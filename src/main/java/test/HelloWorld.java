package test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by skillsup on 24.06.15.
 */

@Component
public class HelloWorld {

    @Autowired
    private TEstBean bean;
    private String message;

        public void setMessage(String message){
            this.message  = message;
        }

        public void getMessage(){
            System.out.println("Your Message : " + message);
            System.out.println(bean.method());
        }


}
