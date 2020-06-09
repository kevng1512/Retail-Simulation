// The "Marketing" class.import java.io.*;
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class Marketing
{
    protected int size;
    protected String[] price = new String [999];
    protected double[] Price = new double [999];

    public void markIden () throws IOException
    {
	double ans;
	String markFile = "marketing.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (markFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price [i] = infile.readLine ();
	    this.Price [i] = Integer.parseInt (this.price [i]);
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public void printMarketing (int i)
    {
	System.out.print (this.price [i] + " $");
	System.out.println ();
    }
} // Marketing class
