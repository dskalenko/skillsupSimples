package com.skillsup.entity;


import com.google.common.base.MoreObjects;
import com.google.common.base.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Contacts")
public class MappedContact {

    @Id
    @GeneratedValue
    @Column(name = "CONTACT_ID")
    private Long id;

    @Column(name = "NAME")
    private String name;

    @Column(name = "PHONE")
    private String phone;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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

        MappedContact that = (MappedContact) o;

        return Objects.equal(this.id, that.id) && Objects.equal(this.name, that.name) & Objects.equal(this.phone, that.phone);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(this.id, this.name, this.phone);
    }

    @Override
    public String toString() {
        return MoreObjects.toStringHelper(this)
                .addValue(this.id)
                .addValue(this.name)
                .addValue(this.phone)
                .toString();
    }
}
