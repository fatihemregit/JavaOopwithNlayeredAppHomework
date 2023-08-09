package dataAcess.concretes;

import dataAcess.abstracts.DataAcessService;
import entites.concretes.Category;
import entites.concretes.Course;
import entites.concretes.Instructor;

import java.util.ArrayList;
import java.util.List;

public class JdbcDao  implements DataAcessService {
    //datas
    List<Category> categories = new ArrayList<Category>();
    List<Course> courses = new ArrayList<Course>();
    List<Instructor> instructors = new ArrayList<Instructor>();


    @Override
    public void addCategory(Category category) {
        categories.add(category);
        System.out.println("Jdbc ile category eklendi");
    }

    @Override
    public List<Category> getAllCategory() {
        System.out.println("Jdbc ile category listelendi");
        return categories;
    }

    @Override
    public void deleteCategory(int id) {
        /*for each ile listeyi gez eşlesen id yi sil*/
        for(Category category : categories){
            if(category.getId() == id){
                categories.remove(category);
                System.out.println("Jdbc ile category silindi");
                return;
            }
        }
    }

    @Override
    public void addCourse(Course course) {
        courses.add(course);
        System.out.println("Jdbc ile course eklendi");
    }

    @Override
    public List<Course> getAllCourse() {
        System.out.println("Jdbc ile course listelendi");
        return courses;
    }

    @Override
    public void deleteCourse(int id) {
        for(Course course: courses){
            if(course.getId() == id){
                courses.remove(course);
                System.out.println("Jdbc ile course silindi");
                return;

            }
        }
    }

    @Override
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
        System.out.println("Jdbc ile instructor eklendi");
    }

    @Override
    public List<Instructor> getAllInstructor() {
        System.out.println("Jdbc ile instructor listelendi");
        return instructors;
    }

    @Override
    public void deleteInstructor(int id) {
        for(Instructor instructor:instructors){
            if(instructor.getId() == id){
                instructors.remove(instructor);
                System.out.println("Jdbc ile instructor silindi");
                return;
            }
        }
    }
}
