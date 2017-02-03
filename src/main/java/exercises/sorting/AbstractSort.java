package exercises.sorting;

import java.util.stream.IntStream;

public class AbstractSort
{
	public static void display(int[] array)
	{
		IntStream.range(0, array.length).forEach(i -> System.out.print(array[i] + "\t"));
		System.out.println();
	}

	public static void swap(int[] array, int indexA, int indexB)
	{
		int temp = array[indexA];
		array[indexA] = array[indexB];
		array[indexB] = temp;
	}
}
