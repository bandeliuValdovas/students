package ru.course.demospringstudents.service.Impl;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.course.demospringstudents.model.Student;
import ru.course.demospringstudents.repository.InMemoryStudentDAO;
import ru.course.demospringstudents.service.StudentService;

import java.util.List;

@Service
@AllArgsConstructor
public class InMemoryStudentServiceImpl implements StudentService {
    private final InMemoryStudentDAO repository;
    @Override
    public List<Student> findAllStudent(){
        return repository.findAllStudent();

    }

    @Override
    public Student saveStudent(Student student) {
        return repository.saveStudent(student);
    }

    @Override
    public Student findByEmail(String email) {
        return repository.findByEmail(email);
    }

    @Override
    public Student updateStudent(Student student) {
        return repository.updateStudent(student);
    }

    @Override
    public void deleteStudent(String email) {
        repository.deleteStudent(email);

    }
}
