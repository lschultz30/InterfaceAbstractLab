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
public interface CollegeProgrammingCourse {
   public void setCredits(double credits);
    
    public void setCourseName(String courseName);
    
    public void setCourseNumber(String courseNumber);
    
    public void setPrerequisites(String courseName);
    
    public double getCredits();
    
    public String getCourseNumber();
    
    public String getCourseName();
    
    public String getPrerequisites();
}
