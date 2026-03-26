package mono.com.google.android.material.tabs;


public class TabLayout_BaseOnTabSelectedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
{

	public TabLayout_BaseOnTabSelectedListenerImplementor ()
	{
		super ();
		if (getClass () == TabLayout_BaseOnTabSelectedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Google.Android.Material.Tabs.TabLayout+IOnTabSelectedListenerImplementor, Xamarin.Google.Android.Material", "", this, new java.lang.Object[] {  });
		}
	}

	public void onTabReselected (com.google.android.material.tabs.TabLayout.Tab p0)
	{
		n_onTabReselected (p0);
	}

	private native void n_onTabReselected (com.google.android.material.tabs.TabLayout.Tab p0);

	public void onTabSelected (com.google.android.material.tabs.TabLayout.Tab p0)
	{
		n_onTabSelected (p0);
	}

	private native void n_onTabSelected (com.google.android.material.tabs.TabLayout.Tab p0);

	public void onTabUnselected (com.google.android.material.tabs.TabLayout.Tab p0)
	{
		n_onTabUnselected (p0);
	}

	private native void n_onTabUnselected (com.google.android.material.tabs.TabLayout.Tab p0);

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
