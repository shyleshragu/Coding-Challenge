<<<<<<< HEAD
package ca.jrvs.apps;

class Base {
    private static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }

    public void typed(){
        System.out.println("Non-static or instance method from Base");
    }
}

class Outsider extends Base {
    public static void display() {
        System.out.println("Static or class method from Derived");
    }
    public void print() {
        System.out.println("Non-static or instance method from Derived");
    }

}


public class CodingCheck extends Outsider {

    public static void main(String[] args) {
        Outsider check1 = new Outsider();
        check1.print();
        check1.display();
        check1.typed();


    }
}
=======
package ca.jrvs.apps;

class Base {
    private static void display() {
        System.out.println("Static or class method from Base");
    }

    public void print() {
        System.out.println("Non-static or instance method from Base");
    }

    public void typed(){
        System.out.println("Non-static or instance method from Base");
    }
}

class Outsider extends Base {
    public static void display() {
        System.out.println("Static or class method from Derived");
    }
    public void print() {
        System.out.println("Non-static or instance method from Derived");
    }

}


public class CodingCheck extends Outsider {

    public static void main(String[] args) {
        Outsider check1 = new Outsider();
        check1.print();
        check1.display();
        check1.typed();


    }
}
>>>>>>> 4b6da9e7b1cf6e7c548213835c923b65a1ff8c35
