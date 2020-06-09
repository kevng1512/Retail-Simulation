// Nguyen Vu Kha        2017-10-0181
// Period 1
// FINAL PROJECT

import java.io.*;
import java.util.*;
import java.awt.*;
import hsa.*;

// The "KevinsFinalProgram" class.
public class KevinsFinalProgram
{
    static double money;
    static double budget;
    static double price, price1, price2, price3, price4, price5, price6, price7, price8, price9;
    static double w1, w2, w3, w4, w5, w6, w7, w8, w9, m1 = 0;
    static double g1, g2, g3, g4, g5, g6, g7, g8, g9, g0;
    static String[] name = new String [999];
    static String[] historyPhone = new String [999];
    static String[] historyWorking = new String [999];
    static String[] historyGaming = new String [999];
    static double[] historyPhonePrice = new double [999];
    static double[] historyWorkingPrice = new double [999];
    static double[] historyGamingPrice = new double [999];
    static String[] id = new String [999];
    static int empSize = 0, more, markChoice;
    static double officeSpace;
    static double land, landPrice;
    static double workingPrice, gamingPrice, phonePrice, markPrice;
    static int ans, ans1, ans2;
    static int countP = 0, countG = 0, countW = 0;
    static int count = 0;
    static double ans3 = 0, ans4, total;
    static String temp;


    public static void main (String[] args) throws IOException
    {
	readEmp ();
	readOffice ();
	budget = currentStatus ();

	while (true)
	{
	    int choice;
	    System.out.println ("=============================================");
	    System.out.println ("\t\t  BUSINESS GAME");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println ("======   1. Start your business        ======");
	    System.out.println ("======   2. Marketing                  ======");
	    System.out.println ("======   3. Employee Management        ======");
	    System.out.println ("======   4. Office Upgrade             ======");
	    System.out.println ("======   5. Check your current status  ======");
	    System.out.println ("======   6. Exit                       ======");
	    System.out.println ();
	    System.out.println ("=============================================");
	    System.out.println ();
	    System.out.println ();
	    System.out.print ("Please choose a number to start this game: ");
	    int num = Stdin.readInt ();
	    System.out.println ();
	    System.out.println ();

	    if (num == 1)
	    {
		choice = showMenu (num);
		if (choice == 1)
		{
		    phoneType ();
		    System.out.println ("It cost: " + total (choice) + " to produce 1 device");
		    phonePrice = total (choice);
		    historyPhone [countP] = "Phone";
		    System.out.println ();
		    budget = setAmount (phonePrice);
		    System.out.println ();
		    question ();
		    total = setMoney (phonePrice);
		    historyPhonePrice [countP] = total;
		    budget = budget - m1;
		    budget = budget + total;
		    countP++;
		}

		if (choice == 2)
		{
		    System.out.println ();
		    System.out.println ("What type of laptop you want to make?");
		    System.out.println ();
		    System.out.println ("1.  Gaming Laptop");
		    System.out.println ("2.  Working Laptop");
		    System.out.println ();
		    System.out.print ("Please choose an option above: ");
		    int type = Stdin.readInt ();

		    if (type == 1)
		    {
			gamingLaptopType ();
			System.out.println ("It cost: " + total (type + 1) + " to produce 1 device");
			gamingPrice = total (type + 1);
			historyGaming [countG] = "Gaming laptop";
			System.out.println ();
			budget = setAmount (gamingPrice);
			System.out.println ();
			question ();
			total = setMoney (gamingPrice);
			historyGamingPrice [countG] = total;
			budget = budget - m1;
			budget = budget + total;
			countG++;
		    }
		    else if (type == 2)
		    {
			workingLaptopType ();
			System.out.println ("It cost: " + total (type + 1) + " to produce 1 device");
			workingPrice = total (type + 1);
			historyWorking [countW] = "Working laptop";
			System.out.println ();
			budget = setAmount (workingPrice);
			System.out.println ();
			question ();
			total = setMoney (workingPrice);
			historyWorkingPrice [countW] = total;
			budget = budget - m1;
			budget = budget + total;
			countW++;
		    }
		}
	    }
	    else
	    {
		if (num == 2)
		{
		    choice = showMenu (num);
		    marketing (choice - 1);
		    markChoice = choice - 1;
		    int temp = choice - 1;
		    System.out.println ();
		    if (temp != 7)
		    {
			System.out.println ("Your marketing service cost: " + total (num + 2));
			System.out.println ();
		    }
		}
		else
		{
		    if (num == 3)
		    {
			choice = showMenu (num);
			if (choice == 1)
			{
			    System.out.println ();
			    showEmp ();
			}

			if (choice == 2)
			{
			    addEmp ();
			    System.out.println ();
			}

			if (choice == 3)
			{
			    deleteEmp ();
			    System.out.println ();
			}

			if (choice == 4)
			{
			    sorting ();
			    System.out.println ();
			    System.out.println ("Done!");
			    System.out.println ();
			}
		    }
		    else
		    {
			if (num == 4)
			{
			    choice = showMenu (num);

			    if (choice == 1)
			    {
				officeUpgrade ();
			    }

			    else if (choice == 2)
			    {
				officeSummary ();
			    }
			}
			else
			{
			    if (num == 5)
			    {
				choice = showMenu (num);
				if (choice == 1)
				{
				    System.out.println ("Your current budget is " + budget);
				    System.out.println ();
				}
				if (choice == 2)
				{
				    showHistory ();
				}
			    }
			    else
			    {
				if (num == 6)
				{
				    choice = showMenu (num);
				    if (choice == 1)
				    {
					writeEmp ();
					writeOffice ();
					writeBudget ();
					writeHistory ();
					System.out.println ();
					System.out.println ("Your data has been saved.");
					System.out.println ();
					System.out.println ("Goodbye!");
				    }

				    if (choice == 2)
				    {
					System.out.println ();
					System.out.println ("Your data has not been saved.");
					System.out.println ();
					System.out.println ("Goodbye!");
					break;
				    }
				    break;
				}
				else
				{
				    System.out.println ("Please check your input number again.");
				}
			    }
			}
		    }
		}
	    }
	}
    } // main method


    private static double currentStatus () throws IOException
    {
	double money = 0;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader ("currentMoney.txt"));
	String Money = infile.readLine ();
	money = Double.parseDouble (Money);
	System.out.println ();
	System.out.println ();

	return money;
    }


    private static double setAmount (double amount)
    {
	System.out.println ("How many percent of your budget would you use for production? ");
	System.out.println ();
	System.out.print ("1. 25% of budget for ");
	double ansT = Math.floor ((25 * budget / 100) / amount);
	ans = (int) (ansT);
	System.out.println (ans + " devices.");

	System.out.print ("2. 50% of budget for ");
	double ans1T = Math.floor ((50 * budget / 100) / amount);
	ans1 = (int) (ans1T);
	System.out.println (ans1 + " devices.");

	System.out.print ("3. 75% of budget for ");
	double ans2T = Math.floor ((75 * budget / 100) / amount);
	ans2 = (int) (ans2T);
	System.out.println (ans2 + " devices.");

	System.out.println ();
	System.out.println ("Choose wisely to avoid bankrupt.");
	System.out.print ("Choose one of the option above: ");
	int choice = Stdin.readInt ();

	if (choice == 1)
	{
	    ans3 = budget - (25 * budget / 100);
	    ans4 = ans;
	}

	if (choice == 2)
	{
	    ans3 = budget - (50 * budget / 100);
	    ans4 = ans1;
	}

	if (choice == 3)
	{
	    ans3 = budget - (75 * budget / 100);
	    ans4 = ans2;
	}
	return ans3;
    }


    private static double setMoney (double amount)
    {
	int buyer = 0;
	double total = 0;
	System.out.println ("The original price is " + amount + " $.");
	System.out.println ("Make your choice wisely.");
	System.out.print ("Choose a retail price between ");
	System.out.print (amount + 1);
	System.out.print ("$ and ");
	System.out.print (amount + 1000);
	System.out.print ("$ :  $");
	double newMoney = Stdin.readDouble ();

	if (newMoney <= (amount + 250))
	{
	    buyer = (int) (Math.random () * 1501 + 3500);
	    //3500 to 5000
	}
	else
	{
	    if (newMoney > (amount + 250) && newMoney <= (amount + 500))
	    {
		buyer = (int) (Math.random () * 1401 + 2900);
		//2900 to 4300
	    }
	    else
	    {
		if (newMoney > (amount + 500) && newMoney <= (amount + 750))
		{
		    buyer = (int) (Math.random () * 901 + 1500);
		    //1500 to 2400
		}
		else
		    if (newMoney > (amount + 750) && newMoney <= (amount + 1000))
		    {
			buyer = (int) (Math.random () * 1001 + 900);
			//900 to 1900
		    }
	    }
	}

	switch (markChoice)
	{
	    case 1:
		buyer = buyer + 500;
		break;
	    case 2:
		buyer = buyer + 1000;
		break;
	    case 3:
		buyer = buyer + 350;
		break;
	    case 4:
		buyer = buyer + 700;
		break;
	    case 5:
		buyer = buyer + 200;
		break;
	    case 6:
		buyer = buyer + 550;
		break;
	    case 7:
		buyer = buyer + 650;
		break;
	}
	System.out.println ();
	System.out.println ("You have produced " + ans4 + " devices.");

	if (buyer > ans4)
	{
	    buyer = (int) (ans4);
	    total = newMoney * (ans4 - buyer);
	    System.out.println ("All the devices had been sold.");
	    System.out.println ("Congratulations!");
	}
	else
	{
	    if (buyer <= ans4)
	    {
		total = newMoney * (ans4 - buyer);
		System.out.print (ans4 - buyer);
		System.out.println (" copies had been sold.");
	    }
	}

	System.out.print ("Your profit for this sales is: ");
	System.out.print (total, 0, 2);
	System.out.println ("$");
	System.out.println ();

	return total;
    }


    private static void showHistory ()
    {
	if (countP > 0)
	{
	    for (int i = 0 ; i < countP ; i++)
	    {
		count++;
		System.out.print (count + ". Device type: ");
		System.out.println (historyPhone [i]);
		System.out.print ("   Profits earned: ");
		System.out.println (historyPhonePrice [i], 0, 2);
	    }
	}

	if (countG > 0)
	{
	    for (int i = 0 ; i < countG ; i++)
	    {
		count++;
		System.out.print (count + ". Device type: ");
		System.out.println (historyGaming [i]);
		System.out.print ("   Profits earned: ");
		System.out.println (historyGamingPrice [i], 0, 2);
	    }
	}

	if (countW > 0)
	{
	    for (int i = 0 ; i < countW ; i++)
	    {
		count++;
		System.out.print (count + ". Device type: ");
		System.out.println (historyWorking [i]);
		System.out.print ("   Profits earned: ");
		System.out.println (historyWorkingPrice [i], 0, 2);
	    }
	}
	System.out.println ();
    }


    private static void writeHistory () throws IOException
    {
	String outputFileLoc = "history.txt";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));

	output.println (count);

	if (countP > 0)
	{
	    for (int a = 0 ; a < countP ; a++)
	    {
		output.println (historyPhone [a]);
		output.println (historyPhonePrice [a]);
		output.println ();
	    }
	}

	if (countG > 0)
	{
	    for (int b = 0 ; b < countG ; b++)
	    {
		output.println (historyGaming [b]);
		output.println (historyGamingPrice [b]);
		output.println ();
	    }
	}

	if (countW > 0)
	{
	    for (int c = 0 ; c < countW ; c++)
	    {
		output.println (historyWorking [c]);
		output.println (historyWorkingPrice [c]);
		output.println ();
	    }
	}
	output.close ();
    }


    private static void phoneType () throws IOException
    {
	PhoneChip chip;
	chip = new PhoneChip ();
	Phone phone;
	phone = new Phone ();
	PhoneBattery battery;
	battery = new PhoneBattery ();

	System.out.println ("1. Apple");
	System.out.println ("2. Samsung");
	System.out.println ("3. Huawei");
	System.out.println ();
	System.out.print ("Which phone would you like to do? ");
	int choice = Stdin.readInt ();
	System.out.println ();
	chip.chipIden ();

	switch (choice)
	{
	    case 1:
		chip.getAppleChip ();
		System.out.println ();
		System.out.print ("Please choose a processor: ");
		int opt = Stdin.readInt ();
		price = chip.printAppleChip (opt - 1);
		System.out.println ();
		//System.out.println (" test main " + price);
		//System.out.println ("method " + total (opt));
		break;
	    case 2:
		chip.getSamsungChip ();
		System.out.println ();
		System.out.print ("Please choose a processor: ");
		opt = Stdin.readInt ();
		price = chip.printSamsungChip (opt - 1);
		System.out.println ();
		//System.out.println ("test main " + price);
		break;
	    case 3:
		chip.getHuaweiChip ();
		System.out.println ();
		System.out.print ("Please choose a processor: ");
		opt = Stdin.readInt ();
		price = chip.printHuaweiChip (opt - 1);
		System.out.println ();
		//System.out.println ("test main " + price);
		break;
	}


	phone.showMenu ();
	phone.getScreenType ();
	System.out.println ();
	System.out.print ("Please choose screen type: ");
	int choiceScreen = Stdin.readInt ();
	price1 = phone.printScreenType (choiceScreen - 1);
	System.out.println ();
	//System.out.println ("test main " + price1);

	phone.getScreenRes ();
	System.out.println ();
	System.out.print ("Please choose screen resolution: ");
	int choiceRes = Stdin.readInt ();
	price2 = phone.printScreenRes (choiceRes - 1);
	System.out.println ();
	//System.out.println ("test main " + price2);

	phone.getBackCam ();
	System.out.println ();
	System.out.print ("Please choose the camera: ");
	int choiceBcam = Stdin.readInt ();
	price3 = phone.printBackCam (choiceBcam - 1);
	System.out.println ();
	//System.out.println ("test main " + price3);

	phone.getFrontCam ();
	System.out.println ();
	System.out.print ("Please choose the frontal camera: ");
	int choiceFcam = Stdin.readInt ();
	price4 = phone.printFrontCam (choiceFcam - 1);
	System.out.println ();
	//System.out.println ("test main " + price4);

	battery.showMenu ();
	battery.getBattery ();
	System.out.println ();
	System.out.print ("Please choose battery type: ");
	int choiceBattery = Stdin.readInt ();
	price5 = battery.printBatteryType (choiceBattery - 1);
	System.out.println ();
	//System.out.println ("test main " + price5);

	battery.getRam ();
	System.out.println ();
	System.out.print ("Please choose ram amount: ");
	int choiceRam = Stdin.readInt ();
	price6 = battery.printRamType (choiceRam - 1);
	System.out.println ();
	//System.out.println ("test main " + price6);

	battery.getRom ();
	System.out.println ();
	System.out.print ("Please choose rom amount: ");
	int choiceRom = Stdin.readInt ();
	price7 = battery.printRomType (choiceRom - 1);
	System.out.println ();
	//System.out.println ("test main " + price7);

	battery.getStorage ();
	System.out.println ();
	System.out.print ("Please choose storage amount: ");
	int choiceStorage = Stdin.readInt ();
	price8 = battery.printStorageType (choiceStorage - 1);
	System.out.println ();
	//System.out.println ("test main " + price8);

	battery.getTech ();
	System.out.println ();
	System.out.print ("Please choose phone's technology: ");
	int choiceTech = Stdin.readInt ();
	price9 = battery.printTechType (choiceTech - 1);
	System.out.println ();
	//System.out.println ("test main " + price9);
    }


    private static void gamingLaptopType () throws IOException
    {
	GamingLaptop g = new GamingLaptop ();

	g.showMenu ();
	g.getInches ();
	System.out.println ();
	System.out.print ("Please choose screen width: ");
	int choiceScreen = Stdin.readInt ();
	g1 = g.printInches (choiceScreen - 1);
	System.out.println ();
	//System.out.println ("test main " + g1);

	g.getScreenType ();
	System.out.println ();
	System.out.print ("Please choose screen type: ");
	int choiceScreenType = Stdin.readInt ();
	g2 = g.printScreenType (choiceScreenType - 1);
	System.out.println ();
	//System.out.println ("test main " + g2);

	g.getResolution ();
	System.out.println ();
	System.out.print ("Please choose screen resolution: ");
	int choiceScreenRes = Stdin.readInt ();
	g3 = g.printResolution (choiceScreenRes - 1);
	System.out.println ();
	//System.out.println ("test main " + g3);

	g.getChip ();
	System.out.println ();
	System.out.print ("Please choose the processor: ");
	int choiceChip = Stdin.readInt ();
	g4 = g.printChip (choiceChip - 1);
	System.out.println ();
	//System.out.println ("test main " + g4);

	g.getStorage ();
	System.out.println ();
	System.out.print ("Please choose the amount of storage: ");
	int choiceStorage = Stdin.readInt ();
	g5 = g.printStorage (choiceStorage - 1);
	System.out.println ();
	//System.out.println ("test main " + g5);

	g.getGpu1 ();
	System.out.println ();
	System.out.print ("Please choose the 1st graphic card: ");
	int choiceGpu1 = Stdin.readInt ();
	g6 = g.printGpu1 (choiceGpu1 - 1);
	System.out.println ();
	//System.out.println ("test main " + g6);

	g.getGpu2 ();
	System.out.println ();
	System.out.print ("Please choose the 2nd graphic card: ");
	int choiceGpu2 = Stdin.readInt ();
	g7 = g.printGpu2 (choiceGpu2 - 1);
	System.out.println ();
	//System.out.println ("test main " + g7);

	g.getRam ();
	System.out.println ();
	System.out.print ("Please choose the ram amount: ");
	int choiceRam = Stdin.readInt ();
	g8 = g.printRam (choiceRam - 1);
	System.out.println ();
	//System.out.println ("test main " + g8);

	g.getBattery ();
	System.out.println ();
	System.out.print ("Please choose the battery capacity: ");
	int choiceBattery = Stdin.readInt ();
	g9 = g.printBattery (choiceBattery - 1);
	System.out.println ();
	//System.out.println ("test main " + g9);

	g.getTech ();
	System.out.println ();
	System.out.print ("Please choose the technology: ");
	int choiceTech = Stdin.readInt ();
	g0 = g.printTech (choiceTech - 1);
	System.out.println ();
	//System.out.println ("test main " + g0);
    }


    private static void workingLaptopType () throws IOException
    {
	WorkingLaptop w = new WorkingLaptop ();

	w.showMenu ();
	w.getInches ();
	System.out.println ();
	System.out.print ("Please choose screen width: ");
	int choiceScreen = Stdin.readInt ();
	w1 = w.printInches (choiceScreen - 1);
	System.out.println ();
	//System.out.println ("test main " + w1);

	w.getScreenType ();
	System.out.println ();
	System.out.print ("Please choose screen type: ");
	int choiceScreenType = Stdin.readInt ();
	w2 = w.printScreenType (choiceScreenType - 1);
	System.out.println ();
	//System.out.println ("test main " + w2);

	w.getResolution ();
	System.out.println ();
	System.out.print ("Please choose screen resolution: ");
	int choiceScreenRes = Stdin.readInt ();
	w3 = w.printResolution (choiceScreenRes - 1);
	System.out.println ();
	//System.out.println ("test main " + w3);

	w.getChip ();
	System.out.println ();
	System.out.print ("Please choose the processor: ");
	int choiceChip = Stdin.readInt ();
	w4 = w.printChip (choiceChip - 1);
	System.out.println ();
	//System.out.println ("test main " + w4);

	w.getStorage ();
	System.out.println ();
	System.out.print ("Please choose the amount of storage: ");
	int choiceStorage = Stdin.readInt ();
	w5 = w.printStorage (choiceStorage - 1);
	System.out.println ();
	//System.out.println ("test main " + w5);

	w.getGpu1 ();
	System.out.println ();
	System.out.print ("Please choose the 1st graphic card: ");
	int choiceGpu1 = Stdin.readInt ();
	w6 = w.printGpu1 (choiceGpu1 - 1);
	System.out.println ();
	//System.out.println ("test main " + w6);

	w.getRam ();
	System.out.println ();
	System.out.print ("Please choose the ram amount: ");
	int choiceRam = Stdin.readInt ();
	w7 = w.printRam (choiceRam - 1);
	System.out.println ();
	//System.out.println ("test main " + w7);

	w.getBattery ();
	System.out.println ();
	System.out.print ("Please choose the battery capacity: ");
	int choiceBattery = Stdin.readInt ();
	w8 = w.printBattery (choiceBattery - 1);
	System.out.println ();
	//System.out.println ("test main " + w8);

	w.getTech ();
	System.out.println ();
	System.out.print ("Please choose the technology: ");
	int choiceTech = Stdin.readInt ();
	w9 = w.printTech (choiceTech - 1);
	System.out.println ();
	//Stdiout.println ("test main " + gw);
    }


    private static double total (int choice)
    {
	double ans = 0;
	if (choice == 1)
	    ans = price + price1 + price2 + price3 + price4 + price5 + price6 + price7 + price8 + price9;
	else if (choice == 2)
	    ans = g1 + g2 + g3 + g4 + g5 + g6 + g7 + g8 + g9 + g0;
	else if (choice == 3)
	    ans = w1 + w2 + w3 + w4 + w5 + w6 + w7 + w8 + w9;
	else if (choice == 4)
	    ans = m1;
	return ans;
    }


    private static void marketing (int d) throws IOException
    {
	Marketing m = new Marketing ();
	m.markIden ();
	m1 = m.Price [d];
    }


    private static void question () throws IOException
    {
	System.out.println ("Before release you device, do you want to do some marketing?");
	System.out.println ("This will improve your sales.");
	System.out.println ();
	System.out.println ("1. Yes");
	System.out.println ("2. No");
	System.out.println ();
	System.out.print ("Please make a choice: ");
	int choice = Stdin.readInt ();
	if (choice == 1)
	{
	    choice = showMenu (2);
	    marketing (choice - 1);
	    markChoice = choice - 1;
	    System.out.println ();
	    System.out.println ("Your marketing service cost: " + total (4));
	    System.out.println ();
	}


	if (choice == 2)
	{
	    System.out.println ();
	}
    }


    private static void readEmp () throws IOException
    {
	String inputFileLoc = "employee.txt";
	String str = "";

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));

	str = infile.readLine ();
	empSize = Integer.parseInt (str);

	for (int i = 0 ; i < empSize ; i++)
	{
	    name [i] = infile.readLine ();
	    id [i] = infile.readLine ();
	    str = infile.readLine ();

	}


	infile.close ();
    }


    private static void showEmp ()
    {
	for (int i = 0 ; i < empSize ; i++)
	{
	    int a = 1 + i;
	    System.out.println (a + ". Name: " + name [i]);
	    System.out.println ("   ID: " + id [i]);
	    System.out.println ();
	}
    }


    private static void sorting ()
    {
	for (int i = 0 ; i < empSize ; i++)

	    {

		for (int j = i + 1 ; j < empSize ; j++)

		    {

			if (name [i].compareTo (name [j]) > 0)

			    {
				temp = name [i];
				name [i] = name [j];
				name [j] = temp;
			    }

		    }

	    }
    }


    private static void addEmp ()
    {
	String newName, newId;
	double temp = empSize * 2.5;

	if (temp < officeSpace)
	{
	    System.out.print ("Enter the employee's name: ");
	    newName = Stdin.readLine ();
	    System.out.print ("Enter " + newName + "'s ID: ");
	    newId = Stdin.readLine ();
	    name [empSize] = newName;
	    id [empSize] = newId;
	    empSize++;
	}


	else
	{
	    System.out.println ();
	    System.out.println ("You need to upgrade your office/dissmiss before adding more staff,");
	    System.out.println ("only 1 staff can work every 2.5 meter(s) squares.");
	    System.out.println ("Your offcice's current space is: " + officeSpace + " meter(s) square.");
	    System.out.println ("Press any letter to continue.");
	    String aaa = Stdin.readString ();
	}
    }


    private static void deleteEmp () throws IOException
    {
	System.out.println ();
	showEmp ();
	int location;

	System.out.print ("Enter the employee's location: ");
	location = Stdin.readInt ();
	location--;

	name [location] = null;
	id [location] = null;

	for (int i = location ; i < empSize + 1 ; i++)
	{
	    name [i] = name [i + 1];
	    id [i] = id [i + 1];
	}


	empSize--;
    }


    private static void writeEmp () throws IOException
    {
	String outputFileLoc = "employee.txt";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));

	output.println (empSize);
	for (int i = 0 ; i < empSize ; i++)
	{
	    output.println (name [i]);
	    output.println (id [i]);
	    output.println ();
	}


	output.close ();
    }


    private static void writeBudget () throws IOException
    {
	String outputFileLoc = "currentMoney.txt";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));

	output.println (budget);
	output.close ();
    }


    private static void readOffice () throws IOException
    {
	String inputFileLoc = "office.txt";
	String str = "";
	double temp, temp1, temp2;

	BufferedReader infile;
	infile = new BufferedReader (new FileReader (inputFileLoc));

	officeSpace = Double.parseDouble (infile.readLine ());

	infile.close ();
    }


    private static void officeUpgrade ()
    {
	double temp1, temp2, temp;
	System.out.println ();
	System.out.println ("1 meter square is 5000$");
	System.out.println ("Your current space is " + officeSpace + " meters square.");
	System.out.print ("How many meter(s) square you want to buy?    ");
	land = Stdin.readDouble ();
	landPrice = land * 5000;
	System.out.println ();
	System.out.println ("You paid " + landPrice + "$ for " + land + " meter(s) square.");
	temp = officeSpace;
	officeSpace = officeSpace + land;
	System.out.print ("The maximum amount of staff now is ");
	temp1 = Math.floor (officeSpace / 2.5);
	System.out.print (temp1);
	System.out.print (" instead of ");
	temp2 = Math.floor (temp / 2.5);
	System.out.println (temp2);
	more = (int) (temp1 - temp2);
	System.out.println ();
    }


    private static void officeSummary ()
    {
	System.out.println ("Office's current space: " + officeSpace + " meter(s) square.");
	System.out.println ("You are having " + empSize + " employees working for you right now.");
	System.out.print ("You can hire ");
	System.out.print (more + 1);
	System.out.println (" more employees.");
	System.out.println ();
	System.out.print ("Press any letter to continue: ");
	String ggg = Stdin.readString ();
	System.out.println ();
    }


    private static void writeOffice () throws IOException
    {
	String outputFileLoc = "office.txt";
	PrintWriter output;
	output = new PrintWriter (new FileWriter (outputFileLoc));
	output.println (officeSpace);
	output.close ();
    }


    private static int showMenu (int num) throws IOException
    {
	int choice;
	if (num == 1)
	{
	    System.out.println ("=============================================");
	    System.out.println ("===== Please choose one of the products =====");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println ("======   1. Smart phone                ======");
	    System.out.println ("======   2. Laptop                     ======");
	    System.out.println ("======   3. Go back                    ======");
	    System.out.println ("=============================================");
	    System.out.println ();
	    System.out.println ();
	}


	else if (num == 2)
	{
	    Marketing m = new Marketing ();
	    m.markIden ();

	    System.out.println ("============================================");
	    System.out.println ("=====  How would you like to advertise? ====");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - ");
	    System.out.println ("=====  1. Social Media                  ====");
	    System.out.print ("\t\t");
	    m.printMarketing (0);
	    System.out.println ("=====  2. Billboards & TVs              ====");
	    System.out.print ("\t\t");
	    m.printMarketing (1);
	    System.out.println ("=====  3. Affiliate Programs            ====");
	    System.out.print ("\t\t");
	    m.printMarketing (2);
	    System.out.println ("=====  4. In-Store Promotions           ====");
	    System.out.print ("\t\t");
	    m.printMarketing (3);
	    System.out.println ("=====  5. Magazines and posters         ====");
	    System.out.print ("\t\t");
	    m.printMarketing (4);
	    System.out.println ("=====  6. Offer an Upgrade or Trade-In  ====");
	    System.out.print ("\t\t");
	    m.printMarketing (5);
	    System.out.println ("=====  7. Email Marketing & Online Ads  ====");
	    System.out.print ("\t\t");
	    m.printMarketing (6);
	    System.out.println ("=====  8. Go back                      =====");
	    System.out.println ("============================================");
	    System.out.println ();
	    System.out.println ();
	}


	else if (num == 3)
	{
	    System.out.println ("============================================");
	    System.out.println ("=====     What you would like to do?    ====");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - ");
	    System.out.println ("======  1. Show employee list         ======");
	    System.out.println ("======  2. Hire an employee;          ======");
	    System.out.println ("======  3. Dismiss an employee        ======");
	    System.out.println ("======  4. Sort the list aphabetically =====");
	    System.out.println ("======  5. Go back                    ======");
	    System.out.println ("============================================");
	    System.out.println ();
	    System.out.println ();
	}


	else if (num == 4)
	{
	    System.out.println ("=============================================");
	    System.out.println ("=====       Customize your office       =====");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println ("====== 1. Upgrade office's facility    ======");
	    System.out.println ("======     (More members can work)     ======");
	    System.out.println ("====== 2. Your office summary         ======");
	    System.out.println ("====== 3. Go back                      ======");
	    System.out.println ("=============================================");
	    System.out.println ();
	    System.out.println ();
	}


	else if (num == 5)
	{
	    System.out.println ("=============================================");
	    System.out.println ("=====        View your status           =====");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println ("======   1. Budget                     ======");
	    System.out.println ("======   2. Business history           ======");
	    System.out.println ("======   3. Go back                     ======");
	    System.out.println ("=============================================");
	    System.out.println ();
	    System.out.println ();

	}


	else if (num == 6)
	{
	    System.out.println ("=============================================");
	    System.out.println ("=====              Quitting             =====");
	    System.out.println ("- - - - - - - - - - - - - - - - - - - - - - -");
	    System.out.println ("======   1. Save and exit              ======");
	    System.out.println ("======   2. Exit without saving        ======");
	    System.out.println ("======   3. Go back                    ======");
	    System.out.println ("=============================================");
	    System.out.println ();
	    System.out.println ();
	}


	System.out.print ("Please choose an option above: ");
	choice = Stdin.readInt ();
	return choice;
    }
} // KevinsFinalProgram class


