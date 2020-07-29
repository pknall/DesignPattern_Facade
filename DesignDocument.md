Facade Pattern
===
This project implements a simple Facade Pattern from http://www.design-patterns-stories.com/patterns/Facade/.

This compiler abstracts the work necessary for a compiler to add two integers.  If the client wants
to add two numbers, it does not make sense for that client to work through the low level code
necessary to perform that operation.  Instead, the Compiler object acts as a Facade to take care
of the low level details and allow the client to perform the operation with just one command.

In order to add two numbers, the Compiler object must
1) Create the parser object
2) Convert the input string into a list of tokens
3) Convert the list of tokens to an Abstract Syntax Tree (AST)
4) Evaluate the AST and return the result

Instead, the client calls Compiler.compile(String) and the compiler handles the details.