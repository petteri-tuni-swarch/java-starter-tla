package org.hfdp.tla.javastarter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "=== Welcome to the SW Architecture and Design Course ===" );

        DryClass dry = new DryClass();
        dry.RegisterUser("Antti Arkkitehti", 35);
        System.out.println(dry.toString());
    }
}
