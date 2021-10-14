/**
 * Project name(项目名称)：静态内部类
 * Package(包名): PACKAGE_NAME
 * Class(类名): Outer
 * Author(作者）: mao
 * Author QQ：1296193245
 * Date(创建日期)： 2021/10/14
 * Time(创建时间)： 19:37
 * Version(版本): 1.0
 * Description(描述)： 静态内部类是指使用 static 修饰的内部类。
 * 静态内部类有如下特点
 * 1）在创建静态内部类的实例时，不需要创建外部类的实例。
 * 2）静态内部类中可以定义静态成员和实例成员。外部类以外的其他类需要通过完整的类名访问静态内部类中的静态成员，
 * 如果要访问静态内部类中的实例成员，则需要通过静态内部类的实例。
 * 3）静态内部类可以直接访问外部类的静态成员，如果要访问外部类的实例成员，则需要通过外部类的实例去访问。
 */

public class Outer
{
    int c = 2;
    static int d = 3;

    static class inner
    {
        int a = 0;
        static int b = 1;
        Outer o = new Outer();
        int b2 = o.c;
        int c2 = d;

        public void display()
        {
            System.out.println(b2);
            System.out.println(c2);
        }
    }
}

class test
{
    public static void main(String[] args)
    {
        Outer.inner t = new Outer.inner();
        int a2 = t.a;
        int a3 = Outer.inner.b;
        System.out.println(a2);
        System.out.println(a3);
        t.display();
    }
}
