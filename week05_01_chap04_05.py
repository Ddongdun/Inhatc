class Node:
    def __init__(self):
        self.data = None
        self.link = None


def print_nodes(start):
    current = start
    if current is None:
        return

    print(current.data, end=' ')
    while current.link is not None:  # current의 링크 값이 None이 아닐때 까지
        current = current.link  # 가르키는 대상 증가
        print(current.data, end=' ')
    print()


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
    '''
    다현 정현 쯔위 사나 지효 
    '''