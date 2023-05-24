using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week9
{
    internal class Point
    {
        int x = 0;
        int y = 0;

        public Point(int x, int y)
        {
            this.x = x;
            this.y = y;
        }

        //public void SetX(int x)
        ////x값 초기화
        //{
        //    this.x = x;
        //}
        //
        //public int GetX()
        ////x값 가져오기
        //{
        //    return this.x;
        //}

        public int X
        //property 속성
        {
            get { return this.x; }
            //getter
            set { this.x = value; }
            //setter
        }

        public void SetY(int y)
        //y값 초기화
        {
            this.y = y;
        }

        public int GetY()
        //y값 가져오기
        {
            return this.y;
        }
        public void AddX(int offset)
        //물체의 x좌표 움직이기
        {
            this.x += offset;
        }

        public void AddY(int offset)
        //물체의 y좌표 움직이기
        {
            this.y += offset;
        }

        public void AddXY(int xOffset, int yOffset)
        //xy 묶은 함수
        {
            this.x += xOffset;
            this.y += yOffset;
        }

        public void AddXY(Point pOffset)
        //포인트의 xy값
        {
            this.x += pOffset.GetX();
            this.y += pOffset.GetY();
        }
    }


}
