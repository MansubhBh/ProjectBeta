/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionbasics;

import com.itn.collectionbasics.model.Student;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Mansuv
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Student> computerstudent = new ArrayList<>();
        List<Student> civilstudent = new ArrayList<>();
        List<Student> electronicsstudent = new ArrayList<>();
        
        Student s = new Student(1, "Rajeev", "rajeev@gmail.com", 24);
        Student s1 = new Student(2, "Hari", "hari@gmail.com", 22);
        Student s2 = new Student(3, "Shyam", "shyam@gmail.com", 20);
        Student s3 = new Student(4, "Susan", "susan@gmail.com", 18);
        Student s4 = new Student(5, "Sachin", "sachin@gmail.com", 21);
        Student s5 = new Student(6, "John", "john@gmail.com", 25);
        Student s6 = new Student(7, "Rojon", "rojon@gmail.com", 26);
        Student s7 = new Student(8, "Sita", "Sita@gmail.com", 21);
        Student s8 = new Student(9, "Gita", "gita@gmail.com", 29);
        
        computerstudent.add(s);
        computerstudent.add(s1);
        computerstudent.add(s2);
        
        civilstudent.add(s3);
        civilstudent.add(s4);
        civilstudent.add(s5);
        
        electronicsstudent.add(s6);
        electronicsstudent.add(s7);
        electronicsstudent.add(s8);
        
        Map<String,List<Student>> studentmap = new HashMap<>();
        
        studentmap.put("civil", civilstudent);
        studentmap.put("computer", computerstudent);
        studentmap.put("electronics", electronicsstudent);
        
        System.out.println("Enter the faculty you want to read:");
        String userinput = sc.next();
        Program  p = new Program();
        List<Student> studentbyUserInput = p.getstudentByFaculty(studentmap, userinput);
       if(studentbyUserInput != null){
           studentbyUserInput.forEach(System.out::println);
       }
       else if(studentbyUserInput == null){
           System.out.println("Sorry incorrect entry");
       }
    }
    
     List<Student> getstudentByFaculty(Map<String,List<Student>> smap,String userkey){
        for(Map.Entry<String,List<Student>> m : smap.entrySet()){
            if(m.getKey().equalsIgnoreCase(userkey)){
                List<Student> slist = m.getValue();
                return slist;
            }
        }
        return null;
    }
    
}
