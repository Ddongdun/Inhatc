using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.ComponentModel.Design;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace ParkingManager
{
    public partial class FormMain : Form
    {
        Car[] cars = null;
        //클래스 car를 인스턴스 변수 cars로 불러온다
        List<Car> carsHistory;
        //주차기록을 저장할 Car타입을 저장하는 리스트 생성
        public FormMain() //생성자(특수메소드)
        {
            InitializeComponent(); //Designer.cs의 메소드
            //아래 코드는 지역 변수 cars를 생성
            //생성자(특수메소드)의 실행이 끝나면 지역변수 cars 변수가 사라짐
            //그래서 cars를 [지역변수]가 아닌 [인스턴스변수]로 만들어야 함.
            //FormMain의 인스턴스가 있는 동안 유지할 수 있음.
            //Car[] cars = new Car[5];

            cars = new Car[5];
            //인스턴스 변수 cars에 Car 인스턴스 5개를 저장할 배열을 만들어 참조값을 복사
            carsHistory = new List<Car>();
            //주차기록을 저장할 리스트를 인스턴스 변수로 생성
        }

        private void btnEntry_Click(object sender, EventArgs e)
        {
            //1. 차량번호를 넣었는지 검사
            //모든 UI 컨트롤의 Text 속성은 string 타입
            //Type.1
            //var isEmpty = tbxCarNumber.Text == null || tbxCarNumber.Text == "";
            //자동차 번호가 비었는지 체크

            //var isEmpty = string.IsNullOrEmpty(tbxCarNumber.Text);
            //
            //if (isEmpty)
            //{
            //    MessageBox.Show("차량번호비어있음");
            //    tbxCarNumber.Focus();
            //    return; //메소드 즉시종료
            //}

            if (IsEmptyNumber())
            //위 주석 내용을 메소드로 정의 후 선언
            {
                return;
            }
            //2. 차량번호(기존 주차) 중복 검사
            int emptyLot = -1; 
            //비어있는 인덱스 넣을 변수
            for (int i = 0; i < cars.Length; i++)
            //주차장 크기만큼 반복
            {
                if (cars[i] == null)
                //차량이 있는지
                {
                    if (emptyLot == -1)
                    //주차되어있는지
                    {
                        emptyLot = i;
                        //주차되어 있는 주차칸 저장
                    }
                }
                else
                {
                    if (cars[i].GetCarNumber() == tbxCarNumber.Text) //중복검사
                    //주차칸의 차량번호와 입력된 차량번호가 같은지
                    {
                        MessageBox.Show("동일차량번호");
                        //동일한 차량이 있음을 알려줌
                        tbxCarNumber.Focus();
                        //포커스
                        return;
                    }
                } 
            }
            //3. 주차가능 구역이 있는지 없는지
            if(emptyLot == -1)
            //주차되어있는지
            {
                MessageBox.Show("만차");
                //주차칸이 없음을 알려줌
                return;
            }
            //4. 1, 2, 3 모두 통과한 경우 입차 진행위해 car인스턴스 만들고 배열에 넣는다
            Car car = new Car(tbxCarNumber.Text);
            //Car.PricePerMin = 100;
            //Car car = new Car();
            //클래스를 불러온다
            //car.CarNumber = tbxCarNumber.Text;
            //차량 번호를 출력한다
            //car.InTime = DateTime.Now;
            //입차시간을 현재시간으로 설정
            //car.OutTime = DateTime.MinValue;
            //출차시간을 인트형의 최소치로 정함 / 널값x

            //인스턴스를 알고 있는 지역변수의 참조 정보를 배열로 복사
            cars[emptyLot] = car;
            //주차되어 있는 주차칸 정보를 car에 넣는다
            //5. 입차 결과를 출력한다
            //문자열보간
            string result = $"차량번호 : {car.GetCarNumber()}";
            result += Environment.NewLine;
            result += $"입차시간 : {car.GetInTime()}";
            result += Environment.NewLine;
            result += $"주차구역 : {emptyLot}";
            result += Environment.NewLine;
            result += "입차완료";

            tbxResult.Text = result;
        }

        private void tbxResult_TextChanged(object sender, EventArgs e)
        {

        }

        private void btnExit_Click(object sender, EventArgs e)
        {
            if (IsEmptyNumber())
            //메소드 불러오기
            {
                return;
            }
            //1. 차가 있는지 검사
            int index = FindCar();
            
            if(index == -1)
            //차량이 없다면
            {
                MessageBox.Show("해당 차량 없음");
                tbxCarNumber.Focus();
                return;
            }
            //2. 현재 시간을 출차 시간으로 설정
            int termmin = cars[index].Out();
            //cars[index].OutTime = DateTime.Now;
            ////현재 출차하는 차량의 출차시간을 현재시간으로 설정
            
            //3. 출차시간-입차시간 = 주차시간
            //var termtime = cars[index].OutTime - cars[index].InTime;
            //출차하려는 자동차의 주차시간 계산
            //var termmin = termtime.TotalMinutes;
            //분 단위로 환산

            //4. 주차시간을 가지고 주차요금 계산
            var price = termmin * Car.PricePerMin;
            //주차시간과 Car클래스에 정의된 분당 요금을 계산

            //5. 결과출력
            if (termmin <= Car.TurningTime)
            //요금을 받는 최소 이용 시간보다 적게 사용했다면
            {
                tbxResult.Text = "회차";
                //요금을 받지 않고 내보내기
            }
            else
            {
                tbxResult.Text = $"{termmin}분 주차, 요금:{price}원";
                //주차시간과 요금 출력
            }
            //6. 주차칸을 비우기
            carsHistory.Add(cars[index]);
            //리스트에 index칸의 기록을 저장한다
            cars[index] = null;
            //출차한 주차칸에 null값을 넣어 초기화
            
         

        }
        private bool IsEmptyNumber()
        {
            var isEmpty = string.IsNullOrEmpty(tbxCarNumber.Text);
            //공백과 널값 체크

            if (isEmpty == true)
            //공백이거나 널값이라면
            {
                MessageBox.Show("차량번호비어있음");
                //차량번호가 비어있음을 출력
                tbxCarNumber.Focus();
                //포커스
            }

            return isEmpty;
            //결과 값 false 반환
        }

        private void btnShowDetail_Click(object sender, EventArgs e)
        //상세내역 버튼
        {
            if (IsEmptyNumber())
            //차량번호 확인하는 메소드 불러오기
            {
                return;
            }
            //1. 차가 있는지 검사
            int index = FindCar();
            //차량번호 찾는 메소드 호출

            if (index == -1)
            //차량이 없다면
            {
                MessageBox.Show("해당 차량 없음");
                tbxCarNumber.Focus();
                return;
            }

            tbxResult.Text = cars[index].Info(index);
            //차량이 있는 칸의 정보를 호출한다
        }

        private int FindCar()
        {
            int index = -1;
            //차가 있는지 결과를 저장하는 변수
            for (int i = 0; i < cars.Length; i++)
            //차량이 저장된 배열의 길이만큼 반복
            {
                if (cars[i] != null && cars[i].GetCarNumber() == tbxCarNumber.Text)
                //비어있지 않고 차량을 찾았다면
                {
                    index = i;
                    //인덱스에 차량이 주차된 주차칸 번호 저장
                    break;
                    //탈출
                }
            }
            return index;
        }
    }//class
}//namespace
