package com.assignment.test;

/**
 * Sort object by ascendant order
 * @author Venkatasiva Lekkala
 *
 */
public class AscStrategy implements SortStrategy {
	@Override
	public int compare(BinarySearchTreeNode node1, BinarySearchTreeNode node2) {
		String data1 = node1.getData();
		String data2 = node2.getData();
		return data1.compareTo(data2);
	}


}
