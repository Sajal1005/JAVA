package OOPS;

class Parent2{
    String name="Sajal";
    Parent2(){
        System.out.println("Constructor called");
    }
}
class Child2 extends Parent2{
    Child2(){
        super();
    }
    public static void main(String[] args) {
        Child2 obj = new Child2();
    }
}