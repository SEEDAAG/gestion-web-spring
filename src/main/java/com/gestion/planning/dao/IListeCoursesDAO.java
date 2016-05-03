package com.gestion.planning.dao;


import java.util.List;

import com.gestion.planning.entities.Course;

public interface IListeCoursesDAO {
    List<Course> rechercherCourses();
}