package sorting.project.model;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class sortingMachine
{

	private long startTime;
	private long endTime;
	private long sortTime;

	public long getSortTime()
	{
		return sortTime;
	}

	public int[] selectionSort(int[] toBeSorted)
	{
		/**
		 * minimum that is an int
		 * minimumPosition is an int
		 */
		int minimum;
		int minimumPosition;
		/**
		 * the start time is the current time that is in milliseconds 
		 */
		startTime = System.currentTimeMillis();
		/**
		 * 
		 */
		for (int position = 0; position < toBeSorted.length; position++)
		{
			minimumPosition = position;
			minimum = toBeSorted[position];
			for (int next = position + 1; next < toBeSorted.length; next++)
			{
				/**
				 * * if toBeSorted is less than minimum then minimum is set to equal toBeSorted, and minimumPosition is equal to next
				 */
				if (toBeSorted[next] < minimum)
				{
					minimum = toBeSorted[next];
					minimumPosition = next;
				}
			}
			/**
			 * if minimumPostition does not equal position then we use the swap method.
			 */
			if (minimumPosition != position)
			{
				swap(toBeSorted, position, minimumPosition);
			}

		}
		
		endTime = System.currentTimeMillis();

		/**
		 * sortTime is equal to the endTime minus the startTime
		 */
		sortTime = endTime - startTime;

		return toBeSorted;
	}
	public ArrayList<Integer> selectionSort(ArrayList<Integer> arrayListSort)
	{
		/**
		 * minimum that is an int
		 * minimumPosition is an int
		 */
		int minimum;
		int minimumPosition;
		/**
		 * the start time is the current time that is in milliseconds 
		 */
		startTime = System.currentTimeMillis();
		/**
		 * 
		 */
		for (int position = 0; position < arrayListSort.size(); position++)
		{
			minimumPosition = position;
			minimum = arrayListSort.get(position);
			for (int next = position + 1; next < arrayListSort.size(); next++)
			{
				/**
				 * * if toBeSorted is less than minimum then minimum is set to equal toBeSorted, and minimumPosition is equal to next
				 */
				if (arrayListSort.get(next) < minimum)
				{
					minimum = arrayListSort.get(next);
					minimumPosition = next;
				}
			}
			/**
			 * if minimumPostition does not equal position then we use the swap method.
			 */
			if (minimumPosition != position)
			{
				swap(arrayListSort, position, minimumPosition);
			}

		}
		
		endTime = System.currentTimeMillis();

		/**
		 * sortTime is equal to the endTime minus the startTime
		 */
		sortTime = endTime - startTime;

		return arrayListSort;
	}
	


	public double[] selectionSort(double[] sortTheDouble)
	{
		int minimumPosition;
		double minimum;
		startTime = System.currentTimeMillis();
		for(int position =0; position < sortTheDouble.length; position++)
		{
			minimumPosition = position;
			minimum = sortTheDouble[position];
			for(int next = position +1; next < sortTheDouble.length; next++)
			{
				if(sortTheDouble[next] < minimum)
					
				{
					minimum = sortTheDouble[next];
					minimumPosition = next;
				}
			}
			
			if(minimumPosition != position)
			{
				swap(sortTheDouble, position, minimumPosition);
			}
		}
		
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		return sortTheDouble;
	}
	
	public Keyboards [] selectionSort(Keyboards [] sortTheKeyboards)
	{
		int maximumPosition;
		Keyboards maximum;
		startTime = System.currentTimeMillis();
		
		for(int position =0; position < sortTheKeyboards.length; position++)
		{
			maximumPosition = position;
			maximum = sortTheKeyboards[position];
			for (int next = position +1; next < sortTheKeyboards.length; next++)
			{
				if(sortTheKeyboards[next].compareTo(maximum)>0)
				{
					maximum = sortTheKeyboards[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(sortTheKeyboards, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return sortTheKeyboards;
	}
	
	public String [] selectionSort(String [] sortTheString)
	{
		int maximumPosition;
		String maximum;
		startTime = System.currentTimeMillis();
		
		for(int position =0; position < sortTheString.length; position++)
		{
			maximumPosition = position;
			maximum = sortTheString[position];
			for (int next = position +1; next < sortTheString.length; next++)
			{
				if(sortTheString[next].compareTo(maximum)>0)
				{
					maximum = sortTheString[next];
					maximumPosition = next;
				}
			}
			if(maximumPosition != position)
			{
				swap(sortTheString, position, maximumPosition);
			}
		}
		endTime = System.currentTimeMillis();
		sortTime = endTime - startTime;
		
		return sortTheString;
	}

	public Keyboards[] quickSort(Keyboards[] sortedArray,int low, int high)
	{
		if( low < high)
		{
			int p = partition(sortedArray, high, low);
			quickSort(sortedArray, low, p-1);
			quickSort(sortedArray, p+1, high);
		}
		return sortedArray;
	}
	
	public int partition(Keyboards[] sortedArray,int low, int high)
	{
		int pivotIndex = choosePivot (sortedArray, high, low);
		Keyboards pivotValue = sortedArray[pivotIndex];
		swap(sortedArray, pivotIndex, high);
		int storeIndex = low;
		for(int row = low; row <= high -1; row++)
		{
			if(sortedArray[row].compareTo(pivotValue) < 0)
			{
				swap(sortedArray,row,storeIndex);
				storeIndex = storeIndex + 1;
			}
		}
		return storeIndex;
	}
	
	private int choosePivot(Keyboards[] sortedArray, int high, int low)
	{
		int choosePivot =low + (high-low)/2;
		
		return choosePivot;
	}

	private void swap( double[] array, int position, int change)
	{
		double temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	
	
	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(Keyboards[] array, int position, int change)
	{
		Keyboards temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(String[] array, int position, int change)
	{
		String temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
	private void swap(ArrayList<Integer> arrayListSort, int position, int change)
	{
		int temp = arrayListSort.get(position);
		arrayListSort.set(position, arrayListSort.get(change));
		arrayListSort.set(change, temp);
		
	}
	
/**
 * 
 * @param sortTime
 * @return the current time using Days, hours, minutes, seconds, and milliseconds.
 */
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort +="Days" + sortTime/(1000*60*60*24) + "\n";
		timeToSort +="Hours" + sortTime/(1000*60*60) %24+ "\n";
		timeToSort +="Minutes" + sortTime/(1000*60) %60+ "\n";
		timeToSort +="Seconds" + sortTime/(1000)%60 + "\n";
		timeToSort +="Milliseconds" + sortTime %1000 + "\n";
		
		return timeToSort;
	}
}
