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
        Point point = null;
        //struct로 만든 타입 = 값형
        int width = 0;
        int height = 0;

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
        {
            this.point = point;
            if (width > MAX_SIZE)
            {
                this.width = MAX_SIZE;
            }
            else if (width < 1)
            {
                this.width = 1;
            }
            else
            {
                this.width = width;
            }

            if (height > MAX_SIZE)
            {
                this.height = MAX_SIZE;
            }
            else if (height < 1)
            {
                this.height = 1;
            }
            else
            {
                this.height = height;
            }
            this.width = width;
            this.height = height;
        }

        public int GetWidth()
        {
            return this.width;
        }

        public int GetHeight()
        {
            return this.height;
        }

        public int GetX()
        {
            //return this.point.GetX();
            return this.point.X;
            //프로퍼티 getter 사용
        }

        public int GetY()
        {
            return this.point.GetY();
        }

        public void MoveX(int offset)
        {
            this.point.AddX(offset);
        }

        public void MoveY(int offset)
        {
            this.point.AddY(offset);
        }
    }
}
