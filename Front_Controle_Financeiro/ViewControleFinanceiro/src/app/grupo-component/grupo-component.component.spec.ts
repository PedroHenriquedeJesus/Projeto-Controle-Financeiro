import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GrupoComponentComponent } from './grupo-component.component';

describe('GrupoComponentComponent', () => {
  let component: GrupoComponentComponent;
  let fixture: ComponentFixture<GrupoComponentComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GrupoComponentComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GrupoComponentComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
