 public class Box {
	 int len,bre,hei;
	public Box(int len,int bre,int hei) {
		this.len=len;
		this.bre=bre;
		this.hei=hei;
		
	}
	int calcVolume()
	{
		return len*bre*hei;	
	}

	public static void main(String[] args) {
		
		Box b = new Box(10,12,14);
		
		System.out.println("Volume : "+b.calcVolume());
	}

}
