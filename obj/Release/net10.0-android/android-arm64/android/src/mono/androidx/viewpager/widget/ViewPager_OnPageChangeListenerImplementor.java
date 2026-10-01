package mono.androidx.viewpager.widget;


public class ViewPager_OnPageChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.viewpager.widget.ViewPager.OnPageChangeListener
{

	public ViewPager_OnPageChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewPager_OnPageChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.ViewPager.Widget.ViewPager+IOnPageChangeListenerImplementor, Xamarin.AndroidX.ViewPager", "", this, new java.lang.Object[] {  });
		}
	}

	public void onPageScrollStateChanged (int p0)
	{
		n_onPageScrollStateChanged (p0);
	}

	private native void n_onPageScrollStateChanged (int p0);

	public void onPageScrolled (int p0, float p1, int p2)
	{
		n_onPageScrolled (p0, p1, p2);
	}

	private native void n_onPageScrolled (int p0, float p1, int p2);

	public void onPageSelected (int p0)
	{
		n_onPageSelected (p0);
	}

	private native void n_onPageSelected (int p0);

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
