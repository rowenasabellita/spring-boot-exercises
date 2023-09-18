# Activity 2

Objectives
- Learn how to create a Controller with Spring Boot
- Learn how to use API endpoints with Spring Boot

What to do:
- Create a `TodoController.java`
- Wrap your `class TodoController` with `@RestController` and `@RequestMapping("/todo")`
- Create function `getTodo()`, wrap it with `@GetMapping`, return a `String` object `Create Controller`
- Create function `createTodo(@RequestBody String title)`, wrap it with `@PostMapping`, return a `String` object based from the `title`
- Create Function `updateTodo`, with a parameter of `@RequestBody String title` wrap it with `@PutMapping`, return a `String` object based from `title`

Acceptance Criteria:
- Can do `./gradlew bootRun`
- GET `/todo` returns `Create Controller`
- POST `/todo` returns based on the `title` parameter
- PUT `/todo` returns based on the `title` parameter
