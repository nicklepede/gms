package com.google.android.gms.gcm;

import android.content.Context;
import android.content.Intent;
import android.os.Message;
import android.os.Parcelable;
import android.os.UserHandle;
import android.util.Log;
import com.google.android.chimera.IntentOperation;
import defpackage.arwm;
import defpackage.bhvo;
import defpackage.bhwo;
import defpackage.bhwz;
import defpackage.bhzg;
import defpackage.biab;
import defpackage.biac;
import defpackage.bibu;
import defpackage.bime;
import defpackage.bimi;
import defpackage.dnnr;
import j$.util.Objects;
import java.util.Collections;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public final class GcmProxyIntentOperation extends IntentOperation {
    public static void a(Context context, Intent intent) {
        bhvo.i(context);
        if (bhvo.d() == 0) {
            b(intent, 0);
            return;
        }
        Intent intent2 = new Intent("com.google.android.gcm.USER_FORWARD");
        intent2.setPackage(context.getPackageName());
        intent2.putExtra("intent", intent);
        intent2.putExtra("userSerial", bhvo.d());
        intent2.addFlags(268435456);
        if (!bhvo.k() || !bhvo.a) {
            context.sendBroadcast(intent2);
            return;
        }
        Object f = bhvo.f(0);
        arwm.s(f);
        context.sendBroadcastAsUser(intent2, (UserHandle) f);
    }

    private static void b(final Intent intent, final int i) {
        biab biabVar;
        arwm.l(bhvo.d() == 0);
        if (i < 0) {
            Log.w("GCM", "Dispatching intent with invalid user serial");
            return;
        }
        String action = intent.getAction();
        bhwz b = bhwz.b();
        if (Objects.equals(action, "com.google.android.gcm.intent.SEND")) {
            final bhwo a = b.a();
            Context context = a.b;
            if (dnnr.h(context)) {
                return;
            }
            GcmSenderChimeraProxy.a(context);
            a.c.execute(new Runnable() { // from class: bhwb
                /* JADX WARN: Removed duplicated region for block: B:152:0x0393 A[RETURN] */
                /* JADX WARN: Removed duplicated region for block: B:153:0x036f A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Removed duplicated region for block: B:163:0x039b  */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void run() {
                    /*
                        Method dump skipped, instructions count: 927
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: defpackage.bhwb.run():void");
                }
            });
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.gcm.MESSENGER_IPC_USER_FORWARD")) {
            bhzg g = b.g();
            Parcelable parcelableExtra = intent.getParcelableExtra("msg");
            if (parcelableExtra instanceof Message) {
                g.a((Message) parcelableExtra, i);
                return;
            } else {
                Log.w("GCM", "Invalid forwarded request: ".concat(String.valueOf(String.valueOf(intent))));
                return;
            }
        }
        if (Objects.equals(action, "com.google.android.c2dm.intent.REGISTER")) {
            bime m = b.m();
            bimi g2 = bimi.g(1, i, intent, Collections.EMPTY_MAP);
            if (g2 != null) {
                m.f(g2);
                return;
            }
            return;
        }
        if (Objects.equals(action, "com.google.android.c2dm.intent.UNREGISTER")) {
            bime m2 = b.m();
            bimi g3 = bimi.g(2, i, intent, bimi.i(0));
            if (g3 != null) {
                m2.f(g3);
                return;
            }
            return;
        }
        if (Objects.equals(action, "android.intent.action.PACKAGE_REPLACED")) {
            biac a2 = GcmPackageIntentOperation.a(intent, i);
            if (a2 != null) {
                bhwz.b().e().c(a2);
                return;
            }
            return;
        }
        if (Objects.equals(action, "android.intent.action.PACKAGE_FULLY_REMOVED")) {
            biac a3 = GcmPackageIntentOperation.a(intent, i);
            if (a3 != null) {
                bhwz.b().e().d(a3);
                return;
            }
            return;
        }
        if (Objects.equals(action, "com.google.android.gms.gcm.CHECKBOX_EVENT")) {
            b.e().a();
            return;
        }
        if (!Objects.equals(action, "com.google.android.gcm.intent.USER_UNLOCKED")) {
            Log.w("GCM", "Unexpected forwarded intent: ".concat(String.valueOf(String.valueOf(intent))));
            return;
        }
        bhwo a4 = b.a();
        bibu bibuVar = (bibu) a4.s.a();
        if (bibuVar == null || (biabVar = a4.d) == null) {
            return;
        }
        biabVar.a(intent, bibuVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (!Objects.equals(intent.getAction(), "com.google.android.gcm.USER_FORWARD")) {
            Log.w("GCM", "Unexpected intent: ".concat(String.valueOf(String.valueOf(intent))));
            return;
        }
        Intent intent2 = (Intent) intent.getParcelableExtra("intent");
        if (intent2 == null) {
            Log.w("GCM", "GcmProxyIntentOperation.onHandleIntent: dropping since KEY_ORIGINAL_INTENT isn't present in ".concat(String.valueOf(String.valueOf(intent))));
        } else {
            b(intent2, intent.getIntExtra("userSerial", -1));
        }
    }
}
