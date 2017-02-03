package exercises.sorting;

public class BubbleSort extends AbstractSort
{
	public static int[] sort(int[] array)
	{
		for (int i = array.length - 1; i > 0; i--)
		{
			display(array);
			for (int j = 0; j < i; j++)
			{
				if (array[j] > array[j + 1])
				{
					swap(array, j, j + 1);
				}
			}
		}
		return array;
	}
}
