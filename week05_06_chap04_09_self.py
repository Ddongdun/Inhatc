## 클래스와 함수 선언 부분 ##
class Node() :
	def __init__ (self) :
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
        # 노드 데이터가 없을때까지
        current = current.link
        # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def make_simple_linked_List(name_height) :
	global head, current, pre
	#전역 변수 선언
	print_nodes(head)

	node = Node()
	#새 노드 생성
	node.data = name_height
	#새 노드에 데이터 삽입
	if head is None:
	#헤드가 없다면
		head = node
		#새 노드를 헤드로 지정
		return

	if head.data[1] > name_height[1] :	
	#헤드의 두번째 데이터가 넣을 두번째 데이터보다 크다면
		node.link = head
		#새 노드의 링크를 헤드로 지정
		head = node
		#새 노드를 헤드로 지정
		return

	# 중간 노드로 삽입하는 경우
	current = head
	while current.link != None :
	#빈 값이 나올때까지 반복
		pre = current
		#전 노드
		current = current.link
		#후 노드
		if current.data[1] > name_height[1]:
		#현재 노드의 두번째 데이터가 넣을 두번째 데이터보다 크다면
			pre.link = node
			#전 노드의 링크를 새 노드와 연결
			node.link = current
			#새 노드의 링크를 후 노드와 연결
			return

	# 삽입하는 노드가 가장 큰 경우
	current.link = node
	#맨 뒤에 연결

## 전역 변수 선언 부분 ##
head, current, pre = None, None, None
data_array = [["지민", 180], ["정국", 177], ["뷔", 183], ["슈가", 175], ["진", 179]]

## 메인 코드 부분 ##
if __name__ == "__main__" :

	for data in data_array :
		make_simple_linked_List(data)

	print_nodes(head)
