package dao;

import entities.Projeto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProjetoDAO extends BancoDAO{

    public void inserir(Projeto projeto){
        String sql = """
                INSERT INTO projeto(nome_projeto, local, data_inicio, data_termino)
                VALUES(?, ?, ?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, projeto.getNome());
            stat.setString(2, projeto.getLocal());
            stat.setString(3, projeto.getDataInicio());
            stat.setString(4, projeto.getDataTermino());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Projeto projeto){
        String sql = """
               UPDATE projeto SET nome_projeto = ?, local = ?, data_inicio = ?, data_termino = ?
               WHERE id_projeto = ?
               """;
        try(Connection conexao = conexao();
            PreparedStatement stat = conexao.prepareStatement(sql)){
            stat.setString(1, projeto.getNome());
            stat.setString(2, projeto.getLocal());
            stat.setString(3, projeto.getDataInicio());
            stat.setString(4, projeto.getDataTermino());
            stat.setInt(5, projeto.getId());
            stat.execute();

        }catch (SQLException e){
            e.printStackTrace();
        }
    }

    public void excluir(Projeto projeto){
        String sql = """
                DELETE FROM projeto WHERE id_projeto = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, projeto.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Projeto> listar(){
        List<Projeto> lista = new ArrayList<>();
        String sql = """
                SELECT id_projeto, nome_projeto, local, data_inicio, data_termino FROM projeto
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Projeto projeto = new Projeto();
                projeto.setId(res.getInt("id_projeto"));
                projeto.setNome(res.getString("nome_projeto"));
                projeto.setLocal(res.getString("local"));
                projeto.setDataInicio(res.getString("data_inicio"));
                projeto.setDataTermino(res.getString("data_termino"));
                lista.add(projeto);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}