package mono.android.view;


public class ViewGroup_OnHierarchyChangeListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.view.ViewGroup.OnHierarchyChangeListener
{

	public ViewGroup_OnHierarchyChangeListenerImplementor ()
	{
		super ();
		if (getClass () == ViewGroup_OnHierarchyChangeListenerImplementor.class) {
			mono.android.TypeManager.Activate ("Android.Views.ViewGroup+IOnHierarchyChangeListenerImplementor, Mono.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onChildViewAdded (android.view.View p0, android.view.View p1)
	{
		n_onChildViewAdded (p0, p1);
	}

	private native void n_onChildViewAdded (android.view.View p0, android.view.View p1);

	public void onChildViewRemoved (android.view.View p0, android.view.View p1)
	{
		n_onChildViewRemoved (p0, p1);
	}

	private native void n_onChildViewRemoved (android.view.View p0, android.view.View p1);

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
