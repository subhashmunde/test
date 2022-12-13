package DS2;

import java.util.*;

public class DoubleLinkList {


Dnode root;
int count = 0;
void createList()
{
root=null;
}


void insertRight(int data)

{
Dnode n=new Dnode(data);
if(root==null)
root=n;
else
{
Dnode t=root;
while(t.right!=null)
t=t.right;
t.right=n;
n.left=t;
}
}

void printList()
{
if(root==null)
System.out.println("List Empty");
else
{
Dnode t;
t=root;
while(t!=null)
{
System.out.println(t.data);
t=t.right;
}
}
}
void printRevList()
{
if(root==null)
System.out.println("List Empty");
else
{
Dnode t;
t=root;
while(t.right!=null)
{
t=t.right;
}
while(t!=null)
{
System.out.println(t.data);
t=t.left;
}
}
}


void split(DoubleLinkList a, DoubleLinkList b) {
if (a.root == null)
System.out.println("List Empty");
else {

count = 1;
Dnode t = a.root;
while (t != null) {
if (count % 2 != 0) {
t = t.right;
count++;
} else {
b.insertRight(t.data);
if(count % 2 == 0 && t.right==null) {
t.right = null;
}
else {
(t.right).left = t.left;
}
(t.left).right = t.right;
t = t.right;
count++;
}
}

}
System.out.println("Odd List :\n");
a.printList();
System.out.println("Even List :\n");
b.printList();
}



public static void main(String args[])
{
int ch,e;
var obj1=new  DoubleLinkList();
var obb=new  DoubleLinkList();
Scanner in=new Scanner(System.in);
obj1.createList();
do
{
System.out.println("1.insertRight\n2.printList\n3.printRevList\n4.splitList\n0.exit");
ch=in.nextInt();
switch(ch)
{
case 1:
System.out.println("Enter Data:");
e=in.nextInt();
obj1.insertRight(e);
System.out.println("insertRight");
break;
case 2:
obj1.printList();
break;  
case 3:
obj1.printRevList();
break;
case 4:

obb.createList();

System.out.println(" Original List :\n");
obj1.printList();
obj1.split(obj1,obb);


break;

case 0:
System.out.println("Exiting ");
break;

default:
System.out.println("Wrong option selected");
break;
}
}while(ch!=0);
in.close();}

}
