package Class;

public class Test1 {

    class Student{
        int age;
        int rollno;
        String name;
        Student(int age,int rollno,String name){
            this.age=age;
            this.rollno=rollno;
            this.name=name;
            System.out.println("Age rollno and name are "+age+" "+rollno+" "+name);
        }
    }

    public static void main(String[] args) {
        Student sajal = new Student(19,1232,"Sajal");
    }
}
