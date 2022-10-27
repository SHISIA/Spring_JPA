package com._jpa.Spring_JPA.repository;

import com._jpa.Spring_JPA.entity.Guardian;
import com._jpa.Spring_JPA.entity.Student;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.security.Guard;
import java.util.List;


@SpringBootTest
class StudentRepositoryTest {
    @Autowired
    private StudentRepository studentRepository;

    @Test@DisplayName("Saving Student")

    public void saveStudent(){
        Student student=Student.builder()
                .emailId("shsia@gmail.com")
                .firstName("Shsia")
                .lastName("James")
//                .guardianName("Mama Laura")
//                .guardianEmail("lau@gmail.com")
//                .guardianMobile("0o3223e3ee3")
                .build();
        studentRepository.save(student);
    }

    @Test
    public void getStudents(){
        List<Student> studentList=studentRepository.findAll();
        System.out.println("Student "+studentList);
    }

    @Test
    public void saveStudentWithGuardian(){
        Guardian guardian=Guardian.builder()
                .email("jamesmalika@gmail.com")
                .mobile("43676u09123")
                .name("Jemo's Guard")
                .build();
        Student student=Student.builder()
                .firstName("jemo")
                .lastName("dhhew")
                .emailId("toto@Gmail.com")
                .guardian(guardian)
                .build();
        studentRepository.save(student);
    }

    @Test
    @DisplayName("Name Update JPQL")
    public void updateStudentNameByEmail(){
        studentRepository.updateStudentNameByEmailId("Jemo@Jemo","shsia@gmail.com");
    }
}