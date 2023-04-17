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
        # current의 링크 값이 None이 아닐때 까지
        current = current.link
        # 가르키는 대상 증가
        print(current.data, end=' ')
    print()

def make_simple_linked_List(namePhone) :
#리스트를 만드는 함수
	global head, current, pre
	#전역변수 선언
	print_nodes(head)

	node = Node()
	#새 노드 생성
	node.data = namePhone
	#노드에 데이터 삽입
	if head is None:
	#헤드가 없다면
		head = node
		#헤드로 지정
		return

	if head.data[0] > namePhone[0] :	
	# 첫 번째 노드보다 작을 때
		node.link = head
		#노드 링크에 현재 헤드 연결
		head = node
		#현재 노드를 헤드로 지정
		return

	# 중간 노드로 삽입하는 경우
	current = head
	#처음부터
	while current.link != None :
	#빈 값이 나올때까지 반복
		pre = current
		#전 노드
		current = current.link
		#후 노드
		if current.data[0] > namePhone[0]:
		#현재 값이 넣을 값보다 크다면
			pre.link = node
			#전 노드 링크 연결
			node.link = current
			#노드 링크에 후 노드 연결
			return

	# 삽입하는 노드가 가장 큰 경우
	current.link = node
	#맨 뒤에 연결

## 전역 변수 선언 부분 ##
head, current, pre = None, None, None
data_array = [["지민", "010-1111-1111"], ["정국", "010-2222-2222"], ["뷔", "010-3333-3333"], ["슈가", "010-4444-4444"], ["진", "010-5555-5555"]]

## 메인 코드 부분 ##
if __name__ == "__main__" :

	for data in data_array :
	#배열 만큼 
		make_simple_linked_List(data_array)

	print_nodes(head)
