using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Fourth
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //배열의 가장 큰 특징:고정길이
            //배열의 데이터 구성 특징 - 연속적인 할당

            //C언어 스타일 배열
            //int arr[3];

            //C# 스타일
            int[] arr;
            //int형 배열을 참조할 arr변수
            arr = new int[4];
            //int형 3개가 들어갈 배열을 힙에 만듬
            //해당 배열 참조정보를 arr에 복사

            for (int i = 0; i < arr.Length; i++)
            //배열의 길이만큼 포문을 반복
            {
                arr[i] = int.Parse(Console.ReadLine());
                //i를 하나씩 증가 시키면서 배열에 집어넣는다
            }
            for (int i = 0; i < arr.Length; i++)
            //배열의 길이만큼 포문을 반복
            {
                Console.WriteLine(arr[i]);
                //i를 하나씩 증가 시키면서 배열에 집어넣는다
            }

            foreach (int data in arr)
            {
                //data를 arr크기만큼 반복
                Console.WriteLine(data);
            }

            string[] names = { "김", "인", "하" };
            foreach (var data in names)
            {
                //names의 크기만큼 반복
                //data는 변수타입에 맞게 바꿔주어야 한다
                Console.WriteLine(names);
            }

            string test = "  abc   ";
            //p.181
            Console.WriteLine(test.ToUpper());
            //대문자 변환
            Console.WriteLine(test.ToLower());
            //소문자 변환

            //p.182
            var datas = test.Split(new char[] { 'B' });
            //foreach로 확인해보기

            //p.183
            Console.WriteLine("|" + test.Trim() + "|");
            //공백제거

            //p.184
            Console.WriteLine(string.Join(",", datas));
            //배열 사이사이에 ,를 넣는다
        }
    }
}
