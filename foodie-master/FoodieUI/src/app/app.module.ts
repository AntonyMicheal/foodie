import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { HomeComponent } from './home/home.component';
import { AdminComponent } from './admin/admin.component';
import { CustomerComponent } from './customer/customer.component';
import { RestaurantComponent } from './restaurant/restaurant.component';
import { HeaderComponent } from './header/header.component';
import { LoginComponent } from './login/login.component';
import { ForbiddenComponent } from './forbidden/forbidden.component';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpClientModule, HTTP_INTERCEPTORS } from '@angular/common/http';
import { AuthGuard } from './authGaurd/auth.guard';
import { AuthInterceptor } from './authGaurd/auth.interceptor';
import { UserService } from './services/user.service';
import { AdminregistrationComponent } from './adminregistration/adminregistration.component';
import { CustomerRegistrationComponent } from './customer-registration/customer-registration.component';
import { RestaurantregistrationComponent } from './restaurantregistration/restaurantregistration.component';
import { AddrestaurantComponent } from './addrestaurant/addrestaurant.component';
import { FooterComponent } from './footer/footer.component';
import { AddDishComponent } from './add-dish/add-dish.component';
import { RestaurantFilterPipe } from './restaurant-filter.pipe';
//import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import { SearchPipe } from './search.pipe';
import { LocationFilterPipe } from './location-filter.pipe';
import { RatingModule } from 'ngx-bootstrap/rating';
@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdminComponent,
    CustomerComponent,
    RestaurantComponent,
    HeaderComponent,
    LoginComponent,
    ForbiddenComponent,
    AdminregistrationComponent,
    CustomerRegistrationComponent,
    RestaurantregistrationComponent,
    AddrestaurantComponent,
    FooterComponent,
    AddDishComponent,
    RestaurantFilterPipe,
    SearchPipe,
    LocationFilterPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    BrowserAnimationsModule,
    RatingModule.forRoot(),
    FormsModule,
    ReactiveFormsModule,
    RouterModule,
    HttpClientModule

    
  ],
  providers: [
    AuthGuard,
    {
    provide : HTTP_INTERCEPTORS,
    useClass: AuthInterceptor,
    multi:true
    },
    UserService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
