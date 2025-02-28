package mapid;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void main(String[] args) {

        //Map on andmekogum. Mapil on võti ja sellele vastav väärtus
        //Võtmete seas ei tohi (ei saa) olla korduvaid elemente
        //Map ei saa olla iseenda võti

        //esimene on võti (key), teine on väärtus (value)
        Map<String, String> languages = new HashMap<>();

        //kui listi puhul on .add(), siis mapi puhul on .put()
        languages.put("Java", "Keel, mida õpime");
        languages.put("Python", "Teine prog. keel");
        languages.put("C++", "Kolmas keel");
        languages.put("Javascript", "Veebikeel");

        if(languages.containsKey("Java")) {
            System.out.println("Java on juba olemas");
        } else {
            languages.put("Java", "123");
        }

        System.out.println(languages.get("Java"));

        //put meetod lisab sõltumata sellest, kas on juba olemas või mitte
        //kui sama võti on juba olemas, siis selle väärtus asendatakse uuega

        //remove
        //languages.remove("Python");

        System.out.println("Nüüd kustutatakse: " + languages.remove("Python", "Madu"));
        System.out.println(languages.get("Python"));

        //replace
        System.out.println(languages.replace("Python", "Snake"));
        System.out.println(languages.get("Python"));

        //Kui proovime asendada key järgi, mida pole olemas, siis ei juhtu midagi
        System.out.println(languages.replace("Dog", "Midagi ei juhtu"));
        System.out.println(languages.get("Dog"));

        //replace - saame määrata nii key kui vana väärtuse (ja uue väärtuse)
        System.out.println(languages.replace("Python", "Snake", "Uss"));
        System.out.println(languages.get("Python"));

        System.out.println("**********");
        for(String key : languages.keySet()) {
            System.out.println(key + " : " + languages.get(key));
        }

    }

}
