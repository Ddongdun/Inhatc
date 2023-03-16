#함수이름()
def plus(v1, v2):
    result = 0
    result = v1 + v2
    return result

if __name__ == "__main__":
#파이썬은 메인이 필수가 아니지만 필요하다면 작성 가능
#코드가 길어지면 가독성을 위해 사용하는것이 좋음
    hap = 0
    hap = plus(100,200)
    print("100과 200의 plus()함수 결과는 %d" %hap)
    #100과 200의 plus()함수 결과는 300