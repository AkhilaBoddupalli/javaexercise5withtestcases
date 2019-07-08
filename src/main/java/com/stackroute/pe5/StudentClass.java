package com.stackroute.pe5;

import java.util.Comparator;

public class StudentClass {
    private int id;
    private String name;
    private int age;

    public StudentClass(int id,String name,int age){

        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "StudentClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}


class StudentSorter implements Comparator<StudentClass>
{


//    public int compareByAge(StudentClass a,StudentClass b) {
//        return a.getAge() - b.getAge();
//    }
//
//    public int compareByName(StudentClass a,StudentClass b) {
//        return a.getName().compareTo(b.getName());
//    }



    @Override
    public int compare(StudentClass a,StudentClass b) {
        if(a.getAge()==(b.getAge()))
        {
            if(a.getName().equals(b.getName())) //compares if names are equal
            {
                return a.getId()-b.getId(); //returns sorted list by id
            }else{
                return  a.getName().compareTo(b.getName());
            }

        }else{
            return a.getAge()-b.getAge(); //ascending order with respect to age
        }
    }
}
