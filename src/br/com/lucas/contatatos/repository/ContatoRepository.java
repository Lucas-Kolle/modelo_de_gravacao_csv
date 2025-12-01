package br.com.lucas.contatatos.repository;

import br.com.lucas.contatatos.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class ContatoRepository {

    public Contato contato;
    private Path arquivo = Paths.get("/Users/25203704/ds1t/contatos.csv");

    public void gravar(){

        try {
            Files.writeString(arquivo, contato.serializarContato(), StandardOpenOption.APPEND);
            System.out.println("Contato " + contato.nome +  " gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }

    public void listarContatos(){
        try {
            List <String> contatos =  Files.readAllLines(arquivo);
            int contador = 0;
            while (contador < contatos.size()) {
                System.out.println(contatos.get(contador));
                contador++;

            }
        } catch (IOException erro ) {
            erro.printStackTrace();
        }
    }


}
