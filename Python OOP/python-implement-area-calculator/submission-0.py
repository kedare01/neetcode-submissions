import math

class AreaCalc:
    # TODO: Implement calculate method
    def calculate(self,args1,args2=None):
        if args2 is None:
            return round(math.pi*args1**2,2)
        else:
            return args1*args2

    

    
# Don't modify the following code
calc = AreaCalc()
print(calc.calculate(5))    
print(calc.calculate(4, 6))
