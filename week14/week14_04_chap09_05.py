# week14_04_chap09_05.py
class Graph:
#그래프 클래스 선언
    def __init__(self, size):
    #함수
        self.SIZE = size
        #사이즈
        self.graph = [[0 for _ in range(size)] for _ in range(size)]
        #Size * Size의 그래프를 만든다


def print_graph(g):
#그래프 출력 함수
    print(' ', end=' ')
    #빈칸 출력
    for v in range(g.SIZE):
    #그래프의 사이즈 만큼 반복
        print(nameAry[v], end=' ')
        #그래프 원소 출력
    print()
    #빈칸 출력
    for row in range(g.SIZE):
    #그래프의 행 만큼 반복
        print(nameAry[row], end=' ')
        #그래프 원소 출력
        for col in range(g.SIZE):
        #그래프의 열 만큼 반복
            print("%2d" % g.graph[row][col], end=' ')
            #그래프 간선을 그린다
        print()
        #빈칸 출력
    print()
    #빈칸 출력


def find_vertex(g, find_vtx):
#방문한 정점 찾는 함수
    stack = []
    #스택 배열
    visited_ary = []
    #방문한 정점 배열

    current = 0
    #시작 정점
    stack.append(current)
    #스택에 추가
    visited_ary.append(current)
    #방문한 정점 배열에 추가

    while len(stack) != 0:
    #스택이 빌 때 까지 반복
        next = None
        #다음 정점을 지정할 변수
        for vertex in range(G1.SIZE):
        #그래프의 사이즈 만큼 반복
            if g.graph[current][vertex] != 0:
            #그래프의 간선을 그려야 한다면
                if vertex in visited_ary:
                # 방문한 적이 있는 정점이면
                    pass
                    #패스
                else:
                #방문한 적이 없으면
                    next = vertex
                    #다음 정점으로 지정
                    break
                    #탈출

        if next is not None:
        #다음에 방문할 정점이 있는 경우
            current = next
            #시작 정점을 저장한 정점으로 지정
            stack.append(current)
            #스택에 추가
            visited_ary.append(current)
            #방문한 정점 배열에 추가
        else :
        #다음에 방문할 정점이 없는 경우
            current = stack.pop()
            #팝을 이용해 시작 정점으로 지정

    if find_vtx in visited_ary:
    #찾는 정점이 방문한 정점 배열에 있다면
        return True
        #리턴 트루
    else:
    #그렇지 않다면
        return False
        #리턴 폴스


G1 = None
#그래프를 그릴 변수
nameAry = ['춘천', '서울', '속초', '대전', '광주', '부산']
#정점 배열
cc, sl, sc, dj, kw, bs = 0, 1, 2, 3, 4, 5
#각각의 원소에 이름 할당


G1 = Graph(6)
#6*6 사이즈의 그래프를 그린다
G1.graph[cc][sl] = 10; G1.graph[cc][sc] = 15
G1.graph[sl][cc] = 10; G1.graph[sl][sc] = 40; G1.graph[sl][dj] = 11; G1.graph[sl][kw] = 50
G1.graph[sc][cc] = 15; G1.graph[sc][sl] = 40; G1.graph[sc][dj] = 12
G1.graph[dj][sl] = 11; G1.graph[dj][sc] = 12; G1.graph[dj][kw] = 20; G1.graph[dj][bs] = 30
G1.graph[kw][sl] = 50; G1.graph[kw][dj] = 20; G1.graph[kw][bs] = 25
G1.graph[bs][dj] = 30; G1.graph[bs][kw] = 25
#가중치 할당

print('## 자전거 도로 건설을 위한 전체 연결도 ##')
#출력
print_graph(G1)
#그래프를 그린다


edge_ary = []
#가중치 간선 목록
for i in range(G1.SIZE):
#그래프의 행 크기 만큼 반복
    for k in range(G1.SIZE):
    #그래프의 열 크기 만큼 반복
        if G1.graph[i][k] != 0:
        #가중치가 할당 되어있다면
            edge_ary.append([G1.graph[i][k], i, k])
            #간선 목록에 추가

from operator import itemgetter
#정렬 함수 임포트
edge_ary = sorted(edge_ary, key=itemgetter(0), reverse=True)
#간선 정렬, 기준은 가중치로 내림차순

new_ary = []
#정렬한 배열
for i in range(0, len(edge_ary), 2):
# 2씩 증가하여 중복 값 제거
    new_ary.append(edge_ary[i])
    #정렬된 간선을 중복 제거해 추가
print(new_ary)
print()

index = 0
#인덱스 변수
while len(new_ary) > G1.SIZE - 1:
#간선의 개수가 '정점 개수-1'일 때까지 반복
#크루스칼 알고리즘
    start = new_ary[index][1]
    #시작 정점
    #[50, 1, 4]
    #1의 위치 : 시작 정점
    end = new_ary[index][2]
    #끝 정점
    #[50, 1, 4]
    #4의 위치 : 끝 정점
    saveCost = new_ary[index][0]
    #가중치 저장
    # [50, 1, 4]
    # 50의 위치 : 정점간의 가중치

    G1.graph[start][end] = 0
    #50 -> 0
    G1.graph[end][start] = 0
    #50 -> 0

    startYN = find_vertex(G1, start)
    #그래프에 연결되어 있는지 체크
    endYN = find_vertex(G1, end)
    #그래프에 연결되어 있는지 체크

    if startYN and endYN:
    #간선이 중복된다면
        del new_ary[index]
        # 서울-광주 구간 간선 제거
    else:
        G1.graph[start][end] = saveCost
        #간선 복구
        G1.graph[end][start] = saveCost
        #간선 복구
        index += 1
        #인덱스 값 증가

print('## 최소 비용의 자전거 도로 연결도 ##')
print_graph(G1)