package ee.spring.naidis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class DemoController {

    List<String> cars = new ArrayList<>(Arrays.asList("Volkswagen", "BMW", "Audi"));

    @GetMapping("hello")
    public String helloWeb() {
        //meetodite nimed pole olulised, tähtis on annotatsioonid
        return "Hello web!";
    }
    @GetMapping("hello/{name}")
    public String helloName(@PathVariable String name) {
        return "Hello " + name;
    }
    @GetMapping("get-cars")
    public List<String> getCars() {
        System.out.println("Laeti cars list");
        return cars;
    }

    //Tee meetod, millega saab cars listi lisada auto
    //lisamismeetod võib returnida kohe listi

    @GetMapping("add-cars/{name}")
    public List<String> addCar(@PathVariable String name) {
        cars.add(name);
        System.out.println("Lisati cars listi");
        return cars;
    }
    //Tee meetod, mis kustutab indexi järgi autode listist elemendi
    //Võib kohe returnida listi

    @GetMapping("remove-cars/{name}")
    public List<String> removeCar(@PathVariable int index) {
        cars.remove(index);
        System.out.println("Lisati cars listi");
        return cars;
    }
    //errorid
    //4-ga algavad = kasutaja viga
    //400 - vale andmetüüp
    //404 - url viga

    //500 - meie tegime kõik õigesti, mingi serveri viga

    @GetMapping("cars-count")
    public int asd123() {
        //meetodi nimi ei oma tähtsust
        return cars.size();
    }

    //loe kokku kõik tähed, mis on cars listis
    //kuva see number brauseris

    @GetMapping("cars-count-t")
    public int letterCount() {
        //meetodi nimi ei oma tähtsust
        int sum = 0;
        for(String car : cars) {
            sum += car.length();
        }

        return sum;
    }




}
