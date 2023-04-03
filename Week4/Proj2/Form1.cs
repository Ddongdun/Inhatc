using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Runtime.InteropServices;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Proj2
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }



        private void lblResult_Click(object sender, EventArgs e)
        {

        }

        private void btnPrint_Click(object sender, EventArgs e)
        {
            //1. tbxAge의 Text 가져오기
            //2. 가져온 값에 +1 실행
            //3. 변경한 값 lblResult의 Text로 넣기

            //var age = tbxAge.Text + 1;
            //lblResult.Text = age;

            int age;
            bool result = int.TryParse(tbxAge.Text, out age);
            if(result)
            {
                lblResult.Text = (age + 1).ToString();
            }
            else
            {
                lblResult.Text = "형식이 안맞음";
            }

        }

        private void tbxAge_TextChanged(object sender, EventArgs e)
        {

        }
    }
}
