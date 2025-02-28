package ee.spring.naidis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarDbController {

    @Autowired
    CarRepository carRepository;

    //CarRepository carRepository = new CarRepository(); - tagataustal
    //Spring töötab koguaeg. Me ei taha, et iga kord, kui API päring tehakse,
    //et luuakse uus new CarRepository

    @GetMapping("getcars3")
    public List<Car> getCars() {
        return carRepository.findAll();
    }

    @GetMapping("addcar3/{make}/{model}/{year}")
    public List<Car> addCar(@PathVariable String make,
                            @PathVariable String model,
                            @PathVariable int year) {
        carRepository.save(new Car(make,model,year));
        return carRepository.findAll();
    }

    @GetMapping("removecars3/{id}")
    public List<Car> removeCar(@PathVariable Long id) {
        carRepository.deleteById(id);
        System.out.println("kustutati cars listist");
        return carRepository.findAll();
    }

    @PostMapping("addcar4")
    public List<Car> addCar2(@RequestBody Car car) {
        carRepository.save(car);
        return carRepository.findAll();
    }
    @DeleteMapping("removecar4/{id}")
    public List<Car> removeCar2(@PathVariable Long id) {
        carRepository.deleteById(id);
        System.out.println("kustutati cars listist");
        return carRepository.findAll();
    }
    @PutMapping("editcar/{id}")
    public List<Car> modifyCar(@PathVariable Long id, @RequestBody Car car) {
        Car oldCar = carRepository.findById(id).orElseThrow();

        if(car.getMake() != null && !car.getMake().isEmpty()) {
            oldCar.setMake(car.getMake());
        }
        if(car.getModel() != null && !car.getModel().isEmpty()) {
            oldCar.setModel(car.getModel());
        }
        if(car.getYear() != 0) {
            oldCar.setYear(car.getYear());
        }
        carRepository.save(oldCar);

        return carRepository.findAll();
    }

}
