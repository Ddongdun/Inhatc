class Node:
    def __init__(self):
        self.data = None
        self.link = None


def print_nodes(start):
    current = start
    if current is None:
        return

    print(current.data, end=' ')
    while current.link is not start:  # current의 링크 값이 None이 아닐때 까지
        current = current.link  # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def insert_nodes(find_data, insert_data):
    '''
    :param find_data: 찾는 데이터
    :param insert_data: 입력하는 데이터
    :return:
    '''
    global head, pre, current

    if head.data == find_data:
    #첫 번째 노드에 데이터 삽입
        node = Node()
        #새 노드 생성
        node.data = insert_data
        #새 노드에 데이터 삽입
        node.link = head
        #새 노드의 링크를 헤드에 연결
        last = head
        #마지막과 헤드를 연결
        while last.link != head:
        #링크가 헤드가 아닐때까지
            last = last.link
            #검사
        last.link = node
        #마지막 노드를 새로운 헤드에 링크 연결
        head = node
        #헤드 업데이트
        return

    #중간 노드에 데이터 삽입
    current = head
    while current.link is not head:
    #현재 처리중인 값이 None이 아닐 때 까지
        pre = current
        #pre 증가
        current = current.link
        #current 증가
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
    #현재 처리중인 노드 링크에 헤드 연결
    node.link = head

def delete_nodes(delete_data):
    global head, current, pre

    if head.data == delete_data:
    #헤드 데이터가 삭제할 데이터라면
        current = head
        #현재 처리중인 노드를 헤드로 지정
        head = head.link
        #헤드링크 업데이트
        last = head
        #마지막과 헤드를 연결
        while last.link is not current:
        #링크가 커런트가 아닐때까지
            last = last.link
        last.link = head
        #마지막 노드를 새로운 헤드에 연결
        del current
        #노드 삭제
        return

    current = head
    while current.link is not head:
        pre = current
        # pre 증가
        current = current.link
        # current 증가
        if current.data == delete_data:
        #현재 처리중인 노드가 삭제할 데이터라면
            pre.link = current.link
            #앞 노드의 링크에 커런트 링크 연결
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
    while current.link is not head:
    #링크값이 빈값이 아닐때까지 반복
        current = current.link
        #커런트 링크 연결해서 다음 값 비교
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