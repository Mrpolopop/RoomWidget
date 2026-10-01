package mono.android.runtime;


public class JavaObject
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer
{

	public JavaObject ()
	{
		super ();
		if (getClass () == JavaObject.class) {
			mono.android.TypeManager.Activate ("Android.Runtime.JavaObject, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean equals (java.lang.Object p0)
	{
		return n_equals (p0);
	}

	private native boolean n_equals (java.lang.Object p0);

	public int hashCode ()
	{
		return n_hashCode ();
	}

	private native int n_hashCode ();

	public java.lang.String toString ()
	{
		return n_toString ();
	}

	private native java.lang.String n_toString ();

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
