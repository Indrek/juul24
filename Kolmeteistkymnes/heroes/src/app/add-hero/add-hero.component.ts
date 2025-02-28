import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';

@Component({
  selector: 'app-add-hero',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './add-hero.component.html',
  styleUrl: './add-hero.component.css'
})
export class AddHeroComponent {
onSubmit(addHeroForm: NgForm) {
  console.log(addHeroForm.value);
}

}
