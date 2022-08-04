package com.revature.student;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



//the repository StudentRepository interface EXTENDS the JpaRepositor and inside of the GENERICS are <Student, Long> to declare the type of date that's going to be worked with.

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>{

	//@Query("SELECT s FROM s WHERE s.email= ?1")
	Optional<Student> findStudentByEmail(String email);

}
