import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RestaurantserviceService } from '../restaurantservice.service';

@Component({
  selector: 'app-addrestaurant',
  templateUrl: './addrestaurant.component.html',
  styleUrls: ['./addrestaurant.component.css']
})
export class AddrestaurantComponent implements OnInit {
  addrestaurant!: FormGroup<any>;
  message!: String;

  constructor(private formBuilder: FormBuilder,private restarant: RestaurantserviceService,private router: Router) { }

  ngOnInit(): void {
    this.addrestaurant = this.formBuilder.group({

      name: ['', Validators.required],
      category:  ['', Validators.required],
      location:  ['', Validators.required],
      imageUrl: ['', Validators.required],
      contactNo:  ['', Validators.required],
      rating:  ['', Validators.required],
      username: ['', Validators.required],
      password: ['', Validators.required],
      isApproved: ['', Validators.required]
    });
  }

  onSubmit(form: FormGroup) {

    console.log('Valid?', form.valid); // true or false
    console.log('formDetails', form.value);
    this.restarant.register(form.value).subscribe(

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

