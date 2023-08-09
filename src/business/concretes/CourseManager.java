package business.concretes;

import business.abstracts.CourseService;
import core.logging.abstracts.Logger;
import dataAcess.abstracts.DataAcessService;
import entites.concretes.Course;

import java.util.ArrayList;
import java.util.List;

public class CourseManager implements CourseService {

    DataAcessService dataAcessService;

    List<Logger> loggers;


    public CourseManager(DataAcessService dataAcessService, List<Logger> loggers) {
        this.dataAcessService = dataAcessService;
        this.loggers = loggers;
    }

    ArrayList<Course> courses = new ArrayList<>();


    @Override
    public void addCourse(Course course) {
        //şart kontrollü ekleme yapıldı(Kurs ismi tekrar edemez ve kursun fiyatı 0 dan küçük olamaz)
        for (Course course1 : courses){
            if(course.getName().toLowerCase().matches(course1.getName().toLowerCase())){
                //course1.getName().matches(course.getName())
                System.out.println("Kurs eklenemedi(zaten bu kurs var)");
                listloger(course1.getName() + " Adlı Kurs zaten olduğundan dolayı eklenemedi");
                return;
            }
        }
        if(course.getUnitPrice() < 0){
            System.out.println("Kurs eklenemedi (kursun fiyatı 0 dan küçük olamaz)");
            listloger(course.getName() + " Adlı Kurs fiyatı 0 dan küçük olduğu için eklenmedi");
            return;
        }
        courses.add(course);
        dataAcessService.addCourse(course);
        listloger( course.getName() + " Adlı Kurs eklendi");

    }

    @Override
    public List<Course> getAllCourse() {
        listloger("Tüm kurslar listelendi");
        return dataAcessService.getAllCourse();
    }

    @Override
    public void deleteCourse(int id) {
        listloger(id + " id li kurs silindi");
        dataAcessService.deleteCourse(id);
    }
    private void listloger(String data){
        for(Logger logger:loggers){
            logger.log(data);
        }
    }
}
