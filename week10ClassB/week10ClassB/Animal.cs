using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace week10ClassB
{
    /// <summary>
    ///  base 클래스 (기반 클래스)
    /// </summary>
    internal abstract class Animal
    //추상 클래스 선언
    {
        private string name;
        public string Name
        //name 프로퍼티
        //public의 프로퍼티는 대문자로 시작
        {
            get { return this.name; }
            set { this.name = value; }
            //프로퍼티의 getter, setter
        }
        protected int age;
        public int Age
        //age 프로퍼티
        //public의 프로퍼티는 대문자로 시작
        {
            get { return this.age; }
            set { this.age = value; }
            //프로퍼티의 getter, setter
        }
        public Animal(string name, int age)
        //매개변수 두개를 받는 생성자
        {
            this.Name = name;
            this.Age = age;
        }

        public void AddAge()
        //age에 + 1 하는 함수
        {
            this.Age++;
        }

        public abstract void Sleep();
        //추상 메소드

        //public void Bark()
        //{
        //    Console.WriteLine(this.Name + " 멍멍");
        //}

        //public void Meow()
        //{
        //    Console.WriteLine(this.Name + " 냥");
        //}
    }
    
}
