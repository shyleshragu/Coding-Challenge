package ca.jrvs.apps;

/*
    Create a singleton class

    - make constructor private
    - use static method to create instance of singleton class
 */
public class SingleTonClass {
    private static SingleTonClass singleInstance = null;
    public String s;

    private SingleTonClass(){
        s = "Singleton class";
    }

    public static SingleTonClass getInstance(){
        if (singleInstance == null){
            singleInstance = new SingleTonClass();
        }
        return singleInstance;
    }
}

class SingleTonClassRun{
    public static void main(String[] args) {
        SingleTonClass a = SingleTonClass.getInstance();
        SingleTonClass b = SingleTonClass.getInstance();
        SingleTonClass c = SingleTonClass.getInstance();

        System.out.println("Hashcode of a : " + a.hashCode());
        System.out.println("Hashcode of b : " + b.hashCode());
        System.out.println("Hashcode of c : " + c.hashCode());

        if (a == b){
            System.out.println("a = b");
        }

        if (b == c){
            System.out.println("b = c");
        }

        if (a == c){
            System.out.println("a = c");
        }
        if (a != b || b != c || a != c){
            System.out.println("Not Equal");
        }

    }
}
