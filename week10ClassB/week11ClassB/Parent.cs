using System;
using System.Collections.Generic;
using System.Diagnostics;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week11ClassB
{
    internal class Parent : Object
    //Object를 상속받는다(선언하지 않아도 기본값)
    {
        public override string ToString()
        //이름을 출력하는 메소드
        {
            return "신동준";
            //이름 출력
        }
        public void GetMyName()
        //이름을 출력하는 메소드
        {
            Console.WriteLine("부모");
            //이름 출력
        }

        public virtual void GetMyAge()
        //부모 클래스에서는 virtual을 붙여 오버라이드
        {
            Console.WriteLine("40~50대");
            //나이 출력
        }
    }
}
