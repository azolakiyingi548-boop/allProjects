//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String[] makeoverTypes = {"Bathrooms", "Kitchens", "Garden"};
        String[] months = {"JAN", "FEB", "MAR", "APR", "MAY", "JUN"};
        int[][] makeovers = {{8, 2, 5}, {7, 4, 5}, {5, 5, 2}, {2, 2, 3}, {7, 7, 9}, {7, 8, 5}};

        System.out.println("----------------------------------------------------------------");
        System.out.println("HOME MAKEOVER REPORT");
        System.out.println("----------------------------------------------------------------");

        System.out.printf("%-16s", "");
        for (String type : makeoverTypes) {
            System.out.printf("%-16s", type);
        }
        System.out.println();

        for (int i = 0; i < months.length; i++) {
            System.out.printf("%-16s", months[i]);
            for (int j = 0; j < makeovers[i].length; j++) {
                System.out.printf("%-18d", makeovers[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");
        System.out.println("MONTHLY TOTALS");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < months.length; i++) {
            int monthlyTotals = 0;
            for (int j = 0; j < makeovers[i].length; j++) {
                monthlyTotals += makeovers[i][j];
            }

            String stars = "";
            if (monthlyTotals >= 15) {
                stars = "***";
            }

            System.out.printf("%-8s %-6d %s%n", months[i], monthlyTotals, stars);
        }
    }
}