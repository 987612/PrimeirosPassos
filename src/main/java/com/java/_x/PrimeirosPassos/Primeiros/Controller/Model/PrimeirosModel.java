package com.java._x.PrimeirosPassos.Primeiros.Controller.Model;

import com.java._x.PrimeirosPassos.Missoes.MissoesModel;
import jakarta.persistence.*;

@Entity
@Table(name="primeiro_passos")
public class PrimeirosModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    private String email;
    private int idade;
    @ManyToOne
    @JoinColumn(name = "missoes_id")//forening key ou chave estrangeira
    private MissoesModel missoes;
    public PrimeirosModel(){

}

    public PrimeirosModel(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
