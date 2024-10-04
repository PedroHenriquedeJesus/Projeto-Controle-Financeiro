import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class MetaService {

  private apiUrl = 'http://localhost:8080/api/metas';

  constructor(private http: HttpClient) { }

  enviarDados(meta: any): Observable<any> {
    return this.http.post(this.apiUrl, meta);
  }
}
