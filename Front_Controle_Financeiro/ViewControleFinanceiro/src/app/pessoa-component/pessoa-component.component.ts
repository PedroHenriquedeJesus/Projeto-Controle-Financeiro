import { Component } from '@angular/core';
import {CardModule} from 'primeng/card';
import {ButtonModule} from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import {FloatLabelModule} from 'primeng/floatlabel'
import { InputMaskModule } from 'primeng/inputmask';

@Component({
  selector: 'app-pessoa-component',
  standalone: true,
  imports: [CardModule, ButtonModule, InputTextModule, FloatLabelModule, InputMaskModule],
  templateUrl: './pessoa-component.component.html',
  styleUrl: './pessoa-component.component.css'
})
export class PessoaComponentComponent {

}
