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
  postId = '';
  account: any;
  post: any;
  constructor(private as: AccountService) { }

  ngOnInit(): void {
  }

  getAccount() {
    var accountId = this.accountId;
    var postId = this.postId;
    console.log(postId);
    this.as.getAccount(accountId).subscribe(
      response => {
        this.account = response; 
        console.log(this.account)   
      }
    )

    this.as.getPost(postId).subscribe(
      response => {
        this.account = response; 
        console.log(this.post)   
      }
    )
  }

}
