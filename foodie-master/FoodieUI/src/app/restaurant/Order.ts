export class Order {
    id:number;
    price: number;
    quantity: string;
    dishName: string;
    constructor(id:number,price: number,quantity:string, dishName: string) {
        this.id=id;
        this.dishName=dishName;
        this.price = price;
        this.quantity=quantity;
    }

    }