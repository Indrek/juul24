var Customer2 = /** @class */ (function () {
    function Customer2(theFirst, theLast) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }
    Customer2.prototype.setFirstName = function (value) {
        this._firstName = value;
    };
    Customer2.prototype.getFirstName = function () {
        return this._firstName;
    };
    Object.defineProperty(Customer2.prototype, "lastName", {
        get: function () {
            return this._lastName;
        },
        set: function (value) {
            this._lastName = value;
        },
        enumerable: false,
        configurable: true
    });
    return Customer2;
}());
var myCustomer2 = new Customer2("Heli", "Kopter");
//myCustomer.firstName = "Heli";
//myCustomer.lastName = "Kopter";
myCustomer2.setFirstName("Maie");
myCustomer2.lastName = "Mesi";
console.log(myCustomer2.getFirstName());
console.log(myCustomer2.lastName);
