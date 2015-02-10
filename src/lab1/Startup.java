/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import lab2.CollegeProgrammingCourse;

/**
 *
 * @author Lane Schultz
 */
public class Startup {
    public static void main(String[] args){
    lab2.AdvancedJavaCourse advJava = new lab2.AdvancedJavaCourse("Advanced Java", "180-150");
        lab2.IntroJavaCourse introJava = new lab2.IntroJavaCourse("Introduction to Java", 
                "180-151");
        CollegeProgrammingCourse introProgramming = new lab2.IntroToProgrammingCourse(
                "Introduction to Programming", "180-152");
        
        
        //Sets prerequisites for the Advanced Java and Intro to Java Courses
        advJava.setPrerequisites("Intro to Java");
        introJava.setPrerequisites("Intro to Programming");
        
        //Displays the Course information
         System.out.println(advJava.getCourseName() + " " + 
                 advJava.getCourseNumber() + " " + advJava.getPrerequisites());
         System.out.println(introJava.getCourseName() + " " + 
                 introJava.getCourseNumber() + " " + introJava.getPrerequisites());
         System.out.println(introProgramming.getCourseName() + " " + 
                 introProgramming.getCourseNumber());
         }
}
