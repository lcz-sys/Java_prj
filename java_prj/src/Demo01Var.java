//������������ָ�ʽ
public class Demo01Var {
	public static void main(String[] args){
		/*
			��������ĸ�ʽһ:
				�������� �������� = ����ֵ;//��һ����,ͬʱ��ÿ�����һ���ܲ�
		*/
		//����һ��byte����(ռ1���ֽ�)�Ŀ�,�����������һ�����ֽ���a,ͬʱ��ÿ��з�������10
		byte a = 10;
		
		System.out.println(a);//��ӡ����Ϊa�Ŀ��е�����: 10
		
		/*
			��������ĸ�ʽ��:
				�������� ��������;//����һ����
				�������� = ����ֵ;//Ȼ����ÿ�����һ���ܲ�
		*/
		short b;//����һ��short����(ռ2���ֽ�)�Ŀ�,�����������һ�����ֽ���b
		
		b = 20;//������20�洢������Ϊb�Ŀ���
		
		System.out.println(b);//��ӡ����Ϊb�Ŀ��е�����: 20
		
		/*
			��������ĸ�ʽ��:
				//�ڶ����,ͬʱ�ֱ���ÿ��������һ���ܲ�
				�������� ��������1 = ����ֵ1,��������2 = ����ֵ2,... ;
		*/
		//��������int����(ռ4���ֽ�)�Ŀ�,��һ���ӵ����ֽ���c,�ڶ����ӵ����ֽ���d
		//ͬʱ������30�洢������Ϊc�Ŀ���,������40�洢������Ϊd����,
		int c = 30, d = 40;
		System.out.println(c);//��ӡ����Ϊc�Ŀ��е�����: 30
		System.out.println(d);//��ӡ����Ϊd�Ŀ��е�����: 40
		
		/*
			��������ĸ�ʽ��:
				�������� ��������1,��������2,... ;//���ڶ����
				��������1 = ����ֵ1;//���һ��������һ���ܲ�
				��������2 = ����ֵ2;//��ڶ���������һ���ܲ�
		*/
		//��������long����(ռ8���ֽ�)�Ŀ�,��һ���ӵ����ֽ���e,�ڶ����ӵ����ֽ���f
		long e,f;
		e = 50L;//������50�洢������Ϊe�Ŀ���
		f = 60L;//������60�洢������Ϊf�Ŀ���
		
		System.out.println(e);//��ӡ����Ϊe�Ŀ��е�����: 50
		System.out.println(f);//��ӡ����Ϊf�Ŀ��е�����: 60
	}
} 