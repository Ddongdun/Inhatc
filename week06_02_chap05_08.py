import random

class Node:
    def __init__(self):
        self.data = None
        self.link = None


def print_nodes(start):
    current = start
    if current is None:
        return

    print(current.data, end=' ')
    while current.link is not start:  
    #마지막이 아닐 때 까지
        current = current.link  
        # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def count_odd_even() -> tuple:
    """
    원형 연결 리스트의 원소를 조사하여 홀수와 짝수의 개수를 세는 함수
    :return (홀수 갯수, 짝수 갯수)
    """
    global head, current, pre
    #전역 변수 선언
    odd, even = 0, 0
    #홀수와 짝수의 갯수를 담을 변수
    current = head
    #처음부터
    while True:
        if current.data % 2 == 0:
        #짝수라면
            even = even + 1
            #짝수 변수를 하나 늘림
        else:
        #홀수라면
            odd = odd + 1
            #홀수 변수를 하나 늘림
        if current.link is head:
        #마지막 노드라면
            break
            #탈출
        current = current.link
        #다음 노드 지정
    return odd, even
    #개수환반환

def make_minus_number(odd, even):
    """
    홀짝 개수 중 많은 쪽의 원소 값을 음수로 변환하는 함수
    :param odd: 홀수 갯수
    :param even: 짝수 갯수
    :return:
    """
    if odd > even:
    #홀수가 더 많다면
        remainder = 1
        #홀수가 더 많다고 알려줌
    else:
    #짝수가 더 많다면
        remainder = 0
        #짝수가 더 많다고 알려줌
    current = head
    #처음부터
    while True:
    #무한반복
        if current.data % 2 == remainder:
        #짝수라면
            current.data *= -1
            #음수로 바꿔준다
        if current.link == head:
        #마지막이라면
            break;
            #탈출
        current = current.link
        #다음 노드 지정
head, current, pre = None, None, None
data_array = [random.randint(1, 100) for _  in range(7)]
#랜덤 숫자를 배열에다담는다

if __name__ == "__main__":
    node = Node()
    node.data = data_array[0]
    head = node
    node.link = head


    #for data in data_array[1:]:
    for i in range(1, len(data_array)):
    #for문 형식
    #i = 1
    #while i < len(data_array):
    #while문 형식
        # data 만큼 data_array의 1번 항목부터 반복
        pre = node
        node = Node()
        node.data = data_array[i]
        pre.link = node
        node.link = head

    print_nodes(head)
    o, e = count_odd_even()
    print(o, e)
    make_minus_number(o, e)
    print_nodes(head)
    '''
    다현 정현 쯔위 사나 지효 
    화사 다현 정현 쯔위 사나 지효
    화사 다현 정현 쯔위 솔라 사나 지효
    화사 다현 정현 쯔위 솔라 사나 지효 문별
    '''



    #delete_nodes("다현")
    #print_nodes(head)

    #delete_nodes("쯔위")
    #print_nodes(head)

    #delete_nodes("지효")
    #print_nodes(head)
