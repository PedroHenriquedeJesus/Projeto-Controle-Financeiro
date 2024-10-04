import { Component } from '@angular/core';
import { TableModule } from 'primeng/table';
import {ButtonModule} from 'primeng/button';

@Component({
  selector: 'app-meta-table',
  standalone: true,
  imports: [TableModule, ButtonModule],
  templateUrl: './meta-table.component.html',
  styleUrl: './meta-table.component.css'
})
export class MetaTableComponent {

}
