package pl.edu.pw.ee;

import org.junit.Assert;
import org.junit.Test;

public class RedBlackTreeTest {
	// TODO
    
    @Test
    public void getTest() {
        RedBlackTree tree = new RedBlackTree();
        Integer key = 5;
        String value = "5";
        tree.put(key, value);
        
        String result = (String) tree.get(key);
        
        Assert.assertEquals(value, result);
    }
    
    @Test
    public void deleteTest() {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 100; i++) {
            tree.put(i, String.valueOf(i));
        } 
        tree.deleteMax();
        String result = (String)tree.get(99);
        
        Assert.assertEquals(null, result);
    }
    
    @Test
    public void getTest1() {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 100; i++) {
            tree.put(i, String.valueOf(i));
        } 
        String result = (String) tree.get(56);
        String expected = "56";
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void preOrderTest() {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 10; i++) {
            tree.put(i, String.valueOf(i));
        } 
        String result = tree.getPreOrder();
        String expected = "3:3 1:1 0:0 2:2 7:7 5:5 4:4 6:6 9:9 8:8";
        
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void inOrderTest() {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 10; i++) {
            tree.put(i, String.valueOf(i));
        } 
        String result = tree.getInOrder();
        String expected = "0:0 1:1 2:2 3:3 4:4 5:5 6:6 7:7 8:8 9:9";
        
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void postOrderTest() {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 0; i < 10; i++) {
            tree.put(i, String.valueOf(i));
        } 
        String result = tree.getPostOrder();
        String expected = "0:0 2:2 1:1 4:4 6:6 5:5 8:8 9:9 7:7 3:3";
        
        
        Assert.assertEquals(expected, result);
    }
    
    @Test
    public void getTest2() {
        RedBlackTree tree = new RedBlackTree();
        for (int i = 99; i >= 0; i--) {
            tree.put(i, String.valueOf(i));
        } 
        String result = (String) tree.get(56);
        String expected = "56";
        
        Assert.assertEquals(expected, result);
    }
    
    
}
