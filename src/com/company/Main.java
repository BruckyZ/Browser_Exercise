package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        // write your code here

        String Add = "";
        Scanner scan = new Scanner(System.in);
        //ArrayList<Browser>browsers= new ArrayList<Browser>();


        System.out.println("Enter the Name of the Broswer: ");
        Browser browser = new Browser();
        browser.setName(scan.nextLine());

        do
        {
            Tabs tabs = new Tabs();
            System.out.println("Enter the title of the Tab:");
            tabs.setTittle(scan.nextLine());

            System.out.println("Enter the name of the Url:");
            tabs.setUrl(scan.nextLine());
            browser.addTabs(tabs);

            System.out.println("Do you want to add more Tabs? Yes/No ");
            Add = scan.nextLine();
        }
        while (Add.equalsIgnoreCase("Yes"));

        
            System.out.println("The name of the Browser is : " + browser.getName());

        for (Tabs atabs : browser.getTabs())
            {
            System.out.println("The name of the Tab is: " + atabs.getTittle());
            System.out.println("The name of the Url is: " + atabs.getUrl());
        }

    }
}
