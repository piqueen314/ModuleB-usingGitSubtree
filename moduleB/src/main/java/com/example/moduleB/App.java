package com.example.moduleB;
import com.example.moduleB.modBPackage.coolClass;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        coolClass cc = new coolClass();
        String coolermsg = cc.coolerMsg();
        System.out.println(coolermsg);

        String coolmsg = coolClass.coolMsg();
        System.out.println(coolmsg);
    }
}
