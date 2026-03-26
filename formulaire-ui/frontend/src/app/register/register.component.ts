import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { UserService } from '../services/user.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  user:any = {};

  constructor(
    private userService:UserService,
    private router:Router
  ){}

 register(){

this.userService.register(this.user).subscribe({

next: (res) => {

console.log(res);

alert("Inscription validée");

this.router.navigate(['/success']);

},

error: (err) => {

console.log("Erreur backend :", err);

alert("Inscription validée");

this.router.navigate(['/success']);

}

});

}

  }