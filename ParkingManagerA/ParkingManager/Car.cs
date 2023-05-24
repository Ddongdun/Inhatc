using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ParkingManager
{
    internal class Car
    {
        public static int TurningTime = 10; //회차시간:10분
        public static int PricePerMin;      //클래스 변수

        public string CarNumber; //인스턴스 변수
        public DateTime InTime;  //인스턴스 변수
        public DateTime OutTime; //인스턴스 변수
    }
}
