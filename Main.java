import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.w3c.dom.NameList;

public class Main{
    public static void main(String[] args){
        Square newSquare = new Square(5);
        newSquare.move();
        System.out.println(newSquare.findArea());
        sample();
    }

    static void sample(){
        List<String> names= new ArrayList<>();

        names.add("Hello");
        names.add("Hello");
        names.add("Hello");

        HashMap<String,Integer> data = new HashMap<>();

        data.put("Size", 10);
        data.put("Length", 100);
        data.put("Color", 12);


        System.out.println(names);
        System.out.println(data);
    }



}