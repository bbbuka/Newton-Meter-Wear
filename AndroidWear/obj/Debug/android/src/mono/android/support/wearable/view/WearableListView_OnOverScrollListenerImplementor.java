package mono.android.support.wearable.view;


public class WearableListView_OnOverScrollListenerImplementor
	extends java.lang.Object
	implements
		mono.android.IGCUserPeer,
		android.support.wearable.view.WearableListView.OnOverScrollListener
{
	static final String __md_methods;
	static {
		__md_methods = 
			"n_onOverScroll:()V:GetOnOverScrollHandler:Android.Support.Wearable.Views.WearableListView/IOnOverScrollListenerInvoker, Xamarin.Android.Wearable\n" +
			"";
		mono.android.Runtime.register ("Android.Support.Wearable.Views.WearableListView/IOnOverScrollListenerImplementor, Xamarin.Android.Wearable, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", WearableListView_OnOverScrollListenerImplementor.class, __md_methods);
	}


	public WearableListView_OnOverScrollListenerImplementor () throws java.lang.Throwable
	{
		super ();
		if (getClass () == WearableListView_OnOverScrollListenerImplementor.class)
			mono.android.TypeManager.Activate ("Android.Support.Wearable.Views.WearableListView/IOnOverScrollListenerImplementor, Xamarin.Android.Wearable, Version=1.0.0.0, Culture=neutral, PublicKeyToken=null", "", this, new java.lang.Object[] {  });
	}


	public void onOverScroll ()
	{
		n_onOverScroll ();
	}

	private native void n_onOverScroll ();

	java.util.ArrayList refList;
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
