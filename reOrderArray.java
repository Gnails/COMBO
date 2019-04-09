
public class reOrderArray {
	public void reOrderArrays(int[] array) {
		int[] tmp = new int[array.length - 1];
		int evenbegin = 0,oddbegin=0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 1)
				evenbegin++;
		}
		for(int i=0;i<array.length;i++) {
			if (array[i] % 2 == 0)
				tmp[evenbegin++]=array[i];
			if (array[i] % 2 == 1)
				tmp[oddbegin++]=array[i];
		}
		for(int i=0;i<array.length;i++) {
			array[i]=tmp[i];
		}

	}

}
