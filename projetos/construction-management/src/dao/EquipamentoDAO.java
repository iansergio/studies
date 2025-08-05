package dao;

import entities.Equipamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquipamentoDAO extends BancoDAO{

    public void inserir(Equipamento equipamento) {
        String sql = """
                INSERT INTO equipamento(nome_equipamento, tipo)
                VALUES(?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, equipamento.getNome());
            stat.setString(2, equipamento.getTipo());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Equipamento equipamento) {
        String sql = """
                UPDATE equipamento SET nome_equipamento = ?, tipo = ?
                WHERE id_equipamento = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, equipamento.getNome());
            stat.setString(2, equipamento.getTipo());
            stat.setInt(3, equipamento.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(Equipamento equipamento) {
        String sql = """
                DELETE FROM equipamento WHERE id_equipamento = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, equipamento.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Equipamento> listar(){
        List<Equipamento> lista = new ArrayList<>();
        String sql = """
                SELECT id_equipamento, nome_equipamento, tipo FROM equipamento
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Equipamento equipamento = new Equipamento();
                equipamento.setId(res.getInt("id_equipamento"));
                equipamento.setNome(res.getString("nome_equipamento"));
                equipamento.setTipo(res.getString("tipo"));
                lista.add(equipamento);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}