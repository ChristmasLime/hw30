package ru.hogwarts.school.services;

import org.springframework.stereotype.Service;
import ru.hogwarts.school.model.Faculty;

import java.util.Collection;
import java.util.HashMap;
import java.util.stream.Collectors;

@Service
public class FacultyService {

    private final HashMap<Long, Faculty> faculties = new HashMap<>();

    private long lastId = 0;

    public Faculty createFacul(Faculty faculty) {
        faculty.setId(++lastId);
        faculties.put(lastId, faculty);
        return faculty;
    }

    public Faculty findFacul(long id) {
        return faculties.get(id);
    }

    public Faculty editFacul(Faculty faculty) {
        if (faculties.containsKey(faculty.getId())) {
            faculties.put(faculty.getId(), faculty);
            return faculty;
        }
        return null;
    }

    public Faculty deleteFacul(long id) {
        return faculties.remove(id);
    }

    public Collection<Faculty> getAllFacul() {
        return faculties.values();
    }

    public Collection<Faculty> getFaculByColor(String color) {
        return faculties.values().stream()
                .filter(faculty -> faculty.getColor().equalsIgnoreCase(color))
                .collect(Collectors.toList());
    }
}

