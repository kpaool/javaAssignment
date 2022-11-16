public class Rectangle extends Shape {
    private double length;
    private double width;

    
    Rectangle(double startPosition, double length, double width) {
        super(startPosition);
        this.length=length;
        this.width=width;
        //TODO Auto-generated constructor stub
    }

    double findArea(){
        return this.length*this.width;
    }

    double calculateVolume(){
        return 0;
    }
}
