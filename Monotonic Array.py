# 如果数组是单调递增或单调递减的，那么它是单调的。
#
# 如果对于所有 i <= j，A[i] <= A[j]，那么数组 A 是单调递增的。 如果对于所有 i <= j，A[i]> = A[j]，那么数组 A 是单调递减的。
#
# 当给定的数组 A 是单调数组时返回 true，否则返回 false。
#
# 来源：力扣（LeetCode）
# 链接：https://leetcode-cn.com/problems/monotonic-array
# 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

#单调list的话有两种情况(无论如何都要遍历两遍)
# 1.单调递减list，后一个元素减掉前一个元素一直小于等于0,遍历的过程中一旦小于0，那么就不是单调list
# 2.单调递增list，后一个元素减掉前一个元素一直大于等于0,遍历的过程中一旦大于0,那么就不是单调list
class Solution:

    def isMonotonic(self,A):

        return Solution.issorted(self,A,True) or Solution.issorted(self,A,False)

    def issorted(self,A,increasing):
        n = len(A)
        if(increasing):
            for i in range(1,n):
                if A[i-1]>A[i]:
                    return False
        else:
            for i in range(1,n):
                if A[i-1]<A[i]:
                    return False
        return True

l=[1,2,2,2]
p=Solution()
print(p.isMonotonic(l))

#参考
# class Solution:
#     def isMonotonic(self, A: List[int]) -> bool:
#         if len(A)==1:
#             return True
#         B=A.copy()
#         A.sort()
#         if B==A:
#             return True
#         A.reverse()
#         if B==A:
#             return True
#         return False
