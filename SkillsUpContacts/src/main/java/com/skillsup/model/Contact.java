package com.skillsup.model;

import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

public class Contact {

    private String name;

    private String phone;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Contact that = (Contact) o;

        return Objects.equal(this.name, that.name) & Objects.equal(this.phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.name, this.phone);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .addValue(this.name)
                .addValue(this.phone)
                .toString();
    }
}
