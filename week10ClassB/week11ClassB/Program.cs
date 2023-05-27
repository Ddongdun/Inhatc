using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week11ClassB
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Child child = new Child();
            //차일드 생성자 선언
            child.GetMyName();
            //차일드 이름 출력
            child.GetMyAge();
            //차일드 나이 출력

            Parent parent = (Parent)child;
            //parent를 child로 형변환
            parent.GetMyName();
            //부모 이름 출력
            parent.GetMyAge();
            //자식 나이 출력
            //자식 클래스에서 오버라이드 했으므로 자식의 나이가 출력됨

            Console.WriteLine(parent);
        }
    }
}
