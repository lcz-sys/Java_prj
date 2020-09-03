package cn.gdcp.system.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * ������ܹ�����
 * ��������123456->��������e10adc3949ba59abbe56e057f20f883e
 */
public final class Md5Util {

	/**
	 * ������new��������
	 */
	private Md5Util(){}

	/**
	 * ����������ת�ɰ������� 
	 */
	public static String encodeByMd5(String password) {
		//Java��MessageDigest���װ��MD5�㷨
		MessageDigest md5;
		try {
			md5 = MessageDigest.getInstance("MD5");
			//����MD5�㷨������16��byte���͵�ֵ
			byte[] byteArray = md5.digest(password.getBytes());
	
			//ע�⣺MessageDigestֻ�ܽ�Stringת��byte[]�������������飬�����ǳ���Ա�����
			//��byte[]ת��16�����ַ���
			return byteArrayToHexString(byteArray);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	/**
	 * ��byte[]ת��16�����ַ��� 
	 */
	private static String byteArrayToHexString(byte[] byteArray) {
		StringBuffer sb = new StringBuffer();
		//����
		for(byte b : byteArray){//16��
			//ȡ��ÿһ��byte���ͣ�����ת��
			String hex = byteToHexString(b);

			//��ת�����ֵ����StringBuffer��
			sb.append(hex);
		}
		return sb.toString();
	}

	/**
	 * ��byteת��16�����ַ��� 
	 */
	private static String byteToHexString(byte b) {
		//��byte���͸���int����
		int n = b;

		//���n�Ǹ���
		if(n < 0){
			//ת������-31��16���������ȼ�����225��16������ 
			n = 256 + n;
		}

		//��(14)��������±�
		int d1 = n / 16;

		//��(1)��������±�
		int d2 = n % 16;

		//ͨ���±�ȡֵ
		return hex[d1] + hex[d2];
	}
	
	/**
	 * װ16�����ַ�����String[]
	 */
	private static String[] hex = {"0","1","2","3","4","5","6","7","8","9","a","b","c","d","e","f"};

	/**
	 * ����
	 */
	public static void main(String[] args) throws Exception{
		String password = "250";
		String passwordMD5 = Md5Util.encodeByMd5(password);
		System.out.println("�������룺" + password);
		System.out.println("�������룺" + passwordMD5);
	}
}
