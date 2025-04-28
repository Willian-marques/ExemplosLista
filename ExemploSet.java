import java.util.HashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {
        Set<String> cores = new HashSet<>();

        // ADcionando elementos
        cores.add("Vermelho");
        cores.add("Azul");
        cores.add("Verde");
        cores.add("Amarelo");
        //Testendo adicionar uma cor ja existente
        cores.add("Azul"); // nao sera adicionado

        //imprimindo o conjunto
        System.out.println("cores: ");
        for(String cor : cores) {
            System.out.println(cor);
        }
        //Verificando se contém uma cor
        if(cores.contains("Verde")) {
            System.out.println("Contém a cor verde");
        }

        //Removendo uma cor
        cores.remove("Amarelo");

        //tamanho do conjunto
        System.out.println("T0amanho da cores: " + cores.size());

        }
    }
