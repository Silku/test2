package chapter5;

public class Car {
		public String company; //자동차 회사
		public String model; //자동차 모델
		public String color; //색상
		public int maxSpeed; //최대 속도
		public int speed; //현재 속도
		
		public Car() { //생성자
			
		}
		
		public Car(String cp, String m, String c, int ms) { //생성자 오버로딩
			company = cp;
			model = m;
			color = c;
			maxSpeed = ms;
			speed = 0;
		}
		
		void speedUp() {
			if(speed < maxSpeed) {
				speed += 5;
			}else{
				System.out.println("더이상 속도를 올릴 수 없습니다.");
			}
		}
		
		void speedDown() {
			if(0 < speed) {
				speed -= 5;
			}else{
				System.out.println("차량이 정지 상태입니다.");
			}
		}
		
		void carInfo() {
			if(speed < maxSpeed && speed > 0) {
				System.out.println("현재 속도: 시속 " + speed +"km");
			}else {
				System.out.println("차량이 정지 상태입니다.");
			}
		}
	}