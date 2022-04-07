import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-pipe-demo',
  templateUrl: './pipe-demo.component.html',
  styleUrls: ['./pipe-demo.component.css']
})
export class PipeDemoComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string ="My Name is Nikunj And i am Trainer";
  pi:number=3.1415927;
  a=0.12345;
  b=9876.5432;
  today=new Date();
  object={name:"nikunj",email:"nikunj@gmail.com",address:"mumbai"};
  
  cust:string ="welcome to the world of custom pipe";
}
