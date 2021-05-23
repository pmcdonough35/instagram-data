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

  constructor(private as: AccountService) { }

  ngOnInit(): void {
    this.getAccount();
  }

  getAccount() {
    this.as.getAccount().subscribe(
      response => {
        console.log(response);
      }
    )
  }

}
