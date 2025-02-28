class Customer3 {
    
    

    constructor(private _firstName: string, private _lastName: string) {
        
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

let myCustomer3 = new Customer3("Heli", "Kopter");
//myCustomer.firstName = "Heli";
//myCustomer.lastName = "Kopter";

myCustomer3.setFirstName("Maie");
myCustomer3.lastName = "Mesi";

console.log(myCustomer3.getFirstName());
console.log(myCustomer3.lastName);