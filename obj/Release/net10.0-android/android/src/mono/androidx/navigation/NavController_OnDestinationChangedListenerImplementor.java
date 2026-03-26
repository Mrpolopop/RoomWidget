package mono.androidx.navigation;


public class NavController_OnDestinationChangedListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		androidx.navigation.NavController.OnDestinationChangedListener
{

	public NavController_OnDestinationChangedListenerImplementor ()
	{
		super ();
		if (getClass () == NavController_OnDestinationChangedListenerImplementor.class) {
			mono.android.TypeManager.Activate ("AndroidX.Navigation.NavController+IOnDestinationChangedListenerImplementor, Xamarin.AndroidX.Navigation.Runtime.Android", "", this, new java.lang.Object[] {  });
		}
	}

	public void onDestinationChanged (androidx.navigation.NavController p0, androidx.navigation.NavDestination p1, android.os.Bundle p2)
	{
		n_onDestinationChanged (p0, p1, p2);
	}

	private native void n_onDestinationChanged (androidx.navigation.NavController p0, androidx.navigation.NavDestination p1, android.os.Bundle p2);

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
