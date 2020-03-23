/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tpsi.labs.lab3;

/**
 *
 * @author naeri
 */
public class Teacher extends Person {

    private String courseName;

    public Teacher(String firstName, String lastName,String emailAddress, String groupId) {
        super(firstName, lastName,emailAddress);
        this.courseName = groupId;
    }
    
    
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String groupId) {
        this.courseName = groupId;
    }
    @Override
    public String toString() {
        return getFirstName()+" "+getLastName()+" "+courseName;
    }
}
