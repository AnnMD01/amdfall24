import math


#// O
def is_prime_one(f):
    if f == 1:
        return False
    for i in range(2, f):
        if f % i == 0:
            return False
    return True

def is_prime_two(f):
    if f == 1:
        return False
    
    for i in range (2, math.floor(f*1/2)):
        if f % i == 0:
            return False
        
    return True


def is_prime(f):
    if f == 1:
        return False
    
    if f == 2:
        return True
    
    if f % 2 == 0:
        return False
    
    for i in range(3, math.floor(f**(1/2))+1, 2):
        #print(i)
        if f % i == 0:
            return False
        
    return True


def gcd_1(a, b): 
    while b != 0: a, b = b, a % b
    return a

def swap(a, b):
    return b, a

def gcd_2(a, b): return a if b == 0 else gcd_2(b, a % b)
