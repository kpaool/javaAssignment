public abstract class Shape {
    private double startPosition;

    abstract double findArea();

    Shape( double startPosition){
        this.startPosition=startPosition;
    }

    abstract double calculateVolume();

    void move(){
        System.out.println("Shape has been moved");
    }
}
