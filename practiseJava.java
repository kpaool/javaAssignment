import java.util.ArrayList;

import java.util.*;  
public class practiseJava {

    private static int returnMax(int a, int b, int c) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        Collections.sort(list,Collections.reverseOrder());
        return list.get(0);
    }

    private static void flipVariables(int m, int n){
        int tmp =m; //temporarily store m in temp
        m=n;
        m=tmp;
        System.out.println("m is "+m+ " and n is "+n);
    }

    private static void checkIfNumberIsOddOrEven(int number){
        String statement= "";
        if(number%2==0){
            statement="EVEN";
        }else{
            statement="ODD";
        }
        System.out.println(statement);
    }

    private static Boolean isLeapYear(int year){
        if(year%4==0){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isLeapYear(2000));
        //System.out.println(returnMax(4,5,2));
        //flipVariables(5,6);
        //checkIfNumberIsOddOrEven(28);
    }
}
