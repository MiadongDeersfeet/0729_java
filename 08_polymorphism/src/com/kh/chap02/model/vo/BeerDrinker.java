package com.kh.chap02.model.vo;

public class BeerDrinker extends Drinker {
	
	private boolean gout;
	
	public BeerDrinker() {}
	public BeerDrinker(boolean gout) {
		this.gout = gout;
	}
	
	public void setGout(boolean gout) {
		this.gout = gout;
	}
	
	public boolean isGout() {
		return gout;
	}
	
	@Override
	public void drink() {
		System.out.println("¸ÆÁÖ¸¦ ÇÑ ÀÔ ¸¶½Ê´Ï´Ù. ²Ü²©²Ü²©");
		
	}
	
	@Override
	public void eat() {
		System.out.println("Ä¡Å²À» ÇÑ ÀÔ ¸Ô½À´Ï´Ù. ¿è‡œ‡œ¿è‡œ");
	}
}
