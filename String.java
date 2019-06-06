import java.util.*;
import java.lang.*;
public class String
{
public static void main(String[] args)
{
int k,n,i;
Scanner sc=new Scanner(System.in);
String b=sc.next();
char ch[]=b.toCharArray();
n=b.length();
k=sc.nextInt();
for(i=n-k;i<n;i++)
{
System.out.print(ch[i]);
}
}
}

