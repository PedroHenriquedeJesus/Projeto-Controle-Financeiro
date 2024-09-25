import { Routes, RouterModule} from '@angular/router';
import { NgModule } from '@angular/core';
import {PessoaComponentComponent} from "./pessoa-component/pessoa-component.component";
import {LancamentoComponentComponent} from "./lancamento-component/lancamento-component.component";
import {HomeComponentComponent} from "./home-component/home-component.component";
import {GrupoComponentComponent} from "./grupo-component/grupo-component.component";
import {MetaComponentComponent} from "./meta-component/meta-component.component";

export const routes: Routes = [
  {path: '', redirectTo: 'home', pathMatch: 'full'},
  {path:'home', component:HomeComponentComponent},
  {path: 'pessoa', component:PessoaComponentComponent},
  {path:'lancamento', component:LancamentoComponentComponent},
  {path:'grupo',component:GrupoComponentComponent},
  {path:'meta',component:MetaComponentComponent}
];


@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
