public class Cat extends Animal {

    public String name;
    public String color;
    public int age;



    //конструктор обычных котов
    public Cat(String name, String color, int age){

        //установка пределов
        runLimit = 200;
        jumpLimit = 2;
        swimLimit = 0;

        //заполнение свойств
        System.out.println("Cat's constructor working: ");
        this.name = name;
        this.color = color;
        this.age = 5;

            System.out.println ("Work result is new cat:");
            System.out.println ("Cat's name is: " + name );
            System.out.println ("Cat's color is: " + color);
            System.out.println ("Cat's age is: " + age);

    }

    //конструктор особых котов
    public Cat(String name, String color, int age, int runLimit, int jumpLimit, int swimLimit){

        //установка пределов
        this.runLimit = runLimit;
        this.jumpLimit = jumpLimit;
        this.swimLimit = swimLimit;

        //заполнение свойств
        System.out.println("Cat's constructor working: ");
        this.name = name;
        this.color = color;
        this.age = 5;

        System.out.println ("Work result is new cat:");
        System.out.println ("Cat's name is: " + name );
        System.out.println ("Cat's color is: " + color);
        System.out.println ("Cat's age is: " + age);

    }

}
