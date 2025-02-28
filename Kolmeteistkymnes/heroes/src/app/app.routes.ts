import { Routes } from '@angular/router';
import { HomePageComponent } from './home-page/home-page.component';
import { AddHeroComponent } from './add-hero/add-hero.component';
import { EditHeroComponent } from './edit-hero/edit-hero.component';
import { ViewHeroesComponent } from './view-heroes/view-heroes.component';

export const routes: Routes = [
    {path: "", component: HomePageComponent},
    {path: "lisa", component: AddHeroComponent},
    {path: "muuda/:id", component: EditHeroComponent},
    {path: "vaata", component: ViewHeroesComponent}
];
