using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Week4_homework
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void btn_plus_Click(object sender, EventArgs e)
        {
            double NumbP_1;
            //피연산자1을 담을 변수
            double NumbP_2;
            //피연산자2를 담을 변수
            bool result1 = double.TryParse(Num1.Text, out NumbP_1);
            //TryParse로 변환할수있는지 체크
            bool result2 = double.TryParse(Num2.Text, out NumbP_2);
            //TryParse로 변환할수있는지 체크
            if (result1 && result2)
            //두개의 피연산자 모두 변환할 수 있다면
            {
                label_result.Text = (NumbP_1 + NumbP_2).ToString();
                //레이블의 텍스트에 결과값을 집어넣는다
            }
            else
            //그렇지 않다면
            {
                label_result.Text = "형식이 안맞음";
                //형식이 맞이 않음을 알려준다
            }

        }

        private void Num1_TextChanged(object sender, EventArgs e)
        {

        }

        private void Num2_TextChanged(object sender, EventArgs e)
        {

        }

        private void label_result_Click(object sender, EventArgs e)
        {

        }

        private void btn_minus_Click(object sender, EventArgs e)
        {
            double NumbM_1;
            //피연산자1을 담을 변수
            double NumbM_2;
            //피연산자2를 담을 변수
            bool result1 = double.TryParse(Num1.Text, out NumbM_1);
            //TryParse로 변환할수있는지 체크
            bool result2 = double.TryParse(Num2.Text, out NumbM_2);
            //TryParse로 변환할수있는지 체크
            if (result1 && result2)
            //두개의 피연산자 모두 변환할 수 있다면
            {
                label_result.Text = (NumbM_1 - NumbM_2).ToString();
                //레이블의 텍스트에 결과값을 집어넣는다
            }
            else
            //그렇지 않다면
            {
                label_result.Text = "형식이 안맞음";
                //형식이 맞이 않음을 알려준다
            }
        }

        private void btn_multiply_Click(object sender, EventArgs e)
        {
            double NumbMu_1;
            //피연산자1을 담을 변수
            double NumbMu_2;
            //피연산자2를 담을 변수
            bool result1 = double.TryParse(Num1.Text, out NumbMu_1);
            //TryParse로 변환할수있는지 체크
            bool result2 = double.TryParse(Num2.Text, out NumbMu_2);
            //TryParse로 변환할수있는지 체크
            if (result1 && result2)
            //두개의 피연산자 모두 변환할 수 있다면
            {
                label_result.Text = (NumbMu_1 * NumbMu_2).ToString();
                //레이블의 텍스트에 결과값을 집어넣는다
            }
            else
            //그렇지 않다면
            {
                label_result.Text = "형식이 안맞음";
                //형식이 맞이 않음을 알려준다
            }
        }


        private void btn_divide_Click(object sender, EventArgs e)
        {
            double NumbD_1;
            //피연산자1을 담을 변수
            double NumbD_2;
            //피연산자2를 담을 변수
            bool result1 = double.TryParse(Num1.Text, out NumbD_1);
            //TryParse로 변환할수있는지 체크
            bool result2 = double.TryParse(Num2.Text, out NumbD_2);
            //TryParse로 변환할수있는지 체크
            if (result1 && result2)
            //두개의 피연산자 모두 변환할 수 있다면
            {
                label_result.Text = (NumbD_1 / NumbD_2).ToString();
                //레이블의 텍스트에 결과값을 집어넣는다
            }
            else
            //그렇지 않다면
            {
                label_result.Text = "형식이 안맞음";
                //형식이 맞이 않음을 알려준다
            }
        }

      
    }
}
