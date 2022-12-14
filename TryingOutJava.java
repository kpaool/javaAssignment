public class TryingOutJava {
    public static void main(String[] args) {
        printFiveTimes();
        printFirstFiveNumbers();
        printNNaturalNumber(10);
        System.out.println(factorial(5));
    }

    public static void printFiveTimes() {
        int counter=0;
        while (counter<5) {
            System.out.println("I'm a string that is to be printed out five times");
            counter++;
        }
    }

    public static void printFirstFiveNumbers() {
        int counter=1;
        while (counter<=5) {
            System.out.println(counter);
            counter++;
        }
    }

    public static void printNNaturalNumber(int n) {
        int counter=1;
        while (counter<=n) {
            System.out.println(counter);
            counter++;
        }
    }

    public static int factorial(int number) {
        if (number>1){
            return number*factorial(number-1);
        }else{
            return number;
        }
    }
}
