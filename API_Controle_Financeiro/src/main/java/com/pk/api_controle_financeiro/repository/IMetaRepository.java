package com.pk.api_controle_financeiro.repository;

import com.pk.api_controle_financeiro.model.Meta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMetaRepository extends JpaRepository<Meta, Long> {
}
