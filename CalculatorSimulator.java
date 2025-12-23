public class CalculatorSimulator {
    static class CountryNotValidException extends Exception {
        CountryNotValidException(String msg) {
            super(msg);
        }
    }

    static class EmployeeNameInvalidException extends Exception {
        EmployeeNameInvalidException(String msg) {
            super(msg);
        }
    }

    static class TaxNotEligibleException extends Exception {
        TaxNotEligibleException(String msg) {
            super(msg);
        }
    }
    static class TaxCalculator {

        public double calculateTax(String empName, boolean isIndian, double empSal)
                throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException {

            if (!isIndian) {
                throw new CountryNotValidException(
                        "The employee should be an Indian citizen for calculating tax");
            }

            if (empName == null || empName.isEmpty()) {
                throw new EmployeeNameInvalidException(
                        "The employee name cannot be empty");
            }

            if (empSal > 100000) {
                return empSal * 8 / 100;
            } else if (empSal >= 50000) {
                return empSal * 6 / 100;
            } else if (empSal >= 30000) {
                return empSal * 5 / 100;
            } else if (empSal >= 10000) {
                return empSal * 4 / 100;
            } else {
                throw new TaxNotEligibleException(
                        "The employee does not need to pay tax");
            }
        }
    }

    public static void main(String[] args) {

        TaxCalculator calculator = new TaxCalculator();

        try {
            double tax = calculator.calculateTax("Jack", true, 55000);
            System.out.println("Tax amount is " + tax);
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
