package prince;


interface C {
    default void call() {
        System.out.println("Default method in interface A");
    }
}
//
//class MyClass implements A, B {
//    // You can override the default method if you want, but it's not necessary for this example
//}
//public class Main {
//    public static void main(String[] args) {
//        MyClass myObject = new MyClass();
//// A myObject = new MyClass();
//        // Call the default method from interface A
//        ((A) myObject).call();
//        // Call the default method from interface B
//        ((B) myObject).call();
//    }
//}




