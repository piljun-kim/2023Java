package sec01;

public class ifelseifelseExample {
	public static void main(String[] args) {
		int score = 75;
		
		if(score>=90) {
			System.out.println("점수가 100~90사이 입니다.");
			System.out.println("등급은 A등급 입니다.");
		} else if(score>=80) {
			System.out.println("점수가 80~89사이 입니다.");
			System.out.println("등급은 B등급 입니다.");
		} else if(score>=70) {
			System.out.println("점수가 70~79사이 입니다.");
			System.out.println("등급은 C등급 입니다.");
		} else {
			System.out.println("점수가 70 미만 입니다.");
			System.out.println("등급은 D등급 입니다.");
		}
	}

}
