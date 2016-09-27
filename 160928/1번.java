package absolute;

import java.util.Calendar;

public class CreditCard {
  private long number;
  private String owner;

  private int point;
  private String date;
  


  public void setNumber(long number) {
    this.number = number;
  }



  public void setOwner(String owner) {
    this.owner = owner;
  }



  public void setDate(int year,int month, int day) {
    Calendar now = Calendar.getInstance(); //Calendar 클래스를 받아 내기 위한 선언문
    
    if(year>now.get(Calendar.YEAR)){ //오늘의 연도보다 입력한 year이 높다면 에러 메세지 표출
      System.out.println("사용기한이 지난 날짜입니다(년)");
      return;
    }else if(year<now.get(Calendar.YEAR)){  //오늘의 연도보다 입력한 연도가 낮으면 사용가능한 카드이므로 날짜 입력
      this.date = year+"-"+month+"-"+day; //날짜 입력 구문
      return;
    }else if(month==now.get(Calendar.MONTH)+1){ //오늘의 월보다 입력한 월이 같으면 사용가능한 카드이므로 일단 패스 
      if(day>now.get(Calendar.DATE)){ //오늘의 월보다 같은 월이니 day를 확인해서 day 가 오늘날 보다 큰 경우 사용기한이 지났으므로 에러메세지 표출 -->날짜의 일을 뺄 경우 지워도 됨{
        System.out.println("사용기한이 지난 날짜입니다(일)");
        return;
      }else if(day<=now.get(Calendar.DATE)){ //오늘의 월보다 같은 월이니 day를 확인해서 day 가 오늘날 보다 작은 경우 사용가능한 카드이므로 날짜 입력 -->날짜의 일을 뺄 경우 지워도 됨{
        this.date = year+"-"+month+"-"+day; //날짜 입력 구문
        return;
      }// } 요기까지 지우시면 됩니다
    }else if(month>now.get(Calendar.MONTH)+1){  //오늘의 월보다 큰 월 이므로 오류메세지 표출
      System.out.println("사용기한이 지난 날짜입니다(월)");
      return;
    }else if(month<now.get(Calendar.MONTH)+1){ //오늘의 월보다 작은 월 경우 사용가능한 카드이므로 날짜 입력 -->날짜의 일을 뺄 경우 지워도 됨{
      this.date = year+"-"+month+"-"+day;
      
      return;
    } //} 요기까지 지우면 됩니다
    else if(day>now.get(Calendar.DATE)){ //입력한 일이 오늘날보다 큰 경우 사용기한이 지났으므로 에러메세지 표출 -->날짜의 일을 뺄 경우 지워도 됨{
      System.out.println("유효하지 않은 날짜입니다(일)");
      return;
    } //} 요기까지 지우면 됩니다
    
    this.date = year+"-"+month+"-"+day; //위에 모든 제약조건을 통과했으므로 날짜 입력이 됩니다
  }



  public void setPoint(int point){
    this.point=point;
    
  }
  public int getPoint(){
    return this.point;
  }
  
  public void usePoint(int point){
    
    this.point-=point;
  }
  public void display(){
    if(this.owner==null||this.date==null){ //위 날짜유효성검사 함수가 잘못되었을 경우 date 변수가 null 이 입력 됩니다 그래서 사용불가능 한 카드이므로 빈값을 출력합니다
      return;
    }else if(this.point<=100){
      System.out.println("100이하 포인트는 쓸 수 없습니다");
      return;
    }
    System.out.println("카드번호: "+ this.number);
    System.out.println("카드소유자: "+ this.owner);
    System.out.println("누적 포인트: "+this.point);
    System.out.println("등록일자: "+this.date);
    
    System.out.println("사용가능한 카드 입니다");
  }

  
  
}
