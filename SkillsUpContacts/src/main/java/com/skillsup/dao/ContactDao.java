package com.skillsup.dao;


import com.skillsup.entity.MappedContact;

import java.util.List;

public interface ContactDao {

    void save(MappedContact contact);

    List<MappedContact> findAll();

}
