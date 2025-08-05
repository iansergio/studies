package dao;

import entities.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MaterialDAO extends BancoDAO{

    public void inserir(Material material) {
        String sql = """
                INSERT INTO material(nome_material, quantidade)
                VALUES(?, ?)
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, material.getNome());
            stat.setInt(2, material.getQuantidade());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void atualizar(Material material) {
        String sql = """
                UPDATE material SET nome_material = ?, quantidade = ?
                WHERE id_material = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setString(1, material.getNome());
            stat.setInt(2, material.getQuantidade());
            stat.setInt(3, material.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void excluir(Material material) {
        String sql = """
                DELETE FROM material WHERE id_material = ?
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            stat.setInt(1, material.getId());
            stat.execute();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Material> listar(){
        List<Material> lista = new ArrayList<>();
        String sql = """
                SELECT id_material, nome_material, quantidade FROM material
                """;
        try(Connection con = conexao();
            PreparedStatement stat = con.prepareStatement(sql)){
            ResultSet res = stat.executeQuery();
            while(res.next()){
                Material material = new Material();
                material.setId(res.getInt("id_material"));
                material.setNome(res.getString("nome_material"));
                material.setQuantidade(res.getInt("quantidade"));
                lista.add(material);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}