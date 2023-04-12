import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddrestaurantComponent } from './addrestaurant/addrestaurant.component';
import { AdminComponent } from './admin/admin.component';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { AuthGuard } from './authGaurd/auth.guard';
import { CustomerRegistrationComponent } from './customer-registration/customer-registration.component';
import { CustomerComponent } from './customer/customer.component';
import { ForbiddenComponent } from './forbidden/forbidden.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RestaurantComponent } from './restaurant/restaurant.component';

import { RestaurantregistrationComponent } from './restaurantregistration/restaurantregistration.component';
import { AddDishComponent } from './add-dish/add-dish.component';

const routes: Routes = [
    { path: 'admin', component: AdminComponent, canActivate:[AuthGuard], data:{roles:['Admin']}},
    { path: 'customer', component: CustomerComponent,canActivate:[AuthGuard], data:{roles:['Customer']}},
    { path: 'restaurant', component: RestaurantComponent,canActivate:[AuthGuard], data:{roles:['Restaurant']}},
    { path: 'addrestaurant', component: AddrestaurantComponent,canActivate:[AuthGuard], data:{roles:['Restaurant']}},
    { path: 'adddish', component: AddDishComponent,canActivate:[AuthGuard], data:{roles:['Restaurant']}},
    
    {path:'home',component:HomeComponent},
    { path: 'login', component: LoginComponent },
    { path: 'forbidden', component: ForbiddenComponent},
    { path: 'adminregistration', component: AdminregistrationComponent},
    { path: 'customer-reg', component:CustomerRegistrationComponent},
    { path: 'restaurantregistration', component: RestaurantregistrationComponent},
    { path: '', component: HomeComponent}
    

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
