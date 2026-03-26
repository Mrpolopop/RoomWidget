package crc6452ffdc5b34af3a0f;


public class StackNavigationManager_Callbacks
	extends androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
	implements
		mono.android.IGCUserPeer,
		androidx.navigation.NavController.OnDestinationChangedListener
{

	public StackNavigationManager_Callbacks ()
	{
		super ();
		if (getClass () == StackNavigationManager_Callbacks.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.StackNavigationManager+Callbacks, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onFragmentResumed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentResumed (p0, p1);
	}

	private native void n_onFragmentResumed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);

	public void onFragmentViewDestroyed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentViewDestroyed (p0, p1);
	}

	private native void n_onFragmentViewDestroyed (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);

	public void onFragmentCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2)
	{
		n_onFragmentCreated (p0, p1, p2);
	}

	private native void n_onFragmentCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2);

	public void onFragmentPreCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2)
	{
		n_onFragmentPreCreated (p0, p1, p2);
	}

	private native void n_onFragmentPreCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2);

	public void onFragmentPreAttached (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.content.Context p2)
	{
		n_onFragmentPreAttached (p0, p1, p2);
	}

	private native void n_onFragmentPreAttached (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.content.Context p2);

	public void onFragmentStarted (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1)
	{
		n_onFragmentStarted (p0, p1);
	}

	private native void n_onFragmentStarted (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1);

	public void onFragmentAttached (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.content.Context p2)
	{
		n_onFragmentAttached (p0, p1, p2);
	}

	private native void n_onFragmentAttached (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.content.Context p2);

	public void onFragmentSaveInstanceState (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2)
	{
		n_onFragmentSaveInstanceState (p0, p1, p2);
	}

	private native void n_onFragmentSaveInstanceState (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.os.Bundle p2);

	public void onFragmentViewCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.view.View p2, android.os.Bundle p3)
	{
		n_onFragmentViewCreated (p0, p1, p2, p3);
	}

	private native void n_onFragmentViewCreated (androidx.fragment.app.FragmentManager p0, androidx.fragment.app.Fragment p1, android.view.View p2, android.os.Bundle p3);

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
