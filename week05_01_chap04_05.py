class Node:
    def __init__(self):
        self.data = None
        self.link = None


def print_nodes(start):
#노드를 출력하는 함수
    current = start
    #시작 노드를 매개변수로 받는다
    if current is None:
    #노드가 비어있다면
        return
        #반환

    print(current.data, end=' ')
    #출력
    while current.link is not None:  
    # current의 링크 값이 None이 아닐때 까지
        current = current.link  
        #다음 노드로 이동
        print(current.data, end=' ')
        #출력
    print()


head, current, pre = None, None, None
#head -> 첫번째노드, current -> 지금 처리 중인 노드, pre -> current의 바로 앞 노
data_array = ["다현", "정현", "쯔위", "사나", "지효"]

if __name__ == "__main__":
    node = Node()
    node.data = data_array[0]
    head = node

    #for data in data_array[1:]:
    #for i in range(1, len(data_array)):
    #for문 형식
    i = 1
    while i < len(data_array):
    #while문 형식
        # data 만큼 data_array의 1번 항목부터 반복
        pre = node
        node = Node()
        node.data = data_array[i]
        pre.link = node
        i = i + 1

    print_nodes(head)
    '''
    다현 정현 쯔위 사나 지효 
    '''
