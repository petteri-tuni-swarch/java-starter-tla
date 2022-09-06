package org.hfdp.tla.javastarter;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main( String[] args )
    {
        System.out.println( "=== Welcome to the SW Architecture and Design Course ===" );
        // BasicConfigurator.configure();

        //PropertyConfigurator.configure("log4j.properties");
        logger.info("Logging ... main running");

        if (args.length > 0) {
            System.out.println("Nice argument, has " + inputHandler(args[0]) + " characters ...");
        }
    }

    private static int inputHandler (String val) {
        logger.error("Input from user: "+val);
        return val.length();
    }
}
