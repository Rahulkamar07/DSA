class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        int suma = 0;
        for (int a : apple) {
            suma += a;
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int c : capacity) {
            list.add(c);
        }

        Collections.sort(list, Collections.reverseOrder());

        int count = 0;
        for (int i = 0; i < list.size() && suma > 0; i++) {
            suma -= list.get(i);
            count++;
        }

        return count;
    }
}
