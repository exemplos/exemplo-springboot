import {Contato} from './contato.model'
import {AGENDA_API} from '../app.config'
import { Http } from '@angular/http'
import { Observable } from "rxjs/Observable";
import { Injectable } from "@angular/core";
import { ErrorHandler } from "../error.handler";


import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch'

@Injectable()
export class ContatoService{

    contatos:Contato[]

    constructor(private http:Http){}

    list():Observable<Contato[]>{
        return this.http.get(`${AGENDA_API}/contato`)
            .map(response => response.json())
            .catch(ErrorHandler.handleError)
    }

    save(contato:Contato):Observable<any>{
        return this.http.post(`${AGENDA_API}/contato`, contato)
    }
}

