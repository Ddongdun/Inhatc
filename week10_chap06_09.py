import webbrowser
import time


## 함수 선언 부분 ##
def is_stack_full():
#스택이 꽉 찼는지 확인하는 함수
    global SIZE, stack, top
    #전역 변수 선언
    if top >= SIZE - 1:
    #탑(맨 위)가 사이즈-1보다 크거나 같다면
        return True
        #꽉 찼다고 알림
    else:
    #그렇지 않다면
        return False
        #공간이 남았다고 알림


def is_stack_empty():
#스택이 비어있는지 확인하는 함수
    global SIZE, stack, top
    #전역 변수 선언
    if top == -1:
    #탑이 -1이라면
        return True
        #비어있다고 알림
    else:
    #그렇지 않다면
        return False
        #비어있지않다고 알림


def push(data):
#데이터를 넣는 함수
    global SIZE, stack, top
    #전역 변수 선언
    if is_stack_full():
    #스택이 꽉 찼다면
        print("스택이 꽉 찼습니다.")
        #알려준다
        return None
        #넌 값 리턴
    top += 1
    #탑값을 더해준다
    stack[top] = data
    #스택의 탑 위치에 데이터 삽입


def pop():
#데이터 삭제 함수
    global SIZE, stack, top
    #전역 변수 선언
    if is_stack_empty():
    #스택이 비어있다면
        print("스택이 비었습니다.")
        #알려준다
        return None
        #넌 값 리턴
    data = stack[top]
    #스택의 탑 위치 데이터 지정
    stack[top] = None
    #데이터를 삭제한다
    top -= 1
    #이전 층을 탑으로 지정
    return data
    #데이터 반환


def peek():
#데이터 추출 함수
    global SIZE, stack, top
    #전역 변수 선언
    if is_stack_empty():
    #스택이 비어있다면
        print("스택이 비었습니다.")
        #알려준다
        return None
        #넌 값 리턴
    return stack[top]
    #스택의 탑 값 리턴


## 전역 변수 선언 부분 ##
SIZE = 100
#스택 사이즈 지정
stack = [None for _ in range(SIZE)]
#스택 배열 선언
top = -1
#탑의 초기값

## 메인 코드 부분 ##
if __name__ == "__main__":
    urls = ['naver.com', 'daum.net', 'nate.com']
    #스택에 넣을 데이터 배열

    for url in urls:
    #url을 urls 만큼 반복
        push(url)
        #데이터를 넣는다
        webbrowser.open('http://' + url)
        #url오픈
        print(url, end='-->')
        #오픈된 url을 알려준다
        time.sleep(1)
        #1초 딜레이

    print("방문 종료")
    #for문이 끝나면 종료
    time.sleep(5)
    #5초 딜레이

    while True:
    #무한반복
        url = pop()
        #url은 팝 함수
        if url is None:
        #url이 비어있다면
            break
            #탈출
        webbrowser.open('http://' + url)
        #url오픈
        print(url, end='-->')
        #오픈한 url을 알려준다
        time.sleep(1)
        #1초 딜레이
    print("방문 종료")
    #url이 비어있다면 종료
    time.sleep(5)
    #5초 딜레이
