   /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appmedia;

/**
 *
 * @author Giovani Pereira
 */
    public class Aluno {
        float a1, a2;
        float a3;
    
    //Final = Não será alterada
    final float MEDIA = 6.0f;
   
    //Construção da classe
    public Aluno(){
        this.a1 = 0.0f;
        this.a2 = 0.0f;
        this.a3 = 0.0f;
    }
    public Aluno(float a1, float a2){
        this.a1 = a1;
        this.a2 = a2;
    }
    
    public Aluno(float a1, float a2, float a3){
        this.a1 = a1;
        this.a2 = a2;
        this.a3 = a3;
    }
    //Comportamento - Métodos para implementação
    public float media (){
        return a1+a2;
    }
    
    public float maior (){
        return (a1 > a2) ? a1: a2;
    }
    
    public float mediaFinal(){
        if (media() >= MEDIA ){
            return media();    
        }else{
        if((a3<a1)&&(a3<a2)){
           return media();
        }else{  
           return maior() + a3;
        }
      }
    }
            
    public String situação (){
        return mediaFinal()>= MEDIA ? "Aprovado" : "Reprovado";
    }
    
    @Override               
    public String toString(){  // Método sugerido em JS para uma exibição padrão
        String exibir = "";
        exibir = "A1       = " + this.a1;
        exibir += "\nA2    = " + this.a2;
        exibir += "\nMedia = " + this.media();
        if(media() < MEDIA){
            exibir += "\nA3 = " + this.a3;
        }
        exibir += "\nMedia final = " + this.mediaFinal();
        exibir += "\nO aluno está " + this.situação();
        return exibir;
    }
}
