package com.mpak.sma.repository;


import com.mpak.sma.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;



public interface StudentRepository  extends JpaRepository <Student, Long>{
}
