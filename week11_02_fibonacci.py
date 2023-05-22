def fibonacci_recursion(n: int) -> int:
    """
    피보나치 계산 함수(재귀)
    :param n:  정수
    :return:  정수, n!
    """
    if n < 2:
    #n이 2보다 작다면
        return n
        #n값 반환
    else:
    #그렇지 않다면
        return fibonacci_recursion(n-1) + fibonacci_recursion(n-2)
        #재귀함수로 피보나치 수열 계산

if __name__ == "__main__":
    number = int(input("정수 입력 : "))
    print(fibonacci_recursion(number))
