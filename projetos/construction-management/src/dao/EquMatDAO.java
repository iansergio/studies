package dao;

import entities.EquMat;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EquMatDAO extends BancoDAO{

    public List<EquMat> listar(int id){
        List<EquMat> lista = new ArrayList<>();
        String sql = """
                SELECT equipamento.id_equipamento AS id_equipamentos_e_materiais, equipamento.nome_equipamento AS nome
                FROM equipamento
                         INNER JOIN uso_equipamento
                                    ON equipamento.id_equipamento = uso_equipamento.id_equipamento
                WHERE uso_equipamento.id_projeto = ?
                
                UNION ALL
                
                SELECT material.id_material, material.nome_material
                FROM material
                         INNER JOIN consumo_material
                                    ON material.id_material = consumo_material.id_material
                WHERE consumo_material.id_projeto = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, id);
            stat.setInt(2, id);
            ResultSet res = stat.executeQuery();
            while(res.next()){
                EquMat e = new EquMat();
                e.setId(res.getInt("id_equipamentos_e_materiais"));
                e.setNome(res.getString("nome"));
                lista.add(e);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}