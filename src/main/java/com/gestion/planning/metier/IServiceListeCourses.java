package com.gestion.planning.metier;

import java.util.List;

import com.gestion.planning.entities.Course;

public interface IServiceListeCourses {
    List<Course> rechercherCourses();
}