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
    #링크가 첫 시작점이 아닐 때 까
        current = current.link  
        # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def insert_nodes(find_data, insert_data):
    '''
    :param find_data: 찾는 데이터
    :param insert_data: 입력하는 데이터
    :return:
    '''
    global head, pre, current
    #전역 변수 선언

    if head.data == find_data:
    #첫 번째 노드에 데이터 삽입
        node = Node()
        #새 노드 생성
        node.data = insert_data
        #새 노드에 데이터 삽입
        node.link = head
        #새 노드의 링크를 헤드에 연결
        last = head
        #마지막 노드를 첫번째 노드로 우선 지
        while last.link != head:
        #마지막 노드를 찾을때까지
            last = last.link
            #last를 다음 노드로 변경
        last.link = node
        #마지막 노드의 링크를 새로 지정한 헤드로 연결
        head = node
        #새 노드를 헤드로 지정
        return

    #중간 노드에 데이터 삽입
    current = head
    #처음부터
    while current.link is not head:
    #현재 처리중인 값이 None이 아닐 때 까지
        pre = current
        #전 노드
        current = current.link
        #후 노드
        if current.data == find_data:
        #값을 찾았다면
            node = Node()
            #노드 생성
            node.data = insert_data
            #노드에 데이터 삽입
            node.link = current
            #노드의 링크를 현재 처리중인 노드에 연결
            pre.link = node
            #앞 노드 링크에 노드 연결
            return

    #마지막 노드에 데이터 삽입
    node = Node()
    #새 노드 생성
    node.data = insert_data
    #생성된 노드에 데이터 삽입
    current.link = node
    #후 노드의 링크에 새 노드 연결
    node.link = head
    #새 노드의 링크에 헤드 

def delete_nodes(delete_data):
    global head, current, pre

    if head.data == delete_data:
    #헤드 데이터가 삭제할 데이터라면
        current = head
        #처음부터
        head = head.link
        #헤드가 가리키고 있는 노드를 헤드로 지정
        last = head
        #마지막 노드를 첫번째 노드로 우선 지정
        while last.link is not current:
        #마지막 노드를 찾을때까지
            last = last.link
            #last를 다음 노드로 변경
        last.link = head
        #마지막 노드의 링크를 새로운 헤드에 연결
        del current
        #노드 삭제
        return

    current = head
    #처음부터
    while current.link is not head:
    #마지막이 아닐 때 까지
        pre = current
        #전 노드
        current = current.link
        #후 노드
        if current.data == delete_data:
        #현재 처리중인 노드가 삭제할 데이터라면
            pre.link = current.link
            #전 노드의 링크에 후 노드의 링크 결노드를 연결
            del current
            #노드 삭제
            return

def find_node(find_data):
    global head, current, pre
    if head.data == find_data:
    #head가 찾는 데이터라면
        return head
        #헤드 값 반환

    current = head
    #처음부터
    while current.link is not head:
    #마지막이 아닐 때 까지
        current = current.link
        #후 노드
        if current.data == find_data:
        #데이터를 찾았다면
            return current
            #커런트 값 반환

    return Node()

head, current, pre = None, None, None
data_array = ["다현", "정현", "쯔위", "사나", "지효"]

if __name__ == "__main__":
    node = Node()
    node.data = data_array[0]
    head = node
    node.link = head

    #for data in data_array[1:]:
    for i in range(1, len(data_array)):
    #for문 형식
    #while i < len(data_array):
    #while문 형식
        # data 만큼 data_array의 1번 항목부터 반복
        pre = node
        node = Node()
        node.data = data_array[i]
        pre.link = node
        node.link = head

    print_nodes(head)

    fNode = find_node("다현")
    print(fNode.data)
    fNode = find_node("인하")
    print(fNode.data)

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
