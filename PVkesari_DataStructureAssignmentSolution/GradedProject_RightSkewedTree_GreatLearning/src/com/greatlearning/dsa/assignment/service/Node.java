package com.greatlearning.dsa.assignment.service;

//Class of the node
public class Node {
	int val;
	public Node left;
	public Node right;

	// Helper function that allocates a new node
	// with the given data and NULL left and right
	// pointers.
	public Node(int item) {
		val = item;
		left = right = null;
	}
}