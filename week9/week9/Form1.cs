using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace week9
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        Rectangle black;
        //정보
        Label blackLabel;
        //정보를 보여주는 기능

        private void btnMakeBlack_Click(object sender, EventArgs e)
        {
            var width = 30;
            //물체 기본 넓이
            var height = 40;
            //물체 기본 높이

            var x = (pnlMain.Size.Width) - (Width / 2);
            //중심좌표 x값
            var y = (pnlMain.Size.Height - height);
            //중심좌표 y값

            black = new Rectangle(x, y, width, height);
            //중심좌표에 기본 크기의 사각형 만들기

            blackLabel = new Label();
            //물체를 화면에 표시할 레이블 선언
            blackLabel.AutoSize = false;
            //사이즈를 정하기 위해 false로 선언
            blackLabel.Size = new Size(black.GetWidth(), black.GetHeight());
            //Rectangle클래스의 함수로 사이즈 지정
            blackLabel.BackColor = Color.Black;
            //검정색으로 만듬
            pnlMain.Controls.Add(blackLabel);
            //패널에 추가
            blackLabel.Location = new System.Drawing.Point(black.GetX(), black.GetY());
            //레이블 위치 지정
        }

        private void btnUp_Click(object sender, EventArgs e)
        {
            black.MoveY(-10);
            //Y값을 -10만큼 빼서 올라감
            SetBlackLocation();
            //위치 설정
        }

        private void btnDown_Click(object sender, EventArgs e)
        {
            black.MoveY(10);
            //Y값을 -10만큼 빼서 올라감
            SetBlackLocation();
            //위치 설정
        }

        private void btnLeft_Click(object sender, EventArgs e)
        {
            black.MoveX(-10);
            //Y값을 -10만큼 빼서 올라감
            if(black.GetX() < 0)
            //밖으로 나가면
            {
                black.MoveX(10);
                //다시 돌아온다
            }
            SetBlackLocation();
            //위치 설정
        }

        private void btnRight_Click(object sender, EventArgs e)
        {
            black.MoveX(10);
            //Y값을 -10만큼 빼서 올라감
            if(black.GetX() + black.GetWidth() > pnlMain.Size.Width)
            //물체의 x좌표값과 넓이를 더한 값이 패널 넓이 보다 커진다면
            {
                black.MoveX(-10);
                //다시 돌아간다
            }
            SetBlackLocation();
            //위치 설정
        }

        private void SetBlackLocation()
        //물체의 위치 바꾸는 메소드
        {
            blackLabel.Location = new System.Drawing.Point(black.GetX(), black.GetY());
            //물체의 위치가 위로 올라가게 위치 최신화
        }

        List<Rectangle> reds = new List<Rectangle>();
        //적 물체를 관리할 리스트
        List<Label> redlabels = new List<Label>();
        //적 물체를 담을 레이블의 리스트
        Random rand = new Random();
        //난수
        private void btnMakeRed_Click(object sender, EventArgs e)
        {
            var size = pnlMain.Size.Width / 5;
            //적들간의 거리
            for(int i = 0; i < 5; i ++)
            //적 5개 생성
            {
                int y = 20 + rand.Next(-2, 10);
                //적이 소환될 y좌표값
                int x = 20 + (size * i) + rand.Next(-2, 20);
                //적이 소환될 x좌표값

                Rectangle r = new Rectangle(x, y, 30, 40);
                //적 물체
                Label l = new Label();
                //적 물체의 레이블
                l.AutoSize = false;
                //사이즈 직접 지정을 위해 false
                l.Size = new Size(r.GetWidth(), r.GetHeight());
                //사이즈를 정해준다
                l.BackColor = Color.Red;
                //색 지정
                l.ForeColor = Color.White;
                //글씨색 지정
                l.Text = (i + 1).ToString();
                //적들의 번호 지정 및 표시
                l.TextAlign = ContentAlignment.MiddleCenter;
                //텍스트 위치 가운데로 지정

                pnlMain.Controls.Add(l);
                //패널에 적 레이블 추가
                l.Location = new System.Drawing.Point(x, y);
                //레이블 위치 지정
                reds.Add(r);
                //적 물체를 리스트에 추가
                redlabels.Add(l);
                //적 물체를 레이블에 추가
            }
            tmrRed.Enabled = true;
            //버튼 눌렀을 때 타이머 활성화
        }

        private void tmrRed_Tick(object sender, EventArgs e)
        {
            for(int i = 0; i < reds.Count; i++)
            //적의 수 만큼 반복
            {
                reds[i].MoveX(rand.Next(-5, 5));
                //적의 x값을 랜덤하게 움직임
                reds[i].MoveY(rand.Next(0, 14));
                //적의 y값을 랜덤하게 움직임
                redlabels[i].Location = new System.Drawing.Point(reds[i].GetX(), reds[i].GetY());
                //바꾼 위치 최신화
            }
        }
    }
}
