import { Component } from '@angular/core';
import {CardModule} from 'primeng/card';
import {ButtonModule} from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import {FloatLabelModule} from 'primeng/floatlabel';
import { DropdownModule } from 'primeng/dropdown';

@Component({
  selector: 'app-grupo-component',
  standalone: true,
  imports: [CardModule, ButtonModule, InputTextModule, FloatLabelModule, DropdownModule],
  templateUrl: './grupo-component.component.html',
  styleUrl: './grupo-component.component.css'
})
export class GrupoComponentComponent {

}
