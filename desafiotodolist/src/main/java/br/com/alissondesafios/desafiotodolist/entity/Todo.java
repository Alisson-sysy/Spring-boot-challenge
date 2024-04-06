package br.com.alissondesafios.desafiotodolist.entity;

import jakarta.persistence.*;

// signals that this is an entity
@Entity
// set a name for a table in DB
@Table(name = "todo")
public class Todo {
    
    // create an ID field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iTodo;
    private String name;
    private String descricao;
    private Boolean finished;
    private int prioridade;

    public Long getiTodo() {
        return iTodo;
    }

    public void setiTodo(Long iTodo) {
        this.iTodo = iTodo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Boolean getFinished() {
        return finished;
    }

    public void setFinished(Boolean finished) {
        this.finished = finished;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
