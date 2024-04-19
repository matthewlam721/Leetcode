Steps with nums = [2, 1, 4, 1, 2]
Initialization:
xor = 2 (initial value, i.e., nums[0])

First iteration (i = 1):
xor = 2 ^ 1 = 3 (binary 10 ^ 01 = 11)

Second iteration (i = 2):
xor = 3 ^ 4 = 7 (binary 11 ^ 100 = 111)

Third iteration (i = 3):
xor = 7 ^ 1 = 6 (binary 111 ^ 001 = 110)

Fourth iteration (i = 4):
xor = 6 ^ 2 = 4 (binary 110 ^ 010 = 100)

Because same number again will be ==0 so the last int will be different

XOR of the same number twice: a ^ a = 0. This means that if a number appears exactly twice, the two instances will XOR to zero.
XOR of any number with zero: a ^ 0 = a. This property ensures that XORing a number with zero leaves the number unchanged.

Therefore, when you XOR all the elements of the array together, the numbers that appear twice cancel themselves out because each pair contributes '0' to the final result. What remains at the end of the XOR operations is the number that appears exactly once, as it does not have a pair to cancel it out.