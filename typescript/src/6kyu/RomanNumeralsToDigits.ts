const map = new Map<string, number>();
map.set("I", 1);
map.set("IV", 4);
map.set("V", 5);
map.set("IX", 9);
map.set("X", 10);
map.set("XL", 40);
map.set("L", 50);
map.set("XC", 90);
map.set("C", 100);
map.set("CD", 400);
map.set("D", 500);
map.set("CM", 900);
map.set("M", 1000);

function fromRoman(romanNumber: string) {
    if (map.has(romanNumber)) {
        return map.get(romanNumber)!;
    } else {
        let result = 0;

        for (let i = 0; i < romanNumber.length - 1; i++) {
            let numeral = romanNumber.substring(i, i + 2);
            if (map.has(numeral)) {
                result += map.get(numeral)!;
                romanNumber = romanNumber.replace(numeral, "");
            }
        }

        //solve last 2 letters
        for (let i = 0; i < romanNumber.length; i++) {
            result += map.get(romanNumber[i])!;
        }
        return result;
    }
}
console.log(fromRoman("MMXXII"));