/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

import javax.swing.JOptionPane;

/**
 *
 * @author Lane Schultz
 */
public abstract class CollegeProgramingCourse {
    private String courseName;
    private String courseNumber;
    private double credits;
   
    //Setters for the Course Number, Course Name, & Credits
    public final void setCourseNumber(String courseNumber) {
        if(courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }
    
    public final void setCourseName(String courseName) {
        if(courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }
    public final void setCredits(double credits) {
        if(credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    //Getters for the Course Name, Course Number, and Credits
    public final String getCourseName() {
        return courseName;
    }
    
    public final String getCourseNumber() {
        return courseNumber;
    }
    
    public final double getCredits() {
        return credits;
    }
    
    //Returns a capitalized version of the course name

    public final String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }  
}
