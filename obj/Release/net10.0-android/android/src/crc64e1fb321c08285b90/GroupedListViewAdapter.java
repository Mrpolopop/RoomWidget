package crc64e1fb321c08285b90;


public class GroupedListViewAdapter
	extends crc64e1fb321c08285b90.ListViewAdapter
	implements
		mono.android.IGCUserPeer,
		android.widget.SectionIndexer
{

	public GroupedListViewAdapter ()
	{
		super ();
		if (getClass () == GroupedListViewAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.GroupedListViewAdapter, Microsoft.Maui.Controls", "", this, new java.lang.Object[] {  });
		}
	}

	public GroupedListViewAdapter (android.content.Context p0)
	{
		super ();
		if (getClass () == GroupedListViewAdapter.class) {
			mono.android.TypeManager.Activate ("Microsoft.Maui.Controls.Handlers.Compatibility.GroupedListViewAdapter, Microsoft.Maui.Controls", "Android.Content.Context, Mono.Android", this, new java.lang.Object[] { p0 });
		}
	}

	public int getPositionForSection (int p0)
	{
		return n_getPositionForSection (p0);
	}

	private native int n_getPositionForSection (int p0);

	public int getSectionForPosition (int p0)
	{
		return n_getSectionForPosition (p0);
	}

	private native int n_getSectionForPosition (int p0);

	public java.lang.Object[] getSections ()
	{
		return n_getSections ();
	}

	private native java.lang.Object[] n_getSections ();

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
