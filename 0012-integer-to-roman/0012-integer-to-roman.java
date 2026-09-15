class Solution {
    public String intToRoman(int num) {
        List<Integer>val=List.of(1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1);
        List<String>sys=List.of("M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I");
        String res="";
        for(int i=0; i<13; i++){
            if(num==0){
                break;
            }
            int times=num/val.get(i);
            while(times!=0){
                res=res+sys.get(i);
                times--;
            }
            num=num%val.get(i);
        }
        return res;
    }
}