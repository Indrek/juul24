console.log("Hello world!");
console.log("Tere mina olen " + " Indrek");
//Muutujad
//let muutujaNimi: andmetüüp = algväärtus
//javascriptis var võtmesõna
var found = true;
var grade = 88.6; //int v komaga
var firstName = "Juku";
var lastName = "Juhanson";
//type mismatch (nt boolean ei saa olla string vms)
var myData = 50;
//any saab kasutada teiste andmetüüpidega ka (nt kui listi teha, generics jaoks)
console.log(found);
console.log("Tere " + firstName + " " + lastName);
//template strings
console.log("Tervist ".concat(firstName, " ").concat(lastName));
