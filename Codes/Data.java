public class Data{
    private int day;
    private int month;
    private int year;

    // 7 - Como garantir que datas como 31/02 não sejam aceitas pela class Data?
    public Data(int day, int month, int year){
        switch (month) {
            case 1:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            
            case 2:
                if(!(day < 1 || day > 28)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            
            case 3:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 4:
                if(!(day < 1 || day > 30)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 5:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 6:
                if(!(day < 1 || day > 30)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;  
            case 7:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 8:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 9:
                if(!(day < 1 || day > 30)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 10:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 11:
                if(!(day < 1 || day > 30)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            case 12:
                if(!(day < 1 || day > 31)){
                    this.day = day;
                }else{
                    this.day = 1;
                }
                break;
            default:
                break;
        }
        if(month < 1 && month > 12){
            this.month = 1;
        }else{
            this.month = month;
        }

        if(year > 2022){
            this.year = 2022;
        }else{
            this.year = year;
        }
    }

    public int getDay(){
        return day;
    }

    public int getMonth(){
        return month;
    }

    public int getYear(){
        return year;
    }

    public String dataString() {
        return (day + "/" + month + "/" + year);
    }

}