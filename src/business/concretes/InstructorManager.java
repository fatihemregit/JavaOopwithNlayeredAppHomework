package business.concretes;

import business.abstracts.InstructorService;
import core.logging.abstracts.Logger;
import dataAcess.abstracts.DataAcessService;
import entites.concretes.Instructor;

import java.util.ArrayList;
import java.util.List;

public class InstructorManager implements InstructorService {

    DataAcessService dataAcessService;

    List<Logger> loggers;

    public InstructorManager(DataAcessService dataAcessService, List<Logger> loggers) {
        this.dataAcessService = dataAcessService;
        this.loggers = loggers;
        //eğitmenlerimizi sahte veritabanımıza ekliyoruz

    }
    ArrayList<Instructor> instructors = new ArrayList<Instructor>();
    @Override
    public void addInstructor(Instructor instructor) {
        listloger(instructor.getName() + " Adlı eğitmen eklendi");
        instructors.add(instructor);
        dataAcessService.addInstructor(instructor);
    }

    @Override
    public List<Instructor> getAllInstructor() {
        listloger("Tüm Eğitmenler Listelendi");
        return  dataAcessService.getAllInstructor();
    }

    @Override
    public void deleteInstructor(int id) {
        listloger( id + " id li eğitmen silindi");
        dataAcessService.deleteInstructor(id);
    }
    private void listloger(String data){
        for(Logger logger:loggers){
            logger.log(data);
        }
    }
}
