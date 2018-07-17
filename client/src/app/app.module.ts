import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { DestinationService } from './shared/destination/destination.service';
import { DestinationListComponent } from './destination-list/destination-list.component';
import { HTTP_INTERCEPTORS, HttpClientModule } from '@angular/common/http';
import { MatButtonModule, MatCardModule, MatInputModule, MatListModule, MatToolbarModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';


@NgModule({
  declarations: [
    AppComponent,
    DestinationListComponet,
    DestinationListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    BrowserAnimationsModule,
    MatCardModule,
    MatInputModule,
    MatListModule,
    MatToolbarModule
  ],
  providers: [DestinationService],
  bootstrap: [AppComponent]
})

export class AppModule { }



