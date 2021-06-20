// github.com/SudirKrishnaaRS
    public int TotalPairs(int[] nums, int x, int y)
    {
        // Code here 
        int len=nums.length;
        int cnt=0;
        for(int i=0;i<len;i++)
        {
            for(int j=i+1;j<len;j++)
            {
                int prod=nums[i]*nums[j];
                if(prod>=x &&prod<=y)
                {
                    // System.out.println("Sum"+prod);
                    cnt++;
                }
            }
        }
        return cnt;
    }
