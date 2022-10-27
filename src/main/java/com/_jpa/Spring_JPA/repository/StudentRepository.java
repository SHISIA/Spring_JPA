package com._jpa.Spring_JPA.repository;

import com._jpa.Spring_JPA.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface StudentRepository extends JpaRepository<Student,Long> {

    @Modifying
    @Transactional
    @Query(
            value = "update table_student set first_name = ?1 where email_address = ?2",
            nativeQuery=true
    )
    int updateStudentNameByEmailId(String firstName,String emailId);
}
