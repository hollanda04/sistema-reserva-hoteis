package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.Cliente;

public class clienteDAO {
    private Connection connection;

    public clienteDAO(Connection connection) {
        this.connection = connection;
    }

    public String inserirCliente(Cliente cliente) {
        String sql = "INSERT INTO clientes (nome, cpf, telefone, email) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getCpf());
            stmt.setString(3, cliente.getTelefone());
            stmt.setString(4, cliente.getEmail());

            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso!");
            return "Dados inseridos com sucesso!";
        } catch (SQLException e) {
            String mensagem = "Erro ao inserir dados no banco de dados: " + e.getMessage();
            System.out.println(mensagem);
            return mensagem;
        }
    }


    public Cliente buscarPorCpf(String cpf) {
        String sql = "SELECT * FROM cliente WHERE cpf = ?";
            try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, cpf);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Cliente(
                    rs.getString("cpf"),
                    rs.getString("email"),
                    rs.getString("nome"),
                    rs.getString("telefone")
                );
            }
            } 
            catch (SQLException e) {
            System.out.println("Erro ao buscar cliente: " + e.getMessage());
        }
        return null;
    }
}