using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week12ClassB
{
    internal class Program
    {
        static void Main(string[] args)
        {
            try {
                //실행을 정상적으로 할 코드
                Dog d = new Dog();
                //Dog 생성자 선언
                Bird b = new Bird();
                //Bird 생성자 선언
                AirPlane a = new AirPlane();
                //AirPlane 생성자 선언

                List<Animal> animals = null;
                //애니멀 클래스 리스트 초기값 null

                if (animals != null)
                //애니멀 리스트의 값이 null이 아니라면
                {
                    for (int i = 0; i < animals.Count; i++)
                    //애니멀 리스트의 개수만큼 반복
                    {
                        animals[i].Eat();
                        //Eat 메소드 실행
                    }
                }
                animals = new List<Animal>();
                //리스트 변수 선언
                animals.Add(d);
                //Dog를 리스트에 담는다
                animals.Add(b);
                //Bird를 리스트에 담는다
                //animals.Add(a);

                foreach (var ani in animals)
                {
                //animals 리스트 만큼 반복
                    ani.Eat();
                    //animal 클래스의 eat 메소드 실행
                    try {
                    //정상적으로 동작할 코드
                        ((Bird)ani).Twitter();
                        //Bird로 형변환이 성공하면 Bird클래스의 Twitter 메소드 실행
                        //첫번째는 Dog이므로 실패
                    } catch(Exception bex) {
                      //실패했을 경우
                        Console.WriteLine("새가 아님");
                        //출력
                    }

                    //int temp1;
                    //ani.Weight = int.Parse(Console.ReadLine());
                    if (ani.NextWeight(out int temp1)) {
                    //입력받은 값이 없으므로 false 반환
                        Console.WriteLine("다음 무게: " + temp1);
                        //출력
                    } else {
                      //그렇지 않다면
                        Console.WriteLine("다음 무게 모름");
                        //출력
                    }

                    while (true) {
                    //무한반복
                        try {
                        //정상적으로 작동할 코드
                            ani.Weight = int.Parse(Console.ReadLine());
                            //animal 클래스의 프로퍼티를 통해 입력 받는다
                            //입력받은 값을 int형으로 변환
                            break;
                            //탈출
                        } catch(Exception fex) {
                          //실패했을 경우
                            Console.WriteLine("다시입력(y) 안할래(아무키)");
                            //y 나 아무키를 입력받는다
                            if(Console.ReadLine().Trim().ToLower() != "y"){
                            //y를 입력받지 않았다면
                                break;
                                //탈출
                            }
                        } 
                    }
                    if (ani.NextWeight(out int temp2))
                    //프로퍼티로 Weight 필드에 값이 들어와 true 반환
                    {
                        Console.WriteLine("다음 무게: " + temp2);
                        //출력
                    }
                    else
                    //그렇지 않다면
                    {
                        Console.WriteLine("다음 무게 모름");
                        //출력
                    }
                }
                //애니멀을 상속받지 않아 오류
                List<IFlyable> flyables = new List<IFlyable>();
                //flyables.Add(d);
                //flyable을 상속받지 않아 오류
                flyables.Add(b);
                //리스트에 bird 추가
                flyables.Add(a);
                //리스트에 airplane 추가
                foreach (var fly in flyables)
                //리스트 개수 만큼 반복
                {
                    fly.Fly();
                    //이륙 메소드 실행
                    fly.Landing();
                    //착륙 메소드 실행
                }

            } catch (NullReferenceException ex) {
                Console.WriteLine("null입니다");
            } catch (Exception ex){
                //실행중 예외가 발생할 때 처리할 코드
                Console.WriteLine("관리자에게 문의");
                Console.WriteLine(ex.ToString());
            } finally {
              //무조건 실행하는 코드
                Console.WriteLine("헤어져야할시간");
            }
        }
    }
}
