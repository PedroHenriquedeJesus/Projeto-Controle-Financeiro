import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common'; // Importar CommonModule
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';
import { FloatLabelModule } from 'primeng/floatlabel';
import { Router } from '@angular/router';

@Component({
  selector: 'app-lancamento-component',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule, // Adicionar CommonModule
    CardModule,
    InputTextModule,
    InputTextareaModule,
    ButtonModule,
    FloatLabelModule
  ],
  templateUrl: './lancamento-component.component.html',
  styleUrls: ['./lancamento-component.component.css']
})
export class LancamentoComponentComponent {
  constructor(private router: Router) {}
  navigateToHome() {
    this.router.navigate(['/home']);
  }
  nome: string = '';
  descricao: string = '';
  data: string = '';
  tipo: string = '';
  valor: number | null = null;
  categoria: string = '';

  onSubmit(form: NgForm) {
    if (form.valid) {
      console.log('Formulário enviado', {
        nome: this.nome,
        descricao: this.descricao,
        data: this.data,
        tipo: this.tipo,
        valor: this.valor,
        categoria: this.categoria
      });

      // Limpar os campos do formulário
      this.nome = '';
      this.descricao = '';
      this.data = '';
      this.tipo = '';
      this.valor = null;
      this.categoria = '';
      form.resetForm();
    } else {
      console.log('Formulário inválido');
    }
  }
}
