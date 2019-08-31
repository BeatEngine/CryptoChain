public class CryptoChain
{
    public static byte[] encryptBlockwise(byte[] key, byte[] data)
    {
        byte[] newd = new byte[data.length];
        int k = 0;
        byte[] tmpk = new byte[key.length];
        tmpk = key.clone();
        for(int i = 0; i < data.length; i++)
        {
            if(k>=key.length)
            {
                k=0;
            }
            newd[i] = (byte)(data[i] ^ tmpk[k]);
            tmpk[k] = data[i];
            k++;
        }
        return newd;
    }
    public static byte[] decryptBlockwise(byte[] key, byte[] data)
    {
        byte[] newd = new byte[data.length];
        int k = 0;
        byte[] tmpk = new byte[key.length];
        tmpk = key.clone();
        for(int i = 0; i < data.length; i++)
        {
            if(k>=key.length)
            {
                k=0;
            }
            newd[i] = (byte)(data[i] ^ tmpk[k]);
            tmpk[k] = newd[i];
            k++;
        }
        return newd;
    }
    public static String byteArrayToString(byte[] array)
    {
        String ret = "";
        for(int i = 0; i < array.length; i++)
        {
            ret += (char)array[i];
        }
        return ret;
    }

}
