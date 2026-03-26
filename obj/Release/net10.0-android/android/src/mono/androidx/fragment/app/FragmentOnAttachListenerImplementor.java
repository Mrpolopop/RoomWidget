package mono.androidx.fragment.app;


public class FragmentOnAttachListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.fragment.app.FragmentOnAttachListener
{

	public FragmentOnAttachListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentOnAttachListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Fragment.App.IFragmentOnAttachListenerImplementor, Xamarin.AndroidX.Fragment", "", this, new java.lang.Object[] {  });
		}
	}

	public void onAttachFragment (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onAttachFragment (p0, p1);
	}

	private native void n_onAttachFragment (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);

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
