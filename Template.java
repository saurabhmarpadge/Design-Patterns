abstract class Vehicle{
    protected boolean status;
    abstract void start();
    abstract void run();
    abstract void stop();
    public void testDrive(){
        start();
        if(this.status){
            run();
            stop();
        }
    }
}

class BatMobile extends Vehicle {

    @Override
    void start() {
        this.status = true;
    }

    @Override
    void run() {
        System.out.println("BatMobile started!");
    }

    @Override
    void stop() {
        System.out.println("BatMobile parked!");
    }
}

class BatPlane extends Vehicle {

    @Override
    void start() {
        this.status = true;
    }

    @Override
    void run() {
        System.out.println("BatPlane on the way!");
    }

    @Override
    void stop() {
        System.out.println("BatPlane landed!");
    }
}

public class Template {
    public static void main(String[] args){
        BatMobile batMobile = new BatMobile();
        batMobile.testDrive();

        BatPlane batPlane = new BatPlane();
        batPlane.testDrive();
    }
}
