% Competition Differential Equation Model 
 function deqn = CompetitionEquations(t,var) 
 global rx ry cxy cyx 
 x = var(1); 
 y = var(2); 
 deqn = [(rx-rx*x-cyx*y)*x; (ry-ry*y-cxy*x)*y]; 
 end