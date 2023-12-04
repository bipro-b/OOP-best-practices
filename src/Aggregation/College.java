package Aggregation;

import java.util.ArrayList;

import java.util.Collection;
import java.util.List;

public class College {
    String collegeName;
    private final List<Course> courses;

    College(String collegeName, List<Course> courses){
        this.collegeName = collegeName;
        this.courses = courses;
    }
    public List<Course> getCourses(){

        return courses;
    }

    public int countStudents(){
        int studentInCollege = 0;
        List<Student> students;
        for (Course course: courses){
            students = course.studentsData();

            for(Student s : students){
                studentInCollege++;
            }
        }
        return studentInCollege;
    }
}
