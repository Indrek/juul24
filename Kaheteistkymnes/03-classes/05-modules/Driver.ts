import {Customer3} from "./Customer";

let myCustomer3 = new Customer3("Heli", "Kopter");
//myCustomer.firstName = "Heli";
//myCustomer.lastName = "Kopter";

myCustomer3.setFirstName("Maie");
myCustomer3.lastName = "Mesi";

console.log(myCustomer3.getFirstName());
console.log(myCustomer3.lastName);