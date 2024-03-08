/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pessoa;

/**
 *
 * @author Admin
 */
public class Pessoa { //public serve para outros programadores mexerem.
    
   public String nome;
   public int idade;
   public int documentos;

   public static String humano;
   
   public Pessoa(String nome,int idade, int documentos){
   
       this.nome = nome;
       this.idade = idade;
       this.documentos = documentos; 
   
   
   }
   
   
}

