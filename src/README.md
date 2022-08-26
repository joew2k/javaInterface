#Interface

An **Interface** is similar to an abstract class, except in an abstract class there 
can be some methods that are implemented. The methods in an interface are abstract by 
default so there is no need to declare them as abstract. Interfaces are implemented not 
extended and any class that implements an interface must implement all its methods or 
declare itself as an abstract class.

In the example here, we are going to create a product interface and create a book class 
that implement the product. 

Note that fields are not defined in an interface, if a feed is defined then that field 
is going to be final.

Changing the structure of the interface will break all classes that implemented the interface, 
from Java 8 the term default was used to make modifications to the interface without necessarily 
implementing it in the other classes and this will not break the classes that implemented 
the interface.

A class can implement multiple interfaces using comma delimeted list.