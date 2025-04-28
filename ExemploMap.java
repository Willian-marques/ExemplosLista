// um mao é uma estrutura que armazena pares de chaves e valor
// cada chave é unica (não pode se repetir)
// Pode ser pensado como um dicionario

import java.util.hashMap;
import java.util.Map;

public class ExemploMap {
    public static void main(String[] args) {
        // Criando um Map onde a vhace é string (nome) e o valor é interger (idade)
        map<String, Integer> pessoas = new HashMap<>();

        //Adicionando Elementos
        pessoa.put("Ana", 25);
        pessoa.put("Bruno", 30);
        pessoa.put("Carlos", 20);
        //Pessoa atualizar a idade da Ana
        pessoa.put("Ana", 25);

        //Imprimindo o Map
        System.out.println("Lista de pessoas: ");
        for(String nome : pessoas.keySet()){
            Integer idade = pessoa.get(nome);
            System.out.println("Nome: " + nome + " Idade: " + idade);
        }
        //Verificando se uma pessoa esta no map
        if(pessoa.containKey("Carlos")){
            System.out.println("Carlos está Cadastrado");
        }
        //Removendo uma pessoa
        pessoas.remove("Bruno");

        //Mostrando o Tamanho do  Map
        System.out.println("Quantidade de pessoas cadrastada: " + pessoas.size);

    }
}
