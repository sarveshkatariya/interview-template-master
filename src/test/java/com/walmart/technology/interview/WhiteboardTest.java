package com.walmart.technology.interview;

import junit.framework.Assert;
import junit.framework.TestCase;

/**
 * Test class for validating Whiteboard logic
 */
public class WhiteboardTest extends TestCase {
	
	private Whiteboard whiteboard;

	/* (non-Javadoc)
	 * @see junit.framework.TestCase#setUp()
	 */
	@Override
	protected void setUp() throws Exception {
		// TODO Auto-generated method stub
		super.setUp();
		this.whiteboard = new Whiteboard();
	}
	
	public void testNumberOfStoresVisited() {
		int numberOfStoresVisited = this.whiteboard.getNumberOfStores("<>^v");
		Assert.assertEquals(3, numberOfStoresVisited);
	}
	
}
