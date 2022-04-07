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

@NgModule({
  declarations: [
    AppComponent,
    ChangeColorDirective,
    HighlightDirective,
    PipeDemoComponent,
    CustomPipe,
    HomeComponent,
    AboutusComponent
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
