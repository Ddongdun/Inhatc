using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week12ClassB
{
    internal class AirPlane : IFlyable
    //인터페이스를 상속
    //인터페이스를 상속받으면 반드시 모든 메소드를 재정의해야함
    {
        public void Fly()
        //이륙 메소드
        {
            Console.WriteLine("슈웅~");
            //출력
        }

        public void Landing()
        //착륙 메소드
        {
            Console.WriteLine("활주로에 착륙 중");
            //출력
        }
        //인터페이스의 메소드들 재정의
    }
}
