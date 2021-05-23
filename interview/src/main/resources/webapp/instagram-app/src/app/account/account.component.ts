import { Component, OnInit, Input } from '@angular/core';
import {NgForm} from '@angular/forms';
import { AccountService } from '../account.service';
import {Account} from '../account';

@Component({
  selector: 'app-account',
  templateUrl: './account.component.html',
  styleUrls: ['./account.component.css']
})
export class AccountComponent implements OnInit {

  accountId = '';
  account: any
  constructor(private as: AccountService) { }

  ngOnInit(): void {
  }

  getAccount() {
    var accountId = this.accountId;
    console.log(accountId);
    this.as.getAccount(accountId).subscribe(
      response => {
        this.account = response; 
        console.log(this.account)   
      }
    )
  }

}
