package com.te.java.collection.logger;

import java.io.Console;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
import java.util.logging.XMLFormatter;

public class Demologger {
 private static final Logger LOGGER=Logger.getLogger(Demologger.class.getClass());
 
 public static void main(String[] args) {
	FileHandler fileHandler=new FileHandler("[file path]");
	fileHandler.setLevel(Level.ALL);
	
	ConsoleHandler consoleHandler=new ConsoleHandler();
	consoleHandler.setLevel(Level.ALL);
	
//	SimpleFormatter formatter=new SimpleFormatter();
//	consoleHandler.setLevel(Level.ALL);
	
	XMLFormatter xmlFormatter= new XMLFormatter();
	consoleHandler.setFormatter(xmlFormatter);
	
	LOGGER.addHandler(fileHandler);
	
	LOGGER.setLevel(Level.ALL);
	LOGGER.severe("serve msg");
	LOGGER.warning("warining msg ");
}
}
