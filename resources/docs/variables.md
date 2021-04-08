# OCP-1Z0-819
OCP Oracle Certified Professional Java SE 11 Developer practices notes.

[README.md](../../README.md#variables)

## Variables

### Names
- Names must not start with **_**, numeric characters or include a white space.
- Use **_** alone is illegal.
- By convention, names must not start **$**

### Declaration
````java
String name, city;

String country ="USA", state="CO";
````

### Scope
Variables can have a scope of specific block of code.
````java
if(price > 20){
    double discount = 0.5;
    price -= fee *  discount;
}
````

### Local-variable type inference
````java
    var outputStream = new ByteArrayOutputStream();
    
    UnaryOperator<Integer> unaOp2 = (var x) -> x * 7;
    
    var x = 30;
    
    for(var item : items){}
    
    for(var i=0; i<10; i++){}
    
    var var = 10;
    
````
Where can var **not** be used?
````java
var price; // declarations without an initial value

var price = null; // initialization with a null value

var price = 9.95, tax = 0.05; // compound declarations

var prices = {9.95, 5, 3.50}; // Array initializers

public var price; // fields of a class

public void setPrice(var price){} // parameters of a method

public var getPrice(){} // method return types

(var x, y) -> x.process(y); // You could never mix implicitly and explicitly typed lambda parameters

(var x, int y) -> x.process(y);
        
var x -> x.toString(); // You cannot omit parenthesis for single explicitly typed lambda parameter

````
be careful with **interfaces**.
````java
var list = new ArrayList<String>(); // inferred as ArrayList<String>
        
var itemQueue = new PriorityQueue<>(); // inferred as PriorityQueue<Object>
````
**numbers** usually are going to be inferred as **int** or **double**.
