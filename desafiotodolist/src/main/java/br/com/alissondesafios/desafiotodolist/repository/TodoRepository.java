package br.com.alissondesafios.desafiotodolist.repository;

import br.com.alissondesafios.desafiotodolist.entity.Todo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
