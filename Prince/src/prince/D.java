package prince;


interface D {
    default void call() {
        System.out.println("Default method in interface B");
    }
}