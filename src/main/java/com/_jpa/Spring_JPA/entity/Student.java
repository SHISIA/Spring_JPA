package com._jpa.Spring_JPA.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Table(name="table_student",
uniqueConstraints = @UniqueConstraint(
        name = "emailId_unique",
        columnNames = "email_address"
))
public class Student {
    @Id
    @SequenceGenerator(
            name = "student_sequence",
            sequenceName = "student_sequence",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "student_sequence")
    @Column(
            name = "id",
            nullable = false)
    private Long id;

    private String firstName;
    private String lastName;
    @Column(
            name = "email_address",
            nullable = false
    )
    private String emailId;
//    private String guardianName;
//    private String guardianEmail;
//    private String guardianMobile;
    @Embedded
    private Guardian guardian;
}
