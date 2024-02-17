package hashing;

public class HashingEncadeamentoAberto implements EstruturaDeDados {

    final int[] tabela = new int[1011];

    @Override
    public void insert(int chave) {
        int indice = chave % tabela.length;
        if (tabela[indice] == 0) {
            tabela[indice] = chave;
        }
    }

    @Override
    public void delete(int chave) {
        int indice = chave % tabela.length;
        tabela[indice] = 0;

    }

    @Override
    public boolean search(int chave) {
        int indice = chave % tabela.length;
        int aux = tabela[indice];

        // não encontrar nada no índice e se encontrar for diferente da chave, retorna
        // False
        if (tabela[indice] != 0 && chave == tabela[indice]) {
            return true;
        } else {
            return false;
        }
    }

}
