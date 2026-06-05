import java.util.*;
class Student{
    private String name;
    private Integer sem;
    private String usn;
    public Student(String name,Integer sem,String usn ){
        this.name=name;
        this.sem=sem;
        this.usn=usn;
    }
    public String toString(){
        return "Name: "+name+"|| USN: "+usn+"|| Sem: "+sem;
    }
}
public class ClassObjectDemo {
    public static void main(String[] args){
        ArrayList<Student> stu=new ArrayList<Student>();
        stu.add(new Student("Aditya",4,"4BD24CS003"));
        stu.add(new Student("Alex",4,"4BD24CS003"));
        stu.add(new Student("Lando",4,"4BD24CS003"));
        stu.add(new Student("Max",4,"4BD24CS003"));
        stu.add(new Student("Lewis",4,"4BD24CS003"));
        stu.add(new Student("Oscar",4,"4BD24CS003"));
        stu.add(new Student("Arvid",4,"4BD24CS003"));
        System.out.println("Student Details:");
        for(Student i:stu){
            System.out.println(i.toString());
        }

    }
}
