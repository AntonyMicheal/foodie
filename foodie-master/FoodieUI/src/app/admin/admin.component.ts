import { Component, OnInit } from '@angular/core';
import { AdminService } from '../admin.service';
import { Restaurant } from '../restaurant/restaurant';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  constructor(private adminService : AdminService) { }

  ngOnInit(): void {
  }

  restaurants:any;//= new Array<Restaurant>();
  

  public getAllRestaurants()
  {
    // window.alert("inside admin component getAllRestaurant method");
    this.adminService.getAllRestaurants().subscribe(
      (response:any) => {
        this.restaurants=response;
        console.log(response);
        
      }, 
      (error)=>{
        console.log(error);
      }
    );
  
  }

  public IsDisabled(){
    console.log("printing------------------------"+this.restaurants[0].id);
   // window.alert("inside admin component disable method");
    this.adminService.IsDisabled(this.restaurants[0].id).subscribe(
      (response) => {
        console.log(response);
        this.restaurants=response;
      }, 
      (error)=>{
        console.log(error);
      }
    );

  }

 
public IsApproved(restaurant: Restaurant){

 // window.alert("after clicking is approved");

  console.log(restaurant);

  this.adminService.IsApproved(restaurant).subscribe(
    (response:any) => {
      console.log(response);
      this.restaurants=response;
    }, 
    (error)=>{
      console.log(error);
    }
  );


}


}
