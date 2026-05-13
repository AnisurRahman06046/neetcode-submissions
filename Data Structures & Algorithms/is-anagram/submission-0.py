class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        count={}
        count1={}
        if len(s)!=len(t):
            return False
        for k in s:
            if k in count.keys():
                count[k]+=1
            else:
                count[k]=1

        for m in t:
            if m in count1.keys():
                count1[m]+=1
            else:
                count1[m]=1

        if count==count1:
            return True
        else:
            return False

        