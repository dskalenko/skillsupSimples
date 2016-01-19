var appControllers = angular.module('appControllers', []);


appControllers.controller("contactController", ['$scope', '$http', function ($scope, $http) {

    $scope.refresh  = function () {
        $http.get("contacts")
            .then(function (response) {
                $scope.contacts = response.data;
            });
    };

    $scope.addContact = function () {
        $http.post('/contacts',{"name":$scope.name, "phone":   $scope.phone }).
            success(function (data, status, headers, config) {
                $scope.name = '';
                $scope.phone = '';
                $scope.refresh();
            }).
            error(function (data, status, headers, config) {
                alert("Exception details: " + JSON.stringify({data: data}));
            });

    };
}]);

