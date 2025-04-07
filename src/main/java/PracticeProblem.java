public class PracticeProblem {

	public static void main(String args[]) {

	}

	public static void selectionSortName(String[] names, int[] ages) {
		int n = names.length;
		for (int i = 0; i < n -1; i++) {
			int minIndex = i;

			for (int j = i + 1; j < n; j++) {
				if (names[j].compareToIgnoreCase(names[minIndex]) < 0) {
					minIndex = j;
				}
			}
			if (minIndex != i) {
				String tempName = names[i];
				names[i] = names[minIndex];
				names[minIndex] = tempName;

				int tempAge = ages[i];
				ages[i] = ages[minIndex];
				ages[minIndex] = tempAge
;			}

		}
	}

	public static void selectionSortAge(String[] names, int[] ages) {
		int n = ages.length;
		for(int i = 0; i < n - 1; i++) {
			int minIndex = i;

			for(int j = i+1; j<n; j++) {
				if (ages[j] < ages[minIndex]) {
					minIndex = j;
				}
			}

			if (minIndex != i) {
				int tempAge = ages[i];
				ages[i] = ages[minIndex];
				ages[minIndex] = tempAge;

				String tempName = names[i];
				names[i] = names[minIndex];
				names[minIndex] = tempName;
			}
		}
	}

	

}
