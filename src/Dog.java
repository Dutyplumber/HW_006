public class Dog extends  Animal {

    public String name;
    public String color;
    public int age;



    //конструктор обычных собак
    public Dog(String name, String color, int age) {

        //установка пределов
        super.runLimit = 500;
        super.jumpLimit = 0.5;
        super.swimLimit = 10;

        //заполнение свойств
        System.out.println("Dog's constructor working: ");
        this.name = name;
        this.color = color;
        this.age = 5;

        System.out.println("Work result is new dog:");
        System.out.println("Dog's name is: " + name);
        System.out.println("Dog's color is: " + color);
        System.out.println("Dog's age is: " + age);
        }

    //конструктор особых собак
    public Dog(String name, String color, int age, int runLimit, int jumpLimit, int swimLimit){

        //установка пределов
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;

        //заполнение свойств
        System.out.println("Dog's constructor working: ");
        this.name = name;
        this.color = color;
        this.age = 5;

        System.out.println ("Work result is new cat:");
        System.out.println ("Dog's name is: " + name );
        System.out.println ("Dog's color is: " + color);
        System.out.println ("Dog's age is: " + age);

    }



    }
