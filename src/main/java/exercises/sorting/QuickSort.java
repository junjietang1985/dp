package exercises.sorting;

public class QuickSort extends AbstractSort
{

	public static int[] sort(int[] array, int indexFromInc, int indexToInc)
	{
		if (indexFromInc >= indexToInc)
		{
			return array;
		}
		int indexMiddle = partition(array, indexFromInc, indexToInc);
		System.out.println("relocate " + array[indexMiddle]);
		sort(array, indexFromInc, indexMiddle - 1);
		sort(array, indexMiddle + 1, indexToInc);
		return array;
	}

	private static int partition(int[] array, int left, int right)
	{
		display(array);
		int ret = left;
		while (left < right)
		{
			while (array[right] >= array[ret] && left < right)
			{
				right--;
			}
			while (array[left] <= array[ret] && left < right)
			{
				left++;
			}
			if (left < right)
			{
				swap(array, left++, right--);
			}
		}
		swap(array, ret, Math.min(left, right));
		display(array);
		return Math.min(left, right);

	}
}
