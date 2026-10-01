package crc640ec207abc449b2ca;


public class ShellSectionRenderer
	extends androidx.fragment.app.Fragment
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener,
		com.google.android.material.tabs.TabLayoutMediator.TabConfigurationStrategy
{

	public ShellSectionRenderer ()
	{
		super ();
		if (getClass () == ShellSectionRenderer.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSectionRenderer, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public ShellSectionRenderer (int p0)
	{
		super (p0);
		if (getClass () == ShellSectionRenderer.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellSectionRenderer, Microsoft.Maui.Controls", "System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
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

	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

	public void onConfigureTab (com.google.android.material.tabs.TabLayout.Tab p0, int p1)
	{
		n_onConfigureTab (p0, p1);
	}

	private native void n_onConfigureTab (com.google.android.material.tabs.TabLayout.Tab p0, int p1);

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
