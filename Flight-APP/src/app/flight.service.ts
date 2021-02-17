import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
@Injectable({
  providedIn: 'root'
})
export class FlightService {

  constructor(private http:HttpClient) { }

  baseUrl="http://localhost:8080/api/pss";

  listFlights():any{
    return this.http.get(this.baseUrl);
  }


}
