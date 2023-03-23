using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace First
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //클래스(구조체)이름으로 호출하는 메소드
            int a1 = int.Parse("10");
            //int a1 = 10;

            //클래스(구조체) 값(인스턴스)가 호출하는 메소드
            string a2 = a1.ToString();
            //string a2 = "10";

            //x.Parse()나 y.ToString()은 값을 만드는 것(변경하지 않는다)
        }
    }
}
