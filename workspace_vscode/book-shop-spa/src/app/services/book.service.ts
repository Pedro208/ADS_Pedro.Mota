import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http'
import {Observable} from 'rxjs/internal/Observable'


@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(private client: HttpClient) { }
  public findAllBooks():void {

  }
}
