package ee.indrek.student.controller;

import ee.indrek.student.model.Album;
import ee.indrek.student.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@RestController
public class RestTemplateController {

    @Autowired
    RestTemplate restTemplate;

    @GetMapping("get-albums") //localhost:8080/get-albums?userId=1
    public List<Album> getAlbums(@RequestParam int userId) {
//        RestTemplate restTemplate = new RestTemplate();
        String url = "https://jsonplaceholder.typicode.com/albums";
        ResponseEntity<Album[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Album[].class);
        Album[] albums = response.getBody();
        List<Album> albumList = Arrays.asList(albums);

//        List<Album> filteredAlbums = new ArrayList<>();
//        for(Album a: albumList) {
//            if(a.getUserId() == userId) {
//                filteredAlbums.add(a);
//            }
//        }
//        return filteredAlbums;
        return albumList.stream() //siin keerab streamiks ehk teeb tsükli
                .filter(e -> e.getUserId() == userId) //filtreerin -> võtan ühe, nimetan teda nt "e" ning küsin tingimust kas jääb alles
                .collect(Collectors.toList()); //keerame streami tagasi listiks
    }

    @GetMapping("get-products") //localhost:8080/get-products?minPrice=1
    public List<Product> getProducts(@RequestParam int minPrice) {
//        RestTemplate restTemplate = new RestTemplate();
        String url = "https://fakestoreapi.com/products";
        ResponseEntity<Product[]> response = restTemplate.exchange(url, HttpMethod.GET, null, Product[].class);
        Product[] products = response.getBody();
        List<Product> productList = Arrays.asList(products);
        return productList.stream()
                .filter(e -> e.getPrice() >= minPrice)
                .collect(Collectors.toList());
    }
}
