public class TestEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Sanjay", 1000000, 2024, "AB123456");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());

        employee.setName("Sanju");
        employee.setAnnualSalary(600000);
        employee.setYearStarted(2025);
        employee.setNationalInsuranceNumber("XY987654Z");

        System.out.println("\nUpdated Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Annual Salary: " + employee.getAnnualSalary());
        System.out.println("Year Started: " + employee.getYearStarted());
        System.out.println("National Insurance Number: " + employee.getNationalInsuranceNumber());
    }
}
