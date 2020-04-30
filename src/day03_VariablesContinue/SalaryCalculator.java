package day03_VariablesContinue;

public class SalaryCalculator {

    /*Create a class called salary calculator, write a program that can calculate the text,
    and salary after tax based on the hourly rate & tax rates
    ex:
            if:
    rate = 55;
    stateTax = 0.04;
    federalTax =0.22;
    weeklyHours = 40;
    then output will be:
    your salary is: 105600 USD
    your total tax is: 27456 USD
    your income after tax is: 78144 USD
				if:
    rate = 45.25;
    stateTax =0.045;
    federalTax = 0.25;
    weeklyHours = 45;
    then output will be:
    your salary is: 91260 USD
    your total tax is: 26921.7
    your income after tax: 64338.3 USD
    */
    public static void main(String[] args) {
        // DataType variableName = Data;
        double hourlyRate = 55;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.22;
        byte weeklyHours = 40;
        byte totalWeeks = 52;
        //salary = hourlyRate * weeklyHours * 52
        double salary = hourlyRate * weeklyHours * totalWeeks; //salary before tax
        System.out.println("The salary before the taxes is: " + salary);

        //state tax = salary * stateTax
        double stateTax = salary * stateTaxRate;
        //federal tax = salary * federalTaxRate
        double federalTax = salary * federalTaxRate;

        double salaryAfterTax = salary - (stateTax + federalTax);
        System.out.println("The salary after the taxes is: " + salaryAfterTax);

        double totalTax = stateTax + federalTax;
        System.out.println("Total of the taxes we pay: " + totalTax);
    }
}
