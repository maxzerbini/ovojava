package ovo.client.util;

public class EndPoints {
	public static String CreateTopologyEndpoint() 
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/cluster");
        return sb.toString();
    }

    public static String CreateTopologyNodeEndpoint()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/cluster/me");
        return sb.toString();
    }

    public static String CreateKeysEndpoint()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/keys");
        return sb.toString();
    }

    public static String CreateKeyStorageEndpoint()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/keystorage");
        return sb.toString();
    }

    public static String CreateGetKeyStorageEndpoint(String key)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/keystorage/").append(key);
        return sb.toString();
    }

    public static String CreateGetAndRemoveEndpoint(String key)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/keystorage/").append(key).append("/getandremove");
        return sb.toString();
    }

    public static String CreateUpdateValueIfEqualEndpoint(String key)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/keystorage/").append(key).append("/updatevalueifequal");
        return sb.toString();
    }

    public static String CreateCountersEndpoint()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/counters");
        return sb.toString();
    }

    public static String CreateCounterEndpoint( String key)
    {
        StringBuilder sb = new StringBuilder();
        sb.append("/ovo/counters/").append(key);
        return sb.toString();
    }
}
