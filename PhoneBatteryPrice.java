// The "PhoneBatteryPrice" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class PhoneBatteryPrice
{
    protected int[] price1 = new int [999];
    protected int[] price2 = new int [999];
    protected int[] price3 = new int [999];
    protected int[] price4 = new int [999];
    protected int[] price5 = new int [999];
    protected int size;
    protected String[] batteryPrice = new String [999];
    protected String[] ramPrice = new String [999];
    protected String[] romPrice = new String [999];
    protected String[] storagePrice = new String [999];
    protected String[] techPrice = new String [999];

    public void showMenu () throws IOException
    {
	String batteryPriceFile = "batteryPrice.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (batteryPriceFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.batteryPrice [i] = infile.readLine ();
	    this.ramPrice [i] = infile.readLine ();
	    this.romPrice [i] = infile.readLine ();
	    this.storagePrice [i] = infile.readLine ();
	    this.techPrice [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public int printBatteryPrice (int i)
    {

	this.price1 [i] = Integer.parseInt (this.batteryPrice [i]);
	return this.price1 [i];
    }


    public int printRamPrice (int i)
    {

	this.price2 [i] = Integer.parseInt (this.ramPrice [i]);
	return this.price2 [i];
    }


    public int printRomPrice (int i)
    {

	this.price3 [i] = Integer.parseInt (this.romPrice [i]);
	return this.price3 [i];
    }


    public int printStoragePrice (int i)
    {

	this.price4 [i] = Integer.parseInt (this.storagePrice [i]);
	return this.price4 [i];
    }


    public int printTechPrice (int i)
    {

	this.price5 [i] = Integer.parseInt (this.techPrice [i]);
	return this.price5 [i];
    }
} // PhoneBatteryPrice class
