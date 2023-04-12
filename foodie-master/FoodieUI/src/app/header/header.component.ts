import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserAuthService } from '../services/user-auth.service';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  roles!:[];
  constructor(private userAuthService: UserAuthService,private router:Router,public userService: UserService) { 


  }

  ngOnInit(): void {
    this.userService.getRoles().subscribe(
      (response:any) =>{
        this.roles=response;
        console.log(response);
      },
      (error) =>{
        console.log(error)
      })
  }


  public register(){
    this.router.navigate(['/adminregistration']);
   }

  public isLoggedIn(){
    return this.userAuthService.isLoggedIn();
  }

  public logout(){
   this.userAuthService.clear();
   this.router.navigate(['/home']);
  }
}
