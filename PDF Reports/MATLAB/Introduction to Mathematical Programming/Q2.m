% function dTdt = Q2(t,x) 
% dTdt = [100-0.01*x]; 
% end

%function dTdt = Q2(t,x) 
% dTdt = [0.02*x - 0.00002*x.^2]; 
%end 

function dTdt = Q2(t,x) 
 dTdt = [-0.0000004.*x.^3 + 0.00042.*x.^2 - 0.02.*x]; 
end