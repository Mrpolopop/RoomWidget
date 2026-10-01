package crc6452ffdc5b34af3a0f;


public class MauiWebViewClient
	extends android.webkit.WebViewClient
	implements
		mono.android.IGCUserPeer
{

	public MauiWebViewClient ()
	{
		super ();
		if (getClass () == MauiWebViewClient.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.MauiWebViewClient, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public boolean shouldOverrideUrlLoading (android.webkit.WebView p0, android.webkit.WebResourceRequest p1)
	{
		return n_shouldOverrideUrlLoading (p0, p1);
	}

	private native boolean n_shouldOverrideUrlLoading (android.webkit.WebView p0, android.webkit.WebResourceRequest p1);

	public void onPageStarted (android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2)
	{
		n_onPageStarted (p0, p1, p2);
	}

	private native void n_onPageStarted (android.webkit.WebView p0, java.lang.String p1, android.graphics.Bitmap p2);

	public void onPageFinished (android.webkit.WebView p0, java.lang.String p1)
	{
		n_onPageFinished (p0, p1);
	}

	private native void n_onPageFinished (android.webkit.WebView p0, java.lang.String p1);

	public void onReceivedError (android.webkit.WebView p0, android.webkit.WebResourceRequest p1, android.webkit.WebResourceError p2)
	{
		n_onReceivedError (p0, p1, p2);
	}

	private native void n_onReceivedError (android.webkit.WebView p0, android.webkit.WebResourceRequest p1, android.webkit.WebResourceError p2);

	public boolean onRenderProcessGone (android.webkit.WebView p0, android.webkit.RenderProcessGoneDetail p1)
	{
		return n_onRenderProcessGone (p0, p1);
	}

	private native boolean n_onRenderProcessGone (android.webkit.WebView p0, android.webkit.RenderProcessGoneDetail p1);

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
