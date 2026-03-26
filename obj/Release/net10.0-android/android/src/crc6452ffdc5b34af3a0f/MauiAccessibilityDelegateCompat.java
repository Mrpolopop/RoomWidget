package crc6452ffdc5b34af3a0f;


public class MauiAccessibilityDelegateCompat
	extends crc6452ffdc5b34af3a0f.AccessibilityDelegateCompatWrapper
	implements
		mono.android.IGCUserPeer
{

	public MauiAccessibilityDelegateCompat ()
	{
		super ();
		if (getClass () == MauiAccessibilityDelegateCompat.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiAccessibilityDelegateCompat, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public MauiAccessibilityDelegateCompat (android.view.View.AccessibilityDelegate p0)
	{
		super (p0);
		if (getClass () == MauiAccessibilityDelegateCompat.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiAccessibilityDelegateCompat, Microsoft.Maui", "Android.Views.View+AccessibilityDelegate, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public MauiAccessibilityDelegateCompat (androidx.core.view.AccessibilityDelegateCompat p0)
	{
		super ();
		if (getClass () == MauiAccessibilityDelegateCompat.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiAccessibilityDelegateCompat, Microsoft.Maui", "AndroidX.Core.View.AccessibilityDelegateCompat, Xamarin.AndroidX.Core", this, new java.lang.Object[] { p0 });
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
