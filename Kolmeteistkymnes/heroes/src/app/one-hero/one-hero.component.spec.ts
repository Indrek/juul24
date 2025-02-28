import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OneHeroComponent } from './one-hero.component';

describe('OneHeroComponent', () => {
  let component: OneHeroComponent;
  let fixture: ComponentFixture<OneHeroComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OneHeroComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OneHeroComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
