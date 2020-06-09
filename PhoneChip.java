// The "PhoneChip" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class PhoneChip
{
    protected String[] appleChip = new String [999];
    protected String[] samsungChip = new String [999];
    protected String[] huaweiChip = new String [999];
    protected int size;
    protected double[] price1 = new double [999];
    protected double[] price2 = new double [999];
    protected double[] price3 = new double [999];
    PhoneChipPrice price = new PhoneChipPrice ();

    public void chipIden () throws IOException
    {
	price.chipIden ();
	String chipFile = "processor.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (chipFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.appleChip [i] = infile.readLine ();
	    this.samsungChip [i] = infile.readLine ();
	    this.huaweiChip [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public double printAppleChip (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price1 [i] = price.printApplePrice (i);
	}
	return this.price1 [d];
    }


    public void getAppleChip ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.appleChip [i] + ": \t\t");
	    System.out.println (price.applePrice [i] + " $");
	}
    }


    public double printSamsungChip (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price2 [i] = price.printSamsungPrice (i);
	}
	return this.price2 [d];
    }


    public void getSamsungChip ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.samsungChip [i] + ": \t\t");
	    System.out.println (price.samsungPrice [i] + " $");
	}
    }


    public double printHuaweiChip (int d)
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    this.price3 [i] = price.printHuaweiPrice (i);
	}
	return this.price3 [d];
    }


    public void getHuaweiChip ()
    {
	for (int i = 0 ; i < this.size - 2 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.huaweiChip [i] + ": \t\t");
	    System.out.println (price.huaweiPrice [i] + " $");
	}
    }
} // PhoneChip class
