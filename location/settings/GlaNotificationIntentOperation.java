package com.google.android.gms.location.settings;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.aued;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bzbx;
import defpackage.ccul;
import defpackage.ccvv;
import defpackage.dhpk;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eozj;
import defpackage.fxxm;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public final class GlaNotificationIntentOperation extends IntentOperation {
    private static final ausn a = ausn.b("GlaNotification", auid.LOCATION);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fxxm.f(intent, "intent");
        boolean u = bzbx.u(this, "gps");
        boolean u2 = bzbx.u(this, "network");
        try {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (SecurityException e) {
            ((eluo) ((eluo) a.j()).s(e)).x("GLA notification unable to close system dialogs");
        }
        ausn ausnVar = ccul.a;
        aued f = aued.f(this);
        fxxm.c(f);
        f.m(-1302891281, dhpk.LOCATION_ACCURACY_NOTICE);
        ccvv.c().f(new ekut() { // from class: ccvd
            @Override // defpackage.ekut
            public final Object apply(Object obj) {
                ccvw ccvwVar = (ccvw) obj;
                ausn ausnVar2 = ccvv.a;
                if (!ccvwVar.b.L()) {
                    ccvwVar.U();
                }
                ccvy ccvyVar = (ccvy) ccvwVar.b;
                ccvy ccvyVar2 = ccvy.a;
                ccvyVar.b |= 64;
                ccvyVar.j = true;
                return ccvwVar;
            }
        });
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1538639377:
                    if (action.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_LEARN_MORE_CLICKED")) {
                        ccul.b(u, u2, eozj.LEARN_MORE_CLICKED);
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("https://support.google.com/android/?p=location_accuracy"));
                        intent2.setFlags(268435456);
                        startActivity(intent2);
                        break;
                    }
                    break;
                case -763916222:
                    if (action.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_SETTINGS_CLICKED")) {
                        ccul.b(u, u2, eozj.SETTINGS_CLICKED);
                        Intent intent3 = new Intent();
                        if (Build.VERSION.SDK_INT >= 28) {
                            intent3.setAction("com.google.android.gms.location.settings.LOCATION_ACCURACY");
                            intent3.setComponent(new ComponentName(getPackageName(), "com.google.android.gms.location.settings.LocationAccuracyNonwearableActivity"));
                            intent3.setFlags(268435456);
                        } else {
                            intent3.setAction("android.settings.LOCATION_SOURCE_SETTINGS");
                            intent3.setFlags(268468224);
                        }
                        startActivity(intent3);
                        break;
                    }
                    break;
                case 495545685:
                    if (action.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_CLEARED")) {
                        ccul.b(u, u2, eozj.NOTIFICATION_CLEARED);
                        break;
                    }
                    break;
                case 1788864929:
                    if (action.equals("com.google.android.gms.location.settings.SETUP_WIZARD_MESSAGE_SHOWN")) {
                        ccul.b(u, u2, eozj.SETUP_WIZARD_MESSAGE_SHOWN);
                        break;
                    }
                    break;
            }
        }
    }
}
