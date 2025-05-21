package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.measurement.api.internal.InitializationParams;
import defpackage.arwm;
import defpackage.cdfu;
import defpackage.cdfv;
import defpackage.cdfw;
import defpackage.cdhl;
import defpackage.cdqa;
import defpackage.cdre;
import defpackage.cdsn;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
@Deprecated
/* loaded from: classes5.dex */
public class AppMeasurement {
    private static volatile AppMeasurement a;
    private final cdfw b;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
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
            arwm.s(bundle);
            this.mAppId = (String) cdre.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) cdre.a(bundle, "origin", String.class, null);
            this.mName = (String) cdre.a(bundle, "name", String.class, null);
            this.mValue = cdre.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) cdre.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) cdre.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) cdre.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) cdre.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) cdre.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) cdre.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) cdre.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) cdre.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) cdre.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) cdre.a(bundle, "active", Boolean.class, false)).booleanValue();
            this.mCreationTimestamp = ((Long) cdre.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) cdre.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    public AppMeasurement(cdsn cdsnVar) {
        this.b = new cdfv(cdsnVar);
    }

    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        cdhl.a(context);
        if (a == null) {
            synchronized (AppMeasurement.class) {
                if (a == null) {
                    cdsn cdsnVar = null;
                    if (!cdhl.a(context)) {
                        try {
                            cdsnVar = (cdsn) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
                        } catch (ClassNotFoundException | Exception unused) {
                        }
                    }
                    if (cdsnVar != null) {
                        a = new AppMeasurement(cdsnVar);
                    } else {
                        a = new AppMeasurement(cdqa.B(context, new InitializationParams(0L, 0L, true, null, null, null, null, null)));
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
        arwm.s(conditionalUserProperty);
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
            cdre.b(bundle, obj);
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
        cdfw cdfwVar = this.b;
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        cdfwVar.l(bundle);
    }

    public AppMeasurement(cdqa cdqaVar) {
        this.b = new cdfu(cdqaVar);
    }
}
