package crc6452ffdc5b34af3a0f;


public class MauiWebChromeClient
	extends android.webkit.WebChromeClient
	implements
		mono.android.IGCUserPeer
{

	public MauiWebChromeClient ()
	{
		super ();
		if (getClass () == MauiWebChromeClient.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiWebChromeClient, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean onShowFileChooser (android.webkit.WebView p0, android.webkit.ValueCallback p1, android.webkit.WebChromeClient.FileChooserParams p2)
	{
		return n_onShowFileChooser (p0, p1, p2);
	}

	private native boolean n_onShowFileChooser (android.webkit.WebView p0, android.webkit.ValueCallback p1, android.webkit.WebChromeClient.FileChooserParams p2);

	public void onShowCustomView (android.view.View p0, android.webkit.WebChromeClient.CustomViewCallback p1)
	{
		n_onShowCustomView (p0, p1);
	}

	private native void n_onShowCustomView (android.view.View p0, android.webkit.WebChromeClient.CustomViewCallback p1);

	public void onHideCustomView ()
	{
		n_onHideCustomView ();
	}

	private native void n_onHideCustomView ();

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
