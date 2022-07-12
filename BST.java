class Node{
	int info;
	Node right,left;
	Node(int val){
		info=val;
		left=right=null;
	}
}
class BST{
    Node root;
	Node insert(Node root,int val){
	if(root==null){
		root=new Node(val);
		return root;		
	}
	if(val<root.info)
		root.left=insert(root.left,val);
	else
		root.right=insert(root.right,val);	
	return root;
}
public void preorder(Node root){
	if(root!=null)
	{
		System.out.print(" "+root.info);
		preorder(root.left);
		preorder(root.right);
	}
}
public void inorder(Node root){
	if(root!=null)
	{
		inorder(root.left);
		System.out.print(" "+root.info);
		inorder(root.right);
	}
}
boolean Find(Node root,int item){
	while(root!=null){
		if(root.info==item)
			return true;
		else if(item<root.info)
			root=root.left;
		else
			root=root.right;
		}
		return false;
}
int Findmin(Node root){
	while(root.left!=null)
		root=root.left;
	return root.info;
}
int Findmax(Node root){
	while(root.right!=null)
		root=root.right;
	return root.info;
}
boolean isBst(Node root){
	if(root==null)
		return true;
	if(root.left!=null && Findmax(root.left)>root.info)
		return false;
	if(root.right!=null && Findmin(root.right)<root.info)
		return false;
	
	return (isBst(root.left) && isBst(root.right));
}
public static void main (String args[]){
	BST t=new BST();
	int a[]={10,20,30,25,40};
	for(int i=0;i<a.length;i++)
    	t.root=t.insert(t.root,a[i]);
	t.preorder(t.root);
	System.out.println();
	t.inorder(t.root);
	System.out.println("The min value is "+t.Findmin(t.root));
	System.out.println("The max value is "+t.Findmax(t.root));
	System.out.println("is it a bst ? "+t.isBst(t.root));
	System.out.println("is this present in BST? "+t.Find(t.root,11));
	
	
}
}
		
