package test;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by skillsup on 24.06.15.
 */
@Component
public class ContactDao {

   private List<Contact> contactList = new ArrayList<Contact>();

   public void save(ContactDTO contactDTO){
      Contact contact = new Contact();
      contact.setName(contactDTO.getName());
      contactList.add(contact);
   }

   public List<ContactDTO> getAllContacts(){
      List<ContactDTO> contactDTOs = new ArrayList<ContactDTO>(contactList.size());
      for(Contact contact : contactList){
         contactDTOs.add(new ContactDTO(contact.getName()));
      }
      return contactDTOs;
   }
}


