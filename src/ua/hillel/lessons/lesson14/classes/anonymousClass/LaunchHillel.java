package ua.hillel.lessons.lesson14.classes.anonymousClass;

public class LaunchHillel {
    public static void main(String[] args) {
        Message message = new Message() {
            @Override
            public String sayHello() {
                return "Hello";
            }
        };
        System.out.println(message.sayHello());

        MyClass message2 = new MyClass();
        message2.displayMessage(new Message() {
            @Override
            public String sayHello() {
                return "Realise in anonymous method";
            }
        });
    }
}
