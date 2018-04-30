/*
*

+	addition
-	subtraction
*	multiplication
/	division
%	modulus (remainder)
++ 	Increment
-- 	Decrement


==	is equal to
>=	is greater than or equal to
<=	is less than or equal to
<	is less than
>	is greater than
!=	is not equal to


&&  logic AND
||  logic OR
!   logic NOT
& 	Bitwise AND
| 	Bitwise inclusive OR
~ 	Unary bitwise complement
^ 	Bitwise exclusive OR
<< 	Signed left shift
>> 	Signed right sift
>>> Unsigned right shift


= 	    z = x + y 	z = (x + y)
+=  	x += y 	    x = (x + y)
-=  	x -= y 	    x = (x - y)
*=  	x *= y 	    x = (x * y)
/=  	x /= y 	    x = (x / y)
%=  	x %= y 	    x = (x % y)
<<= 	x <<= y 	x = (x << y)
>>= 	x >>= y 	x = (x >> y)
&= 	    x &= y 	    x = (x & y)
|= 	    x |= y 	    x = (x | y)
^=  	x ^= y 	    x = x^y

? :     ternary     min=(a<b)?a:b;



* */

import java.util.function.DoubleToIntFunction;

public class Operators {

    public static void main (String args[]){

        int i=2;
        //increment-decrement
        i++;
        i--;
        ++i;
        --i;

        //ternary if yapısıdır. ifade sağlanıyorsa soldaki sağlamıyorsa sağdaki sonuçtur.
        int b=0;
        b=i<5? i*3:i*5;


        //logic
        int word = 0b00101010;
        int mask = 0b00000011;   // Mask for masking out all but the bottom
                                // two bits of a word
        int lowBits = word & mask; // -> 0b00000010
        int highBits = word & ~mask; // -> 0b00101000


        String str="Şammas Çölkesen";
        System.out.println("HOşgeldin"+ str);
    }
}
