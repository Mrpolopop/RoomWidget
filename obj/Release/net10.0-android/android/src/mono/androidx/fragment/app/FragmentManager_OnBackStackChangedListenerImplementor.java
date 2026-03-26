package mono.androidx.fragment.app;


public class FragmentManager_OnBackStackChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.fragment.app.FragmentManager.OnBackStackChangedListener
{

	public FragmentManager_OnBackStackChangedListenerImplementor ()
	{
		super ();
		if (getClass () == FragmentManager_OnBackStackChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Fragment.App.FragmentManager+IOnBackStackChangedListenerImplementor, Xamarin.AndroidX.Fragment", "", this, new java.lang.Object[] {  });
		}
	}

	public void onBackStackChanged ()
	{
		n_onBackStackChanged ();
	}

	private native void n_onBackStackChanged ();

	public void onBackStackChangeCancelled ()
	{
		n_onBackStackChangeCancelled ();
	}

	private native void n_onBackStackChangeCancelled ();

	public void onBackStackChangeCommitted (androidx.fragment.app.Fragment p0, boolean p1)
	{
		n_onBackStackChangeCommitted (p0, p1);
	}

	private native void n_onBackStackChangeCommitted (androidx.fragment.app.Fragment p0, boolean p1);

	public void onBackStackChangeProgressed (androidx.activity.BackEventCompat p0)
	{
		n_onBackStackChangeProgressed (p0);
	}

	private native void n_onBackStackChangeProgressed (androidx.activity.BackEventCompat p0);

	public void onBackStackChangeStarted (androidx.fragment.app.Fragment p0, boolean p1)
	{
		n_onBackStackChangeStarted (p0, p1);
	}

	private native void n_onBackStackChangeStarted (androidx.fragment.app.Fragment p0, boolean p1);

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
