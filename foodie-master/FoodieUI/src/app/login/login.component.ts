import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserAuthService } from '../services/user-auth.service';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  
  myForm!: FormGroup<any>;

    constructor(private formBuilder: FormBuilder,
    private userService: UserService,
    private userAuthService: UserAuthService,
    private router: Router)
     { 

     }

  ngOnInit(): void {
    this.myForm = this.formBuilder.group({
      userName: '',
      password: ''
    });

  }
  
  onSubmit(form: FormGroup) {
    console.log('Valid?', form.valid); // true or false    
    this.userService.authenticate(form.value).subscribe(

      (response:any) =>{
        console.log(response);
        this.userAuthService.setRoles(response.user.role);
        this.userAuthService.setToken(response.user.jwtToken);

        const role=response.user.role;
        console.log("role "+role);

        if(role==='Admin'){
           this.router.navigate(['/admin']);
        }else if(role==='Restaurant'){
          this.router.navigate(['/restaurant']);
        }else if(role==='Customer'){
          this.router.navigate(['/customer']);
        }
      },
      (error) =>{
        console.log(error)
      }

    )

  }
}
