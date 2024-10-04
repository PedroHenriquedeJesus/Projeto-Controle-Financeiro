import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PessoaTableComponent } from './pessoa-table.component';

describe('PessoaTableComponent', () => {
  let component: PessoaTableComponent;
  let fixture: ComponentFixture<PessoaTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [PessoaTableComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(PessoaTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
