package com.yanxin;

public class R {
	int count;
	public R(int count){
		this.count=count;
	}
	public String toString(){
		return "R(count Ù–‘£∫"+ count + ")";
	}
	public boolean equals(Object obj){
		if(obj instanceof R){
			R r = (R)obj;
			if(r.count == this.count){
				return true;
			}
		}
		return false;
	}
} 
