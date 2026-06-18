class Solution {
    public double angleClock(int hour, int minutes) {
        
        double minuteHand = minutes * 6;
        double hourHand = (30 * hour) + (0.5 * minutes);
        double angle = Math.abs(hourHand - minuteHand);

        if (angle > 180) {
            angle = 360 - angle;
        }
        return angle;
    }
}