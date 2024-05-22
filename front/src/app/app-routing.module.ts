import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarComponent } from './pagina/cadastrar/cadastrar.component';
import { ListarComponent } from './pagina/listar/listar.component';

const routes: Routes = [
  {path:'', component: CadastrarComponent},
  {path:'cadastrar', component: CadastrarComponent},
  {path:'listar', component: ListarComponent},
  {path:'**', component: CadastrarComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
