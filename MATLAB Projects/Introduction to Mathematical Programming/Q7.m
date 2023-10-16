function fvalue = Q7(x,k,L) 
 fvalue =4.*sqrt(L/9.8).*(1./(1-k.^2.*sin(x).^2)); 
 end