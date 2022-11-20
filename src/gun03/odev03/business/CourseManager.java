package gun03.odev03.business;

import java.util.ArrayList;
import java.util.List;

import gun03.odev03.core.logger.Logger;
import gun03.odev03.dataAccess.Course.CourseDAO;
import gun03.odev03.entities.Course;

public class CourseManager {
    private CourseDAO courseDAO;
    private Logger[] loggers;
    private List<Course> courseList = new ArrayList<>();

    public CourseManager(CourseDAO courseDAO, Logger[] loggers){
        this.courseDAO = courseDAO;
        this.loggers = loggers;
    }
    public void create(Course course) throws Exception {
        if(course.getPrice() < 50) {
            throw new Exception("Kurst fiyati 50'den kucuk olamaz");
        }
        for(Course courses : courseList){
            if(courses.getName().equals(course.getName())){
                throw new Exception("Bu kurs ismi mevcuttur."+course.getName());
            }
        }
        courseDAO.create(course);

        for (Logger logger: loggers) {
            logger.log(course.getName());
        }
    }
}