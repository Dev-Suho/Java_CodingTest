package test;

class Parent{
    public Parent() {
        System.out.println("A");
    }
    public Parent(int a) {
        System.out.println("B");
    }
    public void fn() {
        System.out.println("C");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("D");
    }
    public Child(int a) {
        super(a);
        System.out.println("E");
    }
    public Child(double a) {
        System.out.println("F");
    }
    public void fn() {
        System.out.println("G");
    }
}

public class Constructor {
    public static void main(String[] args) {
        Parent b = new Child(5);
    }
}
