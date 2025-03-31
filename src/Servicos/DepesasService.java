package Servicos;

import Entidade.Transactions.Despesa;
import Interfaces.InterfaceDespesas;

public class DepesasService implements InterfaceDespesas{

    private DespesasRepositorio despesasRepositorio;
    
    public AluguelServico(DespesasRepositorio despesasRepositorio){
        this.despesasRepositorio = despesasRepositorio;
    }
    
    public void cadastra(Despesa despesa){
        despesasRepositorio.salvar(despesa);
    }
    
    public void excluir(Despesa despesa){
        despesasRepositorio.remover(despesa);
    }
    
    public void listar(){
        despesasRepositorio.listarDespesas().forEach(System.out::println);
    }
}
