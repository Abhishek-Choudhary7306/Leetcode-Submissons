#User function Template for python3

class Solution:
	def AllPossibleStrings(self, s):
		# Code here
		res = []
		
		self.solve(s,"",0,res)
		res.sort()
		
		return res
		
	def solve(self,s,curr,index,res):
	    if(len(s)==index):
	        if(curr):
	            res.append(curr)
            return 
        
        self.solve(s,curr+s[index],index+1,res)
        self.solve(s,curr,index+1,res)
        