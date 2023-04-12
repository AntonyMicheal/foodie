import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { RestaurantserviceService } from '../restaurantservice.service';

@Component({
  selector: 'app-add-dish',
  templateUrl: './add-dish.component.html',
  styleUrls: ['./add-dish.component.css']
})
export class AddDishComponent implements OnInit {

  add_dish!: FormGroup<any>;
  message!: String;

  constructor(private formBuilder: FormBuilder,private restarant: RestaurantserviceService,private router: Router) { }

  ngOnInit(): void {
    this.add_dish = this.formBuilder.group({
      dishName: ['', Validators.required],
      description: ['', Validators.required],
      price:  ['', Validators.required],
      availableTime:  ['', Validators.required],
      availableDay: ['', Validators.required],
      imageUrl:  ['', Validators.required],
      isEnabled:  ['', Validators.required],
      type: ['', Validators.required],
      restaurantId: ['', Validators.required],
      restaurantName: ['', Validators.required],
      
    });
  }

  onSubmit(form: FormGroup) {

    console.log('Valid?', form.valid); // true or false
    console.log('formDetails', form.value);
    this.restarant.postdish(form.value).subscribe(

      (response:any) =>{
        console.log(response);
        this.message='Succesfully Dish Added'
      
      },
      (error: any) =>{
        console.log(error);
      
      }

    )


  }

}
