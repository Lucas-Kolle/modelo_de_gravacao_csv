package br.com.lucas.contatatos.repository;

import br.com.lucas.contatatos.model.Contato;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class ContatoRepository {

    public Contato contato;

    public void gravar(){
        Path arquivo = Paths.get("/Users/25203704/ds1t/contatos.csv");
        try {
            Files.writeString(arquivo, contato.serializarContato(), StandardOpenOption.APPEND);
            System.out.println("Contato " + contato.nome +  " gravado com sucesso!");
        } catch (IOException erro) {
            erro.printStackTrace();
        }
    }


}
