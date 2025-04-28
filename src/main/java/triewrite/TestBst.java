package triewrite;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Iterator;
import java.util.List;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestBst {

	BinarySearchTree<Integer> numberTree = new BinarySearchTree<>();
	BinarySearchTree<Integer> emptyTree = new BinarySearchTree<>();

	@BeforeEach
	public void setup() throws Exception {
		numberTree.insert(50);
		numberTree.insert(30);
		numberTree.insert(80);
		numberTree.insert(20);
		numberTree.insert(100);
		numberTree.insert(40);
		numberTree.insert(70);
		numberTree.insert(55);
		numberTree.insert(35);
		numberTree.insert(85);
		numberTree.insert(25);
		numberTree.insert(105);
		numberTree.insert(45);
		numberTree.insert(75);
	}
	

	@Test
	public void testSize() {
		assertEquals( 14, numberTree.size());//"Test size on numberTree",
		assertEquals( 0, emptyTree.size());//"Test size on emptyTree",
	}
	
	@Test
	public void testRoot() {
		assertEquals( Integer.valueOf(50), numberTree.root().getElement());//"Test root on numberTree",
		assertEquals( null, emptyTree.root());//"Test root on emptyTree",
	}
	@Test
	public void testIsEmpty() {
		assertEquals( false, numberTree.isEmpty());//"Test isEmpty on numberTree",
		assertEquals( true, emptyTree.isEmpty());//"Test isEmpty on emptyTree",
	}
	
	@Test
	public void testChildren() {
		assertEquals(Integer.valueOf(30), numberTree.children(numberTree.root()).iterator().next().getElement());// "Test children on numberTree",
		assertEquals(null, emptyTree.children(emptyTree.root()));//"Test children on emptyTree",
	}
	
	@Test
	public void testHeight() {
		assertEquals( 3, numberTree.height(numberTree.root()));//"Test height on numberTree root node",
		assertEquals( 0, numberTree.height(numberTree.find(25)));//"Test height on numberTree leaf node",
		assertEquals( 0, emptyTree.height(emptyTree.root()));//"Test height on emptyTree",
	}
	
	@Test
	public void testDepth() {
		assertEquals( 0, numberTree.depth(numberTree.root()));//"Test depth on numberTree",
		assertEquals( 3, numberTree.depth(numberTree.find(25)));//"Test depth on numberTree",
		assertEquals( 0, emptyTree.height(emptyTree.root()));//"Test depth on emptyTree",
	}
	
	@Test
	public void testFindMin() {
		assertEquals(Integer.valueOf(20), numberTree.findMin(numberTree.root()).getElement());//"Test find minimum on numberTree",
	}
	
	@Test 
	public void testFind() {
		assertEquals( Integer.valueOf(20), numberTree.find(Integer.valueOf(20)).getElement());//"Test find an existing number on numberTree",
		assertEquals(null, numberTree.find(Integer.valueOf(2)));//"Test find a non-existent number on numberTree",
	}
	
	@Test
	public void testDelete() {
		numberTree.delete(numberTree.find(20));
		assertEquals(null, numberTree.find(20));//"Test deleting node with single child",
		assertEquals( Integer.valueOf(30), numberTree.find(25).getParent().getElement());//"Test child parent update after parent is deleted",
		assertEquals( Integer.valueOf(25), numberTree.find(30).getLeft().getElement());//"Test parent update after child is deleted and grandchild attached",
		
		numberTree.delete(numberTree.find(25));
		assertEquals( null, numberTree.find(25));//"Test deleting node with no children",
		assertEquals( 12, numberTree.size());//"Test size after deleting one node",
		assertEquals( null, numberTree.find(30).getLeft());	//"Test parent update after deleting node",
		
		numberTree.delete(numberTree.find(50));
		assertEquals( 55, numberTree.root().getElement().intValue());//"Test new root after root delete",
	}
	
	@Test
	public void testInOrder() {
		List<BinarySearchTree.Node <Integer>> inorderList = numberTree.inorder(numberTree.root());
		Iterator<BinarySearchTree.Node<Integer>> iter = inorderList.iterator();
		assertEquals( Integer.valueOf(20), iter.next().getElement());//"Test inorder traversal",
		assertEquals( Integer.valueOf(25), iter.next().getElement());//"Test inorder traversal",
		assertEquals(Integer.valueOf(30), iter.next().getElement());//"Test inorder traversal",
		assertEquals( Integer.valueOf(35), iter.next().getElement());//"Test inorder traversal",
	}

}
