public class Animal {



    public int runLimit;
    public double jumpLimit;
    public int swimLimit;


    public boolean run(double value){
        if (runLimit > value) {System.out.println ("RUN to " + value + " " + true +"\n");return true;}
        System.out.println("RUN to " + value + " " + false +"\n");
        return false;
    }

    public boolean jump(double value){
        if (jumpLimit > value) {System.out.println ("JUMP to " + value + " " + true +"\n");return true;}
        System.out.println("JUMP to " + value + " " + false +"\n");
        return false;
    }

    public boolean swim(double value){
        if (swimLimit > value) {System.out.println ("SWIM to " + value + " " + true +"\n");return true;}
        System.out.println("SWIM to " + value + " " + false +"\n");
        return false;

    }
}
