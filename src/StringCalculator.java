public class StringCalculator
{
    public int Add(String numbers)
    {
        int sum = 0;
        if(numbers.length()==0) {
            sum = 0;
        } else {
            String[] numArray = numbers.split(";");
            for (String number: numArray
                 ) {
                number = number.trim();
                if(number.length()==0) {
                    number = "0";
                }
                sum+= Integer.parseInt(number);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();

        assert stringCalculator.Add("")==0:"error";
        assert stringCalculator.Add("1")==1:"error";
        assert stringCalculator.Add("1;2")==3:"error";
        assert stringCalculator.Add("1;2;3;4;5")==15:"error";
        assert stringCalculator.Add(";\n1;2")==3:"error";



    }
}
