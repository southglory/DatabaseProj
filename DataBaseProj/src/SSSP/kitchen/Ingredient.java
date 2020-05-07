package SSSP.kitchen;
/*
check point
1.영수증리뷰 - 일반리뷰 구분?
2.결제한메뉴에 대해서만 평가 가능
3.평가분야 - 맛, 서비스, 가격, 음식양 / 총합 (별 갯수로 표시★★★★☆)

(기본)샐러드, 연어샐러드, 참치샐러드
(샐러드기본 포함재료 구성 : 양상추1 치커리1 토마토1 콩1 옥수수1)

치즈오븐스파게티, 알리올레오스파게티, 크림소스스파게티, 로제스파게티
(스파게티기본 포함재료 구성 : 면1 소스1 오일1)

페퍼로니피자, 고구마피자, 포테이토피자, 베이컨피자, 치즈피자
(피자기본 포함 재료 구성 : 치즈1 빵 1 소스1)

두부샌드위치, 콩고기샌드위치, 치킨샌드위치, 계란샌드위치, 치즈샌드위치
(샌드위치기본 포함 재료 구성 : 빵 1 양상추1 토마토1 양파1)
 */
public class Ingredient {

	private int num;
	private String name;


	public Ingredient() {
		}

	public Ingredient(int num, String name) {
			this.num = num;
			this.name = name;
		}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Ingredient [num=" + num + ", name=" + name + "]";
	}

}
