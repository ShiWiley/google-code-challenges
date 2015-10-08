package Challenge3;

public class Zombit_Monitoring {
	int[][] array;

	public Zombit_Monitoring(int[][] array) {
		this.array = array;
	}

	public int filter() {
		int range = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i][0] > 0 && array[i][1] > 0) {
				for (int j = 0; j < array.length; j++) {
					if (i != j) {
						if (array[j][0] >= array[i][0]
								&& array[j][0] <= array[i][1]
								&& array[j][1] > array[i][1]) {
							array[i][1] = array[j][1];
							array[j][0] = 0;
							array[j][1] = 0;
							j = 0;
						} else if (array[j][1] >= array[i][0]
								&& array[j][1] <= array[i][1]
								&& array[j][0] < array[i][0]) {
							array[i][0] = array[j][0];
							array[j][0] = 0;
							array[j][1] = 0;
							j = 0;
						} else if (array[j][0] >= array[i][0]
								&& array[j][1] <= array[i][1]) {
							array[j][0] = 0;
							array[j][1] = 0;
						} else if (array[j][0] <= array[i][0]
								&& array[j][1] >= array[i][1]) {
							array[i][0] = array[j][0];
							array[i][1] = array[j][1];
							array[j][0] = 0;
							array[j][1] = 0;
							j = 0;
						}
					}
				}
			}
		}
		for (int k = 0; k < array.length; k++){
			range += array[k][1] - array[k][0];
		}
		System.out.println(range);
		return range;
	}

	public static void main(String args[]) {
		int[][] array = new int[][] { { 23,25 }, { 19,21 }, {19, 21},{5,10},{6,16}};
		Zombit_Monitoring zm = new Zombit_Monitoring(array);
		zm.filter();
	}
}
