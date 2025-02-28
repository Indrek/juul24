import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, FormsModule, ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HeroService } from '../hero.service';

@Component({
  selector: 'app-edit-hero',
  standalone: true,
  imports: [FormsModule, ReactiveFormsModule, CommonModule, RouterModule],
  templateUrl: './edit-hero.component.html',
  styleUrl: './edit-hero.component.css'
})
export class EditHeroComponent implements OnInit{

form!: FormGroup;
hero = {active: true, imgSrc: 'https://avatarfiles.alphacoders.com/131/131354.jpg', id:300}

constructor(private heroService: HeroService) {}

ngOnInit(): void {
  this.form = new FormGroup({
    name: new FormControl("Superman"),
    color: new FormControl("blue"),
    ability: new FormControl("flight"),
    active: new FormControl(true)
  })
}

onSubmit() {
  console.log(this.form.value);
}

changeHero() {
  this.heroService.heroValueChanged.next(1);
}

}
