from typing import List

def read_integers() -> List[int]:
    nums = input()
    return list(map(lambda x: int(x), nums.split(",")))
    
# do not modify the code below
print(read_integers())
print(read_integers())
print(read_integers())
