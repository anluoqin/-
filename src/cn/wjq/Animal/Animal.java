package cn.wjq.Animal;

public class Animal {
	public String name ;
	private String bird = "���fly";
	private String wolf = "�ᱼ��run";
	public void Gongxin() {
		System.out.print(this.name+"�Ƕ�����������к���");
	}
	public String getBird() {
		return bird;
	}
	public void setBird(String bird) {
		this.bird = bird;
	}
	public String getWolf() {
		return wolf;
	}
	public void setWolf(String wolf) {
		this.wolf = wolf;
	}
	

}
