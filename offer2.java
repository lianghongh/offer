/**
*实现singleton模式
*/


//饿汉的单例模式，线程安全
public class Singleton
{
    private static Singleton o=new Singleton();
    private Singleton(){}

    public static Singleton getInstance()
    {
        return o;
    }
}

//lazy-init，线程不安全

public class Singleton
{
    private static Singleton o;
    private Singleton(){

    }

    public static Singleton getInstance()
    {
        if(o==null)
            o=new Singleton();
        return o;
    }
}


//使用同步的方式，线程安全但效率不高
public class Singleton
{
    private static Singleton o;
    private Singleton(){

    }

    public static Singleton getInstance()
    {
        synchronized(Singleton.class){
            if(o==null)
                o=new Singleton();
            return o;
        }
    }
}

//双重校验的方式，效率可以，线程安全

public class Singleton
{
    private static Singleton o;
    private Singleton()
    {

    }

    public static Singleton getInstance()
    {
        if(o==null)
        {
            syncronized(Singleton.class){
                if(o==null)
                    o=new Singleton();
            }
        }
        return o;
    }
}