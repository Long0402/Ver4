package luyenver4;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.util.ArrayList;
import java.util.Scanner;

public class PersonList {

    private static ArrayList<Person> personList = new ArrayList<>();

    public void addPerson(Person person) {
        personList.add(person);
    }

    public void updatePerson(String id) {
        Scanner sc = new Scanner(System.in);
        for (Person person : personList) {
            if (person instanceof Student && person.getId().equals(id)) {
                Student personToUpdate = (Student) person;
                personToUpdate.updatePerson(id);
                return;
            } else if (person instanceof Teacher && person.getId().equals(id)) {
                Teacher personToUpdate = (Teacher) person;
                personToUpdate.updatePerson(id);
                return;
            }
        }
    }

    public void deletePersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                personList.remove(person);
                System.out.println("Delete successfully");
                return;
            } 
        }
        System.out.println("No information");

    }

    public Person findPersonById(String id) {
        for (Person person : personList) {
            if (person.getId().equals(id)) {
                return person;
            }
//            else System.out.println("Not find");
        }
        return null;
    }

    public void displayEveryone() {
        for (Person person : personList) {
            person.displayInfo();
        }
    }

    public Student findTopStudent() {
        Student topStudent = null;
        for (Person person : personList) {
            if (person instanceof Student) {
                Student student = (Student) person;
                if (topStudent == null || student.getGpa() > topStudent.getGpa()) {
                    topStudent = student;
                }
            }
        }
        return topStudent;
    }

    public Teacher findTeacherByDepartment(String department) {
        for (Person person : personList) {
            if (person instanceof Teacher) {
                Teacher teacher = (Teacher) person;
                if (teacher.getDepartment().equals(department)) {
                    return teacher;
                }
            }
        }
        return null;
    }
}
