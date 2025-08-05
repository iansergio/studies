import dao.*;
import entities.*;

public class Main {
    public static void main(String[] args) {

        Projeto projeto = new Projeto();
        ProjetoDAO daoProjeto = new ProjetoDAO();

        Engenheiro engenheiro = new Engenheiro();
        EngenheiroDAO daoEngenheiro = new EngenheiroDAO();

        Operario operario = new Operario();
        OperarioDAO daoOperario = new OperarioDAO();

        Equipamento equipamento = new Equipamento();
        EquipamentoDAO daoEquipamento = new EquipamentoDAO();

        Material material = new Material();
        MaterialDAO daoMaterial = new MaterialDAO();

        EngOpe engOpe = new EngOpe();
        EngOpeDAO daoEngOpe = new EngOpeDAO();

        EquMat equMat = new EquMat();
        EquMatDAO daoEquMat = new EquMatDAO();

        // Listando todos os engenheiros e operários alocados em um determinado projeto
        for(EngOpe eo : daoEngOpe.listar(2)){
            System.out.println(eo);
        }
        System.out.println("----");
        // Listando todos os equipamentos e materiais utilizados em um determinado projeto
        for(EquMat em : daoEquMat.listar(2)){
            System.out.println(em);
        }

        // ==================
        System.out.println();

        // Inserir projeto
//        projeto.setNome("");
//        projeto.setLocal("");
//        projeto.setDataInicio("");
//        projeto.setDataTermino("");
//        daoProjeto.inserir(projeto);

        // Atualizar projeto
//        projeto.setId();
//        projeto.setNome("");
//        projeto.setLocal("");
//        projeto.setDataInicio("");
//        projeto.setDataTermino("");
//        daoProjeto.atualizar(projeto);

        // Excluir projeto
//        projeto.setId();
//        daoProjeto.excluir(projeto);

        // Listar projeto
        for(Projeto p : daoProjeto.listar()){
            System.out.println(p);
        }

        // ==================
        System.out.println();

        // Inserir engenheiro
//        engenheiro.setNome("");
//        engenheiro.setEspecialidade("");
//        daoEngenheiro.inserir(engenheiro);

        // Atualizar engenheiro
//        engenheiro.setNome("");
//        engenheiro.setEspecialidade("");
//        engenheiro.setId();
//        daoEngenheiro.atualizar(engenheiro);

        // Excluir engenheiro
//        engenheiro.setId();
//        daoEngenheiro.excluir(engenheiro);

        // Listar engenheiro
        for(Engenheiro e : daoEngenheiro.listar()){
            System.out.println(e);
        }

        // ==================
        System.out.println();

        // Inserir operario
//        operario.setNome("");
//        operario.setFuncao("");
//        daoOperario.inserir(operario);

        // Atualizar operario
//        operario.setNome("");
//        operario.setFuncao("");
//        operario.setId();
//        daoOperario.atualizar(operario);

        // Excluir operario
//        operario.setId();
//        daoOperario.excluir(operario);

        // Listar operario
        for(Operario o : daoOperario.listar()){
            System.out.println(o);
        }

        // ==================
        System.out.println();

        // Inserir equipamento
//        equipamento.setNome("");
//        equipamento.setTipo("");
//        daoEquipamento.inserir(equipamento);

        // Atualizar equipamento
//        equipamento.setNome("");
//        equipamento.setTipo("");
//        equipamento.setId();
//        daoEquipamento.atualizar(equipamento);

        // Excluir equipamento
//        equipamento.setId();
//        daoEquipamento.excluir(equipamento);

        // Listar equipamento
        for(Equipamento e : daoEquipamento.listar()){
            System.out.println(e);
        }

        // ==================
        System.out.println();

        // Inserir material
//        material.setNome("");
//        material.setQuantidade();
//        daoMaterial.inserir(material);

        // Atualizar material
//        material.setNome("");
//        material.setQuantidade();
//        material.setId();
//        daoMaterial.atualizar(material);

        // Excluir material
//        material.setId();
//        daoMaterial.excluir(material);

        // Listar material
        for(Material m : daoMaterial.listar()){
            System.out.println(m);
        }
    }
}