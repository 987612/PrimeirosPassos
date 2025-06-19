package com.java._x.PrimeirosPassos.Missoes;

import com.java._x.PrimeirosPassos.Primeiros.Controller.Model.PrimeirosModel;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "Tb_missões")
public class MissoesModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;

    private String dificuldade;
    @OneToMany(mappedBy = "missoes")
    private List<PrimeirosModel> primeio;
}
