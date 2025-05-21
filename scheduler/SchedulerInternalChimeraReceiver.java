package com.google.android.gms.scheduler;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.chimera.BroadcastReceiver;
import com.google.android.gms.gcm.PendingCallback;
import defpackage.asej;
import defpackage.asmf;
import defpackage.asot;
import defpackage.bhyu;
import defpackage.bhyw;
import defpackage.biki;
import defpackage.bry;
import defpackage.byhr;
import defpackage.byiv;
import defpackage.byix;
import defpackage.cxzz;
import defpackage.cyaq;
import defpackage.cyas;
import defpackage.cybn;
import defpackage.cycd;
import defpackage.cyci;
import defpackage.cycj;
import defpackage.cycp;
import defpackage.cyde;
import defpackage.cygm;
import defpackage.egjy;
import defpackage.eglu;
import defpackage.egmm;
import defpackage.ejhf;
import defpackage.ensv;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SchedulerInternalChimeraReceiver extends BroadcastReceiver {
    private static final bry b = new bry();
    private static final asot c = asot.b("NetworkScheduler.SIR", asej.SCHEDULER);
    private static final Binder d = new Binder();
    private static final ensv e = new asmf(1, 10);
    private final Handler f = new byhr(Looper.getMainLooper());

    private static Set a(Intent intent) {
        return byix.a(intent.getIntArrayExtra("content_uri_flags_array"), intent.getParcelableArrayExtra("content_uri_array"));
    }

    private static final boolean b(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("user_serial", -1);
        if (intExtra == -1) {
            return true;
        }
        cxzz.e(context);
        int b2 = cxzz.b();
        if (intExtra == b2) {
            return true;
        }
        ((ejhf) ((ejhf) c.i()).ah(9337)).E("Received broadcast destined for user %d at user %d", intExtra, b2);
        return false;
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        egjy e2;
        IBinder binder;
        Intent intent2;
        if ("com.google.android.gms.gcm.ACTION_CHECK_QUEUE".equals(intent.getAction())) {
            cyas cyasVar = cybn.b().d;
            if (cyasVar == null) {
                ((ejhf) ((ejhf) c.i()).ah((char) 9336)).x("GmsTaskScheduler unavailable.");
                return;
            }
            e2 = egmm.e("com/google/android/gms/scheduler/NetworkScheduler", "alarmUp", 339, "NetworkScheduler_alarmUp");
            try {
                cyasVar.d.execute(new cyaq(5, cyasVar.b, biki.ALARM_MANAGER, null, null, null, null, -1));
                e2.close();
            } finally {
            }
        } else {
            if ("com.google.android.gms.gcm.ACTION_HTTP_OK".equals(intent.getAction())) {
                cyas.c();
                return;
            }
            if ("com.google.android.gms.gcm.ACTION_EXECUTE_TASK".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("component");
                long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                if (componentName == null || TextUtils.isEmpty(componentName.getPackageName())) {
                    ((ejhf) ((ejhf) c.i()).ah((char) 9330)).x("No package provided.");
                    setResultCode(16);
                    return;
                }
                if (!(parcelableExtra instanceof PendingCallback) && !(parcelableExtra instanceof com.google.android.gms.libs.scheduler.PendingCallback)) {
                    ((ejhf) ((ejhf) c.i()).ah((char) 9333)).x("Invalid callback provided.");
                    setResultCode(16);
                    return;
                }
                if (!b(context, intent)) {
                    setResultCode(16);
                    return;
                }
                Intent g = cyci.g(context.getPackageManager(), componentName, stringExtra, parcelableExtra, bundle, longExtra, intent.getBundleExtra("engine_flags"));
                if (g == null) {
                    setResultCode(32);
                    return;
                }
                try {
                    if (context.startService(g) == null) {
                        setResultCode(128);
                        return;
                    } else {
                        setResultCode(1);
                        return;
                    }
                } catch (IllegalStateException e3) {
                    ((ejhf) ((ejhf) c.i()).ah((char) 9332)).B("IllegalStateException starting service: %s", e3.getMessage());
                    setResultCode(64);
                    return;
                } catch (SecurityException e4) {
                    ((ejhf) ((ejhf) c.i()).ah((char) 9331)).B("SecurityException starting service: %s", e4.getMessage());
                    setResultCode(8);
                    return;
                }
            }
            if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                String stringExtra2 = intent.getStringExtra("package");
                if (stringExtra2 == null) {
                    ((ejhf) ((ejhf) c.i()).ah((char) 9329)).x("Trying to send multi-user initialization message but got no package to send to.");
                    return;
                }
                int intExtra = intent.getIntExtra("user_serial", -1);
                if (intExtra == -1) {
                    ((ejhf) ((ejhf) c.i()).ah((char) 9328)).x("Trying to send multi-user initialization message but got an invalid user serial.");
                    return;
                } else {
                    if (b(context, intent)) {
                        cyde.a(context, new cycd(stringExtra2, intExtra));
                        return;
                    }
                    return;
                }
            }
            int intExtra2 = intent.getIntExtra("OP_CODE", -1);
            if (intExtra2 == 1) {
                cxzz.e(context);
                for (byiv byivVar : a(intent)) {
                    bry bryVar = b;
                    if (!bryVar.containsKey(byivVar)) {
                        cygm cygmVar = new cygm(context, this.f, byivVar, e);
                        if (bryVar.put(byivVar, cygmVar) == null) {
                            try {
                                context.getContentResolver().registerContentObserver(byivVar.a, byivVar.a(), cygmVar);
                            } catch (IllegalArgumentException | SecurityException e5) {
                                ((ejhf) ((ejhf) ((ejhf) c.j()).s(e5)).ah(9334)).P("Failed to register content observer for %s: %s", byivVar.a, e5);
                                b.remove(byivVar);
                            }
                        }
                    }
                }
                return;
            }
            if (intExtra2 == 2) {
                Set a = a(intent);
                ContentResolver contentResolver = context.getContentResolver();
                Iterator it = a.iterator();
                while (it.hasNext()) {
                    cygm cygmVar2 = (cygm) b.remove((byiv) it.next());
                    if (cygmVar2 != null) {
                        contentResolver.unregisterContentObserver(cygmVar2);
                    }
                }
                return;
            }
            if (intExtra2 != 3) {
                if (intExtra2 == 4) {
                    int intExtra3 = intent.getIntExtra("user_serial", -1);
                    cyas cyasVar2 = cybn.b().d;
                    if (cyasVar2 != null) {
                        cyasVar2.d.execute(new cyaq(8, cyasVar2.b, biki.CAUSE_UNKNOWN, null, null, null, null, intExtra3));
                        return;
                    }
                    return;
                }
                if (intExtra2 != 5) {
                    ((ejhf) ((ejhf) c.j()).ah((char) 9335)).x("Unrecognised action received by internal scheduler receiver.");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("binder", d);
                Context applicationContext = context.getApplicationContext();
                Bundle extras = intent.getExtras();
                asot asotVar = cycp.a;
                asmf asmfVar = new asmf(1, 10);
                cycp cycpVar = null;
                if (extras != null && (binder = extras.getBinder("callback")) != null && cycj.a("com.google.android.gms.gcm.IMessengerProxyCallback", binder)) {
                    IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.gcm.IMessengerProxyCallback");
                    bhyw bhyuVar = queryLocalInterface instanceof bhyw ? (bhyw) queryLocalInterface : new bhyu(binder);
                    if (bhyuVar != null && (intent2 = (Intent) extras.getParcelable("intent")) != null) {
                        cycpVar = new cycp(applicationContext, bhyuVar, intent2, asmfVar);
                    }
                }
                if (cycpVar != null) {
                    setResultExtras(bundle2);
                    e.execute(cycpVar);
                    return;
                }
                return;
            }
            Set a2 = a(intent);
            Parcelable[] parcelableArrayExtra = intent.getParcelableArrayExtra("triggered_uris");
            if (a2.size() != 1 || parcelableArrayExtra == null || parcelableArrayExtra.length != 1) {
                return;
            }
            int intExtra4 = intent.getIntExtra("user_serial", -1);
            cyas cyasVar3 = cybn.b().d;
            if (cyasVar3 == null) {
                return;
            }
            byiv byivVar2 = (byiv) a2.iterator().next();
            Uri uri = (Uri) parcelableArrayExtra[0];
            e2 = egmm.e("com/google/android/gms/scheduler/NetworkScheduler", "onContentUpdate", 361, "NetworkScheduler_onContentUpdate");
            try {
                cyasVar3.d.execute(eglu.g(new cyaq(7, cyasVar3.b, biki.CONTENT_URI_UPDATED, null, null, byivVar2, uri, intExtra4)));
                e2.close();
            } finally {
            }
        }
    }
}
