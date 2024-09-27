package luyenver4;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Student extends Person {

    private float gpa;
    private String major;

    public Student() {
    }

    public Student(float gpa, String major) {
        this.gpa = gpa;
        this.major = major;
    }

    public Student(float gpa, String major, String id, String fullName, Date dateOfBirth) {
        super(id, fullName, dateOfBirth);
        this.gpa = gpa;
        this.major = major;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    @Override
    public void addPerson() {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.print("Enter ID Student: ");
            String id = sc.nextLine();
            setId(id);
            System.out.print("Enter Full Name Student: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter Date Of Birth Student(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            Date date = sdf.parse(dateOfBirth);
            setDateOfBirth(date);
            System.out.print("Enter GPA: ");
            float gpa = sc.nextFloat();
            setGpa(gpa);
            sc.nextLine();
            System.out.print("Enter Major: ");
            String major = sc.nextLine();
            setMajor(major);
        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        try {
            System.out.println("Enter ID : " + id);
            System.out.print("Enter New Full Name Student: ");
            String fullName = sc.nextLine();
            setFullName(fullName);
            System.out.print("Enter New Date Of Birth Student(dd/MM/yyyy): ");
            String dateOfBirth = sc.nextLine();
            Date date = sdf.parse(dateOfBirth);
            setDateOfBirth(date);
            System.out.print("Enter New GPA: ");
            float gpa = sc.nextFloat();
            setGpa(gpa);
            sc.nextLine();
            System.out.print("Enter New Major: ");
            String major = sc.nextLine();
            setMajor(major);

        } catch (Exception e) {
            System.out.println("Invalid input");
        }
    }

    @Override
    public void displayInfo() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        System.out.println("ID Student: " + getId()
                + "\nFull Name Student: " + getFullName()
                + "\nDate Of Birth Student: " + sdf.format(getDateOfBirth())
                + "\nGPA: " + getGpa()
                + "\nMajor: " + getMajor() + "\n");
    }

}
