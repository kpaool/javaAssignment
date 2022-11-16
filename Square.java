import java.lang.Math;
public class Square implements SampleInterface {

    private double side;
    
    Square(double side) {
        this.side = side;
        //TODO Auto-generated constructor stub
    }

    @Override
    public void move() {
        System.out.println("Moved");
        // TODO Auto-generated method stub
        
    }

    @Override
    public double calculateVolume() {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public double findArea() {
        // TODO Auto-generated method stub
        return Math.pow(side,2);
    }

   
    
}
