import java.io.*;
import java.util.*;
class week3_2
{
public static void main(String args[])
{
int n,i;
Scanner sc= new Scanner(System.in);
n=sc.nextInt();
int a[]=new int[n];
for(i=0;i<n;i++)
{
a[i]=sc.nextInt();
}
int min=a[0],max=a[0];
for(i=0;i<n;i++)
{
if(a[i]>min)
{
min=a[i];
}
else if(a[i]<max)
{
max=a[i];
}
}
System.out.println(min);
System.out.println(max);
}
}