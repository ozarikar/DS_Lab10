import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BSTreeTest {

	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() 
	{
		BSTree one = new BSTree();
		assertTrue(one.isEmpty());
		assertEquals(one.largest(),null);
		one.insert(11);
		assertEquals(11,one.largest().intValue());
		assertFalse(one.isEmpty());
		assertEquals(one.getSize(),1);
		assertEquals(one.sum(),11);
		one.insert(15);
		
		//to list
		ArrayList<Integer> l0 = (ArrayList<Integer>) one.toList();
		List<Integer> l1=new ArrayList<Integer>();
		l1.add(11);
		l1.add(15);
		for(int i=0;i<2;i++)
			assertEquals(l0.get(i),l1.get(i));
		
		assertEquals(one.largest().intValue(),15);
		assertEquals(one.getSize(),2);
		assertEquals(one.sum(),26);
		one.insert(8);
		//to list
				ArrayList<Integer> l2 = (ArrayList<Integer>) one.toList();
				List<Integer> l3=new ArrayList<Integer>();
				l3.add(8);
				l3.add(11);
				l3.add(15);
				for(int i=0;i<3;i++)
					assertEquals(l2.get(i),l3.get(i));
		assertEquals(one.largest().intValue(),15);
		assertEquals(one.getSize(),3);
		assertEquals(one.sum(),34);
		one.insert(30);
		assertEquals(one.getSize(),4);
		assertEquals(one.retrieve(11).intValue(),11);
		assertEquals(one.retrieve(41),null);
		assertEquals(one.retrieve(30).intValue(),30);
		assertEquals(one.retrieve(58),null);
		assertEquals(one.retrieveDepth(30),2);
		assertEquals(one.retrieveDepth(15),1);
		assertEquals(one.retrieveDepth(11),0);
		assertEquals(one.largest().intValue(),30);
		
		
assertEquals(one.sum(),64);
		
		BSTree b= new BSTree();
		b.insert(11);
		b.insert(8);
		b.insert(15);
		b.insert(30);
		assertTrue(one.myEquals(b));
		assertTrue(b.myEquals(one));
		BSTree c= new BSTree();
		c.insert(8);
		c.insert(11);
		c.insert(30);
		c.insert(15);
		assertFalse(one.myEquals(c));
		BSTree d= new BSTree();
		d.insert(24);
		d.insert(65);
		d.insert(100);
		d.insert(48);
		assertFalse(one.myEquals(d));
		assertFalse(b.myEquals(d));
		assertFalse(c.myEquals(b));
		
		
		//hello omkar, this is tenghoit
	
	
	
	
	
	}

}
