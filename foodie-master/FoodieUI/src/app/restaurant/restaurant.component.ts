import { Component, OnInit } from '@angular/core';
import { RestaurantserviceService } from '../restaurantservice.service';

@Component({
  selector: 'app-restaurant',
  templateUrl: './restaurant.component.html',
  styleUrls: ['./restaurant.component.css']
})
export class RestaurantComponent implements OnInit {

  message:any;
  restaurants!:any;
  dishses!:any;

  constructor(private  service:RestaurantserviceService) { }

  public getRestaurant()
  {
    this.service.getrestaurants().subscribe(
      (response: any) =>{
        this.restaurants=response;
        console.log(response);
      },
      (error: any)=>{
        console.log(error);
      }
    )
  }

  ngOnInit(): void {

  }
public getDishes()
{
  this.service.getDishes().subscribe(
    (response:any) => {
      this.dishses=response;
      console.log('dishses');
      console.log(this.dishses);
    }, 
    (error:any)=>{
      console.log(error);
    }
  );

}

public deletedish(id:any)
{
 console.log(id);
 this.service.deletedish(id).subscribe(
  (response:any) => {
    console.log('dishses');
    console.log(this.dishses);
  }, 
  (error:any)=>{
    console.log(error);
  }
);
}

}
