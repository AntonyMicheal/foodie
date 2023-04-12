import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { UserService } from '../services/user.service';

@Component({
  selector: 'app-adminregistration',
  templateUrl: './adminregistration.component.html',
  styleUrls: ['./adminregistration.component.css']
})
export class AdminregistrationComponent implements OnInit {

  adminForm!: FormGroup<any>;
  message!: String;

  constructor( private formBuilder: FormBuilder,private userService: UserService,private router: Router) { 

  }

  ngOnInit(): void {
    this.adminForm = this.formBuilder.group({

      firstName:'',
      lastName: '',
      userName: '',
      password:'',
      repeatPassword: '',
      role: '',
    });
  }


  onSubmit(form: FormGroup) {

    console.log('Valid?', form.valid); // true or false
    console.log('formDetails', form.value);
    this.userService.register(form.value).subscribe(

      (response:any) =>{
        console.log(response);
        this.message='Succesfully Registered'
      
      },
      (error) =>{
        console.log(error);
      
      }

    )


  }
}
