public class Home_Work_1 {
    public static void main(String[] args) {
        byte b = 0;
        short srt = 0;
        int i = 0;
        long lng = 0;
        boolean flag = false;
        String s = "Р’Р°СЃСЏ";
    }

    public static float calcByFormula(float a,float b,float c,float d){
        float result = 0;
        if(d ==0)
            return result;
        result = a * (b + (c / d));
        return result;
    }

    public static boolean isCorrectRange(float a,float b){
        float sum = a + b;
        return sum >= 10 & sum <= 20;
    }

    public static void printPosOrNeg(int chk){
        if(chk >= 0)
            System.out.println(chk + " is positive");
        else
            System.out.println(chk + " is negative");
    }

    public static boolean isNegative(int chk){

        return chk < 0;
    }

    public static void SayHello(String name){
        System.out.printf("РџСЂРёРІРµС‚ %s!\n",name);
    }

    public static void AnalyzeLeapYear(int year){
        if(year % 4 == 0){
            if(year % 400 == 0)
                System.out.printf("%s РІРёСЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ",year);
            else  if(year % 100 == 0)
                System.out.printf("%s РѕР±С‹С‡РЅС‹Р№ РіРѕРґ",year);
            else
                System.out.printf("%s РІРёСЃРѕРєРѕСЃРЅС‹Р№ РіРѕРґ",year);
        }
        else
            System.out.printf("%s РѕР±С‹С‡РЅС‹Р№ РіРѕРґ",year);
    }

}
