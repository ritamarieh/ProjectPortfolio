% Creates my_mean variable 
function my_mean = my_mean(x) 
%initializes variable
my_mean = 0;
%n is equal to the number of elements in the array
n = numel(x);
%sum of the elements in the array
sum_var = sum (x);
%actual equation for average
my_mean = sum_var/n;
end