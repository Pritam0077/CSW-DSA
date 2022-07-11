class Node{
	int info;
	Node left,right;
	Node(int val){
		info=val;
		left=right=null;
	}
}
class CBT{
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
void inorder(Node root){
	if(root!=null){
		inorder(root.left);
		System.out.print(" " + root.info);
		inorder(root.right);
	}
}
void postorder(Node root){
	if(root!=null){
		postorder(root.left);
		postorder(root.right);
		System.out.print(" " + root.info);
	}
}
public static void main(String args[]){
      CBT t=new CBT();
      int arr[]={1,2,3,4,5,6,7,8};
      t.root=t.insert(arr,0);
      t.preorder(t.root);
      System.out.println();
      t.inorder(t.root);
      System.out.println();
      t.postorder(t.root);
      }
   }
