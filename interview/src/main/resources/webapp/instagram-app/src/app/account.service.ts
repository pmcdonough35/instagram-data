import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient, HttpParams} from '@angular/common/http'

@Injectable({
  providedIn: 'root'
})
export class AccountService {
  
  constructor(private _http: HttpClient) { }
  
  public getAccount(accountId: string):Observable<any>{
    let getAccountUrl = `http://localhost:8080/api/account/${accountId}/`;
    const params = new HttpParams().append('__a', '1');
    return this._http.get<any>(getAccountUrl, {params});
  }

  public getPost(postId: string):Observable<any>{
    console.log(postId);
    let getPostUrl = `http://localhost:8080/api/post/${postId}/`;
    const params = new HttpParams().append('__a', '1');
    return this._http.get<any>(getPostUrl, {params});
  }
}
