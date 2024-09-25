import { Component } from '@angular/core';
import {CardModule} from 'primeng/card';
import {ButtonModule} from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import {FloatLabelModule} from 'primeng/floatlabel'

@Component({
  selector: 'app-lancamento-component',
  standalone: true,
  imports: [CardModule, ButtonModule, InputTextModule, FloatLabelModule],
  templateUrl: './lancamento-component.component.html',
  styleUrl: './lancamento-component.component.css'
})
export class LancamentoComponentComponent {


}
