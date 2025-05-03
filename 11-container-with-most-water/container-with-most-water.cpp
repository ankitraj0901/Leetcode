class Solution {
public:
    int maxArea(vector<int>& height) {
        int i=0,j=(height.size()-1),breadth,area1=0,area2=0;
        while(i<=height.size()-2 && j>=i+1){
            if(i==0 && j==height.size()-1){
                breadth=j-i;
                area1=height[i]<=height[j]?breadth*height[i]:breadth*height[j];
                
            }
            else{
                breadth=j-i;
                if(height[i]<=height[j])
                    area2=breadth*height[i];
                else
                    area2=breadth*height[j];
                if(area1<area2)
                    area1=area2;
            }
            if(height[i]<=height[j])
                i++;
            else
                j--;
        
        }
        return area1;
    }
};