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

def make_simple_linked_List(name_height) :
	global head, current, pre
	print_nodes(head)

	node = Node()
	node.data = name_height
	if head is None:			# 첫 번째 노드일 때
		head = node
		return

	if head.data[1] > name_height[1] :	# 첫 번째 노드보다 작을 때
		node.link = head
		head = node
		return

	# 중간 노드로 삽입하는 경우
	current = head
	while current.link != None :
	#빈 값이 나올때까지 반복
		pre = current
		current = current.link
		if current.data[1] > name_height[1]:
			pre.link = node
			#이후 데이터의 링크 연결
			node.link = current
			#노드의 링크에 이전 데이터 연결
			return

	# 삽입하는 노드가 가장 큰 경우
	current.link = node

## 전역 변수 선언 부분 ##
head, current, pre = None, None, None
data_array = [["지민", 180], ["정국", 177], ["뷔", 183], ["슈가", 175], ["진", 179]]

## 메인 코드 부분 ##
if __name__ == "__main__" :

	for data in data_array :
		make_simple_linked_List(data)

	print_nodes(head)
