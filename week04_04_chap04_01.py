class Node():
#Node라는 데이터형을 만드는 것
    def __init__(self):
    #데이터형을 생성할 때 자동으로 실행되는 부분
        self.data = None
        #데이터가 저장되는 부분
        self.link = None
        #링크가 저장되는분부분


node1 = Node()
node1.data = "다현"

node2 = Node()
node2.data = "정연"
node1.link = node2

node3 = Node()
node3.data = "쯔위"
node2.link = node3

node4 = Node()
node4.data = "사나"
node3.link = node4

node5 = Node()
node5.data = "지효"
node4.link = node5

new_node = Node()
#새 노드 생성
new_node.data = "인하"
#새 노드에 데이터 삽입
new_node.link = node2.link 
# 새 노드가 가리킬 다음 노드(쯔위 노드)는 정연 노드로 부터 얻어 온다.
node2.link = new_node 
# 정연 -> 인하

new_node.link = node3.link 
# 쯔위가 가지고 있던 사나의 메모리 번지 주소를 인하 노드에 전달
del(node3)
#노드 
# print(node2.link.link.data, end = ' ')
# print(node1.data, end = ' ')
# print(node1.link.data, end = ' ')
# print(node1.link.link.data, end = ' ')
# print(node1.link.link.link.data, end = ' ')
# print(node1.link.link.link.link.data, end = ' ')

current = node1 
# 시작 값
print(current.data, end=' ')
while current.link != None: 
# 링크 값이 None이 아닐때 까지
    current = current.link  
    # 노드의 링크가 가리키는 노드로 변경
    print(current.data, end=' ')
    #출력
