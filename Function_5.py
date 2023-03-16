def multi(v1, v2):
    #반환 리스트 생성
    retList =[]
    res1 = v1 + v2
    res2 = v1 - v2
    res3 = v1 * v2
    res4 = v1 // v2
    res5 = v1 % v2
    res6 = v1 ** v2

    retList.append(res1)
    retList.append(res2)
    retList.append(res3)
    retList.append(res4)
    retList.append(res5)
    retList.append(res6)
    return retList

#전역 변수 생성
myList = []
hap, sub = 0, 0

myList = multi(100, 20)
hap = myList[0]
sub = myList[1]
gob = myList[2]
mok = myList[3]
nam = myList[4]
geg = myList[5]
print("multi()에서 반환한 값 ==> %d, %d, %d, %d, %d, %d" % (hap, sub, gob, mok, nam, geg))
#multi()에서 반환한 값 ==> 300, -100
#120, 80, 2000, 5, 0, 10000000000000000000000000000000000000000