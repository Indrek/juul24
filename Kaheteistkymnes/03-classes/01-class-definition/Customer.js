var Customer = /** @class */ (function () {
    function Customer(theFirst, theLast) {
        this.firstName = theFirst;
        this.lastName = theLast;
    }
    return Customer;
}());
var myCustomer = new Customer("Heli", "Kopter");
//myCustomer.firstName = "Heli";
//myCustomer.lastName = "Kopter";
console.log(myCustomer.firstName);
console.log(myCustomer.lastName);
