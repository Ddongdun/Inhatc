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


def checkBracket(expr):
#괄호 체크 함수
    for ch in expr:
    #expr만큼 ch를 반복
        if ch in '([{<':
        #ch가 여는괄호라면
            push(ch)
            #여는 괄호를 스택에 넣는다
        elif ch in ')]}>':
        #ch가 닫는 괄호라면
            out = pop()
            #팝 함수의 결과(여는 괄호)를 out에 저장
            if ch == ')' and out == '(':
            #여는 괄호와 닫는 괄호의 짝이 맞다면
                pass
                #패스
            elif ch == ']' and out == '[':
                pass
            elif ch == '}' and out == '{':
                pass
            elif ch == '>' and out == '<':
                pass
            else:
            #그렇지 않다면
                return False
                #False 반환
        else:
        #괄호가 아니라면
            pass
            #패스
    if is_stack_empty():
    #스택이 비어있다면
        return True
        #True 반환
    else:
    #비어있지않다면
        return False
        #False 반환


## 전역 변수 선언 부분 ##
SIZE = 100
#사이즈 100 지정
stack = [None for _ in range(SIZE)]
#스택 배열 선언
top = -1
#탑 초기값 지정

## 메인 코드 부분 ##
if __name__ == "__main__":

    exprAry = ['(A+B)', ')A+B(', '((A+B)-C', '(A+B]', '(<A+{B-C}/[C*D]>)']
    #스택에 저장할 데이터 배열

    for expr in exprAry:
    #배열만큼 반복
        top = -1
        #탑 값을 초기화 시켜준다
        print(expr, '==>', checkBracket(expr))
        #괄호 체크 함수의 결과값 출력
