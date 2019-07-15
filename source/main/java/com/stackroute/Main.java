
package com.stackroute;

import com.stackroute.domain.Movie;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.*;
import org.springframework.beans.factory.xml.ResourceEntityResolver;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

public class Main {
    public static void main( String[] args )
    {
        ApplicationContext context = new AnnotationConfigApplicationContext("com.stackroute.domain");

        Movie movie1 = context.getBean("movieObj1",Movie.class);
        movie1.display();

        Movie movie2 = context.getBean("movieObj2",Movie.class);
        movie2.display();

        Movie movie3 = context.getBean("movieObj3",Movie.class);
        movie3.display();

        Movie movie4 = context.getBean("movieObj3",Movie.class);

        System.out.println(movie3 == movie4);

        Movie movie5 = (Movie) context.getBean("movieObject");
        movie5.display();
    }

}