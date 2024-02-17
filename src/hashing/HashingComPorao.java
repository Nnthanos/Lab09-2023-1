package hashing;

public class HashingComPorao implements EstruturaDeDados {

    final int[] tabela = new int[1011];
    final int[] porao = new int[100];

    @Override
    public void insert(int chave) {
        int indice = chave % tabela.length;
        if (!search(chave)) {
            tabela[indice] = chave;
        } else {
            int iPorao = chave % porao.length;
            if (!searchPorao(chave)) {
                porao[iPorao] = chave;
            }
        }

    }

    @Override
    public void delete(int chave) {
        int indice = chave % tabela.length;
        if (search(chave)) {
            tabela[indice] = 0;
        } else {
            int iPorao = chave % porao.length;
            if (searchPorao(chave)) {
                porao[iPorao] = 0;
            }
        }

    }

    @Override
    public boolean search(int chave) {
        int indice = chave % tabela.length;
        int aux = tabela[indice];
        if (tabela[indice] != 0 && chave == tabela[indice]) {
            return true;
        } else {
            return searchPorao(chave);
        }
    }

    public boolean searchPorao(int chave) {
        int indice = chave % porao.length;
        int aux = porao[indice];
        if (porao[indice] != 0 && chave == porao[indice]) {
            return true;
        } else {
            return false;
        }
    }

}
