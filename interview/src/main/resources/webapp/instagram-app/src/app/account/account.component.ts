import { Component, OnInit, Input } from '@angular/core';
import {NgForm} from '@angular/forms';
import { AccountService } from '../account.service';
import { switchMap, tap } from 'rxjs/operators';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  accountId = '';
  account: any;
  post: any;
  constructor(private as: AccountService) { }

  ngOnInit(): void {
  }

  getAccount() {
    var accountId = this.accountId;

    this.as.getAccount(accountId).pipe(
      tap(output => {
        this.account = output;            
    }),
    switchMap(output => this.as.getPost(this.account.graphql.user.edge_owner_to_timeline_media.edges[0].node.shortcode)),
    tap(output2 => {
        this.post = output2;            
    })
  ).subscribe(output2 => { 
    });
  }

}
