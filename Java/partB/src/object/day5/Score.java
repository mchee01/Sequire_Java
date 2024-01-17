package object.day5;

//학생들의 성적을 객체로 만들어 줄 클래스 입니다.
public class Score {
    //인스턴스 필드
    private String name;    //학생 이름
    private int grade;      //학년
    private int[] jumsues;  //점수들이 저장될 배열
                            //배열의 크기는 학년마다 다를 수 있음.

    // 인스턴스 메소드 : 인스턴스 필드를 사용하는 처리를 합니다.
    //getter
    public String getName() {
        return name;
    }
    public int getGrade() {
        return grade;
    }
    public int[] getJumsues() {
        return jumsues;
    }

    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setJumsues(int[] jumsues) {
        this.jumsues = jumsues;
    }

    //현재 객체의 점수의 합계(개인 총점)를 리턴하는 sum() 메소드
    public int sum() {
        int sum=0;
        for(int i=0;i<jumsues.length;i++)
                sum+=jumsues[i];
        return sum;
    }
    //점수의 평균 double 리턴하는 average() 메소드
    public double average(){
        return (double)sum()/jumsues.length;
    }
    //모든 인스턴스 필드값을 확인 출력 하는 printScore() 메소드
    public void printScore(){
        System.out.println("총점 : " + sum());
        System.out.println("과목 개수 : " + jumsues.length);
        System.out.println("평균 : " + average());
    }

 

}
