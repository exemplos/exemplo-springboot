import { Component, OnInit } from '@angular/core';
import { ContatoService } from "./contato.service";
import { Contato } from "./contato.model";
import { NgForm } from "@angular/forms";

@Component({
  selector: 'a-contatos',
  templateUrl: './contatos.component.html',
  styleUrls: ['./contatos.component.css']
})
export class ContatosComponent implements OnInit {

  contatos:Contato[]

  constructor(private contatoService:ContatoService) { }

  ngOnInit() {
    this.list()
  }

  list(){
    this.contatoService.list().subscribe(result => this.contatos = result)
  }

  save(contato:Contato){
    this.contatoService.save(contato).subscribe(r => {
      this.list()
    })
  }

}
