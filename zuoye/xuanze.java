//ѡ��
public class xuanze {
    public static void main(String[] args) {
        int[] arr={1,3,2,45,65,33,12};
        System.out.println("����֮ǰ��");
        for(int num:arr){
            System.out.print(num+" ");
        }        
        //ѡ��������Ż�
        for(int i = 0; i < arr.length - 1; i++) {// ����i������
            int k = i;
            for(int j = k + 1; j < arr.length; j++){// ѡ��С�ļ�¼
                if(arr[j] < arr[k]){ 
                    k = j; //����Ŀǰ�ҵ�����Сֵ���ڵ�λ��
                }
            }
            //���ڲ�ѭ��������Ҳ�����ҵ�����ѭ������С�����Ժ��ٽ��н���
            if(i != k){  //����a[i]��a[k]
                int temp = arr[i];
                arr[i] = arr[k];
                arr[k] = temp;
            }    
        }
        System.out.println();
        System.out.println("������");
        for(int num:arr){
            System.out.print(num+" ");
        }
    }

}



