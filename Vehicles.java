public class Vehicles {
    protected String brand ="Ford";

    public void honk(){
        System.out.println("Tuu tuuu");
    }

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.modelName="play";
        System.out.println(myCar.modelName);
    }
}

class Car extends Vehicles{
    protected String modelName= "Mustang";
    
}
