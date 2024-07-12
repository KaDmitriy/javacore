package lang.tasks;

public class BankAccount {

	public static long parse(final String acctNbr) {
		int countCharInNumberHor = 3;
		int countCharInNumberVert = 3;
		int sizeLineAllNumber = acctNbr.indexOf("\n");
		int countNumber = sizeLineAllNumber / countCharInNumberHor;
		sizeLineAllNumber += 1; // вместе с "\n"
//		List<String> numbers = new ArrayList<String>();
		long result = 0;
		for (int n = 0, degree = countNumber - 1; n < countNumber; n++, degree--) {
			String number = "";
			for (int i = 0; i < countCharInNumberVert; i++) {
				int beginIndex = (i * sizeLineAllNumber) + (countCharInNumberHor * n);
				int endIndex = beginIndex + countCharInNumberHor - 1;
				number += acctNbr.substring(beginIndex, endIndex + 1);
			}
//			numbers.add(number);
			// result += decodeNumber(number)* Math.pow(10, (countNumber-n-1));
			result += decodeNumber(number) * Math.pow(10, degree);
		}

		return result; // your code here
	}

	public static long decodeNumber(final String number) {
		return switch (number) {
			case " _ | ||_|" -> 0;
			case "     |  |" -> 1;
			case " _  _||_ " -> 2;
			case " _  _| _|" -> 3;
			case "   |_|  |" -> 4;
			case " _ |_  _|" -> 5;
			case " _ |_ |_|" -> 6;
			case " _   |  |" -> 7;
			case " _ |_||_|" -> 8;
			case " _ |_| _|" -> 9;
			default -> throw new IllegalArgumentException("Unexpected value: " + number);
		};
	}

}
