using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week12ClassB
{
    internal interface IFlyable
    //인터페이스에서는 메소드 이름만 선언
    {
        void Fly();
        //이륙 메소드

        void Landing();
        //착륙 메소드
    }
}
