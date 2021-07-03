package javaprograms;

class A5{  
protected void msg(){System.out.println("Hello java");}  
}  
  
public class AccessSpecifier extends A5{  
public void msg(){System.out.println("Hello java");}//C.T.Error  
 public static void main(String args[]){  
	 AccessSpecifier obj=new AccessSpecifier();  
   obj.msg();  
   }  
}  