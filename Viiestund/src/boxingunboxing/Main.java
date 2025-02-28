package boxingunboxing;

import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        //primitiivsed andmetüübid
        int x = 1;
        double d = 2.3;
        boolean b = false;
        char c = 'c';

        //wrapper klass
        Integer i = 5;
        Double g = 6.7;
        Boolean v = true;
        Character f = 'f';

        int y = Integer.parseInt("5");
        Integer k = Integer.parseInt("6");

        System.out.println(y + k);

        ArrayList<Integer> myList = new ArrayList<>();
        //primitiivseid tüüpe ei saa noolte vahel kasutada

    }
}
