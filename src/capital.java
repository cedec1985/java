
import java.io.IOException;
class SommeDargent {
    public static void main (String[] args) throws IOException{
int capital = 10000000,
reste, b500,b200,b100,b50,b10;
assert capital>0 && capital%10 ==0;
b500 = capital/500;
reste = capital%500;
assert capital == b500*500+reste;
b200= reste/200;
reste %=200;
assert capital == b500*500+b200*200+reste;
b100=reste/100;
reste%=100;
assert capital == b500*500+b200*200+b100*100+reste;
b50=reste/50;
reste%=50;
assert capital == b500*500+b200*200+b100*100+b50*50+reste;
b10=reste/10;
assert capital == b500*500+b200*200+b100*100+b50*50+b10*10;
System.out.println(b500+""+b200+""+b100+""+b50+""+b10);}}

