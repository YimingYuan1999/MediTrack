package MediTrack.Medi.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Document(collection = "patients")
@Data
public class Patient {
    @Id
    private String id;
    private String userId; // Reference to User
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private String gender;
    private String contactNumber;
    private String emailAddress;
    private String address;
    private LocalDate registrationDate;
    private List<MedicalRecord> medicalRecords;
    private List<Appointment> appointments;

}