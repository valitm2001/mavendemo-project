package com.leanmaven.mavendemo;

import org.apache.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    final static Logger logger=Logger.getLogger(App.class);
	public static void main( String[] args )
    {
       logger.debug(new Calculator().add(1, 2));
    }
}
