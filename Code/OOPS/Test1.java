package OOPS;

class Parent{
     String name="Parent";
}
class Child extends Parent{
    String name="Child";
    public  void hello()
    {
        System.out.println(super.name);
    }
    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.name);
        obj.hello();            
    }
}