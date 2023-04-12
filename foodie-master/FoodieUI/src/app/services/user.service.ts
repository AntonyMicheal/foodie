import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { UserAuthService } from './user-auth.service';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  apiGatewayurl='http://localhost:9090';

  message:any;

  reqestHeader =new HttpHeaders(
    {"No-Auth": "True"}
    );

  constructor(private httpClient: HttpClient,private userAuthService: UserAuthService) {


   }

public authenticate(loginData: any){

console.log("Inside Authenticate");
console.log(loginData);
return this.httpClient.post(this.apiGatewayurl+"/authenticate",loginData,{headers:this.reqestHeader});


  }

  public register(userData: any){

    console.log("Inside Register");
    console.log(userData);
    return this.httpClient.post(this.apiGatewayurl+"/registerNewUser",userData,{headers:this.reqestHeader});
    
    
      }

  

  public getRoles(){
    return this.httpClient.get('http://localhost:8080/getRoles',{headers:this.reqestHeader});

  }


  public roleMatch(allowedRoles:any): any {
    let isMatch = false;
    const userRoles: any = this.userAuthService.getRoles();
    if (userRoles != null && userRoles) {
      for (let i = 0; i < userRoles.length; i++) {
        for (let j = 0; j < allowedRoles.length; j++) {
          if (userRoles === allowedRoles[j]) {
            isMatch = true;
            return isMatch;
          } else {
            return isMatch;
          }
        }
      }
    }
  }

 
}
