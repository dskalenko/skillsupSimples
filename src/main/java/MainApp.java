import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import test.ContactDTO;
import test.ContactService;
import test.HelloWorld;

/**
 * Created by skillsup on 24.06.15.
 */
public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context =
                new ClassPathXmlApplicationContext("Beans.xml");

        ContactService contactService =  context.getBean(ContactService.class);

        String name = "Vasya";

        ContactDTO contactDTO = new ContactDTO(name);
        contactService.addContact(contactDTO);
        contactService.print();
        System.out.println("Add new one");

        contactService.addContact(new ContactDTO("Vasya2"));
        contactService.print();
    }
}
