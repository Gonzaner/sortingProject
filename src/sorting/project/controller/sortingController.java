package sorting.project.controller;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import sorting.project.model.Keyboards;
import sorting.project.model.sortingMachine;
import sorting.project.view.sortingFrame;

public class sortingController
{
	private int [] integers;
	private double [] real;
	private String [] words;
	private Keyboards [] myKeyboards;
	private sortingMachine mySorter;
	private sortingFrame appFrame;
	private int low;
	private int high;
	private ArrayList<Integer> arrayList;
	public sortingController()
	{
		mySorter = new sortingMachine();
		
	}

	public void start()
	{
		fillTheArrays();
		mySorter.selectionSort(integers);
		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
		mySorter.selectionSort(myKeyboards);
		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));;
		mySorter.quickSort(myKeyboards, 0, myKeyboards.length-1);
		mySorter.selectionSort(arrayList);
		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
		
	}
	private void fillTheArrays()
	{
		fillTheIntArray();
		fillTheDoubleArray();
		fillTheStringArray();
		fillTheKeyboardArray();
		fillTheStringArrayList();
	}
	private void fillTheStringArrayList()
	{
		for(int start = 0; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * 36000);
		}
		
	}

	private void fillTheIntArray()
	{
		integers = new int [30];
		for(int start = 0; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * 36000);
		}
	}
	private void fillTheKeyboardArray()
	{
		myKeyboards = new Keyboards[20];
			for(int index = 0; index< myKeyboards.length; index++)
			{
				String name =  index + "Keyboard";
				String typeOfKeys = (int) (Math.random() * 10) + " Keys";
				int price = (int) (Math.random() * 10000);
				myKeyboards[index] = new Keyboards(name, typeOfKeys, price);
			}
	}
	
	

	private void fillTheStringArray()
	{
		words = new String[100];
		for(int start =0; start < words.length; start++)
		{
			words[start] = "";
		}
	
	}
	
	
	
	private void fillTheDoubleArray()
	{
		real = new double [1];
		for(int start =0; start < real.length; start++)
		{
			real[start] = (int) (Math.random() * 36000);
		}
		
	}
}
