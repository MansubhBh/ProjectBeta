/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.itn.collectionbasics.dao;

import com.itn.collectionbasics.model.Student;
import java.util.List;

/**
 *
 * @author Mansuv
 */
public interface StudentDao {
    void insertstudent(Student s,List<Student> slist);
    void deleteStudent()
    
    
}
