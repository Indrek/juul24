console.log("Hello world!");
console.log("Tere mina olen " + " Indrek");

//Muutujad
//let muutujaNimi: andmetüüp = algväärtus
//javascriptis var võtmesõna

let found: boolean = true;
let grade: number = 88.6; //int v komaga
let firstName: string = "Juku";
let lastName: string = "Juhanson";

//type mismatch (nt boolean ei saa olla string vms)

let myData: any = 50;
//any saab kasutada teiste andmetüüpidega ka (nt kui listi teha, generics jaoks)

console.log(found);
console.log("Tere " + firstName + " " + lastName);

//template strings
console.log(`Tervist ${firstName} ${lastName}`);
