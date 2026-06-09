package Bitwise;

public class Oddrepetitivefindunique {
    
}
// every number appears n times but one number appears only once . find that number in O(n) time and O(1) space

// for ths, if every num appears n , then each number have n set bits .  so the set bits get divided into n parts so it is divisible by n . but the number which appears only once will have set bits which are not divisible by n . so we can find that number by taking mod of count of set bits with n.