package com.skillsup.controller;

import com.skillsup.model.Contact;
import com.skillsup.services.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * (c) Swissquote 1/18/16
 * @author Denys Skalenko
 */
@RestController
@RequestMapping("/contacts")
public class ContactController {

	@Autowired
	private ContactService contactService;

	@RequestMapping(method = RequestMethod.POST)
	public void add(@RequestBody Contact contact) {
		contactService.addContact(contact);
	}

	@RequestMapping(method = RequestMethod.GET)
	public @ResponseBody List<Contact> getAllContacts() {
		return contactService.getAllContacts();
	}

}
