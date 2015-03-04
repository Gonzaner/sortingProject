package sorting.project.controller;

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

	public sortingController()
	{
		mySorter = new sortingMachine();
		
	}

	public void start()
	{
		fillTheArrays();
		mySorter.selectionSort(integers);
		System.out.println(mySorter.sortingTime(mySorter.getSortTime()));
	}
	private void fillTheArrays()
	{
		fillTheIntArray();
		fillTheDoubleArray();
		fillTheStringArray();
	}
	private void fillTheIntArray()
	{
		integers = new int [30];
		for(int start = 0; start < integers.length; start++)
		{
			integers[start] = (int) (Math.random() * 36000);
		}
	}

	private void fillTheStringArray()
	{
		
	}
	private void fillTheDoubleArray()
	{
		
	}
}
