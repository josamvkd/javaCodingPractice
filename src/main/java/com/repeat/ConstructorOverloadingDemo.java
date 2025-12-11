package com.repeat;

class School
{
 private String teacherName;
 private String studentName;

    public School() // default constructor
    {
        teacherName ="Arya";
        studentName ="Bhavan";
    }

    public School(String teacherName, String studentName) // parameterized constructor
    {
        this.teacherName = teacherName;
        this.studentName = studentName;
    }

    public String getTeacherName()
    {
        return teacherName;
    }

    public void setTeacherName(String teacherName)
    {
        this.teacherName = teacherName;
    }

    public String getStudentName()
    {
        return studentName;
    }

    public void setStudentName(String studentName)
    {
        this.studentName = studentName;
    }
}
public class ConstructorOverloadingDemo
{
    static void main(String[] args)
    {
        School obj1 = new School();
        School obj2 = new School("Ravi","Mahesh");
        System.out.println(obj1.getTeacherName()+" : "+obj1.getStudentName());
        System.out.println(obj2.getTeacherName()+" : "+obj2.getStudentName());
    }
}
