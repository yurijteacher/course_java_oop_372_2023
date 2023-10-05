package unit3;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Vasya");
        map.put(2, "Iva");
        map.put(3, "Ivan");

        System.out.println(map.get(2));

        for (Map.Entry<Integer, String> el:
             map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }

        map.put(4,"Ihgv");

        for (Map.Entry<Integer, String> el:
                map.entrySet()) {
            System.out.println(el.getKey() + ":" + el.getValue());
        }


    }
}
