## 함수 선언 부분 ##
def print_poly(f_x):
    """
    다항식 문자열 출력(display)함수
    :param f_x: 정수 타입의 계수를 원소로 하는 리스트
    :return: 다항식 문자열
    """
    term = len(f_x) - 1  
    # 최고차항 숫자 = 배열길이-1
    poly_str = "P(x) = "  
    # 다항식으로 변환하여 담을 변수

    for i in range(len(fx)):
        coef = f_x[i]  
        # 계수

        if coef >= 0:  
        # 계수가 0보다 크거나 같다면
            #poly_str += "+"  
            # 다른 표현
            poly_str = poly_str + "+"  
            # 부호를 붙여 양수로 만든다
        #poly_str += str(coef) + "x^" + str(term) + " "  
        # 거듭제곱수를 붙여준다
        poly_str = poly_str + f"{coef}x^{term} "
        # 다항식을 만들어준다
        term = term - 1  
        # 다음 차항

    return poly_str  
    # 결과 값 반환


def calc_poly(x_Value, f_x):
    """
    다항식 산술 연산 함수
    :param x_Value: 독립 변수 정수 x (입력 값)
    :param f_x: 정수 타입의 계수를 원소로 하는 리스트
    :return: 다항식 산술 연산 계산 값
    """
    ret_value = 0
    # 결과 값을 담을 변수
    term = len(f_x) - 1  
    # 최고차항 숫자 = 배열길이-1

    for i in range(len(fx)):
        coef = f_x[i]  
        # 계수
        ret_value += coef * x_Value ** term  
        # 항의 값 계산해서 변수에 더해준다
        term = term - 1  
        # 다음 차항

    return ret_value
    #결과 값 반환


## 전역 변수 선언 부분 ##
fx = [7, -4, 0, 5]  
# = 7x^3 -4x^2 +0x^1 +5x^0

## 메인 코드 부분 ##
if __name__ == "__main__":
    help(print_poly)
    print(print_poly(fx))

    x = int(input("X 값 : "))

    print(calc_poly(x, fx))


