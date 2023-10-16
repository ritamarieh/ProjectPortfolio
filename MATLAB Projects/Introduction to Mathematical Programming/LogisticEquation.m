% Logistic Differential Equations 
 function dxdt = LogisticEquation(t,x) 
 global r K 
 dxdt = [r*x*(1-x/K)]; 
 end