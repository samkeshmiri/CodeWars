const map = new Map<string, number>();
map.set("I", 1);
map.set("V", 5);
map.set("X", 10);
map.set("L", 50);
map.set("C", 100);
map.set("D", 500);
map.set("M", 1000);

function fromRoman(romanNumber: string) {
    let result = 0;

    for (let i = 0; i < romanNumber.length; i++) {
        let current = map.get(romanNumber[i])!;
        let next = map.get(romanNumber[i + 1]) || 0;

        if (current < next) {
            result -= current;
        } else {
            result += current;
        }
    }
    return result
}

console.log(fromRoman("XXI"));