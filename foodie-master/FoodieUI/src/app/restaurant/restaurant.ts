import { Dish } from "./Dish";

export class Restaurant {
    id:number;
    name: string;
    category: string;
    location: string;
    imageUrl: string;
    contactNo: string;
    isApproved: string;
    rating: number;
    username: string;
    password: string;
    dishList:Dish[]

    constructor(id:number,name: string,category: string,location: string,imageUrl: string,
        contactNo: string,isApproved: string,rating: number,username: string,password: string,  dishList:Dish[] ) {
        this.id = id;
        this.name = name;
        this.category = category;
        this.location=location;
        this.imageUrl=imageUrl;
        this.contactNo=contactNo;
        this.isApproved=isApproved;
        this.rating=rating;
        this.username=username;
        this.password=password;
        this.dishList=dishList;
    }


    }