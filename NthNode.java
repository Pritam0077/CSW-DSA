class Node{
	int info;
	Node left,right;
	Node(int val){
		info=val;
		left=right=null;
	}
}
class NthNode{
	int count;
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
void NthPreOrder(Node root,int n){
	if(root!=null){
		count++;
		if(count==n)
			System.out.println(root.info);
		NthPreOrder(root.left,n);
		NthPreOrder(root.right,n);
	}
}		
void NthInOrder(Node root,int n){
	if(root!=null){
		NthInOrder(root.left,n);
		count++;
		if(count==n)
	            System.out.print(" " +root.info); 
		NthInOrder(root.right,n);
	}
}	
	
public static void main(String args[]){
      NthNode t=new NthNode();
      int arr[]={1,2,3,4,5,6,7,8};
      t.root=t.insert(arr,0);
      t.preorder(t.root);
      System.out.println();
     // t.NthPreOrder(t.root,3);
     // System.out.println();
      t.NthInOrder(t.root,3);
      }
   }
