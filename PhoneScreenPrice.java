// The "PhoneScreenPrice" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class PhoneScreenPrice
{
    protected String[] screenPrice = new String [999];
    protected String[] resPrice = new String [999];
    protected String[] backPrice = new String [999];
    protected String[] frontPrice = new String [999];
    protected int[] price1 = new int [999];
    protected int[] price2 = new int [999];
    protected int[] price3 = new int [999];
    protected int[] price4 = new int [999];
    protected int size;
    //protected int[] value;

    public void typeIden () throws IOException
    {
	String phoneFile = "phoneScreenPrice.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (phoneFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.screenPrice [i] = infile.readLine ();
	    this.resPrice [i] = infile.readLine ();
	    this.backPrice [i] = infile.readLine ();
	    this.frontPrice [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public int printScreenPrice (int i)
    {

	this.price1 [i] = Integer.parseInt (this.screenPrice [i]);
	return this.price1 [i];
    }


    public int printResPrice (int i)
    {
	this.price2 [i] = Integer.parseInt (this.resPrice [i]);
	return this.price2 [i];
    }


    public int printBackPrice (int i)
    {
	this.price3 [i] = Integer.parseInt (this.backPrice [i]);
	return this.price3 [i];
    }


    public int printFrontPrice (int i)
    {
	this.price4 [i] = Integer.parseInt (this.frontPrice [i]);
	return this.price4 [i];
    }
} // PhoneScreenPrice class
