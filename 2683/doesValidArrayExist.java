class Solution {
    public boolean doesValidArrayExist(int[] derived) {
        int x = 0;
        // проходимся по каждому элементу массива и проверяем XOR
        for(int i = 0; i < derived.length; i++) {
            x ^= derived[i];
        }
        return x == 0; // true and false
    }
}
