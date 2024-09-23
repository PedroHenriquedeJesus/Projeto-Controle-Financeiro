import { ComponentFixture, TestBed } from '@angular/core/testing';

import { LancamentoComponentComponent } from './lancamento-component.component';

describe('LancamentoComponentComponent', () => {
  let component: LancamentoComponentComponent;
  let fixture: ComponentFixture<LancamentoComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [LancamentoComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(LancamentoComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
