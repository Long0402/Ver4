package luyenver4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Teacher extends Person {

    private String department;
    private String teachingSubject;

    public Teacher() {
    }

    public Teacher(String department, String teachingSubject) {
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public Teacher(String department, String teachingSubject, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.department = department;
        this.teachingSubject = teachingSubject;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getTeachingSubject() {
        return teachingSubject;
    }

    public void setTeachingSubject(String teachingSubject) {
        this.teachingSubject = teachingSubject;
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Enter ID Teacher: ");
            String id = sc.nextLine();
            setId(id);
            System.out.print("Enter Full Name Teacher: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter Date Of Birth Teacher(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            Date date = sdf.parse(dateOfBirth);
            setDateOfBirth(date);
            System.out.print("Enter Department: ");
            String department = sc.nextLine();
            setDepartment(department);
            System.out.print("Enter Teaching Subject: ");
            String teachingSubject = sc.nextLine();
            setTeachingSubject(teachingSubject);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Enter ID: " + id);
            System.out.print("Enter New Full Name Teacher: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter New Date Of Birth Teacher(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            Date date = sdf.parse(dateOfBirth);
            setDateOfBirth(date);
            System.out.print("Enter New Department: ");
            String department = sc.nextLine();
            setDepartment(department);
            System.out.print("Enter New Teaching Subject: ");
            String teachingSubject = sc.nextLine();
            setTeachingSubject(teachingSubject);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID Teacher: " + getId()
                + "\nFull Name Teacher: " + getFullName()
                + "\nDate Of Birth Teacher: " + sdf.format(getDateOfBirth())
                + "\nDepartment: " + getDepartment()
                + "\nTeaching Subject: " + getTeachingSubject() + "\n");
    }

}
