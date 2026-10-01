package crc6452ffdc5b34af3a0f;


public class ScopedFragment
	extends androidx.fragment.app.Fragment
	implements
		mono.android.IGCUserPeer
{

	public ScopedFragment ()
	{
		super ();
		if (getClass () == ScopedFragment.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.ScopedFragment, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public ScopedFragment (int p0)
	{
		super (p0);
		if (getClass () == ScopedFragment.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.ScopedFragment, Microsoft.Maui", "System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}

	public void onViewStateRestored (android.os.Bundle p0)
	{
		n_onViewStateRestored (p0);
	}

	private native void n_onViewStateRestored (android.os.Bundle p0);

	public android.view.View onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2)
	{
		return n_onCreateView (p0, p1, p2);
	}

	private native android.view.View n_onCreateView (android.view.LayoutInflater p0, android.view.ViewGroup p1, android.os.Bundle p2);

	public void onDestroy ()
	{
		n_onDestroy ();
	}

	private native void n_onDestroy ();

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
