package cn.nsfz.clsl.hk.singleton;

public class SingleTonEx3 {
	
	private SingleTonEx3(){
		
	}

	public static class SingleTonBuilder{
		public final static SingleTonEx3 st = new SingleTonEx3();			
	}
	
	public static SingleTonEx3 getInstance() {
		return SingleTonBuilder.st;
	}

}
