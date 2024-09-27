public class TrappedWater {

    public static int rainWater(int height[]){

        //calculate left max boundary array
        int leftMax[] = new int [height.length];
        leftMax[0] = height[0];
        for(int i = 1; i< height.length; i++){
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }

        //calculate right max boundary array
        int rightMax[] = new int[height.length];
        rightMax[height.length-1] = height[height.length-1];
        for(int i = height.length-2; i>=0; i--){
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }

        //calculate the trapped rain water
        int trapped = 0;
        for(int i = 0; i < height.length; i++){
            int waterLevel = Math.min(leftMax[i], rightMax[i]);
            trapped += (waterLevel - height[i]);
        }

        return trapped;
    }

    public static void main(String[] args) {

        int height[] = {4,2,0,3,2,5};

        int water = rainWater(height);
        System.out.println("Water = "+water);
    }
}