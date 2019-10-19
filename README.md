Introduction:

Depth First Search:
	Depth-first search (DFS) is an algorithm for traversing or searching tree or graph data structures. The algorithm starts at the root node (selecting some arbitrary node as the root node in the case of a graph) and explores as far as possible along each branch before backtracking.
	It uses the Stack data structure, performs two stages, first visited vertices are pushed into stack and second if there is no vertices then visited vertices are popped.
	
Ex.

![Image Daa1](https://user-images.githubusercontent.com/56750272/67140232-39206d80-f276-11e9-9954-bcea5a5c418e.PNG)

Output:A, B, D, E, C, F
	
	

Applications of DFS:
1.	Finding connected components
2.	Topological String
3.	Finding the bridges of a graph
4.	Cycle detection in a graph
5.	Finding bi-connectivity in a graph



Topic : Detect cycle in an undirected graph using DFS


Implementation of DFS in program:
1.	Creating a static class graph.
2.	addEdge() - used to add the edge in a graph between two distinct nodes Edge should be added from souce node to destination node as well as destination to source as it is an undirected graph.
3.	Methodology Used : For any current vertex ‘x’ i.e. currently visiting vertex, if there is an adjacent vertex ‘y’ is present which is already visited and ‘y’ is not a direct parent of ‘x’ then there is a cycle in graph.
4.	Now do DFS from ‘x’, once you reach to ‘y’, will do the DFS from ‘y’ and adjacent vertex is ‘x’ and since its already visited so there should be cycle but actually there is no cycle since ‘x’ is a parent of ‘y’. That is why we will ignore visited vertex if it is parent of current vertex.

Graph Used:



 
Output: Is Cycle present : true.
