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
import defpackage.auid;
import defpackage.aupz;
import defpackage.ausn;
import defpackage.bkdj;
import defpackage.bkdl;
import defpackage.bkox;
import defpackage.bsj;
import defpackage.caqj;
import defpackage.carn;
import defpackage.carp;
import defpackage.dajw;
import defpackage.dakn;
import defpackage.dakp;
import defpackage.dall;
import defpackage.damb;
import defpackage.damg;
import defpackage.damh;
import defpackage.damn;
import defpackage.danc;
import defpackage.daqk;
import defpackage.eixb;
import defpackage.eiyx;
import defpackage.eizp;
import defpackage.eluo;
import defpackage.eqgo;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SchedulerInternalChimeraReceiver extends BroadcastReceiver {
    private static final bsj b = new bsj();
    private static final ausn c = ausn.b("NetworkScheduler.SIR", auid.SCHEDULER);
    private static final Binder d = new Binder();
    private static final eqgo e = new aupz(1, 10);
    private final Handler f = new caqj(Looper.getMainLooper());

    private static Set a(Intent intent) {
        return carp.a(intent.getIntArrayExtra("content_uri_flags_array"), intent.getParcelableArrayExtra("content_uri_array"));
    }

    private static final boolean b(Context context, Intent intent) {
        int intExtra = intent.getIntExtra("user_serial", -1);
        if (intExtra == -1) {
            return true;
        }
        dajw.e(context);
        int b2 = dajw.b();
        if (intExtra == b2) {
            return true;
        }
        ((eluo) ((eluo) c.i()).ai(9339)).E("Received broadcast destined for user %d at user %d", intExtra, b2);
        return false;
    }

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        eixb e2;
        IBinder binder;
        Intent intent2;
        if ("com.google.android.gms.gcm.ACTION_CHECK_QUEUE".equals(intent.getAction())) {
            dakp dakpVar = dall.b().d;
            if (dakpVar == null) {
                ((eluo) ((eluo) c.i()).ai((char) 9338)).x("GmsTaskScheduler unavailable.");
                return;
            }
            e2 = eizp.e("com/google/android/gms/scheduler/NetworkScheduler", "alarmUp", 339, "NetworkScheduler_alarmUp");
            try {
                dakpVar.d.execute(new dakn(5, dakpVar.b, bkox.ALARM_MANAGER, null, null, null, null, -1));
                e2.close();
            } finally {
            }
        } else {
            if ("com.google.android.gms.gcm.ACTION_HTTP_OK".equals(intent.getAction())) {
                dakp.c();
                return;
            }
            if ("com.google.android.gms.gcm.ACTION_EXECUTE_TASK".equals(intent.getAction())) {
                String stringExtra = intent.getStringExtra("tag");
                Parcelable parcelableExtra = intent.getParcelableExtra("callback");
                Bundle bundle = (Bundle) intent.getParcelableExtra("extras");
                ComponentName componentName = (ComponentName) intent.getParcelableExtra("component");
                long longExtra = intent.getLongExtra("max_exec_duration", 180L);
                if (componentName == null || TextUtils.isEmpty(componentName.getPackageName())) {
                    ((eluo) ((eluo) c.i()).ai((char) 9332)).x("No package provided.");
                    setResultCode(16);
                    return;
                }
                if (!(parcelableExtra instanceof PendingCallback) && !(parcelableExtra instanceof com.google.android.gms.libs.scheduler.PendingCallback)) {
                    ((eluo) ((eluo) c.i()).ai((char) 9335)).x("Invalid callback provided.");
                    setResultCode(16);
                    return;
                }
                if (!b(context, intent)) {
                    setResultCode(16);
                    return;
                }
                Intent g = damg.g(context.getPackageManager(), componentName, stringExtra, parcelableExtra, bundle, longExtra, intent.getBundleExtra("engine_flags"));
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
                    ((eluo) ((eluo) c.i()).ai((char) 9334)).B("IllegalStateException starting service: %s", e3.getMessage());
                    setResultCode(64);
                    return;
                } catch (SecurityException e4) {
                    ((eluo) ((eluo) c.i()).ai((char) 9333)).B("SecurityException starting service: %s", e4.getMessage());
                    setResultCode(8);
                    return;
                }
            }
            if ("com.google.android.gms.gcm.SERVICE_ACTION_INITIALIZE".equals(intent.getAction())) {
                String stringExtra2 = intent.getStringExtra("package");
                if (stringExtra2 == null) {
                    ((eluo) ((eluo) c.i()).ai((char) 9331)).x("Trying to send multi-user initialization message but got no package to send to.");
                    return;
                }
                int intExtra = intent.getIntExtra("user_serial", -1);
                if (intExtra == -1) {
                    ((eluo) ((eluo) c.i()).ai((char) 9330)).x("Trying to send multi-user initialization message but got an invalid user serial.");
                    return;
                } else {
                    if (b(context, intent)) {
                        danc.a(context, new damb(stringExtra2, intExtra));
                        return;
                    }
                    return;
                }
            }
            int intExtra2 = intent.getIntExtra("OP_CODE", -1);
            if (intExtra2 == 1) {
                dajw.e(context);
                for (carn carnVar : a(intent)) {
                    bsj bsjVar = b;
                    if (!bsjVar.containsKey(carnVar)) {
                        daqk daqkVar = new daqk(context, this.f, carnVar, e);
                        if (bsjVar.put(carnVar, daqkVar) == null) {
                            try {
                                context.getContentResolver().registerContentObserver(carnVar.a, carnVar.a(), daqkVar);
                            } catch (IllegalArgumentException | SecurityException e5) {
                                ((eluo) ((eluo) ((eluo) c.j()).s(e5)).ai(9336)).P("Failed to register content observer for %s: %s", carnVar.a, e5);
                                b.remove(carnVar);
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
                    daqk daqkVar2 = (daqk) b.remove((carn) it.next());
                    if (daqkVar2 != null) {
                        contentResolver.unregisterContentObserver(daqkVar2);
                    }
                }
                return;
            }
            if (intExtra2 != 3) {
                if (intExtra2 == 4) {
                    int intExtra3 = intent.getIntExtra("user_serial", -1);
                    dakp dakpVar2 = dall.b().d;
                    if (dakpVar2 != null) {
                        dakpVar2.d.execute(new dakn(8, dakpVar2.b, bkox.CAUSE_UNKNOWN, null, null, null, null, intExtra3));
                        return;
                    }
                    return;
                }
                if (intExtra2 != 5) {
                    ((eluo) ((eluo) c.j()).ai((char) 9337)).x("Unrecognised action received by internal scheduler receiver.");
                    return;
                }
                Bundle bundle2 = new Bundle();
                bundle2.putBinder("binder", d);
                Context applicationContext = context.getApplicationContext();
                Bundle extras = intent.getExtras();
                ausn ausnVar = damn.a;
                aupz aupzVar = new aupz(1, 10);
                damn damnVar = null;
                if (extras != null && (binder = extras.getBinder("callback")) != null && damh.a("com.google.android.gms.gcm.IMessengerProxyCallback", binder)) {
                    IInterface queryLocalInterface = binder.queryLocalInterface("com.google.android.gms.gcm.IMessengerProxyCallback");
                    bkdl bkdjVar = queryLocalInterface instanceof bkdl ? (bkdl) queryLocalInterface : new bkdj(binder);
                    if (bkdjVar != null && (intent2 = (Intent) extras.getParcelable("intent")) != null) {
                        damnVar = new damn(applicationContext, bkdjVar, intent2, aupzVar);
                    }
                }
                if (damnVar != null) {
                    setResultExtras(bundle2);
                    e.execute(damnVar);
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
            dakp dakpVar3 = dall.b().d;
            if (dakpVar3 == null) {
                return;
            }
            carn carnVar2 = (carn) a2.iterator().next();
            Uri uri = (Uri) parcelableArrayExtra[0];
            e2 = eizp.e("com/google/android/gms/scheduler/NetworkScheduler", "onContentUpdate", 361, "NetworkScheduler_onContentUpdate");
            try {
                dakpVar3.d.execute(eiyx.g(new dakn(7, dakpVar3.b, bkox.CONTENT_URI_UPDATED, null, null, carnVar2, uri, intExtra4)));
                e2.close();
            } finally {
            }
        }
    }
}
