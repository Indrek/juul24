package ee.indrek.student;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentApplication {

	public static void main(String[] args) {
		SpringApplication.run(StudentApplication.class, args);
	}

}



//Tee Actor Film ja Producer
//Actor - eesnimi, perenimi
//Film - nimi, aasta
//Producer - eesnimi, perenimi
//Kui tahad, võid teha KontaktAndmed analoogi, mida Actor ja Producer saavad kasutada

//Igale controller ja tavaline CRUD (Create, Read, Update, Delete)
//(Kui tahad, võid teha Service ka)
//Igale repository

//Igal filmil võib olla mitu Actor-it
//Igal filmil on ainult üks Producer

//Lisa võimekus otsida filme Actor järgi
//Lisa võimekus otsida filme Producer järgi
//Lisa võimekus otsida filme, mis on väljastatud pärast mingit kindlat aastat
//Võib ka omaloomingut teha


