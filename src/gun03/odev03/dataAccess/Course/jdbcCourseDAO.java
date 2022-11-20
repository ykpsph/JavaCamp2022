package gun03.odev03.dataAccess.Course;

import gun03.odev03.entities.Course;

public class jdbcCourseDAO implements CourseDAO{
    public void create(Course course){
        System.out.println("jdbc ile veritabanina yazildi: "+course.getName());
        System.out.println("--------------------------------------------");
    }
}
