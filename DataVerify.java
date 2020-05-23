package villageBanks;

import javax.swing.text.AttributeSet;
import javax.swing.text.PlainDocument;

public class DataVerify
{
	public DataVerify()
	{
		// TODO Auto-generated constructor stub
	}

	// ��Ϣ����Ϊ��
	public boolean emptyText(String text)
	{
		if (text.length() == 0)
		{
			return true;
		} else
		{
			return false;
		}
	}

	// ����λ������
	public boolean amountPassword(String password)
	{
		if (password.length() >= 6 && password.length() <= 20)
		{
			return true;
		} else
		{
			return false;
		}
	}

	// ���������Ƿ���ͬ�ж� ����Ҫ��6-20λ
	public boolean samePassword(String password, String password2)
	{
		if (password.equalsIgnoreCase(password2))
		{
			return true;
		} else
		{
			return false;
		}
	}

	// �ֻ������ʽ�ж�
	public boolean phoneVerify(String text)
	{
		int size = text.length();
		if (size == 11)
		{
			return true;
		} else
		{
			return false;
		}

	}

	// ���֤�����ʽ�ж�
	public boolean cardVerify(String text)
	{
		int size = text.length();
		if (size == 18)
		{
			return true;
		} else
		{
			return false;
		}

	}

	// �����¼��ı�����˷�������
	public NumberTextField newNumberTextField()
	{
		return new NumberTextField();
	}

	// �ж��Ƿ�Ϊ������
	public boolean isutf_8(String name)
	{
		char nameArray[] = name.toCharArray();
		
		for (int i = 0; i < nameArray.length; i++)
		{
			if (nameArray[i] <= 0x4E00 || nameArray[i] >= 0x29FA5)
			{
				return false;
			}
		}
		return true;
	}

	public boolean idVerify(String text)
	{
		int size = text.length();
		if (size == 19)
		{
			return true;
		} else
		{
			return false;
		}
	}
	
	// �ı�����˷�����
	class NumberTextField extends PlainDocument
	{
		public NumberTextField()
		{
			super();
		}

		public void insertString(int offset, String str, AttributeSet attr) throws javax.swing.text.BadLocationException
		{
			if (str == null)
			{
				return;
			}

			char[] s = str.toCharArray();
			int length = 0;
			// ���˷�����
			for (int i = 0; i < s.length; i++)
			{
				if ((s[i] >= '0') && (s[i] <= '9'))
				{
					s[length++] = s[i];
				}
				// ��������
				super.insertString(offset, new String(s, 0, length), attr);
			}
		}
	}
}
