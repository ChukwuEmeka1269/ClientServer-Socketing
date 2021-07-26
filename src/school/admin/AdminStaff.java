package school.admin;

import school.Person;
import school.academic.Student;
import school.util.Token;

import java.util.List;

public class AdminStaff extends Person {
    private int staff_id;
    private List<Student> studentList;


    public void registerStudent(Student newStudent){
        Student student = new Student();
        if(confirmSchoolFeesPayment() && hasFilledForm()) {
            if (studentList.isEmpty()) {

                System.out.println("Student has been successfully registered.");

            } else if (studentList.contains(student) && student.equals(newStudent)) {
                System.out.println("Student already registered!");
            }
        }
    }

    public boolean confirmSchoolFeesPayment(){
//        return token.getToken() != 0;
        return  true;
    }

    public boolean hasFilledForm(){
        return true;
    }



    
}
