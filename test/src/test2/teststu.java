package test2;

import java.util.*;
 class Student {
   private static String SCHOOLNAME = "����ũҵ��ѧ";
   private String name;
   private String CLASS;
   private int Snumber;
   private String secret;
   private String sex;
   private double sum;
   private double math;
   private double forgien;
   private double language;
   private double politics;
   public static void max(Student [] s){
       double x, m, f, l, p;
       x = s[0].sum;
       m = s[0].math;
       f = s[0].forgien;
       l = s[0].language;
       p = s[0].politics;
       for (int i = 0; i < 5; i++)
       {
           if (x < s[i].sum)
               x = s[i].sum;
           if (m < s[i].math)
               m = s[i].math;
           if (f < s[i].forgien)
               f = s[i].forgien;
           if (l < s[i].language)
               l = s[i].language;
           if (p < s[i].politics)
               p =s[i].politics;
       }
       System.out.println("�ܷ����Ϊ��" + x);
       System.out.println("��ѧ�����Ϊ��" + m);
       System.out.println("��������Ϊ��" + f);
       System.out.println("���ķ����Ϊ��" + l);
       System.out.println("���η����Ϊ��" + p);
   }
   public Student() {
       this("Ԭ����", "17��������1��", 17114126, "114126", "��", 100, 100, 100, 100);
   }
   public Student(String n, String c, int sn, String st, String sx, double m, double f, double l, double p) {
       name = n;
       CLASS = c;
       Snumber = sn;
       secret = st;
       sex = sx;
       sum = m + f + l + p;
       math = m;
       forgien = f;
       language = l;
       politics = p;
   }
   public void setName(String name) {
       this.name = name;
   }
   public String getName() {
       return this.name;
   }
   public void setCLASS(String CLASS) {
       this.CLASS = CLASS;
   }
   public String getCLASS() {
       return this.CLASS;
   }
   public void setSecret(String secret) {
       this.secret = secret;
   }
   public String getSecret() {
       return this.secret;
   }
   public void setSex(String sex) {
       this.sex = sex;
   }
   public String getSex() {
       return this.sex;
   }
   public void setSnumber(int Snumber) {
       this.Snumber = Snumber;
   }
   public int getSnumber() {
       return this.Snumber;
   }
   public void setSum(double sum) {
       this.sum = sum;
   }
   public double getSum() {
       return this.sum;
   }
   public void login() {
          System.out.println("login success");
   }
   public void logout() {
       System.out.println("login out sucess");
   }
   public static void myschool() {
       System.out.println("��ѧ:" + SCHOOLNAME);
   }
   public void login(String name) {
       if (this.name.equals(name))
          System.out.println("��ϲ" + name + "��½�ɹ���");
       else
          logout();
   }
   public boolean changePasword(String password){
       return password.equals("123456") ;
   }
  
   
}
public class teststu {
	 public static void main(String [] args) {
	       Scanner reader = new Scanner(System.in);
	       String n, c, st, sx;
	       double m, f, l ,p;
	       int sn;
	       Student [] stu = new Student[20];
	       for (int i = 0; i < 5; i++) {
	           System.out.print("������������");
	           n = reader.next();
	           System.out.print("������༶��");
	           c = reader.next();
	           System.out.print("������ѧ�ţ�");
	           sn = reader.nextInt();
	           System.out.print("���������룺");
	           st = reader.next();
	           System.out.print("�������Ա�");
	           sx = reader.next();
	           System.out.print("��������Ʒ�����");
	           m = reader.nextDouble();
	           f = reader.nextDouble();
	           l = reader.nextDouble();
	           p = reader.nextDouble();
	           stu[i] = new Student (n, c, sn, st, sx, m, f, l, p);
	       }
	       for (int i = 0; i < 5; i++) {
	           stu[i].login(stu[i].getName());
	           System.out.println("������" + stu[i].getName());
	           System.out.println("�༶��" + stu[i].getCLASS());
	           System.out.println("ѧ�ţ�" + stu[i].getSnumber());
	           System.out.println("���룺" + stu[i].getSecret());
	           System.out.println("�Ա�" + stu[i].getSex());
	           System.out.println("�ܷ֣�"+ stu[i].getSum());
	       }
	       Student.max(stu);
	   }
	

}
