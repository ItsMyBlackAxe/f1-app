import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';
import { MatCardModule } from '@angular/material/card';

import { AppComponent } from './app.component';
import { DriverComponent } from './driver/driver.component';

@NgModule({
  declarations: [
    AppComponent,
    DriverComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    MatCardModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
