import java.util.PriorityQueue;

class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        // Max Heap based on gain = new pass ratio - old pass ratio
        PriorityQueue<double[]> maxHeap = new PriorityQueue<>((a, b) -> Double.compare(b[0], a[0]));
        
        // Initialize maxHeap with current classes data: [gain, pass, total]
        for (int[] cls : classes) {
            int pass = cls[0], total = cls[1];
            double gain = getGain(pass, total);
            maxHeap.offer(new double[] {gain, pass, total});
        }
        
        // Distribute extra students one by one to maximize gain
        while (extraStudents > 0) {
            double[] top = maxHeap.poll();
            double gain = top[0];
            double pass = top[1];
            double total = top[2];
            
            // Add one extra student who will pass (+1 pass and +1 total)
            pass += 1;
            total += 1;
            
            // Recalculate gain and push back
            gain = getGain(pass, total);
            maxHeap.offer(new double[] {gain, pass, total});
            
            extraStudents--;
        }
        
        // Calculate sum of pass ratios
        double totalRatio = 0;
        for (double[] cls : maxHeap) {
            totalRatio += cls[1] / cls[2];
        }
        return totalRatio / classes.length;
    }
    
    private double getGain(double pass, double total) {
        // Gain = new pass ratio - old pass ratio
        return (pass + 1) / (total + 1) - pass / total;
    }
}
