package ru.course.demospringstudents.service;

import org.springframework.stereotype.Service;
import ru.course.demospringstudents.model.Student;

import java.util.List;

@Service
public interface StudentService {
   List<Student> findAllStudent();
   Student saveStudent(Student student);
   Student findByEmail (String email);
   Student updateStudent(Student student);
   void deleteStudent (String email);
}
