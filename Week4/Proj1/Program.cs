using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Proj1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //C#의 자료형을 두개로 분류한다면?
            //값(val) : struct
            //참조(ref) : class

            Car car; //변수선언
            car = new Car(); //new와 생성자를 이용해 인스턴스 생성
                             //생성한 참조값을 car에게 복사

            car.carNumber = 1234;
            car.SetInTime();
            //Console.WriteLine(car.inTime);

            car.SetInTime();

            car.SetOutTime();
        }
    }
}
