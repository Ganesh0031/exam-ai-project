package com.example.ExamGuider.Repository;

import com.example.ExamGuider.Entity.Exam;
import com.example.ExamGuider.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface ExamRepository extends JpaRepository<Exam,Long> {

}
