//�Զ�����ת����ϰ��
public class Demo07Convert {
	public static void main(String[] args){
		int i = 1; 
		double d = 2.5;
		/*
			�����:
			d��double����(ռ8���ֽ�),i��int����(ռ4���ֽ�),���Ͳ�һ��,�ᷢ���Զ�����ת��
			��int���͵�i,�Զ�����ת��Ϊdouble����,��int���͵�i�е�����1���1.0(double����)
			double + int ==> double + double ==> double �����double����(ռ8���ֽ�),
			����ֱ�Ӹ�ֵ������int���ͱ���x(ռ4���ֽ�)
			
			���ܲ�����ֱ�ӷ���С����
			�������:
				1.�ѿӱ��(Ŀǰ�������ַ�ʽ)
				2.���ܲ���С(����������ַ�ʽ: ǿ������ת��)
		*/
		//int x = d + i;
		
		/*
			��ȷ��:
			d��double����(ռ8���ֽ�),i��int����(ռ4���ֽ�),���Ͳ�һ��,�ᷢ���Զ�����ת��
			��int���͵�i,�Զ�����ת��Ϊdouble����,��int���͵�i�е�����1���1.0(double����)
			double + int ==> double + double ==> double �����double����(ռ8���ֽ�),
			����ֱ�Ӹ�ֵ������double���ͱ���x(ռ8���ֽ�)			
		*/
		double x = d + i;
		
		System.out.println(x);//3.5
	}
}