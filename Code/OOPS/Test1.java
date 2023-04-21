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
    public  void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.name);
        hello();
    }
}