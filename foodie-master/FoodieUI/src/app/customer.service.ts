import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Order } from './restaurant/Order';
import { Restaurant } from './restaurant/restaurant';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {


  apiGatewayurl='http://localhost:9090';

  reqestHeader =new HttpHeaders(
    {"No-Auth": "True"}
    );

  constructor(private http:HttpClient) {

   }

      getRestaurants(): Observable<Array<any>>{ 

       return this.http.get<Array<any>>(this.apiGatewayurl+"/customers/getAllRestaurant",{headers:this.reqestHeader});  

   }

   getDishes(): Observable<Array<any>>{ 

    return this.http.get<Array<any>>(this.apiGatewayurl+"/customers/getAllDishses",{headers:this.reqestHeader});  

}

    saveOrders(order:Order){
        console.log(order)
          return this.http.post<Array<any>>(this.apiGatewayurl+"/customers/saveOrder",order,{headers:this.reqestHeader});  
        }
  
}
