import { Injectable } from '@angular/core';
import { HttpClient, HttpErrorResponse } from '@angular/common/http';
import { catchError, map, Observable, of } from 'rxjs';

const routes = {
  drivers: 'http://localhost:8080/drivers'
}

@Injectable({
  providedIn: 'root'
})
export class DriverService {

  constructor(private httpClient: HttpClient) { }

  getDrivers = (): Observable<any> => {
    return this.httpClient.get<any>(routes.drivers).pipe(
      map((res:any)=>{
        return res;
      }),
      catchError(() => of(0))
    );
  }
}
