package ru.hogwarts.school.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Student;
import ru.hogwarts.school.repository.StudentRepository;

import java.util.Collection;


@Service
public class StudentService {

    @Autowired
    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student createStud(Student student) {
        return studentRepository.save(student);
    }

    public Student findStud(long id) {
        return studentRepository.findById(id).get();
    }

    public Student editStud(Student student) {
        return studentRepository.save(student);
    }


    public void deleteStud(long id) {
        studentRepository.deleteById(id);
    }

    public Collection<Student> getAllStud() {
        return studentRepository.findAll();
    }

//    public Collection<Student> getStudByAge() {
//        return studentRepository.findAll
//                (Sort.by(Sort.Direction.DESC, "age"));
//    }
}
