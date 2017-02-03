package exercises.sorting;

public class SortTest
{

	public static void main(String[] args)
	{
		int[] array = new int[] { 9, 15, 8, 16, 4, 11, 3, 14, 5, 10, 7, 12, 1, 13, 2, 6 };
		//		BubbleSort.sort(array);
		QuickSort.sort(array, 0, array.length - 1);
	}

}
