package br.com.lucas.contatatos.model;

import java.util.UUID;

public class Contato {
    public String nome;
    public String telefone;
    public String email;
    public String id = UUID.randomUUID().toString();

    public String serializarContato() {
        //serializando contato (construindo um padrão)
        String contatoSerializado = id + ";" + nome + ";" + telefone + ";" + email + "\n";

        return contatoSerializado;
    }

}
