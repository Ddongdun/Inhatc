using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace week9
{
    internal class Rectangle
    {
        const int MAX_SIZE = 40;
        //class로 만든 타입 = 참조형
        //최대 사이즈 40 설정
        Point point = null;
        //struct로 만든 타입 = 값형
        //초기 좌표값은 널값 설정
        int width = 0;
        //길이
        int height = 0;
        /이높이

        public Rectangle(int x, int y, int width, int height)
            :this(new Point(x, y), width, height)
        {
            //아래 문장만 적고 실행하면 에러가 날 수 있음
            //point.SetX(x);
            //point.SetY(y);

            //this.point = new Point(x, y);
            //this.width = width;
            //this.height = height;
        }

        public Rectangle(Point point, int width, int height)
        //생성자 선언
        {
            this.point = point;
            //자기자신의 포인트 값을 넣어준다
            if (width > MAX_SIZE)
            //길이가 최대값을 넘어가면
            {
                this.width = MAX_SIZE;
                //최대값으로 설정
            }
            else if (width < 1)
            //길이가 음수라면
            {
                this.width = 1;
                //1로 설정
            }
            else
            //1이상 40미만이라면
            {
                this.width = width;
                //그대로 넣어준다
                
            }

            if (height > MAX_SIZE)
            //높이가 최대값보다 크다면
            {
                this.height = MAX_SIZE;
                //최대값으로 설정
            }
            else if (height < 1)
            //높이가 음수라면
            {
                this.height = 1;
                //1로 설정
            }
            else
            //1이상 40미만이라면
            {
                this.height = height;
                //그대로 넣어준다
            }
            this.width = width;
            //자기 자신의 길이를 넣는다
            this.height = height;
            //자기 자신의 높이를 넣는다
        }

        public int GetWidth()
        //길이 가져오는 getter
        {
            return this.width;
            //길이 값 반환
        }

        public int GetHeight()
        //높이 가져오는 getter
        {
            return this.height;
            //높이 값 반환
        }

        public int GetX()
        //x좌표 값 가져오는 getter
        {
            //return this.point.GetX();
            return this.point.X;
            //프로퍼티 getter 사용
        }

        public int GetY()
        //y좌표 값 가져오는 getter
        {
            return this.point.GetY();
            //프로퍼티 getter 사용
        }

        public void MoveX(int offset)
        //x좌표를 움직이는 함수
        {
            this.point.AddX(offset);
            //offset값 만큼 이동
        }

        public void MoveY(int offset)
        //y좌표를 움직이는 함수
        {
            this.point.AddY(offset);
            //offset값 만큼 이동
        }
    }
}
