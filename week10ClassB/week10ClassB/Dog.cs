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
    internal class Dog : Animal
    //Animal 클래스를 상속받는다
    {
        public Dog(string name, int age) 
            : base(name, age)
        //Animal클래스를 상속받아 생성자를 선언
        {
            base.Name = name;
            //부모의 이름을 가져온다
            this.Age = age;
            //자신의 나이를 가져온다
        }

        public void Bark()
        //강아지가 우는 메소드
        {
            Console.WriteLine(this.Name + " 멍멍"); //property
            //Console.WriteLine(this.name + " 멍멍"); //private var
            //private : 상속받아도 접근 할 수 없음
            Console.WriteLine(this.Age + " 멍멍");  //public property
            Console.WriteLine(this.age + " 멍멍");  //protected var
        }

        public override void Sleep()
        //추상메소드 오버라이드
        {
            Console.WriteLine("웅크리고 자요");
            //출력
        }
    }
}
