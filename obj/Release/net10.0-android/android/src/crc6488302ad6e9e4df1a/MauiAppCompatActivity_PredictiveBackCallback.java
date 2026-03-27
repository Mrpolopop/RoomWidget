package crc6488302ad6e9e4df1a;


public class MauiAppCompatActivity_PredictiveBackCallback
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.window.OnBackInvokedCallback
{

	public MauiAppCompatActivity_PredictiveBackCallback ()
	{
		super ();
		if (getClass () == MauiAppCompatActivity_PredictiveBackCallback.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.MauiAppCompatActivity+PredictiveBackCallback, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public MauiAppCompatActivity_PredictiveBackCallback (crc6488302ad6e9e4df1a.MauiAppCompatActivity p0)
	{
		super ();
		if (getClass () == MauiAppCompatActivity_PredictiveBackCallback.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.MauiAppCompatActivity+PredictiveBackCallback, Microsoft.Maui", "Microsoft.Maui.MauiAppCompatActivity, Microsoft.Maui", this, new java.lang.Object[] { p0 });
		}
	}

	public void onBackInvoked ()
	{
		n_onBackInvoked ();
	}

	private native void n_onBackInvoked ();

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
