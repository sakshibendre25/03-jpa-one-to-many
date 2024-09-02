package com.sakshi.cruuddemo.dao;

import com.sakshi.cruuddemo.entity.Course;
import com.sakshi.cruuddemo.entity.Instructor;
import com.sakshi.cruuddemo.entity.InstructorDetail;

import java.util.List;

public interface AppDAO {

    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailsById(int theId);

    List<Course> findCourseByInstructorId(int theId);

    Instructor findInstructorByIdJoinFetch(int theId);

    void update(Instructor tempInstructor);

    void  update(Course tempCourse);

    Course findCourseById(int theId);

    void deleteCourseById(int theId);


}

