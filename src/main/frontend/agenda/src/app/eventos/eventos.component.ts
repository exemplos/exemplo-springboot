import { Component, OnInit } from '@angular/core';
import { Contato } from "../contatos/contato.model";
import { ContatoService } from "../contatos/contato.service";

@Component({
  selector: 'a-eventos',
  templateUrl: './eventos.component.html',
  styleUrls: ['./eventos.component.css']
})
export class EventosComponent implements OnInit {

  contatos:Contato[]

  constructor(private contatoService:ContatoService) { }

  ngOnInit() {
    this.contatoService.list().subscribe(result => this.contatos = result)
  }

}
