import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PessoaService {

  private apiUrl = 'http://localhost:8080/api/pessoas'; // Substitua pela URL do seu backend

  constructor(private http: HttpClient) { }

  enviarDados(pessoa: any): Observable<any> {
    return this.http.post(this.apiUrl, pessoa);
  }
}
