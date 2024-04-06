package br.com.alissondesafios.desafiotodolist.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import org.antlr.v4.runtime.misc.NotNull;
import org.apache.logging.log4j.message.Message;

// signals that this is an entity
@Entity
// set a name for a table in DB
@Table(name = "todo")
public class Todo {
    
    // create an ID field
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long iTodo;

    @NotBlank
    private String name;

    @NotBlank
    private String descricao;

    private Boolean finished;
    private int prioridade;

    public Todo(String name, String descricao, Boolean finished, int prioridade) {
        this.name = name;
        this.descricao = descricao;
        this.finished = finished;
        this.prioridade = prioridade;
    }

    public Todo() {

    }

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
