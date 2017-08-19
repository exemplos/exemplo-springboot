import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {RouterModule} from '@angular/router';
import {ROUTES} from './app.routes';

import { AppComponent } from './app.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { TesteComponent } from './teste/teste.component';
import { MenuComponent } from './menu/menu.component';
import { ContatosComponent } from './contatos/contatos.component';
import { ContatoService } from "./contatos/contato.service";
import { HttpModule } from "@angular/http";
import { FormsModule, NgForm } from "@angular/forms";
import { EventosComponent } from './eventos/eventos.component';
import { Select2Module } from 'ng2-select2';

@NgModule({
  declarations: [
    AppComponent,
    DashboardComponent,
    TesteComponent,
    MenuComponent,
    ContatosComponent,
    EventosComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    Select2Module,
    RouterModule.forRoot(ROUTES)
  ],
  providers: [ContatoService, NgForm],
  bootstrap: [AppComponent]
})
export class AppModule { }
