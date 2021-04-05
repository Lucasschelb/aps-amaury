/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aps;
import java.util.ArrayList;

/**
 *
 * @author lucas
 */
public class sala {
    private ArrayList<aluno> listaalunos;
    
    public sala(){
            listaalunos = new ArrayList<aluno>();
    }
    
    public void inserealuno(aluno a){
        this.listaalunos.add(a);
    }
    
    public void listartodos(){
        for (int i = 0; i < this.listaalunos.size(); i++) {
                listaalunos.get(i).Listar();
                System.out.println("\n");
        }
    }
    
    public void verSituacoes(){
        for (int i = 0; i < this.listaalunos.size(); i++) {
            System.out.println("Nome:"+listaalunos.get(i).getNome());
            float somatorio = listaalunos.get(i).calculaNotas();
            System.out.println("Soma das Notas:"+somatorio);
            if(somatorio>=70){
                System.out.println("Aprovado!\n");
            }
            else{
                System.out.println("Reprovado!\n");
            }
        }
    }

    public ArrayList<aluno> getListaalunos() {
        return listaalunos;
    }

    public void setListaalunos(ArrayList<aluno> listaalunos) {
        this.listaalunos = listaalunos;
    }
    
}
