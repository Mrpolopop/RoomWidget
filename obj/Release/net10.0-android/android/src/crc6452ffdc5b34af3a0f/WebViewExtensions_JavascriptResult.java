package crc6452ffdc5b34af3a0f;


public class WebViewExtensions_JavascriptResult
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.webkit.ValueCallback
{

	public WebViewExtensions_JavascriptResult ()
	{
		super ();
		if (getClass () == WebViewExtensions_JavascriptResult.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Platform.WebViewExtensions+JavascriptResult, Microsoft.Maui", "", this, new java.lang.Object[] {  });
		}
	}

	public void onReceiveValue (java.lang.Object p0)
	{
		n_onReceiveValue (p0);
	}

	private native void n_onReceiveValue (java.lang.Object p0);

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
