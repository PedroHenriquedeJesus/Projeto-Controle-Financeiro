import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common'; // Importar CommonModule
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';
import { FloatLabelModule } from 'primeng/floatlabel';
import { InputMaskModule } from 'primeng/inputmask';
import { Router } from '@angular/router';

//para services
import { HttpClientModule } from '@angular/common/http';
import {PessoaService} from "../Services/pessoaService/pessoa.service";

@Component({
  selector: 'app-pessoa-component',
  standalone: true,
    imports: [
      FormsModule,
      CommonModule, // Adicionar CommonModule
      CardModule,
      InputTextModule,
      InputTextareaModule,
      ButtonModule,
      FloatLabelModule,
      InputMaskModule,
      HttpClientModule
    ],
  templateUrl: './pessoa-component.component.html',
  styleUrl: './pessoa-component.component.css'
})
export class PessoaComponentComponent {
  id: number = 0;
  nome: string = '';
  cpf: string = '';
  email: string = '';
  telefone: string = '';

  navigateToHome() {
    this.router.navigate(['/home']);
  }
  constructor(private pessoaService: PessoaService,private router: Router) {}

  onSubmit(form: NgForm) {
    if (form.valid) {
      const pessoa = {
        id: this.id,
        nome: this.nome,
        cpf: this.cpf,
        email: this.email,
        telefone: this.telefone
      };

      this.pessoaService.enviarDados(pessoa).subscribe(response => {
        console.log('Dados enviados com sucesso', response);
        // Limpar os campos do formulário
        this.nome = '';
        this.cpf = '';
        this.email = '';
        this.telefone = '';
        form.resetForm();
      }, error => {
        console.error('Erro ao enviar dados', error);
      });
    } else {
      console.log('Formulário inválido');
    }
  }
}
