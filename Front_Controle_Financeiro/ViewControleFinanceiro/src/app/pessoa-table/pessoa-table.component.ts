import { Component } from '@angular/core';
import { TableModule } from 'primeng/table';
import {ButtonModule} from 'primeng/button';

@Component({
  selector: 'app-pessoa-table',
  standalone: true,
  imports: [TableModule, ButtonModule],
  templateUrl: './pessoa-table.component.html',
  styleUrl: './pessoa-table.component.css'
})
export class PessoaTableComponent {

}
