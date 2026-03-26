package crc64338477404e88479c;


public class ControlsAccessibilityDelegate
	extends crc6452ffdc5b34af3a0f.AccessibilityDelegateCompatWrapper
	implements
		mono.android.IGCUserPeer
{

	public ControlsAccessibilityDelegate ()
	{
		super ();
		if (getClass () == ControlsAccessibilityDelegate.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.ControlsAccessibilityDelegate, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public ControlsAccessibilityDelegate (android.view.View.AccessibilityDelegate p0)
	{
		super (p0);
		if (getClass () == ControlsAccessibilityDelegate.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.ControlsAccessibilityDelegate, Microsoft.Maui.Controls", "Android.Views.View+AccessibilityDelegate, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public ControlsAccessibilityDelegate (androidx.core.view.AccessibilityDelegateCompat p0)
	{
		super ();
		if (getClass () == ControlsAccessibilityDelegate.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Platform.ControlsAccessibilityDelegate, Microsoft.Maui.Controls", "AndroidX.Core.View.AccessibilityDelegateCompat, Xamarin.AndroidX.Core", this, new java.lang.Object[] { p0 });
		}
	}

	public void onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1)
	{
		n_onInitializeAccessibilityNodeInfo (p0, p1);
	}

	private native void n_onInitializeAccessibilityNodeInfo (android.view.View p0, androidx.core.view.accessibility.AccessibilityNodeInfoCompat p1);

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
