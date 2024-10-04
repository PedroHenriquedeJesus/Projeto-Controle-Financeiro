import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';
import { FloatLabelModule } from 'primeng/floatlabel';
import { Router } from '@angular/router';


import { HttpClientModule } from '@angular/common/http';
import {MetaService} from "../Services/metaService/meta.service";

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
    HttpClientModule
  ],
  templateUrl: './meta-component.component.html',
  styleUrls: ['./meta-component.component.css']
})
export class MetaComponentComponent {
  id: number = 0;
  descricao: string = '';
  valor: number | null = null;

  constructor(private metaService: MetaService, private router: Router) {}
  navigateToHome() {
    this.router.navigate(['/home']);
  }
  onSubmit(form: NgForm) {
    if (form.valid) {
      const meta = {
        id: this.id,
        descricao: this.descricao,
        valor: this.valor
      };

      this.metaService.enviarDados(meta).subscribe(response => {
        console.log('Dados enviados com sucesso', response);
        // Limpar os campos do formulário
        this.descricao = '';
        this.valor = null;
        form.resetForm();
      }, error => {
        console.error('Erro ao enviar dados', error);
      });
    } else {
      console.log('Formulário inválido');
    }
  }
}
