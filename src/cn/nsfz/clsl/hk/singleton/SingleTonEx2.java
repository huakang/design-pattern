package cn.nsfz.clsl.hk.singleton;

public class SingleTonEx2 {
    private static SingleTonEx2 st;
    
    private SingleTonEx2(){
    	
    }

    public static SingleTonEx2 getInstance() {
        if(st==null){
            st = new SingleTonEx2();
    }
        return st;
    }

}
