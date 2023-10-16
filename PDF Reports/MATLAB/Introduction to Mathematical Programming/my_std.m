%Creates standard deviation function
function my_std = my_std(x)
%initialize std
my_std = 0;
m = my_mean(x);
%make a for loop to subtract all elements 
for ii=1:numel(x)
my_std=my_std+((x(ii)-m)^2);
end
%k is equal to 1 divided by the number of elements in the array - 1
k = 1/(numel(x)-1);
v = k*my_std;
my_std = sqrt(v);
end