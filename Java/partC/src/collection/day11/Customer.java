package collection.day11;

//고객 정보 클래스 
public class Customer {
    private String name;
    private String phone;
    private int group ;     //1:일반  2:vip   3:기타


    //커스텀 생성자 :3개 필드 초기화

    //getter


    //setter X
    //정보 변경 메소드
    public void modify(String phone,int group){
        this.phone = phone;
        this.group= group;
    }

    //toString(테스트용)

}
