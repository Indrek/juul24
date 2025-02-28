"use strict";
class Customer3 {
    constructor(_firstName, _lastName) {
        this._firstName = _firstName;
        this._lastName = _lastName;
    }
    setFirstName(value) {
        this._firstName = value;
    }
    getFirstName() {
        return this._firstName;
    }
    set lastName(value) {
        this._lastName = value;
    }
    get lastName() {
        return this._lastName;
    }
}
let myCustomer3 = new Customer3("Heli", "Kopter");
//myCustomer.firstName = "Heli";
//myCustomer.lastName = "Kopter";
myCustomer3.setFirstName("Maie");
myCustomer3.lastName = "Mesi";
console.log(myCustomer3.getFirstName());
console.log(myCustomer3.lastName);
