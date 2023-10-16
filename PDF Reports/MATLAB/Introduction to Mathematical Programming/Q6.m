function deqn = Q6(t,var) 
 x = var(1); 
 y = var(2); 
 deqn = [2*x-x.^2-x*y; x*y-y]; 
 end