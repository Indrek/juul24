import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './model/student';

@Injectable({
  providedIn: 'root'
})
export class SchoolService {

  private apiUrl = 'http://localhost:8080';

  constructor(private http: HttpClient) { }

  public getAllStudents(): Observable<Student[]> {
    return this.http.get<Student[]>(`${this.apiUrl}/student`);
  }
  public addStudent(student: Student): Observable<Student> {
    return this.http.post<Student>(`${this.apiUrl}/student`, student);
  }
  public deleteStudent(id: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/student/${id}`);
  }
  public updateStudent(id: number, student: Student): Observable<Student> {
    return this.http.put<Student>(`${this.apiUrl}/student/${id}`, student);
  }
}
