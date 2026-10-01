package mono.androidx.activity.contextaware;


public class OnContextAvailableListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.activity.contextaware.OnContextAvailableListener
{

	public OnContextAvailableListenerImplementor ()
	{
		super ();
		if (getClass () == OnContextAvailableListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Activity.ContextAware.IOnContextAvailableListenerImplementor, Xamarin.AndroidX.Activity", "", this, new java.lang.Object[] {  });
		}
	}

	public void onContextAvailable (android.content.Context p0)
	{
		n_onContextAvailable (p0);
	}

	private native void n_onContextAvailable (android.content.Context p0);

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
