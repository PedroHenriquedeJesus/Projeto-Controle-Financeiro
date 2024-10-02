import { Component } from '@angular/core';
import {CardModule} from 'primeng/card';
import {ButtonModule} from 'primeng/button';
import {InputTextModule} from 'primeng/inputtext';
import {FloatLabelModule} from 'primeng/floatlabel'

@Component({
  selector: 'app-meta-component',
  standalone: true,
  imports: [CardModule, ButtonModule, InputTextModule, FloatLabelModule],
  templateUrl: './meta-component.component.html',
  styleUrl: './meta-component.component.css'
})
export class MetaComponentComponent {

}
