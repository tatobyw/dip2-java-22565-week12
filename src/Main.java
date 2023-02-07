class Animal{
    protected String name;
    protected void eat(){
        System.out.println("I can eat");
    }
}

class Dog extends Animal{
    public void display(){
        System.out.println("My Dog is " + name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("it eat Dog food");
    }

    public void bark(){
        System.out.println("it can bark");
    }
}

class Cat extends Animal{
    public void display(){
        System.out.println("My Cat is " + name);
    }
    @Override
    public void eat(){
        super.eat();
        System.out.println("it eat Cat food");
    }

    public void meow(){
        System.out.println("it can meow");
    }
}

class Mobile{
    //    states
    public String color = "white";
    public int price = 1_000;

    //    behaviar or method
    public void calling(){
        System.out.println("Wait,its connecting");
    }
    public void messaging(){
        System.out.println("You can sent messages");
    }
}

public class Main {
    public static void main(String[] args) {
//        instance object
        Mobile obj = new Mobile(); //instance object
        Dog dog = new Dog(); //instance object
        Cat cat = new Cat(); //instance object

        dog.name = "Samoyed";
        dog.display();
        dog.eat();
        dog.bark();

        cat.name = "Scottish fold";
        cat.display();
        cat.eat();
        cat.meow();

        obj.calling();
        obj.messaging();
        System.out.println(obj.color);
        System.out.println(obj.price);
    }
}