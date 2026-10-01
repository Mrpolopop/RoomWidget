package mono.java.lang;


public class Runnable
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		java.lang.Runnable
{

	public Runnable ()
	{
		super ();
		if (getClass () == Runnable.class) {
			mono.android.TypeManager.Activate ("Java.Lang.Runnable, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void run ()
	{
		n_run ();
	}

	private native void n_run ();

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
