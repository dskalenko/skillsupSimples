package com.skillsup.services;


import com.skillsup.model.Contact;

import java.util.List;

public interface ContactService {
    void addContact(Contact contact);

    void deleteContact(Contact contact);

    void clearAll();

    List<Contact> getAllContacts();

}
