import { Component, OnInit } from '@angular/core';
import { FlightService } from './flight.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'Flight-APP';

  constructor(private fs: FlightService) {

  }

  flights = {};

  ngOnInit() {

    this.fs.listFlights().subscribe(flights => {
      
      this.flights = flights;
      console.log(this.flights);
    })

  }


}
