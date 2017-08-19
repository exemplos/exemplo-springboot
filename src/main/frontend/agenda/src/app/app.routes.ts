import {Routes} from '@angular/router';
import {DashboardComponent} from './dashboard/dashboard.component';
import { TesteComponent } from './teste/teste.component';
import { ContatosComponent } from "./contatos/contatos.component";
import { EventosComponent } from "./eventos/eventos.component";


export const ROUTES:Routes = [
  {path:'', component:DashboardComponent},
  {path:'teste', component:TesteComponent},
  {path:'eventos', component:EventosComponent},
  {path:'contatos', component:ContatosComponent}
];