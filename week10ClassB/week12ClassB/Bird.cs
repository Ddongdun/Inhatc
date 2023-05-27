using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week12ClassB
{
    internal class Bird : Animal, IFlyable
    //클래스와 인터페이스를 상속받는다
    //클래스는 단일상속만 가능하지만 인터페이스는 ,로 여러개를 받을 수 있음
    {
        public void Twitter()
        //우는소리 메소드
        {
            Console.WriteLine("짹짹");
            //출력
        }

        public void Fly()
        //이륙 메소드
        {
            Console.WriteLine("푸드득");
            //출력
        }

        public void Landing()
        //착륙 메소드
        {
            Console.WriteLine("나뭇가지에 앉았다.");
            //출력
        }
        //인터페이스의 모든 메소드 재정의
    }
}
