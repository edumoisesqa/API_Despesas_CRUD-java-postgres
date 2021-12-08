package br.com.despesas.dao;

import br.com.despesas.model.Categoria;
import br.com.despesas.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {

    Despesa save(Despesa despesa);
    Despesa update(Despesa despesa);
    void delete(Long id);
    List<Despesa> findAll();
    Optional<Despesa> findById(Long id);
    List<Despesa> finByCategoria(Categoria categoria);
}
