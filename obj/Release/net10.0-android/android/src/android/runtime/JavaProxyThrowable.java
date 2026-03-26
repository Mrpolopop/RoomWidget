package android.runtime;


public class JavaProxyThrowable
	extends java.lang.Error
	implements
		mono.android.IGCUserPeer
{
/** @hide */
	public static final String __md_methods;
	static {
		__md_methods = 
			"";
		mono.android.Runtime.register ("Android.Runtime.JavaProxyThrowable, Mono.Android", JavaProxyThrowable.class, __md_methods);
	}

	public JavaProxyThrowable (java.lang.String p0)
	{
		super (p0);
		if (getClass () == JavaProxyThrowable.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaProxyThrowable, Mono.Android", "System.String, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}

	private java.util.ArrayList refList;
	public void monodroidAddReference (java.lang.Object obj)
	{
		if (refList == null)
			refList = new java.util.ArrayList ();
		refList.add (obj);
	}

	public void monodroidClearReferences ()
	{
		if (refList != null)
			refList.clear ();
	}
}
