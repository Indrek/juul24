import { Injectable } from '@angular/core';
import { Subject } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class HeroService {

  heroValueChanged = new Subject();

  constructor() { }
}
