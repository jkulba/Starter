package us.kulba.starter.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationContextLoader;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import us.kulba.starter.JpaTestConfig;
import us.kulba.starter.model.Contact;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * ContactRepositoryTest is a JUnit test to exercise the ContactRepository CRUD methods.
 *
 * @author James Kulba, jkulba@gmail.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = JpaTestConfig.class, loader = SpringApplicationContextLoader.class)
@ActiveProfiles("default")
public class ContactRepositoryTest {
    final Logger logger = LoggerFactory.getLogger(ContactRepositoryTest.class);

    @Autowired
    private ContactRepository contactRepository;

    @Test
    public void insert() throws Exception {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        final Date birthDate = dateFormat.parse("1967-12-06");

        Contact contact = new Contact();
        contact.setFirstName("James");
        contact.setLastName("Kulba");
        contact.setDateOfBirth(birthDate);

        contactRepository.save(contact);

        logger.info( "Contacts: " + contactRepository.count() );


    }

}
