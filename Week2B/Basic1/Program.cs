using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Basic1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            byte iByte = 1;
            //unsigned 는 양수값만 받음
            int iInt = 10000;
            //64비트의 데이터는 받을 수 없음
            long iLong = 1l;
            //64비트에 32비트의 데이터를 넣을 수 있다
            //접미사 L을 붙이면 64비트의 데이터로 변환
            ulong uLong = 1UL;
            //unsigned Long은 UL로 지정
            int iInt2 = (int)1L;
            //64비트의 데이터를 32비트에 넣을 수 없다
            //(int)는 32비트로 잘라준다

            float f1 = 10.12345678912345f;
            //double타입을 float에 넣을 수 없다
            //접미사 f를 넣어준다
            double f2 = 10.12345678912345;
            decimal f3 = 10.12345678912345M;
            //decimal에 더블을 넣을때 접미사 M을 붙여준다

            Console.WriteLine(f1);
            Console.WriteLine(f2);
            Console.WriteLine(f3);
            /*
            10.12346
            10.1234567891235
            10.12345678912345
            */

            char c1 = 'a';
            char c2 = 'b';
            int c3 = c2;
            Console.WriteLine(sizeof(char));
            Console.WriteLine(c1 + c2);
            Console.WriteLine(c1 + 1);
            Console.WriteLine((char)(c1 + 1));
            //char c4 = 98;
            char c4 = (char)98;
            /*
             2
            195
            98
            b
             */

            bool b1 = true;
            bool b2 = false;
            //bool b3 = True;
            //대문자 입력 안됨
            //bool b4 = 1;

            string s1 = "인하";
            Console.WriteLine("김" + s1);
            Console.WriteLine(1 + s1);
            Console.WriteLine(s1 + 1.5);
            Console.WriteLine(s1[1]);
            //문자열은 배열[0]부터 들어감
            Console.WriteLine(1 + 1);
            Console.WriteLine("1" + "1");
            Console.WriteLine("1" + 1);
            //정수 + 문자 출력은 정수형을 문자형으로 바꾼다   
            /*
            김인하
            1인하
            인하1.5
            하
            2
            11
            11
            */

            var v1 = 1;
            var v2 = 2ul;
            //v2 = 3.14;
            //var로 ulong 타입을 선언했기때문에 에러
            var t1 = DateTime.Now;
            //보통 타입이 명확하지않거나 모를때 var을 사용한다
            DateTime t2 = DateTime.Now;
            Console.WriteLine(t2);

            //문자열 --> 숫자
            //숫자 --> 문자열
            int age;
            age = int.Parse(Console.ReadLine());
            //Parse로 문자형을 정수형으로 바꾼다
            Console.WriteLine(age + 1);

            //10 + 3 = "103"
            //string r1 = age + 3;
            string r2 = age.ToString() + 3.ToString();
            string r3 = age.ToString() + 3;
            string r4 = age + "3";
            string r5 = (age + 3).ToString();
        }
    }
}
