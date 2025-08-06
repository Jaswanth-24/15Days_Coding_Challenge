class TrappingRainWater {
    public int trap(int[] height) {
        int result = 0, min = 0;
        int[] leftmax = new int[height.length];
        int[] rightmax = new int[height.length];
        leftmax[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i] = Math.max(leftmax[i - 1], height[i]);
        }
        rightmax[height.length - 1] = height[height.length - 1];
        for (int i = height.length - 2; i >= 0; i--) {
            rightmax[i] = Math.max(rightmax[i + 1], height[i]);
        }
        for (int i = 0; i < height.length; i++) {
            min = (Math.min(leftmax[i], rightmax[i])) - height[i];
            result += min;
        }
        return result;
    }
}