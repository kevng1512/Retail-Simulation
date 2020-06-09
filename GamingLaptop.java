// The "GamingLaptop" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class GamingLaptop
{
    protected String[] inches = new String [999];
    protected String[] screenType = new String [999];
    protected String[] resolution = new String [999];
    protected String[] chip = new String [999];
    protected String[] storage = new String [999];
    protected String[] gpu1 = new String [999];
    protected String[] gpu2 = new String [999];
    protected String[] ram = new String [999];
    protected String[] battery = new String [999];
    protected String[] tech = new String [999];
    protected int size;
    protected int[] price1 = new int [999];
    protected int[] price2 = new int [999];
    protected int[] price3 = new int [999];
    protected int[] price4 = new int [999];
    protected int[] price5 = new int [999];
    protected int[] price6 = new int [999];
    protected int[] price7 = new int [999];
    protected int[] price8 = new int [999];
    protected int[] price9 = new int [999];
    protected int[] price0 = new int [999];
    GamingLaptopPrice g = new GamingLaptopPrice ();

    public void showMenu () throws IOException
    {
	g.gameIden ();
	String gameLaptop = "laptopGaming.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (gameLaptop));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.inches [i] = infile.readLine ();
	    this.screenType [i] = infile.readLine ();
	    this.resolution [i] = infile.readLine ();
	    this.chip [i] = infile.readLine ();
	    this.storage [i] = infile.readLine ();
	    this.gpu1 [i] = infile.readLine ();
	    this.gpu2 [i] = infile.readLine ();
	    this.ram [i] = infile.readLine ();
	    this.battery [i] = infile.readLine ();
	    this.tech [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public double printInches (int d)
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    this.price1 [i] = g.printInchesPrice (i);
	}
	return this.price1 [d];
    }


    public void getInches ()
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.inches [i] + ": \t\t");
	    System.out.println (g.inchesPrice [i] + " $");
	}
    }


    public double printScreenType (int d)
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    this.price2 [i] = g.printScreenTypePrice (i);
	}
	return this.price2 [d];
    }


    public void getScreenType ()
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.screenType [i] + ": \t\t");
	    System.out.println (g.screenTypePrice [i] + " $");
	}
    }


    public double printResolution (int d)
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    this.price3 [i] = g.printResolutionPrice (i);
	}
	return this.price3 [d];
    }


    public void getResolution ()
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.resolution [i] + ": \t\t");
	    System.out.println (g.resolutionPrice [i] + " $");
	}
    }


    public double printChip (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price4 [i] = g.printChipPrice (i);
	}
	return this.price4 [d];
    }


    public void getChip ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.chip [i] + ": \t\t");
	    System.out.println (g.chipPrice [i] + " $");
	}
    }


    public double printStorage (int d)
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    this.price5 [i] = g.printStoragePrice (i);
	}
	return this.price5 [d];
    }


    public void getStorage ()
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.storage [i] + ": \t\t");
	    System.out.println (g.storagePrice [i] + " $");
	}
    }


    public double printGpu1 (int d)
    {
	for (int i = 0 ; i < this.size - 4 ; i++)
	{
	    this.price6 [i] = g.printGpu1Price (i);
	}
	return this.price6 [d];
    }


    public void getGpu1 ()
    {
	for (int i = 0 ; i < this.size - 4 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.gpu1 [i] + ": \t\t");
	    System.out.println (g.gpu1Price [i] + " $");
	}
    }


    public double printGpu2 (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price7 [i] = g.printGpu2Price (i);
	}
	return this.price7 [d];
    }


    public void getGpu2 ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.gpu2 [i] + ": \t\t");
	    System.out.println (g.gpu2Price [i] + " $");
	}
    }


    public double printRam (int d)
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    this.price8 [i] = g.printRamPrice (i);
	}
	return this.price8 [d];
    }


    public void getRam ()
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.ram [i] + ": \t\t");
	    System.out.println (g.ramPrice [i] + " $");
	}
    }


    public double printBattery (int d)
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    this.price9 [i] = g.printBatteryPrice (i);
	}
	return this.price9 [d];
    }


    public void getBattery ()
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.battery [i] + ": \t\t");
	    System.out.println (g.batteryPrice [i] + " $");
	}
    }


    public double printTech (int d)
    {
	for (int i = 0 ; i < this.size - 4 ; i++)
	{
	    this.price0 [i] = g.printTechPrice (i);
	}
	return this.price0 [d];
    }


    public void getTech ()
    {
	for (int i = 0 ; i < this.size - 4 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.tech [i] + ": \t\t");
	    System.out.println (g.techPrice [i] + " $");
	}
    }
} // GamingLaptop class
