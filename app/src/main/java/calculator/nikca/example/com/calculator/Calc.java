package calculator.nikca.example.com.calculator;

public class Calc {

    public static String calculate(String text) {
        if (text.indexOf('+') > 0) {
            try {
                int operIndex = text.indexOf('+');
                double firstNumber = Double.parseDouble(text.substring(0, operIndex));
                double secondNumber = Double.parseDouble(text.substring(operIndex + 1, text.length()));
                return String.valueOf(firstNumber + secondNumber);
            } catch (Exception e) {
                return "";
            }
        }

        if (text.indexOf('-') > 0) {
            try {
                int operIndex = text.indexOf('-');
                double firstNumber = Double.parseDouble(text.substring(0, operIndex));
                double secondNumber = Double.parseDouble(text.substring(operIndex + 1, text.length()));

                return String.valueOf(firstNumber - secondNumber);

            } catch (Exception e) {
                return "";
            }
        }

        if (text.indexOf('*') > 0) {
            try {
                int operIndex = text.indexOf('*');
                double firstNumber = Double.parseDouble(text.substring(0, operIndex));
                double secondNumber = Double.parseDouble(text.substring(operIndex + 1, text.length()));
                return String.valueOf(firstNumber * secondNumber);
            } catch (Exception e) {
                return "";
            }
        }

        if (text.indexOf('/') > 0) {
            try {
                int operIndex = text.indexOf('/');
                double firstNumber = Double.parseDouble(text.substring(0, operIndex));
                double secondNumber = Double.parseDouble(text.substring(operIndex + 1, text.length()));
                if (secondNumber == 0) {
                    return "Делить на 0 нельзя";
                }
                return String.valueOf(firstNumber / secondNumber);
            } catch (Exception e) {
                return "";
            }
        }

        return "";
    }
}
