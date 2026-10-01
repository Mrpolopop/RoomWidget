package crc6497da801d5190a566;


public class CalendarWorker
	extends androidx.work.Worker
	implements
		mono.android.IGCUserPeer
{

	public CalendarWorker (android.content.Context p0, androidx.work.WorkerParameters p1)
	{
		super (p0, p1);
		if (getClass () == CalendarWorker.class) {
			mono.android.TypeManager.Activate ("RoomWidget.Platforms.Android.CalendarWorker, RoomWidget", "Android.Content.Context, Mono.Android:AndroidX.Work.WorkerParameters, Xamarin.AndroidX.Work.Runtime", this, new java.lang.Object[] { p0, p1 });
		}
	}

	public androidx.work.ListenableWorker.Result doWork ()
	{
		return n_doWork ();
	}

	private native androidx.work.ListenableWorker.Result n_doWork ();

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
