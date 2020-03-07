package com.epam.collections2;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class App 
{
	private static final Logger LOGGER=LogManager.getLogger(App.class);
    public static void main( String[] args )
    {
        CustomList<Integer> list = new CustomList<>();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(7);
        LOGGER.debug(list);
        list.remove(3);
        LOGGER.debug(list);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list.get(1));
        LOGGER.debug(list.size());
        CustomList<String> list2=new CustomList<>();
        list2.add("doctor");
        list2.add("teacher");
        list2.add("actor");
        list2.add("choreographer");
        LOGGER.debug(list2);
        LOGGER.debug(list.get(0));
        LOGGER.debug(list2.size());
        list2.remove(2);
        LOGGER.debug(list2);
    }
}