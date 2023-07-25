package ru.hogwarts.school.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;
import ru.hogwarts.school.repository.FacultyRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class FacultyService {

@Autowired
    private final FacultyRepository facultyRepository;

    public FacultyService(FacultyRepository facultyRepository) {
        this.facultyRepository = facultyRepository;
    }

    public Faculty createFacul(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public Faculty findFacul(long id) {
        return facultyRepository.findById(id).get();
    }

    public Faculty editFacul(Faculty faculty) {
        return facultyRepository.save(faculty);
    }

    public void deleteFacul(long id) {
       facultyRepository.deleteById(id);
    }

    public Collection<Faculty> getAllFacul() {
        return facultyRepository.findAll();
    }

//    public Collection<Faculty> getFaculByColor(String color) {
//        return faculties.values().stream()
//                .filter(faculty -> faculty.getColor().equalsIgnoreCase(color))
//                .collect(Collectors.toList());
//    }
}

