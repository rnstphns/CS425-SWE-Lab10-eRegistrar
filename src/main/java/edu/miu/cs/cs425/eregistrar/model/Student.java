package edu.miu.cs.cs425.eregistrar.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PastOrPresent;
import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long studentId;

    @NotNull
    @NotEmpty
    @NotBlank
    //TODO validation unique
    private String studentNumber;

    @NotNull
    @NotEmpty
    @NotBlank
    private String firstName;

    private String middleName;

    @NotNull
    @NotEmpty
    @NotBlank
    private String lastName;

    private Double cgpa;

    @NotNull
//    @PastOrPresent
    //TODO change back to LocalDate
    private String dateOfEnrollment;

    @NotNull
    //TODO validation "yes" or "no", or work out boolean with web form
    private boolean isInternational;
}
