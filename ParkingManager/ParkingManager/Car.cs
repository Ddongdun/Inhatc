using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;
using System.Xml.Schema;

namespace ParkingManager
{
    internal class Car
    {
        //public을 전부 지우면 private로 자동 할당 된다.
        //public static const int TurningTime = 10; 
        //회차시간
        //public static const int PricePerMin = 1000; 
        //class 변수
        //class 안의 변수에 const를 붙이면 static까지 가지게 된다
        public const int TurningTime = 10;
        public const int PricePerMin = 1000;

        private string CarNumber; 
        //instance 변수
        private DateTime InTime; 
        //instance 변수
        private DateTime OutTime; 
        //instance 변수
        //private 변수의 getter() - 변수값 조회 setter() - 변수값 설정

        public string GetCarNumber()
        //CarNumber의 getter()
        {
            return this.CarNumber;
            //CarNumber 반환
        }
        
        public DateTime GetInTime()
        //입차시간의 getter()
        {
            return this.InTime;
            //InTime 반환
        }

        public int Out()
        //시간 계산하는 메소드
        {
            this.OutTime = DateTime.Now;
            //OutTime에 현재시간을 넣는다
            return (int)(OutTime - InTime).TotalMinutes;
            //시간 계산해서 int형으로 반환
        }

        public string Info(int emptyLot)
        //주차차량 정보 출력
        {
            string result = $"차량번호 : {CarNumber}";
            //차량번호 출력
            result += Environment.NewLine;
            //줄바꿈
            result += $"입차시간 : {InTime}";
            //입차시간 출력
            result += Environment.NewLine;
            //줄바꿈
            result += $"주차구역 : {emptyLot}";
            //주차구역 출력
            result += Environment.NewLine;
            //출력

            return result;
            //결과 값 반환
        }

        //InTime의 getter()

        //기본생성자
        //생성자가 하나도 없으면 컴파일러가 아래 생성자를 만들어준다.
        //단, 하나라도 사용자가 직접 만든 생성자가 있다면 컴파일러는 관여하지 않는다.
        public Car()
        {

        }

        public Car(String number)
        //자동차 번호가 매개변수인 생성자
            : this(number, DateTime.Now)
            //밑 생성자로 이동해서 값을 넘겨주는 this
        {
            //this.CarNumber = number;
            //this.InTime = DateTime.Now;
        }
        public Car(string number, DateTime intime)
        //차 번호와 입차 시간이 매개변수인 생성자
        //위 생성자에서 this로 값을 받아온다
        {
            this.CarNumber = number;
            //차량 번호 저장
            this.InTime = intime;
            //입차 시간 저장
        }
    }
}
