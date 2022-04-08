import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeColorDirective } from './ChangeColorDirective';
import { CustomPipe } from './CustomPipe';
import { HighlightDirective } from './HighlightDirective';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';
import { HomeComponent } from './home/home.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { HttpComponent } from './http/http.component';
import { UserComponent } from './user/user.component';
import { DataService } from './data.service';
import { HttpClientModule } from '@angular/common/http';

@NgModule({
  declarations: [
    AppComponent,
    ChangeColorDirective,
    HighlightDirective,
    PipeDemoComponent,
    CustomPipe,
    HomeComponent,
    AboutusComponent,
    HttpComponent,
    UserComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [DataService],
  bootstrap: [AppComponent]
})
export class AppModule { }
