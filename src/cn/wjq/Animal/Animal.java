package cn.wjq.Animal;

public class Animal {
	public String name ;
	private String bird = "会飞fly";
	private String wolf = "会奔跑run";
	public void Gongxin() {
		System.out.print(this.name+"是动物，有心跳，有呼吸");
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
