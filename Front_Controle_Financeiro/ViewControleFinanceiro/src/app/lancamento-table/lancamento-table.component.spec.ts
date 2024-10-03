import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LancamentoTableComponent } from './lancamento-table.component';

describe('LancamentoTableComponent', () => {
  let component: LancamentoTableComponent;
  let fixture: ComponentFixture<LancamentoTableComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LancamentoTableComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LancamentoTableComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
