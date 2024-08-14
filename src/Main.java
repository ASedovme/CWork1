public class Main {
    public static int allWages() {
        int total = 0;
        for (int i = 0; i < employee.length; i++) {
            total += employee[i].getWages();
        }
        return total;
    }

    public static int minWages() {
        int minWages = (int) employee[0].getWages();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getWages() < minWages) {
                minWages = (int) employee[i].getWages();
            }
        }
        return minWages;
    }

    public static int maxWages() {
        int maxWages = (int) employee[0].getWages();
        for (int i = 0; i < employee.length; i++) {
            if (employee[i].getWages() > maxWages) {
                maxWages = (int) employee[i].getWages();
            }
        }
        return maxWages;
    }

    public static double averageWages() {
        int total = 0;
        int i = 0;
        for (; i < employee.length; i++) {
            total += employee[i].getWages();
        }
        double averageWages = total / i;

        return averageWages;
    }
    public static void printFullName(){
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i].getSurname()+" "+employee[i].getName()+" "+employee[i].getFatherName());
        }
    }


    private static Employee employee[] = new Employee[5];

    public static void main(String[] args) {
        System.out.println("Курсовая работа 1");
        System.out.println(" ");

        employee[0] = new Employee("Иванов", "Иван", "Петрович", 2, 18000);
        employee[1] = new Employee("Васильев", "Семен", "Викторович", 1, 22000);
        employee[2] = new Employee("Семенов", "Семен", "Семенович", 3, 45000);
        employee[3] = new Employee("Свиридов", "Петр", "Артамонович", 1, 35700);
        employee[4] = new Employee("Борисов", "Демид", "Сергеевич", 5, 16700);
        System.out.println("Список работников:");
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
        System.out.println(" ");
        int total = allWages();
        System.out.println("Заработная плата всех работников " + total + " рублей");
        System.out.println(" ");

        int minWages = minWages();
        System.out.println("Минимальная заработная плата " + minWages + " рублей");
        System.out.println(" ");

        int maxWages = maxWages();
        System.out.println("Максимальная заработная плата " + maxWages + " рублей");
        System.out.println(" ");

        double averageWages = averageWages();
        System.out.println("Средняя заработная плата " + averageWages + " рублей");
        System.out.println(" ");

        printFullName();


    }
}