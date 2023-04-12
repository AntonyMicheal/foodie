import { ComponentFixture, TestBed } from '@angular/core/testing';

import { RestaurantregistrationComponent } from './restaurantregistration.component';

describe('RestaurantregistrationComponent', () => {
  let component: RestaurantregistrationComponent;
  let fixture: ComponentFixture<RestaurantregistrationComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ RestaurantregistrationComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(RestaurantregistrationComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
