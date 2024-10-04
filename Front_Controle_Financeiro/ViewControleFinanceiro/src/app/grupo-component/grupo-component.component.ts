import { Component } from '@angular/core';
import { FormsModule, NgForm } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { CardModule } from 'primeng/card';
import { InputTextModule } from 'primeng/inputtext';
import { InputTextareaModule } from 'primeng/inputtextarea';
import { ButtonModule } from 'primeng/button';
import { FloatLabelModule } from 'primeng/floatlabel';
import { DropdownModule } from 'primeng/dropdown';

import { HttpClientModule } from '@angular/common/http';

import {ListPessoaService} from '../Services/grupoService/list-pessoa.service';

import { OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-grupo-component',
  standalone: true,
  imports: [
    FormsModule,
    CommonModule,
    CardModule,
    InputTextModule,
    InputTextareaModule,
    ButtonModule,
    FloatLabelModule,
    DropdownModule,
    HttpClientModule
  ],
  templateUrl: './grupo-component.component.html',
  styleUrls: ['./grupo-component.component.css']
})
export class GrupoComponentComponent implements OnInit{
  pessoaList: any[] = [];
  selectedPessoa='';
  descricao: string = '';
  valor: number | null = null;
  nome: string = '';

  constructor(private listPessoaService:ListPessoaService, private router: Router){}
  navigateToHome() {
    this.router.navigate(['/home']);
  }
  ngOnInit(): void {
      this.pegarTodasPessoas();
    }


  pegarTodasPessoas(){
      this.listPessoaService.pegarTodasPessoas().subscribe(
        response =>{
          this.pessoaList = response;
          }
          )
    }


  onSubmit(form: NgForm) {
    if (form.valid) {
      console.log('Formulário enviado', {
        nome: this.nome,
        descricao: this.descricao,
        valor: this.valor
      });

      // Limpar os campos do formulário
      this.nome = '';
      this.descricao = '';
      this.valor = null;
      form.resetForm();
    } else {
      console.log('Formulário inválido');
    }

  }

}
