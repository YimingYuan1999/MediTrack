package MediTrack.Medi.model;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;

import lombok.Data;

@Data
public class MedicalRecord {
    @Id
    private String recordId;
    private LocalDate dateOfSubmission;
    private String recordType;
    private String recordDescription;
    private String fileLocation;
}
