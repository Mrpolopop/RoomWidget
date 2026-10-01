package crc640ec207abc449b2ca;


public class ShellContentFragment
	extends androidx.fragment.app.Fragment
	implements
		mono.android.IGCUserPeer,
		android.view.animation.Animation.AnimationListener
{

	public ShellContentFragment ()
	{
		super ();
		if (getClass () == ShellContentFragment.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellContentFragment, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public ShellContentFragment (int p0)
	{
		super (p0);
		if (getClass () == ShellContentFragment.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.Compatibility.ShellContentFragment, Microsoft.Maui.Controls", "System.Int32, System.Private.CoreLib", this, new java.lang.Object[] { p0 });
		}
	}

	public void onResume ()
	{
		n_onResume ();
	}

	private native void n_onResume ();

	public android.view.animation.Animation onCreateAnimation (int p0, boolean p1, int p2)
	{
		return n_onCreateAnimation (p0, p1, p2);
	}

	private native android.view.animation.Animation n_onCreateAnimation (int p0, boolean p1, int p2);

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

	public void onAnimationEnd (android.view.animation.Animation p0)
	{
		n_onAnimationEnd (p0);
	}

	private native void n_onAnimationEnd (android.view.animation.Animation p0);

	public void onAnimationRepeat (android.view.animation.Animation p0)
	{
		n_onAnimationRepeat (p0);
	}

	private native void n_onAnimationRepeat (android.view.animation.Animation p0);

	public void onAnimationStart (android.view.animation.Animation p0)
	{
		n_onAnimationStart (p0);
	}

	private native void n_onAnimationStart (android.view.animation.Animation p0);

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
