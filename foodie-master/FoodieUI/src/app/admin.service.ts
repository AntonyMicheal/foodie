import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Restaurant } from './restaurant/restaurant';

@Injectable({
  providedIn: 'root'
})
export class AdminService {
  

  apiGatewayurl='http://localhost:9090';

  reqestHeader =new HttpHeaders(
    {"No-Auth": "True"}
    );

  constructor(private http:HttpClient) {


   }

  public getAllRestaurants(){ 
    return this.http.get(this.apiGatewayurl+"/restaurants/v1/getall",{headers:this.reqestHeader});  

   }

  
   public IsDisabled(id:any){ 
    console.log("inside service :" + id);
    return this.http.delete(this.apiGatewayurl+"/restaurants/v1/delete/"+id,);  

   }
   
   
   public IsApproved(restaurant: Restaurant) {
  
     console.log("inside service :" + restaurant.id);
     console.log(restaurant);
   return this.http.put(this.apiGatewayurl+"/restaurants/v1/update/"+restaurant.id,restaurant,{headers:this.reqestHeader});

  }

}
