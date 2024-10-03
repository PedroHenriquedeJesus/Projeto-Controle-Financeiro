import { Component } from '@angular/core';
import { TableModule } from 'primeng/table';
import {ButtonModule} from 'primeng/button';


@Component({
  selector: 'app-grupo-table',
  standalone: true,
  imports: [TableModule, ButtonModule],
  templateUrl: './grupo-table.component.html',
  styleUrl: './grupo-table.component.css'
})
export class GrupoTableComponent {

}
