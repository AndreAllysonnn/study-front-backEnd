package br.com.crud.projeto.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="usuarios")
public class UsuarioModel {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Setter @Getter private long id;
    
    @Column(name="nome")
    @Setter @Getter private String nome;

    @Column(name="dataNascimento")
    @Setter @Getter private String dataNascimento;

    @Column(name="email")
    @Setter @Getter private String email;
}