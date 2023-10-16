function g = Q1(r,xn)
for i = 0:20 
    yn = r*xn.*exp(-xn); 
    figure(1)
    plot([xn xn],[xn yn],'LineWidth',3) 
    hold on
    pause(2)
    plot([xn yn],[yn yn],'LineWidth',3)
    pause(2)
    figure(2)
    plot([i],[yn],'.','MarkerSize',30) 
    hold on 
    xn1 = yn;
    xn = xn1; 
end