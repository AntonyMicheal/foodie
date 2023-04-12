import { Pipe, PipeTransform } from '@angular/core';
import { Dish } from './restaurant/Dish';

@Pipe({
  name: 'restaurantFilter'
})
export class RestaurantFilterPipe implements PipeTransform {

  transform(value: Dish[], input:string): Dish[] {
    console.log('In Pipe')
    console.log(value)
    if(value.length===0 || input===""){
      return value;
    }
    const dishses=[];

    for(const d of value){
     if(d.dishName.includes(input)){
      dishses.push(d);
     }
    }
    return dishses;
  }

}
