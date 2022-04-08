/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package appmedia;

import java.util.Scanner;

/**
 *
 * @author Giovani Pereira
 */
public class AplMedia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    
        //Interface com o Usuário
        Scanner scan = new Scanner(System.in);  // System.in = entrada padrão (teclado)
                                                // File(<nome do arquivo>) = entrada de arquivos
        System.out.print("Insira a nota A1: ");
        float a1 = scan.nextFloat();            // Variável para armazenar a entrada
        System.out.print("Insira a nota A2: ");
        float a2 = scan.nextFloat(); 
        
        System.out.print("Fez a A3? ");
        char opcao = scan.next().charAt(0);     // charAt(0) = Lê o primeiro caractere da srting        
        
        float a3 = 0.0f;
        if (opcao == 's' || opcao == 'S'){
            System.out.print("Insira a nota A3: ");
            a3 = scan.nextFloat();
        }
                
        //Objeto
        Aluno aluno = new Aluno(a1, a2, a3);        // Declaração e instanciação
        
        //aluno.a1 = 4.0f;
        //aluno.a2 = 3.5f;
        
        System.out.println(aluno);
    }  
        
}
