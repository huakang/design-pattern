package cn.nsfz.clsl.hk.singleton;

public class SingleTonEx1 {
    private static SingleTonEx1 st = new SingleTonEx1();
	
	private SingleTonEx1(){
		
	}

	public static SingleTonEx1 getInstance() {
		return st;
	}

}
