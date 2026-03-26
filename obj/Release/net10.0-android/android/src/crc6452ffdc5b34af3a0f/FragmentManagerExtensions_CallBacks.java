package crc6452ffdc5b34af3a0f;


public class FragmentManagerExtensions_CallBacks
	extends androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
	implements
		mono.android.IGCUserPeer
{

	public FragmentManagerExtensions_CallBacks ()
	{
		super ();
		if (getClass () == FragmentManagerExtensions_CallBacks.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.FragmentManagerExtensions+CallBacks, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFragmentDestroyed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentDestroyed (p0, p1);
	}

	private native void n_onFragmentDestroyed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);

	public void onFragmentResumed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentResumed (p0, p1);
	}

	private native void n_onFragmentResumed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);

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
