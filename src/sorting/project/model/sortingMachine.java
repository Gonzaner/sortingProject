package sorting.project.model;

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

	private void swap(int[] array, int position, int change)
	{
		int temp = array[position];
		array[position] = array[change];
		array[change] = temp;
	}
/**
 * 
 * @param sortTime
 * @return the current time using Days, hours, minutes, seconds, and milliseconds.
 */
	public String sortingTime(long sortTime)
	{
		String timeToSort = "";
		
		timeToSort +="Days" + sortTime/(1000*60*60*24) + "/n";
		timeToSort +="Hours" + sortTime/(1000*60*60) %24+ "/n";
		timeToSort +="Minutes" + sortTime/(1000*60) %60+ "/n";
		timeToSort +="Seconds" + sortTime/(1000)%60 + "/n";
		timeToSort +="Milliseconds" + sortTime %1000 + "/n";
		
		return timeToSort;
	}
}
