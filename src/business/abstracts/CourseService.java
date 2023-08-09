package business.abstracts;

import entites.concretes.Course;

import java.util.List;

public interface CourseService {
    void addCourse(Course course);
    List<Course> getAllCourse();
    void deleteCourse(int id);
}
