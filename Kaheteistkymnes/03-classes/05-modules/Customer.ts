export class Customer3 {
    
    

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

