package crc640ec207abc449b2ca;


public class ShellFragmentStateAdapter
	extends androidx.viewpager2.adapter.FragmentStateAdapter
	implements
		mono.android.IGCUserPeer
{

	public ShellFragmentStateAdapter (androidx.fragment.app.Fragment p0)
	{
		super (p0);
		if (getClass () == ShellFragmentStateAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellFragmentStateAdapter, Microsoft.Maui.Controls", "AndroidX.Fragment.App.Fragment, Xamarin.AndroidX.Fragment", this, new java.lang.Object[] { p0 });
		}
	}

	public ShellFragmentStateAdapter (androidx.fragment.app.FragmentActivity p0)
	{
		super (p0);
		if (getClass () == ShellFragmentStateAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellFragmentStateAdapter, Microsoft.Maui.Controls", "AndroidX.Fragment.App.FragmentActivity, Xamarin.AndroidX.Fragment", this, new java.lang.Object[] { p0 });
		}
	}

	public ShellFragmentStateAdapter (androidx.fragment.app.FragmentManager p0, androidx.lifecycle.Lifecycle p1)
	{
		super (p0, p1);
		if (getClass () == ShellFragmentStateAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellFragmentStateAdapter, Microsoft.Maui.Controls", "AndroidX.Fragment.App.FragmentManager, Xamarin.AndroidX.Fragment:AndroidX.Lifecycle.Lifecycle, Xamarin.AndroidX.Lifecycle.Common.Jvm", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public int getItemCount ()
	{
		return n_getItemCount ();
	}

	private native int n_getItemCount ();

	public androidx.fragment.app.Fragment createFragment (int p0)
	{
		return n_createFragment (p0);
	}

	private native androidx.fragment.app.Fragment n_createFragment (int p0);

	public long getItemId (int p0)
	{
		return n_getItemId (p0);
	}

	private native long n_getItemId (int p0);

	public boolean containsItem (long p0)
	{
		return n_containsItem (p0);
	}

	private native boolean n_containsItem (long p0);

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
