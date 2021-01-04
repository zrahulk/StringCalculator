public class StringCalculator
{
    public int Add(String numbers)
    {
        int sum = 0;
        if(numbers.length()==0) {
            sum = 0;
        } else {
            String[] numArray = numbers.split(",");
            for (String number: numArray
                 ) {
                number = number.trim();
                sum+= Integer.parseInt(number);
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        StringCalculator stringCalculator = new StringCalculator();

        assert stringCalculator.Add("")==0:"error";
        assert stringCalculator.Add("1")==0:"error";
        assert stringCalculator.Add("1,2")==0:"error";


    }
}
