import { Pipe, PipeTransform } from '@angular/core';
import { Restaurant } from './restaurant/restaurant';

@Pipe({
  name: 'locationFilter'
})
export class LocationFilterPipe implements PipeTransform {

  transform(value: Restaurant[], search: string): Restaurant[] {
    console.log('In location Pipe')
    console.log(value)
    if(value.length===0 || search===""){
      return value;
    }
    const restaurants=[];

    for(const r of value){
     if(r.location.includes(search)){
      restaurants.push(r);
     }
    }
    return restaurants;
  }


}
