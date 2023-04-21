package OOPS;

class Animal{
    String name = "Animal";
    void details(){
        System.out.println(name);
    }
}
class Dog extends Animal{
    String name = "Dog";
    void details(){
        System.out.println(name);
    }
    public static void main(String[] args) {
        Dog obj = new Dog();
        obj.details();
    }
}