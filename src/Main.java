public class Main {

    public static void main(String[] args) {

        Cat cat01 = new Cat("Barsik","Black", 6);
        cat01.run(100);

        Dog dog01 = new Dog("Sharik","White",7);
        dog01.swim(1000);

        Cat cat02 = new Cat ("Bast","red",3);
        cat02.jump(3);

        Dog dog02 = new Dog ("Boy","Grey",6);
        dog02.jump(0.45);

        Cat swimmingCat = new Cat("Vasyka","striped",8, 200, 2, 10);
        swimmingCat.swim(8);

        Dog highJumpingDogAndLongRunnigDog = new Dog("Bulka","Spotted",3,1000,2,10);
        highJumpingDogAndLongRunnigDog.jump(1.7);
        highJumpingDogAndLongRunnigDog.run(900);




    }


}
