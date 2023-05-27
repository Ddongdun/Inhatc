using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week12ClassB
{
    internal class Dog : Animal
    //애니멀 클래스를 상속
    {
        public void Bark()
        //우는소리 메소드
        {
            Console.WriteLine("멍멍");
            //출력
        }
    }
}
