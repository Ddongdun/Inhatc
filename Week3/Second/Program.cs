using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Second
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //int number = int.Parse(Console.ReadLine());
            //int.Parse로 정수로 받아들인다.

            int number;
            string input = Console.ReadLine();
            bool result = int.TryParse(input, out number);

            if(result == false) {
                return;
                //메소드 종료, 호출한 곳으로 돌아감
            }
            //if
            if(number > 0) {
                Console.WriteLine("1. 양수");
            }

            //if -else
            if (number > 0) {
                Console.WriteLine("1. 양수");
            } else {
                Console.WriteLine("2. 양수 아님");
            }

            //if-else if-else
            if (number > 0) {
                Console.WriteLine("3. 양수");
            } else if (number < 0) {
                Console.WriteLine("3. 음수");
            } else {
                Console.WriteLine("3. Zero");
            }

            //nested if
            if (number > 0) {
                Console.WriteLine("4. 양수");
                if(number % 2 == 0) {
                    Console.WriteLine("4. 짝수");
                }
            } else if (number < 0) {
                Console.WriteLine("4. 음수");
            } else {
                Console.WriteLine("4. Zero");
            }
        }
    }
}
