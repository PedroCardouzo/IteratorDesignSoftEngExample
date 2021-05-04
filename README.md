# IteratorDesignSoftEngExample
Example for a Software Engineering class related to implementation of Iterator Design Pattern

Here we show some of the benefits of having a Iterable interface - as it allows you to elegantly control how the Object (in this case Binary Tree data structure) is iterated over.
For example this allows for quick swap of iteration methods (in this case, between Depht First Search to Breadth First Search).
It also allows for methods to abstract the data structure they receive and only use the Iterable interface.
Finally it also allows for high level for-loops to be used on said data structures, which is elegant for code usage (and again allows for swaps on all iterations through the change of the iterator implementation).
