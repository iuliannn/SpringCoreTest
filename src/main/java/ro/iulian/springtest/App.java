package ro.iulian.springtest;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */

public class App 
{


    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(CDPlayerConfig.class);
        CDPlayer obj = (CDPlayer) context.getBean("cdPlayer");

        obj.playCD();

    }


}
