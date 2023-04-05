using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Third
{
    //alt + 방향키
    //ctrl + k + f
    internal class Program
    {
        static void Main(string[] args)
        {
            while (true)
            {
                string input = Console.ReadLine();
                //값을 입력받는다
                switch (input)
                {
                    //input값에 의한 스위치 케이스 문
                    case "Y":
                    case "y":
                        //값이 Y일때
                        Console.WriteLine("Yes");
                        //Yes 출력
                        break;
                    //탈출
                    case "N":
                    case "n":
                        //값이 N일때
                        Console.WriteLine("No");
                        //No 출력
                        //break;
                        goto EXIT;
                    //탈출
                    default:
                        //이외의 값 일떄
                        Console.WriteLine("Unknown");
                        //Unknown 출력
                        break;
                        //탈출
                }
            }
            EXIT:
            return;
        }
    }
}
