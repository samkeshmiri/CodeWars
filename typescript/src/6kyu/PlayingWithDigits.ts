// https://www.codewars.com/kata/5552101f47fc5178b1000050/typescript

class G964 {

    public static digPow = (n: number, p: number) => {
        
        let numberAsString = n.toString();
        let exponent = p;
        let total = 0;

        for (let i = 0; i < numberAsString.length; i++) {
            let num = +numberAsString[i];

            total += Math.pow(num, exponent);
            exponent++;
        }

        return (total % n == 0 ? total / n : -1);
    }
}

console.log(G964.digPow(89, 1)); // 1
console.log(G964.digPow(114, 3)); // 9
