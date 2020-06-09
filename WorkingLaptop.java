// The "WorkingLaptop" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class WorkingLaptop
{
    protected String[] inches = new String [999];
    protected String[] screenType = new String [999];
    protected String[] resolution = new String [999];
    protected String[] chip = new String [999];
    protected String[] storage = new String [999];
    protected String[] gpu1 = new String [999];
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
    WorkingLaptopPrice w = new WorkingLaptopPrice ();

    public void showMenu () throws IOException
    {
	w.workIden ();
	String workLaptop = "laptopWorking.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (workLaptop));

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
	    this.ram [i] = infile.readLine ();
	    this.battery [i] = infile.readLine ();
	    this.tech [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public double printInches (int d)
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    this.price1 [i] = w.printInchesPrice (i);
	}
	return this.price1 [d];
    }


    public void getInches ()
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.inches [i] + ": \t\t");
	    System.out.println (w.inchesPrice [i] + " $");
	}
    }


    public double printScreenType (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price2 [i] = w.printScreenTypePrice (i);
	}
	return this.price2 [d];
    }


    public void getScreenType ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.screenType [i] + ": \t\t");
	    System.out.println (w.screenTypePrice [i] + " $");
	}
    }


    public double printResolution (int d)
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    this.price3 [i] = w.printResolutionPrice (i);
	}
	return this.price3 [d];
    }


    public void getResolution ()
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.resolution [i] + ": \t\t");
	    System.out.println (w.resolutionPrice [i] + " $");
	}
    }


    public double printChip (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price4 [i] = w.printChipPrice (i);
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
	    System.out.println (w.chipPrice [i] + " $");
	}
    }


    public double printStorage (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price5 [i] = w.printStoragePrice (i);
	}
	return this.price5 [d];
    }


    public void getStorage ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.storage [i] + ": \t\t");
	    System.out.println (w.storagePrice [i] + " $");
	}
    }


    public double printGpu1 (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price6 [i] = w.printGpu1Price (i);
	}
	return this.price6 [d];
    }


    public void getGpu1 ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.gpu1 [i] + ": \t\t");
	    System.out.println (w.gpu1Price [i] + " $");
	}
    }


    public double printRam (int d)
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    this.price7 [i] = w.printRamPrice (i);
	}
	return this.price7 [d];
    }


    public void getRam ()
    {
	for (int i = 0 ; i < this.size - 3 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.ram [i] + ": \t\t");
	    System.out.println (w.ramPrice [i] + " $");
	}
    }


    public double printBattery (int d)
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    this.price8 [i] = w.printBatteryPrice (i);
	}
	return this.price8 [d];
    }


    public void getBattery ()
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.battery [i] + ": \t\t");
	    System.out.println (w.batteryPrice [i] + " $");
	}
    }


    public double printTech (int d)
    {
	for (int i = 0 ; i < this.size - 4 ; i++)
	{
	    this.price9 [i] = w.printTechPrice (i);
	}
	return this.price9 [d];
    }


    public void getTech ()
    {
	for (int i = 0 ; i < this.size - 4 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.tech [i] + ": \t\t");
	    System.out.println (w.techPrice [i] + " $");
	}
    }
} // WorkingLaptop class
