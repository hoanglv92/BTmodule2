package TreeMap;

import com.sun.org.apache.xalan.internal.xsltc.dom.NodeSortRecord;

public class CreatTreeNumber {
    class Node {
        int key;
        Node left;
        Node right;
        public Node(int item){
            key=item;
            left=right=null;
        }
    }
    Node root;
    CreatTreeNumber(){
        root=null;
    }
    void deleteKey(int key){
        root=deleteRec(root,key);
    }
    Node deleteRec(Node root,int key){
        if(root==null){
            return root;
        }else if(key>root.key){
            root.right=deleteRec(root.right,key);
        }else {
            if(root.left==null){
                return root.right;
            }else if(root.right==null){
                return root.left;
            }
            root.key=minVaLue(root.right);
            root.right=deleteRec(root.right,root.key);
        }
        return root;
    }
    int minVaLue(Node root){
        int minv=root.key;
        while (root.left!=null){
            minv=root.left.key;
            root=root.left;
        }
        return minv;
    }
    void inSert(int key){
        root=insertRec(root,key);
    }
    Node insertRec(Node root, int key){
        if(root==null){
            root=new Node(key);
            return root;
        }
        if(key<root.key){
            root.left=insertRec(root.left,key);
        }else if(key>root.key){
            root.right=insertRec(root.right,key);
        }
        return root;
    }
    void intorder(){
        intorderRec(root);
    }
    void intorderRec(Node root){
        if(root!=null){
            intorderRec(root.left);
            System.out.println(root.key+" ");
            intorderRec(root.right);
        }
    }

}
