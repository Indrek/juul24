//Angulari importid
import { Component, OnInit } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { HttpErrorResponse } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormGroup, FormsModule, NgForm, ReactiveFormsModule } from '@angular/forms';

//Kolmandate osapoolte failid

//autori poolt loodud failid
import { Student } from './model/student';
import { SchoolService } from './school.service';
import { response } from 'express';


@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, CommonModule, FormsModule, ReactiveFormsModule],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit{

  public students!: Student[];
  studentId!: number;
  form!: FormGroup;
  studentToEdit?: Student;
  studentToDelete?: Student;

  constructor(private schoolService: SchoolService) {}

  ngOnInit(): void {
    this.getStudents();
  }
  getStudents() {
    this.schoolService.getAllStudents().subscribe(
      {
        next: (response: Student[]) => {
          console.log(response);
          this.students = response;
        },
        error: (error: HttpErrorResponse) => alert(error.message),
        complete: () => console.log("complete")
      }
    );
  }
  addStudent(addForm: NgForm): void {
    this.schoolService.addStudent(addForm.value).subscribe(
      {
        next: (response: Student) => {
          console.log(response);
          this.getStudents();
          addForm.reset();
        },
        error: (error: HttpErrorResponse) => {
          alert(error.message);
          addForm.reset();
        }
      }
    );
  }
  deleteStudent(studentId: number): void {
    this.schoolService.deleteStudent(studentId).subscribe(
      {
        next: (response: void) => {
          console.log(response);
          this.getStudents()
        },
        error: (error: HttpErrorResponse) => console.log(error)
      }
    );
  }
  editStudent(student: Student) {
    this.schoolService.updateStudent(student.id, student).subscribe(
      {
        next: (response: Student) => {
          console.log(response);
          this.getStudents();
        },
        error: (error: HttpErrorResponse) => {
          alert(error.message);
        }
      }
    );
  }
  onOpenModal(student: Student, mode: string): void {
    //mode ütleb, kas me tahame lisada, muuta või kustutada
    const container = document.getElementById('main-container');
    const button = document.createElement('button');
    button.type = 'button'
    button.style.display = 'none';
    button.setAttribute('data-toggle', 'modal');
    if(mode == 'add') {
      button.setAttribute('data-target', '#addStudentModal');
    }
    if(mode == 'edit') {
      this.studentToEdit = student;
      button.setAttribute('data-target', '#editStudentModal');
    }
    if(mode == 'delete') {
      this.studentToDelete = student;
      button.setAttribute('data-target', "#deleteStudentModal");
    }
    container?.appendChild(button);
    button.click();
  }

  public searchStudents(key: string): void {
    const results: Student[] = []; //võtab studentid, kelle nimi, email või dob sobib key-ga
    for(const student of this.students) {
      if(student.name.toLowerCase().indexOf(key.toLowerCase()) != -1
      || student.email.toLowerCase().indexOf(key.toLowerCase()) != -1
      || student.dateOfBirth.toString().toLowerCase().indexOf(key.toLowerCase()) != -1 
      || student.age.toString().toLowerCase().indexOf(key.toLowerCase()) != -1) {
        results.push(student);
      }
    }
    this.students = results;
    //resetime
    if(results.length == 0 || !key) {
      this.getStudents();
    }
  }
  
}
