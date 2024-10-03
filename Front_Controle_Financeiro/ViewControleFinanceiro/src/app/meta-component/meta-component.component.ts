import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';
import { FloatLabelModule } from 'primeng/floatlabel';

@Component({
  selector: 'app-meta-component',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule,
    CardModule,
    InputTextModule,
    InputTextareaModule,
    ButtonModule,
    FloatLabelModule,
  ],
  templateUrl: './meta-component.component.html',
  styleUrls: ['./meta-component.component.css']
})
export class MetaComponentComponent {
  descricao: string = '';
  valor: number | null = null;

  onSubmit(form: NgForm) {
    if (form.valid) {
      console.log('Formulário enviado', {
        descricao: this.descricao,
        valor: this.valor
      });

      // Limpar os campos do formulário
      this.descricao = '';
      this.valor = null;
      form.resetForm();
    } else {
      console.log('Formulário inválido');
    }
  }
}
