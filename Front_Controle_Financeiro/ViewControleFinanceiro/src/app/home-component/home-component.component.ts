import { Component } from '@angular/core';
import { ButtonModule } from 'primeng/button';
import { CardModule } from 'primeng/card';
import { Router } from '@angular/router';
import { TabMenuModule } from 'primeng/tabmenu';
import { MenuItem } from 'primeng/api';

@Component({
  selector: 'app-home-component',
  standalone: true,
  imports: [ButtonModule, CardModule, TabMenuModule],
  templateUrl: './home-component.component.html',
  styleUrls: ['./home-component.component.css']
})
export class HomeComponentComponent {
  items: MenuItem[];

  constructor(private router: Router) {
    this.items = [
      { label: 'Pessoa', icon: 'pi pi-users', command: () => this.navigateTo('pessoa') },
      { label: 'Meta', icon: 'pi pi-chart-line', command: () => this.navigateTo('meta') },
      { label: 'Lançamento', icon: 'pi pi-calendar', command: () => this.navigateTo('lancamento') },
      { label: 'Grupo', icon: 'pi pi-users', command: () => this.navigateTo('grupo') }
    ];
  }

  navigateTo(route: string) {
    this.router.navigate([route]);
  }
}
