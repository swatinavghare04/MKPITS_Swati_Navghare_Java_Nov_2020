// WAp in java where we are storing Student class object in an array list.

package src.com.mkpits.java.collection;
import java.util.*;

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }
}
public class StoringStudentClassObjectInArrayList {
    public static void main(String[] args){
           //Creating user-defined class objects
        Student s1 =new Student(101,"Sonoo",23);
        Student s2=new Student(102,"Ravi",21);
        Student s3=new Student(103,"Hanumat",25);
        //creating arraylist
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(s1);//adding Student class object
        al.add(s2);
        al.add(s3);
        //Getting Iterator
        Iterator itr=al.iterator();
        //traversing elements of ArrayList object
        while(itr.hasNext()){
            Student st=(Student)itr.next();
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}

