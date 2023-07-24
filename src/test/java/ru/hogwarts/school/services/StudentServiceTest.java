package ru.hogwarts.school.services;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ru.hogwarts.school.model.Student;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;


public class StudentServiceTest {

    private StudentService service;

    @BeforeEach
    void setUp() {
        service = new StudentService();
    }

    @Test
    void createStudentTest() {
        service.createStud(new Student(null, "Roma", 22));
        Student newstud = service.createStud(new Student(null, "Jotm", 22));
        service.createStud(new Student(null, "Niko", 23));
        assertEquals("Jotm", newstud.getName());
    }

    @Test
    void findStudentTest() {
        Student newStudent = service.createStud(new Student(null, "Roma", 22));
        assertEquals(newStudent, service.findStud(1));
    }

    @Test
    void editStudentTest() {
        Student newStudent = service.createStud(new Student(null, "Roma", 22));
        Student editStudent = service.editStud(new Student(newStudent.getId(), "Pasha", 44));
        assertEquals(editStudent,service.findStud(1));

    }
    @Test
    void deleteStudentTest() {
        service.createStud(new Student(null, "Roma", 22));
        service.deleteStud(1);
        assertNull(service.findStud(1));

    }
    @Test
    void getAllTest() {
        service.createStud(new Student(null, "Roma", 22));
        service.createStud(new Student(null, "Jotm", 22));
        service.createStud(new Student(null, "Niko", 23));
        assertEquals(3,service.getAllStud().size());
    }
    @Test
    void getStudentsByAge() {
        service.createStud(new Student(null, "Roma", 22));
        service.createStud(new Student(null, "Jotm", 22));
        service.createStud(new Student(null, "Niko", 23));
        assertEquals(2,service.getStudByAge(22).size());
    }

}
