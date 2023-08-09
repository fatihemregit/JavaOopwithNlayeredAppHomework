import business.concretes.CategoryManager;
import business.concretes.CourseManager;
import business.concretes.InstructorManager;
import core.logging.abstracts.Logger;
import core.logging.concretes.FileLogger;
import core.logging.concretes.PrintLogger;
import dataAcess.concretes.HibernateDao;
import dataAcess.concretes.JdbcDao;
import entites.concretes.Category;
import entites.concretes.Course;
import entites.concretes.Instructor;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        /*//kurs manager test
        //Kursların Tanımlanması
        Course course1 = new Course(1,50,"Html");
        Course course2 = new Course(2,20,"html");
        //Loggerin Tanımlanması
        PrintLogger printLogger = new PrintLogger();
        FileLogger fileLogger = new FileLogger();
        ArrayList<Logger> loggers = new ArrayList<>();
        loggers.add(printLogger);
        loggers.add(fileLogger);
        //Data Acess in tanımlanması
        HibernateDao hibernateDao = new HibernateDao();
        //Course Manager in tanımlanması
        CourseManager courseManager = new CourseManager(hibernateDao,loggers);
        //course ekleme
        courseManager.addCourse(course1);
        courseManager.addCourse(course2);
        //course listeleme
        for(Course course3:courseManager.getAllCourse()){
            System.out.println("========================");
            System.out.println("Kurs id : " + course3.getId());
            System.out.println("Kurs Adı : " + course3.getName());
            System.out.println("Kurs fiyatı : " + course3.getUnitPrice());

        }*/
        /*//kategori  manager test
        //kategorilerin tanımlanması
        Category category1 = new Category(1,"Programlama");
        Category category2 = new Category(2,"Ofis Uygulamaları");
        //loggerin tanımlanması
        PrintLogger printLogger = new PrintLogger();
        FileLogger fileLogger = new FileLogger();
        ArrayList<Logger> loggers = new ArrayList<>();
        loggers.add(printLogger);
        loggers.add(fileLogger);
        //Data Acess in tanımlanması
        HibernateDao hibernateDao = new HibernateDao();

        //Category Manager in tanımlanması
        CategoryManager categoryManager = new CategoryManager(hibernateDao,loggers);
        //Kategori ekleme
        categoryManager.addCategory(category1);
        categoryManager.addCategory(category2);
        //Kategori listeleme
        for(Category category : categoryManager.getAllCategory()){
            System.out.println("========================");
            System.out.println("Kategori id : " + category.getId());
            System.out.println("Kategori  Adı : " + category.getName());
        }*/
        //eğitmen manager test
        //eğitmenlerin tanımlanması
        Instructor instructor1 = new Instructor(1,"Fatih","bey");
        Instructor instructor2 = new Instructor(2,"Engin","Demirog");
        //loggerin tanımlanması
        PrintLogger printLogger = new PrintLogger();
        FileLogger fileLogger = new FileLogger();
        ArrayList<Logger> loggers = new ArrayList<>();
        loggers.add(printLogger);
        loggers.add(fileLogger);
        //Data acess in tanımlanması
        HibernateDao hibernateDao = new HibernateDao();
        //Instructor Manager in Tanımlanması
        InstructorManager instructorManager = new InstructorManager(hibernateDao,loggers);
        //Instructor ekleme
        instructorManager.addInstructor(instructor1);
        instructorManager.addInstructor(instructor2);
        //Instructor Listeleme
        System.out.println("=Silinmeden Önce=");
        for(Instructor instructor : instructorManager.getAllInstructor()){
            System.out.println("========================");
            System.out.println("Eğitmen  id : " + instructor.getId());
            System.out.println("Eğitmen  Adı : " + instructor.getName());
            System.out.println("Eğitmen  Soyadı : " + instructor.getSurname());

        }
        //Instrutctor silme
        instructorManager.deleteInstructor(2);
        System.out.println("=Silindikten sonra=");
        for(Instructor instructor : instructorManager.getAllInstructor()){
            System.out.println("========================");
            System.out.println("Eğitmen  id : " + instructor.getId());
            System.out.println("Eğitmen  Adı : " + instructor.getName());
            System.out.println("Eğitmen  Soyadı : " + instructor.getSurname());
        }
    }

}