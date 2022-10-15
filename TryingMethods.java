import java.nio.IntBuffer;

public class TryingMethods {
 
    public static void main(String[] args) {
        /*
         * This class is to explain the use of methods together with different operators and conditionals
         */

    
    }

    public static int methodA() {
        // this method will find the sum of even numbers between 12 and 103
        int sum=0;
        for (int i = 13; i < 103; i++) {
            if(i%2==0){
                sum+=i;
            }
        }
        return sum;
        
    }

    public void methodB() {
        
    }

    String methodC(int dayOfWeek){
        // this method takes an argument of day of the week and return the Day of the week as a string
        String dayOfWeekString="";
        
        switch (dayOfWeek) {
            case 1:
                dayOfWeekString="Monday";
                break;
            case 2:
                dayOfWeekString="Tuesday";
                break;
            case 3:
                dayOfWeekString="Wednesday";
                break;
            case 4:
                dayOfWeekString="Thursday";
                break;
            case 5:
                dayOfWeekString="Friday";
                break;
            case 6:
                dayOfWeekString="Satuday";
                break;
            case 7:
                dayOfWeekString="Sunday";
                break;
            default:
                dayOfWeekString="No day found";
                break;
        }

        return dayOfWeekString;
    }
    

    void methodD(){
        
    }

    

}
