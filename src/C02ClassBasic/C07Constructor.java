package C02ClassBasic;


public class C07Constructor {
    public static void main(String[] args) {
        /// 캘린더 객체 생성: 연도, 월, 일 세팅
        Calendar cal1 = new Calendar("2025", "06", "18");
//        cal1.setYear("2025");
//        cal1.setMonth("06");
//        cal1.setDay("18");

        /// 캘린더 객체 출력: "오늘은 xxxx년 xx월 xx일 입니다."
        /// toString 메서드는 특별한 메서드로 객체명을 출력할 때 자동으로 실행
        System.out.println(cal1.toString());

    }
}

/// Calendar 클래스 생성: year, month, day 모두 String
class Calendar {
    private String year;
    private String month;
    private String day;

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    /// 생성자를 통해 객체 변수값들을 객체가 만들어지는 시점에 초기화(세팅)
    public Calendar(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /// 위와 같이 별도 생성자를 추가할 경우 기본 생성자는 무시되므로 필요 시 추가해야 한다.
    public Calendar() {
    }


    @Override
    public String toString() {
        return "오늘은 " + this.year + "년 " + this.month + "월 " + this.day + "일 입니다.";
    }
}


