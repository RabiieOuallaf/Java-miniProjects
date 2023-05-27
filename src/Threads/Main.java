package Threads;

public class Main {
    public static void main(String[] args) {
        System.out.println(Thread.activeCount());
        Thread.currentThread().setName("Main");
        System.out.println(Thread.currentThread().getName());
    }
}
