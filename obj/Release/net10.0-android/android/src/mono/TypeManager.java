package mono.android;

public class TypeManager {

	public static void Activate (String typeName, String sig, Object instance, Object[] parameterList)
	{
		n_activate (typeName, sig, instance, parameterList);
	}

	private static native void n_activate (String typeName, String sig, Object instance, Object[] parameterList);

}

