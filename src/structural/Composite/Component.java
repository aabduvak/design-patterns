package structural.Composite;

/*
 * Composite pattern is a partitioning design pattern and describes a group of objects that 
 * is treated the same way as a single instance of the same type of object. 
 * The intent of a composite is to “compose” objects into tree structures to represent 
 * part-whole hierarchies. It allows you to have a tree structure and ask each node in the 
 * tree structure to perform a task.
 * 
 * The key concept is that you can manipulate a single instance of the object just as 
 * you would manipulate a group of them. The operations you can perform on all the 
 * composite objects often have a least common denominator relationship.
 * 
 * The Composite Pattern has four participants:
 * 1. Component – declares the interface for objects in the composition and for accessing 
 * and managing its child components. It also implements default behavior for the interface
 * common to all classes as appropriate.
 * 
 * 2. Leaf – defines behavior for primitive objects in the composition. It represents leaf 
 * objects in the composition.
 * 
 * 3. Composite – stores child components and implements child related operations in the 
 * component interface.
 * 
 * 4. Client – manipulates the objects in the composition through the component interface.
 * 
 * Client use the component class interface to interact with objects in the composition 
 * structure. If recipient is a leaf then request is handled directly. If recipient is 
 * a composite, then it usually forwards request to its child components, possibly 
 * performing additional operations before and after forwarding.
 * 
 * Example:
 * 										Team
 * 										/	\
 * 									   /	 \
 * 									TeamA	  TeamB
 * 									 /		   \
 * 									/			\
 * 							Truck + HR		Truck + HR
 * 
 */

public interface Component {
	public void deploy();
}
