import { CommonModule } from '@angular/common';
import { Component, OnInit } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { OneHeroComponent } from '../one-hero/one-hero.component';

@Component({
  selector: 'app-view-heroes',
  standalone: true,
  imports: [CommonModule, FormsModule, OneHeroComponent],
  templateUrl: './view-heroes.component.html',
  styleUrl: './view-heroes.component.css'
})
export class ViewHeroesComponent implements OnInit{
 
  //Komponentide siseste muutujate ja funktsioonide järjekord:
  //1. Muutujatele väärtuste andmine
  //2. Konstruktori käivitamine
  //3. ngOnInit funktsiooni käivitamine
  //4. HTML käivitamine

  kuvatav_stringina = "Superman";
  kuvatav_numbrina = 300;
  kuvatav_booleanina = true;
  heroes: any[] = [
    {name: 'Batman', color: 'black'},
    {name: 'Flash', color: 'red'},
    {name: 'Wolverine', color: 'yellow'}
  ]
  hero: any = {name: "Superman", active: true};
  heroCount = 300;

  ngOnInit(): void {
    console.log("Käivitati 'Vaata' vaheleht");
  }

  startFunctionAfterMouseover() {
    console.log("Liiguti hiirega üle");
  }
  startFunctionAfterClick() {
    console.log("Klikiti nupule");
  }
  startAfterKeypress() {
    console.log("Vajutati klaviatuuril nuppu");
  }

}
