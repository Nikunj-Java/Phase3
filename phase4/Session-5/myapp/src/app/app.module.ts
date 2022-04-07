import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ChangeColorDirective } from './ChangeColorDirective';
import { CustomPipe } from './CustomPipe';
import { HighlightDirective } from './HighlightDirective';
import { PipeDemoComponent } from './pipe-demo/pipe-demo.component';

@NgModule({
  declarations: [
    AppComponent,
    ChangeColorDirective,
    HighlightDirective,
    PipeDemoComponent,
    CustomPipe
   
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
