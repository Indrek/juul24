import { Component, Input, OnInit } from '@angular/core';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-one-hero',
  standalone: true,
  imports: [],
  templateUrl: './one-hero.component.html',
  styleUrl: './one-hero.component.css'
})
export class OneHeroComponent implements OnInit {

  @Input() heroInput: any;
  
  constructor(private heroService: HeroService) {}

  
  ngOnInit(): void {
    console.log("OneHeroComponent käivitus");
    this.heroService.heroValueChanged.subscribe((response) => {
      this.heroInput = response
    });  
  }

}
