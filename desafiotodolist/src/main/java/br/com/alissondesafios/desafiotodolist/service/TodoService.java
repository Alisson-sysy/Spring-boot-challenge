package br.com.alissondesafios.desafiotodolist.service;

import br.com.alissondesafios.desafiotodolist.entity.Todo;
import br.com.alissondesafios.desafiotodolist.repository.TodoRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {
    private TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public List<Todo> create(Todo todo) {
        todoRepository.save(todo);
        return this.list();
    }

    public List<Todo> list() {
        return todoRepository.findAll();
    }
    public List<Todo> delete(Long id) {
        todoRepository.deleteById(id);
        return this.list();
    }
    public List<Todo> update(Todo todo) {
        todoRepository.save(todo);
        return this.list();
    }
}
