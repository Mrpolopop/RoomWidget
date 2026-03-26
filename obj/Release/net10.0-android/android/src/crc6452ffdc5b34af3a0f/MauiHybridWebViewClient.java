package crc6452ffdc5b34af3a0f;


public class MauiHybridWebViewClient
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{

	public MauiHybridWebViewClient ()
	{
		super ();
		if (getClass () == MauiHybridWebViewClient.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiHybridWebViewClient, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public android.webkit.WebResourceResponse shouldInterceptRequest (android.webkit.WebView p0, android.webkit.WebResourceRequest p1)
	{
		return n_shouldInterceptRequest (p0, p1);
	}

	private native android.webkit.WebResourceResponse n_shouldInterceptRequest (android.webkit.WebView p0, android.webkit.WebResourceRequest p1);

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
