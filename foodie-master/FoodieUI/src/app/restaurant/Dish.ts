export class Dish {
    id:number;
    price: number;
    description: string;
    dishName: string;
    restaurantName: string;
    availableTime: string;
    availableDay: string;
    imageUrl: string;
    isEnabled: string;
    type: string;

    constructor(id:number,price: number,description: string, availableDay: string,
         availableTime: string,imageUrl: string,isEnabled: string,type: string, dishName: string,restaurantName: string) {
        this.id = id;
        this.price = price;
        this.description = description;
        this.availableDay=availableDay;
        this.imageUrl=imageUrl;
        this.availableTime=availableTime;
        this.isEnabled=isEnabled;
        this.type=type;
        this.dishName=dishName;
        this.restaurantName=restaurantName

    }

    }