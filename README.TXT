4 estados: 
-pendiente de pago=1
-confirmadas=2
-canceladas=3
-verificadas=4

1etapa, proceso de reserva. 3 hilos
los 3 hilos se metene en la matriz de butacas de forma aleatoria(Clase Randon)
verifican cual esta disponible, si esta disponible lo marca como OCUPADO o
sino busca otro disponible