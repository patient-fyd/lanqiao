import java.util.ArrayList;
import java.util.Scanner;

public class find {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int numOfRecords = Integer.parseInt(scanner.nextLine());
		ArrayList<String> clockRecords = new ArrayList<>();

		while (numOfRecords-- > 0) {
			clockRecords.add(scanner.nextLine());
		}

		String targetEmployeeName = scanner.next().trim();

		clockRecords.forEach(record -> {
			String[] split = record.split("\\s+");
			if (split.length > 1 && split[1].equals(targetEmployeeName)) {
				System.out.println(record);
			}
		});
	}
}