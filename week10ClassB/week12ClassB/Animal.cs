using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week12ClassB
{
    internal class Animal
    {
        //자동구현 프로세서
        public int Weight
        //Weight 변수의 프로퍼티
        {
            get;
            set;
            //getter, setter
        }

        public void Eat()
        //밥을 먹는 메소드
        {
            Console.WriteLine("밥을 먹습니다.");
            //출력
        }

        //출력전용변수 : out vs ref
        public bool NextWeight(out int nextweight)
        //다음 무게를 나타내는 메소드
        //결과값은 out을 통해 nextweight에 저장
        {
            if(Weight <= 0)
            //무게가 0이하라면
            {
                nextweight = Weight;
                //현재무게를 넣는다
                return false;
                //false 리턴
            }

            nextweight = Weight + 1;
            //무게에 1을 더한다
            return true;
            //true 리턴
           
        }

    }
}
