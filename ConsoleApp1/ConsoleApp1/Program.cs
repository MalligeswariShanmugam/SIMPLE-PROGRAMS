using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ConsoleApp1
{
    internal class Program
    {
        static void Main()
        {

            double input1 = IsValid("Enter the input 1 ");

            double input2 = IsValid("Enter the input 2");

            Console.WriteLine("Enter the operation : add-addition, sub-subration, mul-mutiplication, div-division ");

            string oper = Console.ReadLine();


            if (oper == "add")
            {
                Console.WriteLine(input1 + input2);
            }
            else if (oper == "sub")
            {
                Console.WriteLine( input1 - input2);
            }
            else if (oper == "mul")
            {
                Console.WriteLine( input1 * input2);
            }
            else if (oper == "div")
            {

                if (input1 > input2 && input2 != 0)
                {
                    Console.WriteLine(input1 / input2);
                }
                else if (input1 < input2 && input1 != 0)
                {
                    Console.WriteLine(input2 / input1);
                }
                else
                {
                    Console.WriteLine("The divisor can't be zero");

                }

            }
            else
            {
                Console.WriteLine("Invalid operation");
            }

        }

        public static double IsValid(string message)
        {
            double result;
            Console.WriteLine(message);
            while (!double.TryParse(Console.ReadLine(), out result))
            {
                Console.WriteLine("Invalid input. Please enter a numeric value.");

            }
            return result;

        }

    }
}
