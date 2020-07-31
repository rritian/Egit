package test2;

import java.util.*;
 class Student {
   private static String SCHOOLNAME = "安徽农业大学";
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
       System.out.println("总分最高为：" + x);
       System.out.println("数学分最高为：" + m);
       System.out.println("外语分最高为：" + f);
       System.out.println("语文分最高为：" + l);
       System.out.println("政治分最高为：" + p);
   }
   public Student() {
       this("袁新宇", "17物流工程1班", 17114126, "114126", "男", 100, 100, 100, 100);
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
       System.out.println("大学:" + SCHOOLNAME);
   }
   public void login(String name) {
       if (this.name.equals(name))
          System.out.println("恭喜" + name + "登陆成功！");
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
	           System.out.print("请输入姓名：");
	           n = reader.next();
	           System.out.print("请输入班级：");
	           c = reader.next();
	           System.out.print("请输入学号：");
	           sn = reader.nextInt();
	           System.out.print("请输入密码：");
	           st = reader.next();
	           System.out.print("请输入性别：");
	           sx = reader.next();
	           System.out.print("请输入各科分数：");
	           m = reader.nextDouble();
	           f = reader.nextDouble();
	           l = reader.nextDouble();
	           p = reader.nextDouble();
	           stu[i] = new Student (n, c, sn, st, sx, m, f, l, p);
	       }
	       for (int i = 0; i < 5; i++) {
	           stu[i].login(stu[i].getName());
	           System.out.println("姓名：" + stu[i].getName());
	           System.out.println("班级：" + stu[i].getCLASS());
	           System.out.println("学号：" + stu[i].getSnumber());
	           System.out.println("密码：" + stu[i].getSecret());
	           System.out.println("性别：" + stu[i].getSex());
	           System.out.println("总分："+ stu[i].getSum());
	       }
	       Student.max(stu);
	   }
	

}
