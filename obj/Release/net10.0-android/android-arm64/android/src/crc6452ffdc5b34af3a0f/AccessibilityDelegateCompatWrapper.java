package crc6452ffdc5b34af3a0f;


public class AccessibilityDelegateCompatWrapper
	extends androidx.core.view.AccessibilityDelegateCompat
	implements
		mono.android.IGCUserPeer
{

	public AccessibilityDelegateCompatWrapper ()
	{
		super ();
		if (getClass () == AccessibilityDelegateCompatWrapper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.AccessibilityDelegateCompatWrapper, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public AccessibilityDelegateCompatWrapper (android.view.View.AccessibilityDelegate p0)
	{
		super (p0);
		if (getClass () == AccessibilityDelegateCompatWrapper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.AccessibilityDelegateCompatWrapper, Microsoft.Maui", "Android.Views.View+AccessibilityDelegate, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public AccessibilityDelegateCompatWrapper (androidx.core.view.AccessibilityDelegateCompat p0)
	{
		super ();
		if (getClass () == AccessibilityDelegateCompatWrapper.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.AccessibilityDelegateCompatWrapper, Microsoft.Maui", "AndroidX.Core.View.AccessibilityDelegateCompat, Xamarin.AndroidX.Core", this, new java.lang.Object[] { p0 });
		}
	}

	public void onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1)
	{
		n_onInitializeAccessibilityNodeInfo (p0, p1);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1);

	public void sendAccessibilityEvent (android.view.View p0, int p1)
	{
		n_sendAccessibilityEvent (p0, p1);
	}

	private native void n_sendAccessibilityEvent (android.view.View p0, int p1);

	public void sendAccessibilityEventUnchecked (android.view.View p0, android.view.accessibility.AccessibilityEvent p1)
	{
		n_sendAccessibilityEventUnchecked (p0, p1);
	}

	private native void n_sendAccessibilityEventUnchecked (android.view.View p0, android.view.accessibility.AccessibilityEvent p1);

	public boolean dispatchPopulateAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1)
	{
		return n_dispatchPopulateAccessibilityEvent (p0, p1);
	}

	private native boolean n_dispatchPopulateAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1);

	public void onPopulateAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1)
	{
		n_onPopulateAccessibilityEvent (p0, p1);
	}

	private native void n_onPopulateAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1);

	public void onInitializeAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1)
	{
		n_onInitializeAccessibilityEvent (p0, p1);
	}

	private native void n_onInitializeAccessibilityEvent (android.view.View p0, android.view.accessibility.AccessibilityEvent p1);

	public boolean onRequestSendAccessibilityEvent (android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2)
	{
		return n_onRequestSendAccessibilityEvent (p0, p1, p2);
	}

	private native boolean n_onRequestSendAccessibilityEvent (android.view.ViewGroup p0, android.view.View p1, android.view.accessibility.AccessibilityEvent p2);

	public boolean performAccessibilityAction (android.view.View p0, int p1, android.os.Bundle p2)
	{
		return n_performAccessibilityAction (p0, p1, p2);
	}

	private native boolean n_performAccessibilityAction (android.view.View p0, int p1, android.os.Bundle p2);

	public androidx.core.view.accessibility.AccessibilityNodeProviderCompat getAccessibilityNodeProvider (android.view.View p0)
	{
		return n_getAccessibilityNodeProvider (p0);
	}

	private native androidx.core.view.accessibility.AccessibilityNodeProviderCompat n_getAccessibilityNodeProvider (android.view.View p0);

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
