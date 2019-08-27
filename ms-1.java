public class Test {


public static void main(String[] args) 
{
String input1="Today is a nice day";
int input2=41;
String s[]=input1.split(" ");
int b=input2%10;
int a=input2/10;
String s1="";
String s2="";
s1=s[a-1];
s2=s[b-1];
String t1="";
String t2="";
String fin1="";
String fin2="";
int mid1=s1.length()/2;
int mid2=s2.length()/2;
if(s1.length()%2==0)
{
t1 =s1.substring(0,mid1);
t2=s1.substring(mid1);
StringBuffer sb=new StringBuffer(t1);
fin1+=sb.reverse().toString()+t2;

}
else
{
t1 =s1.substring(0,mid1+1);
t2=s1.substring(mid1);
StringBuffer sb=new StringBuffer(t1);
fin2+=sb.reverse().toString()+t2;	
}
if(s2.length()%2==0)
{
t1 =s2.substring(0,mid2);
t2=s2.substring(mid2);
StringBuffer sb1=new StringBuffer(t1);
fin1+=sb1.reverse().toString()+t2;

}
else
{
t1 =s2.substring(0,mid2+1);
t2=s2.substring(mid2);
StringBuffer sb1=new StringBuffer(t1);
fin2+=sb1.reverse().toString()+t2;
}
System.out.print(fin1+" "+fin2);

}

}
