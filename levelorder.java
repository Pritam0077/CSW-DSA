import java.util.*;
class Node{
	int info;
	Node left,right;
	Node(int val){
		info=val;
		left=right=null;
	}
}
class levelorder{
	Node root;
	Node insert(int A[],int i){
		Node curr=null;
	if(i<A.length){
		curr=new Node(A[i]);
		int left=2*i+1;
		int right=2*i+2;
		curr.left=insert(A,left);
		curr.right=insert(A,right);
	}
	return curr;
}
void preorder(Node root){
	if(root!=null){
		System.out.print(" " + root.info);
		preorder(root.left);
		preorder(root.right);
	}
}
void Bfs(Node root){
	ArrayDeque<Node> q=new ArrayDeque<>();
	Node temp;
	if(root!=null){
		q.add(root);
	while(q.isEmpty()==false){
		temp=q.remove();
		System.out.print(" "+ temp.info);
	if(temp.left!=null)
		q.add(temp.left);
	if(temp.right!=null)
		q.add(temp.right);
	}
     }
}
void Dfs(Node root){
 	ArrayDeque<Node> q=new ArrayDeque<>();
	Node temp;
	if(root!=null){
		q.push(root);
	while(q.isEmpty()==false){
		temp=q.pop();
		System.out.print(" "+ temp.info);
	if(temp.left!=null)
		q.push(temp.left);
	if(temp.right!=null)
		q.push(temp.right);
	}
    }
}

public static void main(String args[]){
      levelorder t=new levelorder();
      int arr[]={1,2,3,4,5,6,7,8};
      t.root=t.insert(arr,0);
      t.preorder(t.root);
      System.out.println();
      t.Bfs(t.root);
	System.out.println();
      t.Dfs(t.root);
	
	 
      }
   }
