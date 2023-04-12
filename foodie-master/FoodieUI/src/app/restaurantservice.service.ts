import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs/internal/Observable';

@Injectable({
  providedIn: 'root'
})
export class RestaurantserviceService {
  deletedishes(id: any) {
    throw new Error('Method not implemented.');
  }

  apiGatewayurl='http://localhost:9090';

  reqestHeader =new HttpHeaders(
    {"No-Auth": "True"}
    );

  constructor(private http:HttpClient) { }

public getrestaurants()
{
  return this.http.get(this.apiGatewayurl+"/restaurants/v1/get/getall",{headers:this.reqestHeader});  

}
public register(userData: any){

  console.log("Inside Register");
  console.log(userData);
  return this.http.post(this.apiGatewayurl+"/restaurants/v1/save",userData,{headers:this.reqestHeader});
  
  
    }
    public postdish(dish: any){

      console.log("Inside Register");
      console.log(dish);
      return this.http.post(this.apiGatewayurl+"/restaurants/dish/v1/save",dish,{headers:this.reqestHeader});
      
      
        }
        public getDishes(): Observable<Array<any>>{ 

          return this.http.get<Array<any>>(this.apiGatewayurl+"/restaurants/dish/v1/getall",{headers:this.reqestHeader});  
      
      }
      deletedish(id:any)
      {
        return this.http.delete<Array<any>>(this.apiGatewayurl+"/restaurants/dish/v1/delete/"+id,{headers:this.reqestHeader});  
      
      }
}
