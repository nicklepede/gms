package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import defpackage.atzb;
import defpackage.cfot;
import defpackage.cfou;
import defpackage.cfov;
import defpackage.cfqk;
import defpackage.cfyy;
import defpackage.cgac;
import defpackage.cgbl;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
@Deprecated
/* loaded from: classes5.dex */
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final cfov b;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class ConditionalUserProperty {
        public boolean mActive;
        public String mAppId;
        public long mCreationTimestamp;
        public String mExpiredEventName;
        public Bundle mExpiredEventParams;
        public String mName;
        public String mOrigin;
        public long mTimeToLive;
        public String mTimedOutEventName;
        public Bundle mTimedOutEventParams;
        public String mTriggerEventName;
        public long mTriggerTimeout;
        public String mTriggeredEventName;
        public Bundle mTriggeredEventParams;
        public long mTriggeredTimestamp;
        public Object mValue;

        public ConditionalUserProperty() {
        }

        public ConditionalUserProperty(Bundle bundle) {
            atzb.s(bundle);
            this.mAppId = (String) cgac.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) cgac.a(bundle, "origin", String.class, null);
            this.mName = (String) cgac.a(bundle, "name", String.class, null);
            this.mValue = cgac.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) cgac.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) cgac.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) cgac.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) cgac.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) cgac.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) cgac.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) cgac.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) cgac.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) cgac.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) cgac.a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) cgac.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) cgac.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(cgbl cgblVar) {
        this.b = new cfou(cgblVar);
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        cfqk.a(context);
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    cgbl cgblVar = null;
                    if (!cfqk.a(context)) {
                        try {
                            cgblVar = (cgbl) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        } catch (ClassNotFoundException | Exception unused) {
                        }
                    }
                    if (cgblVar != null) {
                        a = new AppMeasurement(cgblVar);
                    } else {
                        a = new AppMeasurement(cfyy.A(context, new InitializationParams(0L, 0L, true, null, null, null, null, null)));
                    }
                }
            }
        }
        return a;
    }

    public void beginAdUnitExposure(String str) {
        this.b.h(str);
    }

    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.b.i(str, str2, bundle);
    }

    public void endAdUnitExposure(String str) {
        this.b.j(str);
    }

    public long generateEventId() {
        return this.b.a();
    }

    public String getAppInstanceId() {
        return this.b.b();
    }

    public List getConditionalUserProperties(String str, String str2) {
        List f = this.b.f(str, str2);
        ArrayList arrayList = new ArrayList(f.size());
        Iterator it = f.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty((Bundle) it.next()));
        }
        return arrayList;
    }

    public String getCurrentScreenClass() {
        return this.b.c();
    }

    public String getCurrentScreenName() {
        return this.b.d();
    }

    public String getGmpAppId() {
        return this.b.e();
    }

    public int getMaxUserProperties(String str) {
        this.b.m(str);
        return 25;
    }

    protected Map getUserProperties(String str, String str2, boolean z) {
        return this.b.g(str, str2, z);
    }

    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.b.k(str, str2, bundle);
    }

    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        atzb.s(conditionalUserProperty);
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            cgac.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        cfov cfovVar = this.b;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cfovVar.l(bundle);
    }

    public AppMeasurement(cfyy cfyyVar) {
        this.b = new cfot(cfyyVar);
    }
}
