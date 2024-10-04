import { TestBed } from '@angular/core/testing';

import { ListPessoaService } from './list-pessoa.service';

describe('ListPessoaService', () => {
  let service: ListPessoaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(ListPessoaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
