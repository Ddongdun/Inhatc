def func1():
    #전역 변수 a 선언
    global a
    a = 10
    print("func1()에서 a값 %d" % a)

def func2():
    print("func2()에서 a값 %d" % a)

#func1()에서 a를 글로벌로 선언해 지역 변수로 존재 할 수 없음
a = 20

func1()
func2()
'''
func1()에서 a값 10
func2()에서 a값 10
'''