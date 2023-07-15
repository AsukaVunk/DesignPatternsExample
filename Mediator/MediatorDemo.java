package Mediator;

public class MediatorDemo {
    public static void main(String[] args) {
        User robert =  new User("Robert");
        User john = new User("John");
        robert.sendMessage("Hello John!");
        john.sendMessage("Hello Robert!");
    }
}
