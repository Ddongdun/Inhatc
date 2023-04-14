def factorial(n):
    """
    팩토리얼 계산 함수
    :param n: 정수
    :return: 정수, n!
    """
    result = 1
    //초깃값 1
    for i in range(2, n+1):
    //2부터 n+1보다 작을때까지 반복
        result = result * i
        //곱한다
    return result
    //결과 값 반환

def nCr(n, r) -> int:
    """
    조합 삼수
    :param n: 전체 개수
    :param r: 선택 개수
    :return: 경우의 수
    """
    denominator = factorial(n-r) * factorial(r)
    //분모 구하는 공식
    numerator = factorial(n)
    //분자 구하는 공식
    return int(numerator / denominator)
    //경우의 수 구하는 공식 반환

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



