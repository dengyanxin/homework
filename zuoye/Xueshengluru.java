public class Xueshengluru{
	public static void main(String[] arges){
		Xuesheng[] a = new Xuesheng[4];

        Xuesheng b = new Xuesheng("ÂÀ²¼",19,'ÄĞ');
        a[0] = b;
        Xuesheng c = new Xuesheng("õõ²õ",19,'Å®');
        a[1] = c;
		Xuesheng d = new Xuesheng("ËïÎò¿Õ",20,'ÄĞ');
		a[2] = d;
		Xuesheng e = new Xuesheng("Â¶ÄÈ",18,'Å®');
		a[3] = e;

        for(int i = 0;i<a.length;i++){
            a[i].say();
        }
	}
}