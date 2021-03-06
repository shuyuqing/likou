# 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 的那 两个 整数，并返回它们的数组下标。
# 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
# 你可以按任意顺序返回答案。
# 示例 1：
# 输入：nums = [2,7,11,15], target = 9
# 输出：[0,1]
# 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
# 示例 2：
# 输入：nums = [3,2,4], target = 6
# 输出：[1,2]
# 来源：力扣（LeetCode）
# 链接：https://leetcode-cn.com/problems/two-sum
# 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。

#暴力解法，把所有组合都试一遍
# class Solution:
#
#     def twoSum(self, nums, target):
#
#         jieguo=[]
#         for i in range(len(nums)):
#
#             for j in range(i+1,len(nums)):
#
#                 if nums[i]+nums[j]==target:
#
#                     jieguo.append(i)
#                     jieguo.append(j)
#
#                     return jieguo
#
# l=[3,3]
# target=6
# p=Solution()
# l=p.twoSum(l,target)
# print(l)

#第二种解法，用空间换时间，使用哈希表，python的字典
#https://leetcode-cn.com/problems/two-sum/solution/xiao-bai-pythonji-chong-jie-fa-by-lao-la-rou-yue-j/
class Solution:

    def twoSum(self, nums, target):

        jieguo=[]
        yubei={int:int}
        for i in range(len(nums)):

            jiandiao=target-nums[i]
            if jiandiao in yubei.keys():

                jieguo.append(yubei.get(jiandiao))
                jieguo.append(i)

            else:
                yubei.update({nums[i]:i})

        return jieguo

l=[2,7,11,15]
target=9
p=Solution()
l=p.twoSum(l,target)
print(l)

# 参考
# class Solution:
#     def twoSum(self, nums: List[int], target: int) -> List[int]:
#         nums_dict = {}
#         for i, num in enumerate(nums):
#             if target-num in nums_dict:
#                 return [i, nums_dict.get(target-num)]
#             if not nums_dict.get(num):
#                 nums_dict[num] = i

