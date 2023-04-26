using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Bank
{
    internal class Account
    {
        private static int AccountCount = 0;
        //계좌 개설 개수, 이를 이용해 자동 계좌번호 생성
        private string AccountNumber;
        //계좌번호
        private string Owner;
        //소유자
        private long Balance;
        //잔액

        public string GetAccountNumber()
        //계좌번호 가져오는 메소드
        {
            return this.AccountNumber;
            //계좌번호 반환
        }

        public string GetOwner()
        //소유자 이름 가져오는 메소드
        {
            return this.Owner;
            //소유자 이름 반환
        }

        public void SetOwner(string name)
        //소유자 이름 변경하는 메소드
        {
            this.Owner = name;
            //변경된 소유자 이름 반환
        }

        public long GetBalance()
        //계좌 잔액 가져오는 메소드
        {
            return this.Balance;
            //계좌 잔액 반환
        }

        public bool Deposit(long amount)
        //입금 메소드
        {
            this.Balance += amount;
            //계좌 잔액에 입금할 금액을 더한다
            return true;
            //입금 성공
        }

        public bool Withdraw(long amount)
        //출금 메소드
        {
            if(this.Balance < amount)
            //계좌 잔액이 출금할 금액보다 적다면
            {
                return false;
                //출금 실패
            }
            this.Balance -= amount;
            //계좌에서 출금한다
            return true;
            //출금 성공
        }

        public Account(string name)
        {
            AccountCount++;
            this.AccountNumber = AccountCount.ToString("000000");
            this.Owner = name;
            //this.Balance = 0;
        }
        public Account(string name, long amount)
            : this(name)
        {
            //AccountCount++;
            //this.AccountNumber = AccountCount.ToString("000000");
            //this.Owner = name;
            //this.Balance = 0;
        }

        public string Info()
        {
            string result = $"계좌번호: {AccountNumber}";
            result += Environment.NewLine;
            result += $"소유주: {Owner}";
            result += Environment.NewLine;
            result += $"잔액: {Balance}";
            result += Environment.NewLine;
            return result;
        }
    }
}
