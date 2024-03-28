import Arithmetic.Arithmetic;

import java.util.HashMap;
import java.util.Map;
import Map.MyMap;

public class Main {
    public static void main(String[] args) {
        Arithmetic<Double,Integer> arithmetic = new Arithmetic<>(3.2,5);
        arithmetic.add();
        arithmetic.subtract();
        arithmetic.multiply();
        arithmetic.divide();
        arithmetic.getMin();
        arithmetic.getMax();

        System.out.println("===================================================================================");

        MyMap<Integer, String> map = new MyMap<>();
        map.put(1,"gello");
        map.put(1,"wahahaha");
        map.put(2, "sadded");
        map.put(1,"hi sir");
        map.put(3, "yay");
        map.put(2, "huhu laban");
        map.print();
        System.out.println();
        System.out.println("Value at key: "+ map.get(1));
        System.out.println("Removing: "+ map.remove(2));
        map.print();

    }
}