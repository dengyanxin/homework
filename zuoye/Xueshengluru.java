public class Xueshengluru{
	public static void main(String[] arges){
		Xuesheng[] a = new Xuesheng[4];

        Xuesheng b = new Xuesheng("����",19,'��');
        a[0] = b;
        Xuesheng c = new Xuesheng("����",19,'Ů');
        a[1] = c;
		Xuesheng d = new Xuesheng("�����",20,'��');
		a[2] = d;
		Xuesheng e = new Xuesheng("¶��",18,'Ů');
		a[3] = e;

        for(int i = 0;i<a.length;i++){
            a[i].say();
        }
	}
}