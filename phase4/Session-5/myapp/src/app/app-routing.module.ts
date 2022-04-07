import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AboutusComponent } from './aboutus/aboutus.component';
import { HomeComponent } from './home/home.component';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';

const routes: Routes = [

  //path to redirect

  {"path":"about",component:AboutusComponent},
  {"path":"pipe",component:PipeDemoComponent},
  {"path":"home",component:HomeComponent},

];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
