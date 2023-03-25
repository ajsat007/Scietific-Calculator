package ScientificCalculator;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;
public  class ScientificCalculator {
    double a, b;
    Scanner sc = new Scanner(System.in);

    int Addition() {
        System.out.println("Enter 2 numbers for Calculate Addition : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        return (int) (a + b);
    }

    int Subtraction() {
        System.out.println("Enter 2 Numbers for Calculate Subtraction :  ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        return (int) (a - b);
    }

    int Multiplication() {
        System.out.println("Enter 2 Numbers for Calculate Multiplication :  ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        return (int) (a * b);
    }

    int Division() {
        System.out.println("Enter 2 Numbers for Calculate Division :  ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        return (int) (a / b);
    }

    int Power() {
        System.out.println("Enter 2 Number for Calculate Power : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        return (int) Math.pow(a, b);
    }

    int SquareRoot() {
        System.out.println("Enter the Number for  Calculate Square root : ");
        a = sc.nextDouble();
        return ((int) Math.sqrt(a));
    }

    int nthRoot() {
        System.out.println("Enter the 2 Number for Calculate nth root : ");
        a = sc.nextDouble();
        b = sc.nextDouble();
        return ((int) Math.pow(a, 1.0 / b));
    }

    int LogarithmicValue() {
        System.out.println("Enter the  Number for Calculate LogarithmicValue  : ");
        a = sc.nextDouble();
        return (int) Math.log10(a);
    }

    int NaturalLog() {
        System.out.println("Enter the  Number for Calculate NaturalLog  : ");
        a = sc.nextDouble();
        return (int) Math.log(a);
    }

    int Sine() {
        System.out.println("Enter the Number for Calculate Sin : ");
        a = sc.nextDouble();
        return (int) Math.sin(a);
    }

    int InverseSin() {
        System.out.println("Enter the Number for Calculate InverseSin : ");
        a = sc.nextDouble();
        return (int) Math.asin(a);
    }

    int Cosine() {
        System.out.println("Enter the Number for Calculate CoSine : ");
        a = sc.nextDouble();
        return (int) Math.cos(a);
    }

    int InverseCos() {
        System.out.println("Enter the Number for Calculate InverseCos : ");
        a = sc.nextDouble();
        return (int) Math.acos(a);
    }

    int Tangent() {
        System.out.println("Enter the Number for Calculate Tangent : ");
        a = sc.nextDouble();
        return (int) Math.tan(a);

    }

    int InverseTan() {
        System.out.println("Enter the Number for Calculate InverseTan : ");
        a = sc.nextDouble();
        return (int) Math.atan(a);
    }

    int stor() {
        double store = 0;
        int input = 0;
        System.out.println(" Which kind of value/calculation do you want to store 1-int & 2-Double : ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Enter the int variable to store for further use :");
            input = sc.nextInt();
        } else {
            System.out.println("Enter the double variable to store for further use : ");
            double doubleInput = sc.nextDouble();
        }
        a = sc.nextDouble();
        b = sc.nextDouble();
        store = a + input;
        System.out.println(" Here is the your Stored value : ");


        return (int) store;
    }

    int recall() {

        double store = 0;
        int input = 0;
        System.out.println(" Which kind of value/calculation do you want to recall/Recover the number 1-int & 2-Double : ");
        int n = sc.nextInt();
        if (n == 1) {
            System.out.println("Enter the int variable to recall :");
            input = sc.nextInt();
        } else {
            System.out.println("Enter the double variable to recall : ");
            double doubleInput = sc.nextDouble();
        }
        a = sc.nextDouble();
        store = a + input;
        System.out.println(" Here is the your recovered value : ");
        return (int) store;
    }



        int d2b() {
            System.out.println("Enter the number : ");
            int binary =0 , rem, i = 1;
            int num = sc.nextInt();
            while (num != 0) {
                rem = num % 2;
                binary += i * rem;
                num = num / 2;
                i = i * 10;
                System.out.println("Binary : ");

            }
            return binary;
        }
        int b2d () {

            int lastDigit, decimal = 0, i = 0;
            System.out.println("Enter a Binary");
            int binary = sc.nextInt();
            while (binary > 0) {
                lastDigit = binary % 10;
                decimal += Math.pow(2, i) * lastDigit;
                binary = binary / 10;
                i++;
                System.out.println("Decimal : ");

            }
            return decimal;
        }
        int SIP()
        {
            System.out.print("Enter present value: ");
            double p=sc.nextInt();
            System.out.print("Enter the interest rate: ");
            double r=sc.nextInt();
            System.out.print("Enter the time period in years: ");
            double y=sc.nextInt();
            double f=p*Math.pow((1+r/100),y);
            System.out.print("value is: ");
            return (int) f;
        }

        public static void main (String[]args){
            try {
                PrintStream myConsole = new PrintStream(new File("Calculations history.txt"));
                System.out.println(" ");
                System.out.println("Which of the following operations do you want to execute?");
                System.out.print("1: Addition(+)");
                System.out.print("  ");
                System.out.println("2: Subtraction(-)");
                System.out.print("3: Multiplication(*)");
                System.out.print("  ");
                System.out.println("4: Division(/)");
                System.out.print("5: Power(^)");
                System.out.print("  ");
                System.out.println("6: Square Root(Sqrt");
                System.out.print("7: nth root(Nrt)");
                System.out.print("  ");
                System.out.println("8: Logarithmic value(log)");
                System.out.print("9: Natural Log(logn)");
                System.out.print("  ");
                System.out.println("10: Inverse sine(sin)");
                System.out.print("11: Cosine(cos)");
                System.out.print("  ");
                System.out.println("12: Inverse sine(isin)");
                System.out.print("13: Inverse cosine(icos)");
                System.out.print("  ");
                System.out.println("14: Tangent(tan)");
                System.out.print("15: Inverse tan(itan)");
                System.out.print("  ");
                System.out.println("16: Later(stor)");
                System.out.print("17: Recover the number(recall)");
                System.out.print("  ");
                System.out.println("18: Decimal to  Binary(d2b)");
                System.out.print("19: Binary to Decimal(b2d)");
                System.out.print("  ");
                System.out.println("20: Calculation of monthly,quarterly,yearlySIP(sip) ");
                System.out.println(" ");
                System.out.println("Enter the Number : ");


                Scanner sc = new Scanner(System.in);
                ScientificCalculator obj = new ScientificCalculator();
                int ans = 0;
                double choice = sc.nextDouble();
                switch ((int) choice) {
                    case 1:
                        ans = obj.Addition();
                        break;
                    case 2:
                        ans = obj.Subtraction();
                        break;
                    case 3:
                        ans = obj.Multiplication();
                        break;
                    case 4:
                        ans = obj.Division();
                        break;
                    case 5:
                        ans = obj.Power();
                        break;
                    case 6:
                        ans = obj.SquareRoot();
                        break;
                    case 7:
                        ans = obj.nthRoot();
                        break;
                    case 8:
                        ans = obj.LogarithmicValue();
                        break;
                    case 9:
                        ans = obj.NaturalLog();
                        break;
                    case 10:
                        ans = obj.Sine();
                        break;
                    case 11:
                        ans = obj.InverseSin();
                        break;
                    case 12:
                        ans = obj.Cosine();
                        break;
                    case 13:
                        ans = obj.InverseCos();
                        break;
                    case 14:
                        ans = obj.Tangent();
                        break;
                    case 15:
                        ans = obj.InverseTan();
                        break;
                    case 16:
                        ans = obj.stor();
                        break;
                    case 17:
                        ans = obj.recall();
                        break;
                    case 18:
                        ans = obj.d2b();
                        break;
                    case 19:
                        ans = (obj.b2d());
                        break;
                    case 20:
                        ans = obj.SIP();
                    default:
                        System.out.println("Invalid");
                        break;
                }
                System.out.println("Answer = " + ans);
            }
            catch(FileNotFoundException fx) {
                System.out.println(fx);

            }
        }
}
