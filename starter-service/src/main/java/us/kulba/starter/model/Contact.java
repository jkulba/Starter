package us.kulba.starter.model;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import org.hibernate.validator.constraints.Length;
import us.kulba.starter.model.serializer.DateIsoDeSerializer;
import us.kulba.starter.model.serializer.DateIsoSerializer;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Calendar;
import java.util.Date;

/**
 * Model object that represents a contact.
 *
 * @author James Kulba, jjkulba@yahoo.com
 */
@Entity
//@Table(name = "CONTACT")
public class Contact extends BaseObject {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private long id;

    @NotNull
    @Length(max = 50)
    @Column(name = "FIRST_NAME")
    private String firstName;

    @NotNull
    @Length(max = 50)
    @Column(name = "LAST_NAME")
    private String lastName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_OF_BIRTH")
    private Date dateOfBirth;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_ENTERED")
    private Date dateEntered;

    @Version
    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "DATE_UPDATED")
    private Date dateUpdated;

    public Contact() {
        Calendar calendar = Calendar.getInstance();
        this.setDateEntered(calendar.getTime());
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getDateEntered() {
        return dateEntered;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setDateEntered(Date dateEntered) {
        this.dateEntered = dateEntered;
    }

    @JsonSerialize(using= DateIsoSerializer.class)
    public Date getDateUpdated() {
        return dateUpdated;
    }

    @JsonDeserialize(using=DateIsoDeSerializer.class)
    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

}