using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week5_Homework
{
    public partial class Form1 : Form
    {
        char[] Colon = null;
        //배열 선언
        public Form1()
        {
            InitializeComponent();
            Colon = new char[] { ',', '/', '-', '.' };
            //배열에 값을 집어넣는다
        }

        private void Btn_result_Click(object sender, EventArgs e)
        {
            int age;
            //더블 형태로 변환해서 담을 변수
            string result = $"이름 : {txt_name.Text}";
            //이름 출력
            result += Environment.NewLine;
            //줄바꿈
            result += $"학번 : {txt_code.Text}";
            //학번 출력
            result += Environment.NewLine;
            //줄바꿈
            bool result_age = int.TryParse(txt_age.Text, out age);
            if (result_age)
            //더블 형식으로 변환이 가능하다면
            {
                result += $"내년 나이 : {int.Parse(txt_age.Text) + 1}";
                //레이블의 텍스트에 결과값을 집어넣는다
            }
            else
            {
                Lab_result.Text = "형식이 안맞음";
            }
            string[] Sub_split = txt_sub.Text.Split(Colon);
            //스플릿 결과를 배열에 저장
            result += Environment.NewLine;
            //줄바꿈
            result += "수강 과목";
            result += Environment.NewLine;
            //줄바꿈
            for (int i = 0; i < Sub_split.Length; i++)
            //배열을 출력하기 위해 배열의 길이만큼 반복
            {
                result += Sub_split[i];
                //배열에 저장된 결과를 출력문에 하나씩 넣는다
                result += Environment.NewLine;
                //줄바꿈
            }
            

            Lab_result.Text = result;
            //레이블에 결과 값 출력
        }

        
    }
}
