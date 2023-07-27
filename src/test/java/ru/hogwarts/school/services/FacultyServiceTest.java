//package ru.hogwarts.school.services;
//
//
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import ru.hogwarts.school.model.Faculty;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNull;
//
//public class FacultyServiceTest {
//
//    private FacultyService service;
//
//    @BeforeEach
//    void setUp() {
//        service = new FacultyService();
//    }
//
//    @Test
//    void createFacultyTest() {
//        service.createFacul(new Faculty(null, "Gryffindor", "gold"));
//        service.createFacul(new Faculty(null, "Slytherin", "green"));
//        Faculty newFacul = service.createFacul(new Faculty(null, "Ravenclaw", "blue"));
//        service.createFacul(new Faculty(null, "Hufflepuff", "gold"));
//        assertEquals(3, newFacul.getId());
//    }
//
//    @Test
//    void findFacultyTest() {
//        Faculty newFacul = service.createFacul(new Faculty(null, "Ravenclaw", "blue"));
//        assertEquals(newFacul, service.findFacul(1));
//    }
//
//    @Test
//    void editFacultyTest() {
//        Faculty newFacul = service.createFacul(new Faculty(null, "Ravenclaw", "blue"));
//        Faculty editFacul = service.editFacul(new Faculty(newFacul.getId(), "Slytherin", "green"));
//        assertEquals(editFacul, service.findFacul(1));
//    }
//
//    @Test
//    void deleteFacultyTest() {
//        service.createFacul(new Faculty(null, "Ravenclaw", "blue"));
//        service.deleteFacul(1);
//        assertNull(service.findFacul(1));
//    }
//
//    @Test
//    void getAllTest() {
//        service.createFacul(new Faculty(null, "Gryffindor", "gold"));
//        service.createFacul(new Faculty(null, "Slytherin", "green"));
//        service.createFacul(new Faculty(null, "Ravenclaw", "blue"));
//        service.createFacul(new Faculty(null, "Hufflepuff", "gold"));
//        assertEquals(4, service.getAllFacul().size());
//    }
//
//    @Test
//    void getFacultiesByColor() {
//        service.createFacul(new Faculty(null, "Gryffindor", "gold"));
//        service.createFacul(new Faculty(null, "Slytherin", "green"));
//        service.createFacul(new Faculty(null, "Ravenclaw", "blue"));
//        service.createFacul(new Faculty(null, "Hufflepuff", "gold"));
//        assertEquals(2, service.getFaculByColor("gold").size());
//    }
//}
