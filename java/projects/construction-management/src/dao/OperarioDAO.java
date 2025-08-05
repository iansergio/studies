package dao;

import entities.Operario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OperarioDAO extends BancoDAO{

    public void inserir(Operario operario) {
        String sql = """
                INSERT INTO operario(nome_operario, funcao)
                VALUES(?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, operario.getNome());
            stat.setString(2, operario.getFuncao());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Operario operario) {
        String sql = """
                UPDATE operario SET nome_operario = ?, funcao = ?
                WHERE id_operario = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, operario.getNome());
            stat.setString(2, operario.getFuncao());
            stat.setInt(3, operario.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(Operario operario) {
        String sql = """
                DELETE FROM operario WHERE id_operario = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, operario.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Operario> listar(){
        List<Operario> lista = new ArrayList<>();
        String sql = """
                SELECT id_operario, nome_operario, funcao FROM operario
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Operario operario = new Operario();
                operario.setId(res.getInt("id_operario"));
                operario.setNome(res.getString("nome_operario"));
                operario.setFuncao(res.getString("funcao"));
                lista.add(operario);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
