package business.abstracts;

import entites.concretes.Instructor;

import java.util.List;

public interface InstructorService {
    void addInstructor(Instructor instructor);
    List<Instructor> getAllInstructor();
    void deleteInstructor(int id);
}
