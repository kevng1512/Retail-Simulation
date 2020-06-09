// The "WorkingLaptopPrice" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class WorkingLaptopPrice
{
    protected String[] inchesPrice = new String [999];
    protected String[] screenTypePrice = new String [999];
    protected String[] resolutionPrice = new String [999];
    protected String[] chipPrice = new String [999];
    protected String[] storagePrice = new String [999];
    protected String[] gpu1Price = new String [999];
    protected String[] ramPrice = new String [999];
    protected String[] batteryPrice = new String [999];
    protected String[] techPrice = new String [999];
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

    public void workIden () throws IOException
    {
	String workPriceFile = "laptopWorkingPrice.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (workPriceFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.inchesPrice [i] = infile.readLine ();
	    this.screenTypePrice [i] = infile.readLine ();
	    this.resolutionPrice [i] = infile.readLine ();
	    this.chipPrice [i] = infile.readLine ();
	    this.storagePrice [i] = infile.readLine ();
	    this.gpu1Price [i] = infile.readLine ();
	    this.ramPrice [i] = infile.readLine ();
	    this.batteryPrice [i] = infile.readLine ();
	    this.techPrice [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public int printInchesPrice (int i)
    {

	this.price1 [i] = Integer.parseInt (this.inchesPrice [i]);
	return this.price1 [i];
    }


    public int printScreenTypePrice (int i)
    {

	this.price2 [i] = Integer.parseInt (this.screenTypePrice [i]);
	return this.price2 [i];
    }


    public int printResolutionPrice (int i)
    {

	this.price3 [i] = Integer.parseInt (this.resolutionPrice [i]);
	return this.price3 [i];
    }


    public int printChipPrice (int i)
    {

	this.price4 [i] = Integer.parseInt (this.chipPrice [i]);
	return this.price4 [i];
    }


    public int printStoragePrice (int i)
    {

	this.price5 [i] = Integer.parseInt (this.storagePrice [i]);
	return this.price5 [i];
    }


    public int printGpu1Price (int i)
    {

	this.price6 [i] = Integer.parseInt (this.gpu1Price [i]);
	return this.price6 [i];
    }




    public int printRamPrice (int i)
    {

	this.price7 [i] = Integer.parseInt (this.ramPrice [i]);
	return this.price7 [i];
    }


    public int printBatteryPrice (int i)
    {

	this.price8 [i] = Integer.parseInt (this.batteryPrice [i]);
	return this.price8 [i];
    }


    public int printTechPrice (int i)
    {

	this.price9 [i] = Integer.parseInt (this.techPrice [i]);
	return this.price9 [i];
    }
} // WorkingLaptopPrice class
