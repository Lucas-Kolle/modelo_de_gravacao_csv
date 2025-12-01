package br.com.lucas.contatatos;

import br.com.lucas.contatatos.model.Contato;
import br.com.lucas.contatatos.repository.ContatoRepository;

import java.util.Scanner;

public class ContatosApp {
    public static void main(String[] args) {
        System.out.println("contatos");

        Contato c1 = new Contato();

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do contato: ");
        c1.nome = sc.nextLine();

        System.out.print("Digite o email do contato: ");
        c1.email = sc.nextLine();

        System.out.print("Digite o telefone do contato: ");
        c1.telefone = sc.nextLine();

        ContatoRepository cr = new ContatoRepository();
        cr.contato = c1;
        cr.gravar();

    }
}
