package gun03.odev03.business;

import java.util.ArrayList;
import java.util.List;

import gun03.odev03.core.logger.Logger;
import gun03.odev03.dataAccess.Instructor.InstructorDAO;
import gun03.odev03.entities.Instructor;

public class InstructorManager {
    private InstructorDAO instructorDAO;
    private Logger[] loggers;
    private List<Instructor> instructorList = new ArrayList<>();
    public InstructorManager(InstructorDAO instructorDAO, Logger[] loggers){
        this.instructorDAO = instructorDAO;
        this.loggers = loggers;

    }

    public void create(Instructor instructor) throws Exception {

        if(instructor.getSalary() < 1) {
            throw new Exception("maas 1'den kucuk olamaz");
        }
        for(Instructor instructors : instructorList){
            if(instructors.getName().equals(instructor.getName())){
                throw new Exception("Bu kurs ismi mevcuttur."+instructor.getName());
            }
        }
        instructorDAO.create(instructor);

        for(Logger logger:loggers){
            logger.log(instructor.getName());
        }

    }

    public void delete(Instructor instructor){

    }
    public void update(Instructor instructor){

    }
}
