t=float(input("Tiempo: "))
t1=(t*(1/(60*60*24)))
t2=(t1-int(t1))*24
t3=(t2-int(t2))*60
##print("segundos equivalen a:     ", t1, " Dias     ", t*(1/(60*60))," Horas     ", t*(1/(60))," Minutos     ",t," Segundos")
print("segundos equivalen a: ",t2)