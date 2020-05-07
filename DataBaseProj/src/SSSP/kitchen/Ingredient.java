package SSSP.kitchen;
/*
check point
1.���������� - �Ϲݸ��� ����?
2.�����Ѹ޴��� ���ؼ��� �� ����
3.�򰡺о� - ��, ����, ����, ���ľ� / ���� (�� ������ ǥ�áڡڡڡڡ�)

(�⺻)������, ���������, ��ġ������
(������⺻ ������� ���� : �����1 ġĿ��1 �丶��1 ��1 ������1)

ġ����콺�İ�Ƽ, �˸��÷������İ�Ƽ, ũ���ҽ����İ�Ƽ, �������İ�Ƽ
(���İ�Ƽ�⺻ ������� ���� : ��1 �ҽ�1 ����1)

���۷δ�����, ��������, ������������, ����������, ġ������
(���ڱ⺻ ���� ��� ���� : ġ��1 �� 1 �ҽ�1)

�κλ�����ġ, ���������ġ, ġŲ������ġ, ���������ġ, ġ�������ġ
(������ġ�⺻ ���� ��� ���� : �� 1 �����1 �丶��1 ����1)
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
