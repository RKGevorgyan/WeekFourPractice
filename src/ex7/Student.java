package ex7;

import java.util.Iterator;
import java.util.List;

public class Student {
    private String name;
    private int group;
    private int course;
    private int math;
    private int physics;
    private int programming;

    public Student(String name, int group, int course, int math, int physics, int programming) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.math = math;
        this.physics = physics;
        this.programming = programming;
    }

    double avgMark(){
        double avg=0;
        avg=(this.getMath()+this.getPhysics()+this.getProgramming())/(double)3.0;
        return avg;
    }
    // removing students with avg marks<3 and transfers to next course students with avg marks >=3
    static void filterStudents(List<Student> list){
        Iterator<Student> iterator = list.iterator();
        while(iterator.hasNext()) {
            Student s = iterator.next();
            if (s.avgMark() < 3) iterator.remove();
            else {
                s.setCourse(s.getCourse()+1);
                s.setGroup(s.getGroup()+1000); // changing 1st number of group
            }
        }
    }
    // Printing list of students who study at choosen course
    static void printStudents(List<Student> students, int course){
        Iterator<Student> iterator = students.iterator();
        while(iterator.hasNext()) {
            Student s = iterator.next();
            if (s.getCourse()==course) System.out.println("Name: "+s.getName()+" Course: "+s.getCourse());
        }
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public int getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getMath() {
        return math;
    }

    public int getPhysics() {
        return physics;
    }

    public int getProgramming() {
        return programming;
    }

    @Override
    public String toString() {
        return
                "name='" + name + '\'' +
                ", group=" + group +
                ", course=" + course;
    }
}
