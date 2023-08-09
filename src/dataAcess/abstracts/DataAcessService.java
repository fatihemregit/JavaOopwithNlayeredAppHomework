package dataAcess.abstracts;

import entites.concretes.Category;
import entites.concretes.Course;
import entites.concretes.Instructor;

import java.util.List;

public interface DataAcessService {
    //Category(kategori)
    void addCategory(Category category);
    List<Category> getAllCategory();
    void deleteCategory(int id);
    //Course(kurs)
    void addCourse(Course course);
    List<Course> getAllCourse();
    void deleteCourse(int id);
    //Instructor(eğitmen)
    void addInstructor(Instructor instructor);
    List<Instructor> getAllInstructor();
    void deleteInstructor(int id);
}
