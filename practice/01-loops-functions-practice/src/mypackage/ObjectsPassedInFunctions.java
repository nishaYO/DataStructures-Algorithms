package mypackage;

public class ObjectsPassedInFunctions {
    public static void main(String[] args) {

        String name = "Captain America";
        change(name);
        System.out.println(name);//output is captain america
    }

    static void change(String name){
        name = "Iron Man";
    }
}