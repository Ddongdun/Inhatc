using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week11ClassB
{
    internal class Child : Parent
    //Parent 클래스를 상속 받는다
    {
        public new void GetMyName()
        //Parent의 이름을 출력하는 메소드 오버라이드
        {
            Console.WriteLine("자식");
            //자식 이름 출력
        }       

        public override void GetMyAge()
        //자식 클래스에서는 override 키워드를 붙인다
        {
            Console.WriteLine("20~30대");
            //나이 출력
        }
    }
}
