package klasy;

public class Company {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.name = "Frank";
        emp1.lastName = "Lampard";
        emp1.yearOfBirth = 1978;
        emp1.workYears = 20;

        Employee emp2 = new Employee();
        emp2.name = "Ashley";
        emp2.lastName = "Young";
        emp2.yearOfBirth = 1983;
        emp2.workYears = 12;


        System.out.println(emp1.name + " " + emp1.lastName + ", ur. " + emp1.yearOfBirth + ", staż: "
                + emp1.workYears + " lata");

        System.out.println(emp2.name + " " + emp2.lastName + ", ur. " + emp2.yearOfBirth + ", staż: "
                + emp2.workYears + " lata");
    }

}
