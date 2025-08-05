package dao;

import entities.Engenheiro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EngenheiroDAO extends BancoDAO{

    public void inserir(Engenheiro engenheiro) {
        String sql = """
                INSERT INTO engenheiro(nome_engenheiro, especialidade)
                VALUES(?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, engenheiro.getNome());
            stat.setString(2, engenheiro.getEspecialidade());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Engenheiro engenheiro) {
        String sql = """
                UPDATE engenheiro SET nome_engenheiro = ?, especialidade = ?
                WHERE id_engenheiro = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, engenheiro.getNome());
            stat.setString(2, engenheiro.getEspecialidade());
            stat.setInt(3, engenheiro.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(Engenheiro engenheiro) {
        String sql = """
                DELETE FROM engenheiro WHERE id_engenheiro = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, engenheiro.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Engenheiro> listar(){
        List<Engenheiro> lista = new ArrayList<>();
        String sql = """
                SELECT id_engenheiro, nome_engenheiro, especialidade FROM engenheiro
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Engenheiro engenheiro = new Engenheiro();
                engenheiro.setId(res.getInt("id_engenheiro"));
                engenheiro.setNome(res.getString("nome_engenheiro"));
                engenheiro.setEspecialidade(res.getString("especialidade"));
                lista.add(engenheiro);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
