package mono.android.view;


public class View_OnClickListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.View.OnClickListener
{

	public View_OnClickListenerImplementor ()
	{
		super ();
		if (getClass () == View_OnClickListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.View+IOnClickListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onClick (android.view.View p0)
	{
		n_onClick (p0);
	}

	private native void n_onClick (android.view.View p0);

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
