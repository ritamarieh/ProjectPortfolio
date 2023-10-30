%Newton's Second Law
% T = 4√(L/g) int 0 to pi/2 (dx/(√(1-k^2*sin^2(x)))
function fvalue = Q7(x,k,L) 
 fvalue =4.*sqrt(L/9.8).*(1./(1-k.^2.*sin(x).^2)); 
 end
