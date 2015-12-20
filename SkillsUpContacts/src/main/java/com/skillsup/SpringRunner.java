package com.skillsup;


import com.skillsup.config.SpringConfig;
import com.skillsup.model.Contact;
import com.skillsup.services.ContactService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringRunner {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
        ContactService contactService = applicationContext.getBean(ContactService.class);
        Contact contact = new Contact();
        contact.setName("Ivan");
        contact.setPhone("phone");
        contactService.addContact(contact);
        for (Contact savedContact : contactService.getAllContacts()) {
            System.out.println("Saved contact - " + savedContact);
        }
    }
}
