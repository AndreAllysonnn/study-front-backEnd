import { NgModule } from '@angular/core';
import { BrowserModule, provideClientHydration } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './componente/header/header.component';
import { CadastrarComponent } from './pagina/cadastrar/cadastrar.component';
import { ListarComponent } from './pagina/listar/listar.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    CadastrarComponent,
    ListarComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [
    provideClientHydration()
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
