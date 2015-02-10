package rybin;

/**
 * Created by eredin on 10.02.2015.
 */
public class task2 {


	public static int binarySearch(int[] vector, int e)
	{
		int first = 0;
		int last = vector.length - 1;
		int mid = vector.length / 2;
		int i = vector.length;
		while (i > 0)
		{
			if (last - first == 1)
			{
				return first;
			}
			if (vector[mid] == e)
				return mid;
			else if (vector[mid] > e)
			{
				last = mid;
				mid = ((last - first) / 2);
			}
			else if (vector[mid] < e)
			{
				first += mid + 1;
				mid = ((last - first) / 2);
			}
			else
				return -1;
			i--;
		}
		return -1;
	}
}

