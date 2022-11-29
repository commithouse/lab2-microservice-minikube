package com.example.demo;

import javax.persistence.*;
import java.sql.Time;
import java.util.Objects;

@Entity
@Table(name = "dependente_professor", schema = "public", catalog = "postgres")
public class DependenteProfessorEntity {
    private int id;
    private Time dtNascimento;
    private String flagIr;
    private Integer idProfessor;
    private String nome;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "dt_nascimento")
    public Time getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Time dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    @Basic
    @Column(name = "flag_ir")
    public String getFlagIr() {
        return flagIr;
    }

    public void setFlagIr(String flagIr) {
        this.flagIr = flagIr;
    }

    @Basic
    @Column(name = "id_professor")
    public Integer getIdProfessor() {
        return idProfessor;
    }

    public void setIdProfessor(Integer idProfessor) {
        this.idProfessor = idProfessor;
    }

    @Basic
    @Column(name = "nome")
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DependenteProfessorEntity that = (DependenteProfessorEntity) o;
        return id == that.id &&
                Objects.equals(dtNascimento, that.dtNascimento) &&
                Objects.equals(flagIr, that.flagIr) &&
                Objects.equals(idProfessor, that.idProfessor) &&
                Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, dtNascimento, flagIr, idProfessor, nome);
    }
}
