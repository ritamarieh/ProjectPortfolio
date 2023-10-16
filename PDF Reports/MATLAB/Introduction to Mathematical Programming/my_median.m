%Create median
function my_median = my_median(x)
%sorts data into xa
xa = sort(x);
%number of elements in sorted array, (should be same as input array)
n = numel(xa);
%i found rem in the catalog, uses same style for even and odd as C++
if rem(n,2) ~= 0 %if n is odd at 1 to make it even
   n = (n+1)/2;
   my_median = xa(n);
%if n is even then add the two middle elements and divide by 2
else
    n = n/2; 
    my_median = (xa(n)+xa(n+1))/2;
end

end

