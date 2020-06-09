// The "Phone" class.
import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

public class Phone
{
    protected String[] screenType = new String [999];
    protected String[] screenRes = new String [999];
    protected String[] backCam = new String [999];
    protected String[] frontCam = new String [999];
    protected int size;
    protected double[] price1 = new double [999];
    protected double[] price2 = new double [999];
    protected double[] price3 = new double [999];
    protected double[] price4 = new double [999];
    PhoneScreenPrice s = new PhoneScreenPrice ();

    public void showMenu () throws IOException
    {
	s.typeIden ();
	String phoneFile = "phoneScreen.txt";
	String str;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (phoneFile));

	str = infile.readLine ();
	this.size = Integer.parseInt (str);

	for (int i = 0 ; i < this.size ; i++)
	{
	    this.screenType [i] = infile.readLine ();
	    this.screenRes [i] = infile.readLine ();
	    this.backCam [i] = infile.readLine ();
	    this.frontCam [i] = infile.readLine ();
	    str = infile.readLine ();
	}
	infile.close ();
    }


    public double printScreenType (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price1 [i] = s.printScreenPrice (i);
	}
	return this.price1 [d];
    }


    public void getScreenType ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.screenType [i] + ": \t\t");
	    System.out.println (s.screenPrice [i] + " $");
	}
    }


    public double printScreenRes (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price2 [i] = s.printResPrice (i);
	}
	return this.price2 [d];
    }


    public void getScreenRes ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.screenRes [i] + ": \t\t");
	    System.out.println (s.resPrice [i] + " $");
	}
    }


    public double printBackCam (int d)
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    this.price3 [i] = s.printBackPrice (i);
	}
	return this.price3 [d];
    }


    public void getBackCam ()
    {
	for (int i = 0 ; i < this.size ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.backCam [i] + ": \t\t");
	    System.out.println (s.backPrice [i] + " $");
	}
    }


    public double printFrontCam (int d)
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    this.price4 [i] = s.printFrontPrice (i);
	}
	return this.price4 [d];
    }


    public void getFrontCam ()
    {
	for (int i = 0 ; i < this.size - 1 ; i++)
	{
	    int a = i + 1;
	    System.out.print (a);
	    System.out.print (". " + this.frontCam [i] + ": \t\t");
	    System.out.println (s.frontPrice [i] + " $");
	}
    }
} // Phone class
