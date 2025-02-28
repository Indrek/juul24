class Customer2 {
    private _firstName: string;
    private _lastName: string;

    constructor(theFirst: string, theLast: string) {
        this._firstName = theFirst;
        this._lastName = theLast;
    }
    public setFirstName(value: string): void {
        this._firstName = value;
    }
    public getFirstName(): string {
        return this._firstName;
    }
    public set lastName(value: string) {
        this._lastName = value;
    }
    public get lastName(): string {
        return this._lastName;
    }


}

let myCustomer2 = new Customer2("Heli", "Kopter");
//myCustomer.firstName = "Heli";
//myCustomer.lastName = "Kopter";

myCustomer2.setFirstName("Maie");
myCustomer2.lastName = "Mesi";

console.log(myCustomer2.getFirstName());
console.log(myCustomer2.lastName);