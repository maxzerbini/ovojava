package ovo.client.util;

public class HashCodeHelper {
	public static int GetHashCode(String key)
    {
        int hash1 = 5381;
        int hash2 = 5381;
        int c;
        char[] s = key.toCharArray();
        for (int i = 0; i < s.length; i++)
        {
            c = s[i];
            if (i % 2 == 0)
            {
                hash1 = ((hash1 << 5) + hash1) ^ c;
            }
            else
            {
                hash2 = ((hash2 << 5) + hash2) ^ c;
            }

        }
        hash1 = hash1 + (hash2 * 1566083941);
        return hash1;
    }
    public static int GetPositiveHashCode(String key, int maxNum)
    {
        int hash1 = 5381;
        int hash2 = 5381;
        int c;
        char[] s = key.toCharArray();
        for (int i = 0; i < s.length; i++)
        {
            c = s[i];
            //Console.WriteLine("" + i + " " + c);
            if (i % 2 == 0)
            {
                hash1 = ((hash1 << 5) + hash1) ^ c;
            }
            else
            {
                hash2 = ((hash2 << 5) + hash2) ^ c;
            }

        }
        hash1 = hash1 + (hash2 * 1566083941);
        if (hash1 < 0) hash1 = (-1) * hash1;
        return hash1 % maxNum;
    }
}
