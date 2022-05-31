public class Test002 {


    public static void main(String[] args){
        String[] betRange = {
                "1050","10050", "100500","1000500","105",
                "2500",
                "5000",
                "15000",
                "25000",
                "50000",
                "75000",
                "150000",
                "250000",
                "500000",
                "1250000",
        };
        String[] betString = setLineTotalBetToKilo(betRange);
        for(int i = 0 ; i < betString.length; i++){
            System.out.println(" -" + betString[i]);
        }
    }


    //將LineTotalBet轉成LineTotalBetKilo (即原數除以1000,後綴K)
    static public String[] setLineTotalBetToKilo(String[] lineTotalBet){
        String[] lineTotalBetKilo = new String[lineTotalBet.length];
        for(int i = 0; i < lineTotalBet.length; i++){
            if(lineTotalBet[i].length() < 4){							//位數低於4位數直接忽略 避免跳錯
                lineTotalBetKilo[i] = lineTotalBet[i];
                continue;
            }
            StringBuilder sb = new StringBuilder(lineTotalBet[i]);
            sb.insert(sb.length() - 3 , '.');					//加上小數點
            System.out.println(sb.toString());
            System.out.println("SB.len: " + sb.length());
            for(int j = 1; j <= 4; j++){								//去除小數點後不必要的'0', 如果都是'0' 連同小數點也去除
                if(sb.charAt(sb.length() - 1) == '0' || sb.charAt(sb.length() - 1) == '.')
                    sb.deleteCharAt(sb.length() - 1);
                else break;
            }
            System.out.println(" -> " + sb.toString());
            sb.append('K');												//最後加上"K"
            lineTotalBetKilo[i] = sb.toString();
        }
        return lineTotalBetKilo;
    }


}
