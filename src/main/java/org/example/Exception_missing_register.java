package org.example;

public class Exception_missing_register extends Exception
{
    String registr;
    Exception_missing_register(String registr_)
    {
        super("Eror: missing register: ");
        registr = registr_;
    }
    @Override
    public String getMessage()
    {
        return super.getMessage() + registr + ".";
    }
}
