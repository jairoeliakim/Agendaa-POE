/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package agendaa;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author IFTM
 */
public class Agendaa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Digite nome ou  para sair");
        Scanner s = new Scanner(System.in);
        String entrada = s.next();
        
        ArrayList<Contato> lista = new ArrayList();
        
        while(!entrada.equals("0")){
            Contato c = new Contato();
            //c.nome = entrada;
            String nome = s.next();
            
            System.out.println("Digite o telefone");
           // c.Telefone = s.next();
           String Telefone = s.next();
                    
            System.out.println("Digite o email");
          //  c.email = s.next();
          String email = s.next();
                    
            System.out.println("Digite o nasc");
           // c.nasc = s.next();
           String nasc = s.next();
                
            System.out.println("O nome do contato é"
                + c.nome +
                "O email é"
                + c.email +
                "O telefone é"
                + c.Telefone +
                "a data de nascimento é"
                + c.nasc);
            
            Contato c = new Contato(nome, email, Telefone, nasc);
            
            lista.add(c);
            System.out.println("Digite o nome ou 0 para sair");
            entrada = s.next();
                        
            
        }
        
        for(Contato c : lista){
            
        }
    }
    
}
