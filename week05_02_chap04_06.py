class Node:
    def __init__(self):
        self.data = None
        self.link = None


def print_nodes(start):
    current = start
    if current is None:
        return

    print(current.data, end=' ')
    while current.link is not None:  
    # current의 링크 값이 None이 아닐때 까지
        current = current.link  
        # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def insert_nodes(find_data, insert_data):
#노드 삽입 함수
    global head, pre ,current
    #전역 변수 선언

    if head.data == find_data:
    #첫 번째 노드가 삽입할 위치라면
        node = Node()
        #새 노드 생성
        node.data = insert_data
        #새 노드에 데이터 삽입
        node.link = head
        #새 노드의 링크를 원래 헤드와 연결
        head = node
        #새 노드를 새로운 헤드로 지정
        return

    #중간 노드에 데이터 삽입
    current = head
    #처음부터
    while current.link is not None:
    #빈 값이 나올때 까지 반복
        pre = current
        #전 노드
        current = current.link
        #후 노드
        if current.data == find_data:
        #위치를 찾았다면
            node = Node()
            #새 노드 생성
            node.data = insert_data
            #새 노드에 데이터 삽입
            node.link = current
            #새 노드의 링크는 후 노드로 지정
            pre.link = node
            #전 노드의 링크는 새 노드로 지정
            return
            #전 노드 -> 새 노드 -> 후 노드

    #마지막 노드에 데이터 삽입
    node = Node()
    #새 노드 생성
    node.data = insert_data
    #새 노드에 데이터 삽입
    current.link = node
    #후 노드 링크에 새 노드 지정
    #후 노드 -> 새 노드

head, current, pre = None, None, None
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
    #배열을 리스트로 만드는 반복문
        # data 만큼 data_array의 1번 항목부터 반복
        pre = node
        node = Node()
        node.data = data_array[i]
        pre.link = node
        i = i + 1

    print_nodes(head)

    insert_nodes("다현", "화사")
    print_nodes(head)

    insert_nodes("사나", "솔라")
    print_nodes(head)

    insert_nodes("인하", "문별")
    print_nodes(head)

    '''
    다현 정현 쯔위 사나 지효 
    화사 다현 정현 쯔위 사나 지효
    화사 다현 정현 쯔위 솔라 사나 지효
    화사 다현 정현 쯔위 솔라 사나 지효 문별
    '''
