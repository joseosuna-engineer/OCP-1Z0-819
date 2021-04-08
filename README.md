# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

## [ASCII symbols](https://github.com/joseosuna-engineer/ASCII-symbol-names-java/blob/main/README.md)

## Keywords
![](resources/images/keywords.PNG)

## Packages
**package** is optional.

## Access modifiers
- **protected**: package, subclasses.
- **no-modifier**: package.

## [Class](resources/docs/class.md)

## [Types](resources/docs/types.md)

## [Variables](resources/docs/variables.md)

## Operators
### Operator precedence
- From left to right.
- Parentheses.
- ++/--
- Multiplication and division.
- Addition and subtraction.

## [Flow Control](resources/docs/flow-control.md)

## [Arrays](resources/docs/arrays.md)

## Objects in memory
- **Variables** are stored in the **Stack**.
- **Objects** are stored in the **Heap**.
- **Object references** are pointers and variables, they are store in the **Stack**.

## Exceptions
### Hierarchy
- Throwable **(checked)**
    - Exception **(checked)** / Error **(unchecked)**
        - RuntimeException **(unchecked)**

### Flow
After an exception is handled, the execution continues after the last catch handler.
````java
try{
    
    }catch(Exception e){
    System.out.println("exception is handled here");
}
System.out.println("execution continues here");
````

## [Lambdas](resources/docs/lambdas.md)

## [Streams](resources/docs/streams.md)

## [Modularity](resources/docs/modules.md)
