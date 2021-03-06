/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2;

/**
 *
 * @author Lane Schultz
 */
public class StartProgram {
         public static void main(String[] args){
    AdvancedJavaCourse advJava = new AdvancedJavaCourse("Advanced Java", "180-150");
        IntroJavaCourse introJava = new IntroJavaCourse("Introduction to Java", 
                "180-151");
        CollegeProgrammingCourse introProgramming = new IntroToProgrammingCourse(
                "Introduction to Programming", "180-152");
        
        
        //Sets prerequisites for the Advanced Java and Intro to Java Courses
        advJava.setPrerequisites("Intro to Java");
        introJava.setPrerequisites("Intro to Programming");
        introProgramming.setPrerequisites("None");
        
        //Displays the Course information
         System.out.println(advJava.getCourseName() + " " + 
                 advJava.getCourseNumber() + " " + advJava.getPrerequisites());
         System.out.println(introJava.getCourseName() + " " + 
                 introJava.getCourseNumber() + " " + introJava.getPrerequisites());
         System.out.println(introProgramming.getCourseName() + " " + 
                 introProgramming.getCourseNumber());
         }
}
