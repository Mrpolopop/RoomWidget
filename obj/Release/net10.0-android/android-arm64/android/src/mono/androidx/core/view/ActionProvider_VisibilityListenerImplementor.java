package mono.androidx.core.view;


public class ActionProvider_VisibilityListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.core.view.ActionProvider.VisibilityListener
{

	public ActionProvider_VisibilityListenerImplementor ()
	{
		super ();
		if (getClass () == ActionProvider_VisibilityListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Core.View.ActionProvider+IVisibilityListenerImplementor, Xamarin.AndroidX.Core", "", this, new java.lang.Object[] {  });
		}
	}

	public void onActionProviderVisibilityChanged (boolean p0)
	{
		n_onActionProviderVisibilityChanged (p0);
	}

	private native void n_onActionProviderVisibilityChanged (boolean p0);

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
