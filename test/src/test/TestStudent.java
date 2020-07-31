package test;
import java.util.*;


class Student {
   
    private String name;
    private String CLASS;
    private int Snumber;
    private String PASSWORD;
    private String SEX;
    private double sum;
    private double math;
    private double forgien;
    private double language;
    private double politics;
    private static String SNAME = "安徽农业大学";

//    构造函数
    public Student() {
        this("李思宏", "17物流工程", 17114146, "123456", "男", 97, 95, 92, 96);
    }

//    全参构造函数
    public Student(String n, String c, int sn, String st, String sx, double m, double f, double l, double p) {
        name = n;
        CLASS = c;
        Snumber = sn;
        PASSWORD = st;
        SEX = sx;
        sum = m + f + l + p;
        math = m;
        forgien = f;
        language = l;
        politics = p;
    }

    public static void countMax(Student [] s,int X){
        double x, m, f, l, p;
        x = s[0].sum;
        m = s[0].math;
        f = s[0].forgien;
        l = s[0].language;
        p = s[0].politics;
        for (int i = 0; i < X; i++)
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
    public void setPASSWORD(String PASSWORD) {
        this.PASSWORD = PASSWORD;
    }
    public String getPASSWORD() {
        return this.PASSWORD;
    }
    public void setSEX(String SEX) {
        this.SEX = SEX;
    }
    public String getSEX() {
        return this.SEX;
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
        System.out.println("登陆成功");
    }
    public void logout() {
        System.out.println("登陆失败");
    }
    public static void myschool() {
        System.out.println("大学:" + SNAME);
    }
    public void login(String name) {
        if (this.name.equals(name))
            System.out.println(name + "登陆成功！");
        else
            logout();
    }
    public boolean changePasword(String password){
        return password.equals("123456") ;
    }

}

public class TestStudent{
    public static int N = 0;
    private static String SNAME = "安徽农业大学";
    public static void main(String [] args) {
        int M;
        double Math, Fesh, Logic ,p ;
        String NameInput, ClassINput, SNInput, SexInput;
        int sn ;

        Scanner reader = new Scanner(System.in);
        System.out.print("请输入需要录入学生的人数：");N = reader.nextInt();
        Student [] stu = new Student[N];
        for (int i = 0; i < N; i++) {
            System.out.print("请输入名字：");NameInput = reader.next();
            System.out.print("请输入班级：");ClassINput = reader.next();
            System.out.print("请输入学号：");sn = reader.nextInt();
            System.out.print("请输入密码：");SNInput = reader.next();
            System.out.print("请输入性别：");SexInput = reader.next();
            System.out.print("请输入各科分数：");
            Math = reader.nextDouble();
            Fesh = reader.nextDouble();
            Logic = reader.nextDouble();
            p = reader.nextDouble();
            stu[i] = new Student (NameInput, ClassINput, sn, SNInput, SexInput, Math, Fesh, Logic, p);
        }
        for (int i = 0; i < N; i++) {
            stu[i].login(stu[i].getName());
            System.out.println("**名字：" + stu[i].getName());
            System.out.println("**班级：" + stu[i].getCLASS());
            System.out.println("**学校：" + SNAME);
            System.out.println("**学号：" + stu[i].getSnumber());
            System.out.println("**密码：" + stu[i].getPASSWORD());
            System.out.println("**性别：" + stu[i].getSEX());
            System.out.println("**总分："+ stu[i].getSum());
        }
        Student.countMax(stu,N);
        System.out.println("请输入一个学号：");
        M=reader.nextInt();
        for (int j=0;j<N;j++)
        {
            if(M==stu[j].getSnumber())
            {
                System.out.println("存在该学生");
                System.out.println("该名学生信息如下：");
                System.out.println("**名字：" + stu[j].getName());
                System.out.println("**班级：" + stu[j].getCLASS());
                System.out.println("**学校：" + SNAME);
                System.out.println("**学号：" + stu[j].getSnumber());
                System.out.println("**密码：" + stu[j].getPASSWORD());
                System.out.println("**性别：" + stu[j].getSEX());
                System.out.println("**总分："+ stu[j].getSum());
                
            }
            else
            {
                System.out.print(" 不存在该学生 ");
                
            }
            
                    
        }
        
      
    }
    
    	
    }


