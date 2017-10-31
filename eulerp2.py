a = 0
b = 1
s =0
for i in range(4000000):
	if a%2==0:
		s=s+a
	if b%2==0:
		s=s+b
	a=a+b
	b=a+b
	if(b>4000000):
		break
print (s)
	