package gun03.odev03.dataAccess.Course;

import gun03.odev03.entities.Course;

public class hibernateCourseDAO implements CourseDAO {
    @Override
    public void create(Course course) {
        System.out.println("hibernate ile veritabanina yazildi: "+course.getName());
        System.out.println("--------------------------------------------");
    }
}