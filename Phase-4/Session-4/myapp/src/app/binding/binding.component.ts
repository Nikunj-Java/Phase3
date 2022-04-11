import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  name:string ="Nikunj Soni";
  url:string ="https://www.google.com";
  we:number=700;
  products=[
    {name:"pencil",price:"8.3",available:"04-04-2022",rating:4.8},
    {name:"pen",price:"10",available:"05-04-2022",rating:4.0},
    {name:"eraser",price:"5",available:"03-04-2022",rating:4.5},
    {name:"scale",price:"20",available:"10-04-2022",rating:4.9}
  ];

  flag=false;
  show(){
    this.flag=!this.flag;
  }
}
