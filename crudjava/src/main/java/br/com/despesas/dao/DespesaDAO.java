package br.com.despesas.dao;

import br.com.despesas.infra.ConnectionFactory;
import br.com.despesas.model.Categoria;
import br.com.despesas.model.Despesa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements  IDespesaDAO {

    @Override
    public Despesa save(Despesa despesa) {
       try (Connection connection = ConnectionFactory.getConnection()) {
           String sql = "INSERT INTO Despesas(descricao, valor, data, categoria) VALUES (?,?,?,?)";

           PreparedStatement preparedStatement =connection.prepareStatement(sql);
           preparedStatement.setString(1, despesa.getDescricao());
           preparedStatement.setDouble(2,despesa.getValor());
           preparedStatement.setDate(3,java.sql.Date.valueOf(despesa.getData()));
            preparedStatement.setString(4,despesa.getCategoria().toString());

            preparedStatement.executeUpdate();

       }catch (SQLException e){
           throw new RuntimeException(e);
       }
        return despesa;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return null;
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public List<Despesa> finByCategoria(Categoria categoria) {
        return null;
    }
}
