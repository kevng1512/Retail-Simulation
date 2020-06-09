// The "PhoneChipPrice" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class PhoneChipPrice
{
    protected String[] applePrice = new String [999];
    protected String[] samsungPrice = new String [999];
    protected String[] huaweiPrice = new String [999];
    protected int[] price1 = new int [999];
    protected int[] price2 = new int [999];
    protected int[] price3 = new int [999];
    protected int size;
    protected int[] value;

    public void chipIden () throws IOException
    {
	String chipFile = "processorPrice.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (chipFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.applePrice [i] = infile.readLine ();
	    this.samsungPrice [i] = infile.readLine ();
	    this.huaweiPrice [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public int printApplePrice (int i)
    {

	this.price1 [i] = Integer.parseInt (this.applePrice [i]);
	return this.price1 [i];
    }


    public int printSamsungPrice (int i)
    {
	this.price2 [i] = Integer.parseInt (this.samsungPrice [i]);
	return this.price2 [i];
    }


    public int printHuaweiPrice (int i)
    {
	this.price3 [i] = Integer.parseInt (this.huaweiPrice [i]);
	return this.price3 [i];
    }
} // PhoneChipPrice class
