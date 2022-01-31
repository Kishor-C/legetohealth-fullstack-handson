import { NgModule } from '@angular/core';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { BrowserModule } from '@angular/platform-browser';
import {  Routes, RouterModule } from '@angular/router';

import {HttpClientModule} from '@angular/common/http';
import { AppComponent } from './app.component';
import { TdfDemoComponent } from './tdf-demo/tdf-demo.component';
import { MdfDemoComponent } from './mdf-demo/mdf-demo.component';
import { GetUserComponent } from './get-user/get-user.component';
import { AddUserComponent } from './add-user/add-user.component';
import { UpdateUserComponent } from './update-user/update-user.component';
import { DeleteUserComponent } from './delete-user/delete-user.component';
import { GetOneUserComponent } from './get-one-user/get-one-user.component';
import { SuccessComponent } from './success/success.component';
import { DashboardComponent } from './dashboard/dashboard.component';
import { ProfileComponent } from './profile/profile.component';
import { SettingsComponent } from './settings/settings.component';
import { EmpGuard } from './emp.guard';

let routeConfig:Routes=[{path:'',component:GetUserComponent},
{path:'FetchAll',component:GetUserComponent},
{path:'FetchByID',component:GetOneUserComponent},
{path:'AddUser',component:AddUserComponent},
{path:'UpdateUser',component:UpdateUserComponent},
{path:'DeleteById',component:DeleteUserComponent},
{path:'mdf',component:MdfDemoComponent},
{path:'Success/:un',component:SuccessComponent,canActivate:[EmpGuard],children:[{path:'',component:DashboardComponent},
{path:'dashboard',component:DashboardComponent},
{path:'settings',component:SettingsComponent},
{path:'profiles',component:ProfileComponent}]}]
@NgModule({
  declarations: [
    AppComponent,
    TdfDemoComponent,
    MdfDemoComponent,
    GetUserComponent,
    AddUserComponent,
    UpdateUserComponent,
    DeleteUserComponent,
    GetOneUserComponent,
    SuccessComponent,
    DashboardComponent,
    ProfileComponent,
    SettingsComponent
  ],
  imports: [
    BrowserModule, FormsModule , ReactiveFormsModule, HttpClientModule,
    RouterModule.forRoot(routeConfig)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
