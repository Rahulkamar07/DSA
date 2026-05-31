class Solution {
    public boolean asteroidsDestroyed(int mass, int[] asteroids) {
        Arrays.sort(asteroids);
        long currmass = mass;
        for(int astmass : asteroids){
            if(currmass < astmass){
                return false;
            }
            currmass += astmass;
        }
        return true;
    }
}