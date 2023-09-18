# Activity 3

Objectives:
- Learn how to create a model in Java
- Learn how to create a `Service` and `Repository`

What to do:
- Create a `Todo.java`
- Wrap your `class Todo` with `@Getter` and `@Setter`, importing the `lombok`
- Capture data such as `String id`, `String title`, `boolean isCompleted`
- Wrap `class Claim` with `@Document("/[username]-todo")`
- Wrap `id` with `@Id`
- Create `TodoService.java` wrap it with `@Service`
- Create `TodoRepository.java` as an `interface` that `extends MongoRepository<Todo, String>`
- On `TodoService.java`, instantiate the `TodoRepository` with 
    - ```java
        @Autowired
        private TodoRepository repository;
- On `TodoService.java`, create `createTodo(Todo todo)`
    - Create using `.save(entity)`
- On `TodoService.java`, create `updateTodo(Todo todo)`
    - Update using `.save(entity)`
- On `TodoService.java`, create `getTodos()`
    - Get all using `findAll()`

Acceptance Criteria:
- POST `/todo` returns a new `Todo` json
- GET `/todo` returns the data created
- PUT `/todo` returns the newly updated `Todo` json

