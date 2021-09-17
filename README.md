# Exception Handling with Spring

Spring supports exception handling by a global Exception Handler (@ExceptionHandler) with Controller Advice (@ControllerAdvice). 
This enables a mechanism that makes ResponseEntity work with the type safety and flexibility of @ExceptionHandler.

The @ControllerAdvice annotation is specialization of @Component annotation so that it is auto-detected via classpath scanning. 
A Controller Advice is a kind of interceptor that surrounds the logic in our Controllers and allows us to apply some common logic to them.

Its methods (annotated with @ExceptionHandler) are shared globally across multiple @Controller components to capture exceptions and translate them to HTTP responses. 
The @ExceptionHandler annotation indicates which type of Exception we want to handle. The exception instance and the request will be injected via method arguments.

By using two annotations together, we can control the body of the response along with status code & handle several exceptions in the same method.
