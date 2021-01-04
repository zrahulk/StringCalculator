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
                    try {
                        int num = Integer.parseInt(number);

                        if (num < 0) {
                            throw new NegativeNumberException("" + number+" ");
                        }
                        if(num>1000) {
                            num  = 0;
                        }
                        sum += num;
                    }catch (Exception e) {
                        System.out.println("negatives are not allowed "+e.getMessage());
                    }

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
        assert stringCalculator.Add("-1,2")==0:"error";

        assert stringCalculator.Add("-1,-2,-3,2")==0:"error";
        assert stringCalculator.Add("1003,2")==2:"error";


    }
}
