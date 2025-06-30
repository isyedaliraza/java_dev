package domain2;

public class Ex14 {
    public static void main(String[] args) {
        String name = "Brain Hayes";
        String ppsNo = "6464514D";
        String department = "IT";
        float hoursWorked = 50.5f;
        float hoursOvertime = 13.5f;
        float payHourlyRate = 29.35f;
        float overtimeHourlyRate = payHourlyRate * 1.5f;
        float basicSalary = hoursWorked * payHourlyRate;
        float overtimeSalary = hoursOvertime * overtimeHourlyRate;
        float grossPay = basicSalary + overtimeSalary;
        float incomeTax = grossPay * .35f;
        float netPay = grossPay - incomeTax;

        System.out.println("********** Salary Report **********");
        System.out.println("********** Employee Details **********");
        System.out.println(String.format("Employee Name: %s", name));
        System.out.println(String.format("Employee PPS No: %s", ppsNo));
        System.out.println(String.format("Employee Department: %s", department));
        System.out.println("********** Hours Worked **********");
        System.out.println(String.format("Number of basic hours worked: %.1f", hoursWorked));
        System.out.println(String.format("The hourly rate of basic pay is at %.2f euro", payHourlyRate));
        System.out.println(String.format("Basic salary: %.2f", basicSalary));
        System.out.println(String.format("No. of overtime hours worked: %.1f", hoursOvertime));
        System.out.println("The hourly rate of overtime pay is at time and a half");
        System.out.println(String.format("Overtime Salary: %.2f", overtimeSalary));
        System.out.println("********** Take Home Pay **********");
        System.out.println(String.format("Gross Pay: %.2f", grossPay));
        System.out.println(String.format("Income tax payable at 0.35 is %.2f", incomeTax));
        System.out.println(String.format("Net Pay: %.2f", netPay));
    }
}
