using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    internal class BankSystem
    {
        static List<Account> accounts = new List<Account>();
        //계좌를 저장할 리스트를 인스턴스로 선언
        static void Main(string[] args)
        {
            for(int i = 0; i < 2; i++)
            //계좌 신규 개설
            {
                var name = Console.ReadLine();
                //이름 입력받기
                var amount = Console.ReadLine();
                //금액 입력받기

                Account acc;
                //계좌 생성
                if (string.IsNullOrEmpty(amount))
                //입금액이 없다면
                {
                    acc = new Account(name);
                    //이름만 넣어서 계좌 생성
                }
                else
                {
                    long initmoney = 0;
                    //계좌 잔액
                    if(long.TryParse(amount, out initmoney))
                    //long 타입으로 형변환이 잘 되었다면
                    {
                        acc = new Account(name, initmoney);
                        //이름과 잔액을 넣어서 계좌 생성
                    } else
                      //안되었다면
                    {
                        acc = new Account(name);
                        //이름만 넣어서 계좌 생성
                    }
                }
                accounts.Add(acc);
                //리스트에 만든 계좌 추가
            }

            Console.ReadLine();

            if (accounts[0].Deposit(1000000))
            //0번째 계좌에 입금
            {
                Console.WriteLine("입금성공");
                Console.WriteLine(accounts[0].Info());
            }

            Console.ReadLine();

            if (accounts[1].Withdraw(1000000))
            //1번째 계좌에서 출금
            {
                Console.WriteLine("출금성공");
            }
            else
            {
                Console.WriteLine("출금실패");
                Console.WriteLine($"잔액부족:{accounts[1].GetBalance()}");
            }

            Console.ReadLine();

            foreach(var acc in accounts)
            //계좌 수 만큼 반복
            {
                Console.WriteLine(acc.Info());
                //계좌 정보 출력
            }
        }
    }
}
