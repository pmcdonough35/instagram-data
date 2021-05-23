import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  
  constructor(private _http: HttpClient) { }
  
  public getAccount():Observable<any>{
    return this._http.get<any>('http://localhost:8080/api/account/cristiano/?__a=1');
  }
}
