
package calculadora;

import java.util.Scanner;

public class Calculadora {


    public static void main(String[] args) {
    Scanner ler =new Scanner (System.in);
    OperacoesBasicas op = new OperacoesBasicas();
    OperacoesAvancadas av =new OperacoesAvancadas();
     
System.out.println("Digite um numero: ");
double num1 =ler .nextDouble();

System.out.println("Digite o segundo numero: ");  
double num2 =ler. nextDouble();

System.out.println("Digite  a operação desejada... \n (Soma = 1)(Subtração =2) \n(multiplicaçao = 3)(Divisão =4) \n(Raiz =5)(potencia =6)(Percentual =7)");
int operacao = ler.nextInt();

double resultado =0;
        
switch(operacao){
            
case 1:   
resultado = op.soma(num1, num2);
break;    
case 2:
resultado = op.subtracao(num1,num2);
break;
case 3 :
resultado =op.multiplicacao(num1, num2);
break;
case 4: 
resultado =op.divisao(num1, num2);
break;
case 5:
resultado =av.Raiz(num1);
break;
case 6:
resultado =av.Potencia(num1, num2);
case 7 :
resultado =av.Percentual(num1, num2);
break;
default:
break;

}        
System.out.println("resultado :" + resultado);            
}     
}