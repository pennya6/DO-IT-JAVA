package study7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

//Ʈ����ȸ
public class baekjoon1991 {
	
	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int i, n = Integer.parseInt(in.readLine());
		Tree t = new Tree();
		char data[];
		for(i=0;i<n;i++){
			data = in.readLine().replaceAll(" ", "").toCharArray();
			t.add(data[0], data[1], data[2]);
		}
		t.preorder(t.root);
		System.out.println();
		t.inorder(t.root);
		System.out.println();
		t.postorder(t.root);
		in.close();
			
		}
	}


	//node class
	class node{
		char data;
		node left,right;
		public node(char data) {
			this.data=data;
		}
	}
	class Tree{
		node root;
		//�� �߰�
		public void add(char data, char ld, char rd) {
			if(root==null) {
				if(data!='.') {
					root=new node(data);
				}
				if(ld!='.') {
					root.left=new node(ld);
				}
				if(rd!='.') {
					root.right=new node(rd);
				}
			}
			else search(root,data,ld,rd);
		}
		//�����ġ�� �߰����� ã�� �޼���
		private void search(node root,char d, char ld, char rd) {
			if(root==null)
				return ;
			else if(root.data==d) {
				if(ld!='.')root.left=new node(ld);
				if(rd!='.') {
					root.right=new node(rd);
				}
			}
			else {
				search(root.left, d, ld, rd);
				search(root.right, d, ld, rd);
			}
		}
		//��������
		public void preorder(node root){
			System.out.print(root.data);
			if(root.left!=null) preorder(root.left);
			if(root.right!=null) preorder(root.right);
		}
		//��������
		public void inorder(node root){
			if(root.left!=null) inorder(root.left);
			System.out.print(root.data);
			if(root.right!=null) inorder(root.right);
		}
		//��������
		public void postorder(node root){
			if(root.left!=null) postorder(root.left);
			if(root.right!=null) postorder(root.right);
			System.out.print(root.data);
		}
	}

