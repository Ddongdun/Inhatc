def factorial(n):
    """
    팩토리얼 계산 함수
    :param n: 정수
    :return: 정수, n!
    """
    result = 1
    for i in range(2, n+1):
        result = result * i
    return result

def nCr(n, r) -> int:
    """
    조합 삼수
    :param n: 전체 개수
    :param r: 선택 개수
    :return: 경우의 수
    """
    denominator = factorial(n-r) * factorial(r)
    numerator = factorial(n)
    return int(numerator / denominator)

help(nCr)
#함수 설명 출력
#total = int(input("Input n : "))
#총 개수
#select = int(input("input r : "))
#원하는 결과 수
#print(nCr(total, select))
#print(f'{total}C{select} = {nCr(total, select)}')

n, r = input("Input n : ").split()
#.split()은 문자열로 반환시키는 함수 반대는 join()
print(f'{n}C{r} = {nCr(int(n), int(r))}')



