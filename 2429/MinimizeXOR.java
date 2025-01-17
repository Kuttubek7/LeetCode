
class Solution {
    public int minimizeXor(int num1, int num2) {
        int count = Integer.bitCount(num2); 
        int res = 0;

        // Отмените набор битов от наибольшего к наименьшему весу
        for (int i = 31; i >= 0 && count > 0; i--) {
            if ((num1 & (1 << i)) != 0) {
                count--;
                res += (1 << i);
            }
        }

        // Установите биты от самого низкого до самого высокого веса
        for (int i = 0; i < 32 && count > 0; i++) {
            if ((num1 & (1 << i)) == 0) {
                count--;
                res += (1 << i);
            }
        }
        return res;
    }
}
