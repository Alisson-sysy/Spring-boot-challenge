package br.com.alissondesafios.desafiotodolist;

import br.com.alissondesafios.desafiotodolist.entity.Todo;
import br.com.alissondesafios.desafiotodolist.service.TodoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.AutoConfigureWebTestClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureWebTestClient
class DesafiotodolistApplicationTests {

	@Autowired
	private WebTestClient webTestClient;

	@Test
	void contextLoads() {
	}

	@Test
	void testCreateTodoSuccess() {

		Todo todoObject = new Todo("Breakfast", "Make breakfast", false, 1);

		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(todoObject)
				.exchange()
				.expectStatus().isOk()
				.expectBody()
				.jsonPath("$").isArray()
				.jsonPath("$.length()").isEqualTo(1)
				.jsonPath("$[0].name").isEqualTo(todoObject.getName())
				.jsonPath("$[0].descricao").isEqualTo(todoObject.getDescricao())
				.jsonPath("$[0].finished").isEqualTo(todoObject.getFinished())
				.jsonPath("$[0].prioridade").isEqualTo(todoObject.getPrioridade());

	}

	@Test
	void testCreateTodoFailure() {
		webTestClient
				.post()
				.uri("/todos")
				.bodyValue(
						new Todo("", "", false, 1)
				).exchange()
				.expectStatus().isBadRequest();

	}

}
