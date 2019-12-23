import java.io.*;
import java.util.*;
class week3_3
{
public static void main(String args[])
{
int n,i,flag=0;
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int key;
key=sc.nextInt();
for(i=0;i<n;i++)
{
if(key==a[i])
{
flag=1;
break;
}
}

if(flag==1)
{
System.out.println(i+1);
}
else
{
System.out.println(-1);
}
}
}
