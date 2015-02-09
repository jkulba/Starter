package us.kulba.starter.dao;

import org.springframework.data.repository.CrudRepository;
import us.kulba.starter.model.Contact;

/**s
 * ContactRepository Interface for Contact Data.
 *
 * @author James Kulba, jkulba@gmail.com
 */
public interface ContactRepository extends CrudRepository<Contact, Long> {}
