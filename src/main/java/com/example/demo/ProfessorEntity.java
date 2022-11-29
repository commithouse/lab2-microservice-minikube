package com.example.demo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "professor", schema = "public", catalog = "postgres")
public class ProfessorEntity {
    private long id;
    private String dtNascimento;
    private String email;
    private String endereco;
    private String nome;
    private String situacao;
    private String telefone;

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dt_nascimento")
    public String getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(String dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Basic
    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Basic
    @Column(name = "endereco")
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Basic
    @Column(name = "situacao")
    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Basic
    @Column(name = "telefone")
    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProfessorEntity that = (ProfessorEntity) o;
        return id == that.id &&
                Objects.equals(dtNascimento, that.dtNascimento) &&
                Objects.equals(email, that.email) &&
                Objects.equals(endereco, that.endereco) &&
                Objects.equals(nome, that.nome) &&
                Objects.equals(situacao, that.situacao) &&
                Objects.equals(telefone, that.telefone);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dtNascimento, email, endereco, nome, situacao, telefone);
    }
}
