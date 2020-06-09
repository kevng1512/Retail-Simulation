// The "PhoneBattery" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class PhoneBattery
{
    protected String[] battery = new String [999];
    protected String[] ram = new String [999];
    protected String[] rom = new String [999];
    protected String[] storage = new String [999];
    protected String[] tech = new String [999];
    protected int size;
    protected int[] price1 = new int [999];
    protected int[] price2 = new int [999];
    protected int[] price3 = new int [999];
    protected int[] price4 = new int [999];
    protected int[] price5 = new int [999];
    PhoneBatteryPrice b = new PhoneBatteryPrice ();

    public void showMenu () throws IOException
    {
	b.showMenu ();
	String batteryFile = "battery.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (batteryFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.battery [i] = infile.readLine ();
	    this.ram [i] = infile.readLine ();
	    this.rom [i] = infile.readLine ();
	    this.storage [i] = infile.readLine ();
	    this.tech [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public double printBatteryType (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price1 [i] = b.printBatteryPrice (i);
	}
	return this.price1 [d];
    }


    public void getBattery ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.battery [i] + ": \t\t");
	    System.out.println (b.batteryPrice [i] + " $");
	}
    }


    public double printRamType (int d)
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    this.price2 [i] = b.printRamPrice (i);
	}
	return this.price2 [d];
    }


    public void getRam ()
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.ram [i] + ": \t\t");
	    System.out.println (b.ramPrice [i] + " $");
	}
    }


    public double printRomType (int d)
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    this.price3 [i] = b.printRomPrice (i);
	}
	return this.price3 [d];
    }


    public void getRom ()
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.rom [i] + ": \t\t");
	    System.out.println (b.romPrice [i] + " $");
	}
    }


    public double printStorageType (int d)
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    this.price4 [i] = b.printStoragePrice (i);
	}
	return this.price4 [d];
    }


    public void getStorage ()
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.storage [i] + ": \t\t");
	    System.out.println (b.storagePrice [i] + " $");
	}
    }


    public double printTechType (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price5 [i] = b.printTechPrice (i);
	}
	return this.price5 [d];
    }


    public void getTech ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.tech [i] + ": \t\t");
	    System.out.println (b.techPrice [i] + " $");
	}
    }
} // PhoneBattery class
