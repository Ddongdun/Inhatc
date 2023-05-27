using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using week10ClassB;

namespace week10ClassB
{
    /// <summary>
    /// Animal의 derived 클래스(파생 클래스)
    /// </summary>
    internal class Cat : Animal
    //Animal 클래스를 상속 받는다
    {
        public Cat(string name, int age)
            :base(name, age)
        //animal클래스를 상속받아 생성자 선언
        {
            base.Name = name;
            //부모의 이름을 가져온다
            this.Age = age;
            //자신의 나이를 가져온다
        }

        public void Meow()
        //고양이가 우는 메소드
        {
            Console.WriteLine(this.Name + " 냥");
            //출력
        }

        public override void Sleep()
        //부모클래스에서 정의한 추상메소드를 오버라이드
        {
            Console.WriteLine("잠을 잡니다");
            //출력
        }
    }
}
