import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Dish } from '../restaurant/Dish';
import { Order } from '../restaurant/Order';
import { Restaurant } from '../restaurant/restaurant';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-customer',
  templateUrl: './customer.component.html',
  styleUrls: ['./customer.component.css']
})
export class CustomerComponent implements OnInit {

  message:any;
  restaurants=new Array<Restaurant>();

  dishses=new Array<Dish>();

  input='';
  search='';

  max = 5;
  isReadonly = false;

  orders=new Array<Order>();


  constructor(private userService: UserService, private customerService:CustomerService) { 


  }
  ngOnInit(): void {

  }

  public order(dish:Dish)
  {
        let order=new Order(dish.id,dish.price,'1',dish.dishName);
       // this.orders.push(order);
        this.customerService.saveOrders(order).subscribe(
          (response) => {
            console.log(response);
            this.message='Order saved'
          }, 
          (error)=>{
            console.log(error);
          }
        );
  }


public getRestaurants()
{
  this.customerService.getRestaurants().subscribe(
    (response) => {
      this.restaurants=response;
      console.log(this.restaurants);
    }, 
    (error)=>{
      console.log(error);
    }
  );

}

public getDishes()
{
  this.customerService.getDishes().subscribe(
    (response) => {
      this.dishses=response;
      console.log('dishses');
      console.log(this.dishses);
    }, 
    (error)=>{
      console.log(error);
    }
  );

}

}
