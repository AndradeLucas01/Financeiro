package Repositorios;

import Entidades.Transactions.Despesa;
import java.util.ArrayList;

public class DepesasRepository {
    
    public DepesasRepository (ArrayList<Despesa> despesa){
        this.listaDespesas = despesa;
    }

    public void salvar(Despesa despesa) {
        this.listaDespesas.add(despesa);
    }

    public Despesa alterar(int id) {
        for (int i = 0; i < despesas.size(); i++) {
            if (despesas.get(i).getId() == id) {
                despesas.set(i, novaDespesa);
                return; // Sai do método após encontrar e alterar
            }
    }

    public void remover(Despesa despesa) {
        this.listaDespesas.remove(despesa);
    }

    public List<Despesa> listar() {
        // Implementação para encontrar todas as despesas
        return listaDespesas;
    }
}
