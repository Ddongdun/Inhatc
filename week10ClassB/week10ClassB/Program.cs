using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using week10ClassB;

namespace week10ClassB
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Dog dog = new Dog("개", 1);
            //Dog 클래스 생성자 선언
            dog.AddAge();
            //Animal클래스에서 상속받은 AddAge메소드를 실행
            dog.Bark();
            //Dog 클래스의 Bark메소드 실행
            //dog.Name = "개";
            //dog.Age = 1;
            

            Cat cat = new Cat("고니", 1);
            //Cat 클래스 생성자 선언
            cat.AddAge();
            //Animal클래스에서 상속받은 AddAge메소드를 실행
            cat.Meow();
            //Cat 클래스의 Meow메소드 실행
            //cat.Name = "고니";
            //cat.Age = 3;
            

            Animal animal = new Animal("뱀", 5);
            //추상 클래스는 선언 불가
            animal.AddAge();
            //애니멀 클래스의 AddAge 메소드 실행

            Console.WriteLine(dog.Age);
            //Dog의 나이 출력
            Console.WriteLine(cat.Age);
            //Cat의 나이 출력

            List<Dog> dList = new List<Dog>();
            List<Cat> cList = new List<Cat>();
            List<Animal> aList = new List<Animal>();
            dList.Add(dog);
            dList.Add(cat);
            //Dog에 Cat을 Add할 수 없다
            dList.Add(animal);
            //Dog에 Animal을 Add할 수 없다

            cList.Add(dog);
            //Cat에 Dog를 Add할 수 없다
            cList.Add(cat);
            cList.Add(animal);
            //Cat에 Animal을 Add할 수 없다

            aList.Add(dog);
            aList.Add(cat);
            aList.Add(animal);

            foreach(var a in aList)
            //foreach문
            {
                a.AddAge();
                //나이를 더하는 메소드 실행

                //type1 -> is
                if(a is Dog)
                //a가 Dog 라면
                    ((Dog)a).Bark();
                    //Dog로 형변환 후 메소드 실행

                //type2 -> as
                Cat c = a as Cat;
                //as로 cat형변환
                if (c != null)
                //as는 형 변환에 실패하면 null값 
                //형 변환에 성공하면
                    c.Meow();
                    //메소드 실행
            }


        }
    }
}
