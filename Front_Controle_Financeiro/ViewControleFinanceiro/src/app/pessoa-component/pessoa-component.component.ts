import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common'; // Importar CommonModule
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';
import { FloatLabelModule } from 'primeng/floatlabel';
import { InputMaskModule } from 'primeng/inputmask';

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
    ],
  templateUrl: './pessoa-component.component.html',
  styleUrl: './pessoa-component.component.css'
})
export class PessoaComponentComponent {

  nome: string = '';
  CPF: string = '';
  email: string = '';
  telefone: string = '';


  onSubmit(form: NgForm) {
    if (form.valid) {
      console.log('Formulário enviado', {
        nome: this.nome,
        CPF: this.CPF,
        email: this.email,
        telefone: this.telefone
      });

      // Limpar os campos do formulário
      this.nome = '';
      this.CPF = '';
      this.email = '';
      this.telefone = '';
      form.resetForm();
    } else {
      console.log('Formulário inválido');
    }
  }
}
