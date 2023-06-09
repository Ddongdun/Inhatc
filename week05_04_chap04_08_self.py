class Node:
    def __init__(self):
        self.data = None
        self.link = None


def print_nodes(start):
    current = start
    if current is None:
    #current가 None값 이라면
        return
        #반환

    print(current.data, end=' ')
    while current.link is not None:
        # current의 링크 값이 None이 아닐때 까지
        current = current.link
        # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def insert_nodes(find_data, insert_data):
    global head, pre, current

    if head.data == find_data:
    #첫 번째 노드에 데이터 삽입
        node = Node()
        #새 노드 생성
        node.data = insert_data
        #만든 노드에 데이터 삽입
        node.link = head
        #첫 노드 이므로 헤드 연결
        head = node
        #새로 생성된 노드로 헤드 지정
        return

    #중간 노드에 데이터 삽입
    current = head
    while current.link is not None:
        pre = current
        #pre 증가
        current = current.link
        #current 증가
        if current.data == find_data:
        #데이터를 찾았다면
            node = Node()
            #새 노드 생성
            node.data = insert_data
            #만든 노드에 데이터 삽입
            node.link = current
            #이전 데이터와 링크 연결
            pre.link = node
            #이후 데이터와 링크 연결
            return

    #마지막 노드에 데이터 삽입
    node = Node()
    #새 노드 생성
    node.data = insert_data
    #만든 노드에 데이터 삽입
    current.link = node
    #이전 데이터와 링크 연결

def delete_nodes(delete_data):
    global head, current, pre

    if head.data == delete_data:
    #헤드 데이터가 삭제할데이터라면
        current = head
        #그 다음 값을 헤드로 지정
        head = head.link
        #헤드링크 업데이트
        del current
        #삭제
        print("첫 번째 노드가 삭제되었습니다")
        return

    current = head
    while current.link is not None:
        pre = current
        # pre 증가
        current = current.link
        # current 증가
        if current.data == delete_data:
        #삭제할 데이터를 찾았다면
            pre.link = current.link
            #이후 데이터에 링크 연결
            del current
            #삭제
            print("중간 이후 노드가 삭제되었습니다")
            return

    print("삭제된 노드가 없습니다")

def find_node(find_data):
#찾기 함수 
    global head, current, pre
    #전역 변수 선언
    if head.data == find_data:
    #head가 찾는 데이터라면
        return head
        #헤드 값 반환

    current = head
    #처음부터
    while current.link is not None:
    #빈 값이 나올때까지 반복
        current = current.link
        #다음 노드로경변경
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

    f_node = find_node("다현")
    print(f_node.data)

    f_node = find_node("인하")
    print(f_node.data)

    f_node = find_node("사나")
    print(f_node.data)

    #insert_nodes("다현", "화사")
    #print_nodes(head)

    #insert_nodes("사나", "솔라")
    #print_nodes(head)

    #insert_nodes("인하", "문별")
    #print_nodes(head)
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
    '''
    다현 정현 쯔위 사나 지효 
    정현 쯔위 사나 지효 
    정현 사나 지효 
    정현 사나 
    '''
