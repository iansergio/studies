package dao;

import entities.EngOpe;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EngOpeDAO extends BancoDAO{

    public List<EngOpe> listar(int id){
        List<EngOpe> lista = new ArrayList<>();
        String sql = """
                SELECT engenheiro.id_engenheiro AS id_funcionario, engenheiro.nome_engenheiro AS funcionario
                FROM engenheiro
                    INNER JOIN alocacao_engenheiro
                        ON engenheiro.id_engenheiro = alocacao_engenheiro.id_engenheiro
                    WHERE alocacao_engenheiro.id_projeto = ?
                
                UNION ALL
                
                SELECT operario.id_operario, operario.nome_operario
                FROM operario
                         INNER JOIN alocacao_operario
                                    ON operario.id_operario = alocacao_operario.id_operario
                WHERE alocacao_operario.id_projeto = ?
                
                
                
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, id);
            stat.setInt(2, id);
            ResultSet res = stat.executeQuery();
            while(res.next()){
                EngOpe e = new EngOpe();
                e.setId(res.getInt("id_funcionario"));
                e.setNome(res.getString("funcionario"));
                lista.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}
