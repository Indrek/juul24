package ee.spring.naidis;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
public class CarController {

    List<Car> cars = new ArrayList<>(
            List.of(
                    new Car("Ford", "Mondeo", 2010),
                    new Car("Renault","Clio",2008),
                    new Car("Ferrari", "Enzo", 1990)
            )
    );
    @GetMapping("getcars2")
    public List<Car> getCars() {
        return cars;
    }

    //Tee meetod, millega saab autot listi lisada
    //võib returnida kohe listi
    @GetMapping("addcar2/{make}/{model}/{year}")
    public List<Car> addCar(@PathVariable String make,
                            @PathVariable String model,
                            @PathVariable int year) {
        cars.add(new Car(make,model,year));
        return cars;
    }

    //Tee meetod, millega saab autot kustutada indeksi järgi
    //võib returnida kohe listi
    @GetMapping("removecars2/{index}")
    public List<Car> removeCar(@PathVariable int index) {
        cars.remove(index);
        System.out.println("kustutati cars listist");
        return cars;
    }

}
