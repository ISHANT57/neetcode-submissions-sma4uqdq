class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        res=[]
        sum=0
        n1=len(nums1)
        n2=len(nums2)
        nums1.sort()
        for i in nums1:
            res.append(i)
            sum+=i
        nums2.sort()
        for j in nums2:
            res.append(j)
            sum+=j
        

        return (sum/(n1+n2))