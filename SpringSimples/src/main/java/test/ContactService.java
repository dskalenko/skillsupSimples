package test;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by skillsup on 24.06.15.
 */
@Service
public class ContactService {

  @Inject
  private ContactDao contactDao;

  public void addContact(ContactDTO contactDTO){
    contactDao.save(contactDTO);
  }

  public void print(){
   for(ContactDTO contactDTO : contactDao.getAllContacts()){
     System.out.println(contactDTO.getName());
   }
  }
}
