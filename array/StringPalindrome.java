package array;

public class StringPalindrome {
	//String str="madam";
	public void strPal(String str) {
		boolean flag=true;
		char a[]=str.toCharArray();
		for(int i=0;i<a.length;i++) {
			if(a[i]!=a[(a.length-1)-i]) {
				//System.out.println("palindrome");
				flag=false;
			}
		}
		if(flag==true) System.out.println("pal");
		else System.out.println("not pal");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringPalindrome s=new StringPalindrome();
		s.strPal("madama");
	}

}
