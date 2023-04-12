import { Pipe, PipeTransform } from '@angular/core';
import { Restaurant } from './restaurant/restaurant';

@Pipe({
  name: 'search'
})
export class SearchPipe implements PipeTransform {

  transform(value: Restaurant[], search: string): Restaurant[] {
    console.log('In search Pipe')
    console.log(value)
    if(value.length===0 || search===""){
      return value;
    }
    const restaurants=[];

    for(const r of value){
     if(r.name.includes(search)){
      restaurants.push(r);
     }
    }
    return restaurants;
  }

}
