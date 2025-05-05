class Solution {
public:
    int maxArea(vector<int>& height) {
        int i=0,j=(height.size()-1),breadth,area=0,oldArea=0;
        while(i<=j){
            // if(i==0 && j==height.size()-1){
            // }
                breadth=j-i;
                area=height[i]<=height[j]?breadth*height[i]:breadth*height[j];
                
            // else{
            //     breadth=j-i;
            //     if(height[i]<=height[j])
            //         area2=breadth*height[i];
            //     else
            //         area2=breadth*height[j];
            //}
            if(area>oldArea)
                oldArea=area;
            if(height[i]<=height[j])
                i++;
            else
                j--;
        
        }
        return oldArea;
    }
};