package cn.wjq.Dongwu;

import cn.wjq.Animal.Bird;
import cn.wjq.Animal.Wolf;

public class Dongwu {

	public static void main(String[] args) {
		Bird niao =new Bird();
		niao.name = "Äñ";
		niao.Gongxin();
		System.out.println(niao.getBird());
		Wolf lang = new Wolf();
		lang.name = "ÀÇ";
		lang.Gongxin();
		System.out.println(lang.getWolf());
				
	}

}
