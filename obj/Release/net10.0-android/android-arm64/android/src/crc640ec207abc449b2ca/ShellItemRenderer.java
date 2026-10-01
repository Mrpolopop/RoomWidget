package crc640ec207abc449b2ca;


public class ShellItemRenderer
	extends crc640ec207abc449b2ca.ShellItemRendererBase
	implements
		mono.android.IGCUserPeer,
		com.google.android.material.navigation.NavigationBarView.OnItemSelectedListener
{

	public ShellItemRenderer ()
	{
		super ();
		if (getClass () == ShellItemRenderer.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellItemRenderer, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public ShellItemRenderer (int p0)
	{
		super (p0);
		if (getClass () == ShellItemRenderer.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellItemRenderer, Microsoft.Maui.Controls", "System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}

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

	public boolean onNavigationItemSelected (android.view.MenuItem p0)
	{
		return n_onNavigationItemSelected (p0);
	}

	private native boolean n_onNavigationItemSelected (android.view.MenuItem p0);

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
