import java.util.*;
class student1
{
int age;
String name;
static int count;
void getdata()
{
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
sc.nextLine();
name=sc.nextLine();
count++
}
void display()
{
System.out.println(age);
System.out.println(name);
}
public static void main(String x[])
{
student o1=new student1();
o1.getdata();
student o2=new student1();
o2.getdata();
student o3=new student1();
o3.getdata();
student o4=new student1();
o4.getdata();
o1.display();
o2.display();
o3.display();
o4.display();

System.out.println("No of students"+count);
}
}


