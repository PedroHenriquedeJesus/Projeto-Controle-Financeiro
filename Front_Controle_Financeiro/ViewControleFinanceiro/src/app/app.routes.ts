import { Routes, RouterModule} from '@angular/router';
import { NgModule } from '@angular/core';
import {PessoaComponentComponent} from "./pessoa-component/pessoa-component.component";

export const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path:'home', component:PessoaComponentComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
