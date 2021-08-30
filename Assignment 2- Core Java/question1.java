//Interface

interface Car {
    public void start();
    public void applyBreaks();
    public void changeGear(int g);
}

class Fiat implements Car {

    int gear;

    public void start() {
        System.out.println("Car started");
    }
    public void applyBreaks() {
        System.out.println("Breaks applied");
    }
    public void changeGear(int newGear){
          
        gear = newGear;
        System.out.println("Gear set to: " +newGear);
    }
      
    
}


//Abstract

abstract class Vehicle {
    public void setSpeed(int speed) {
        System.out.println("Speed is set to " + speed);
    }

    public abstract void applyBreak();
}


class Bike extends Vehicle {
    public void applyBreak() {
        setSpeed(40);
        System.out.println("Break applied");
    }
}


public class question1 {
    public static void main (String[] args) {
        Car fiat = new Fiat();
        fiat.start();
        fiat.applyBreaks();
        fiat.changeGear(3);

        System.out.println();

        Vehicle bike = new Bike();
        bike.applyBreak();
    }
}