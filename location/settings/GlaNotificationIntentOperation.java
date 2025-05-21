package com.google.android.gms.location.settings;

import android.content.ComponentName;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.asbo;
import defpackage.asej;
import defpackage.asot;
import defpackage.bwth;
import defpackage.calv;
import defpackage.canf;
import defpackage.dfee;
import defpackage.eiho;
import defpackage.ejhf;
import defpackage.emlv;
import defpackage.fvbo;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public final class GlaNotificationIntentOperation extends IntentOperation {
    private static final asot a = asot.b("GlaNotification", asej.LOCATION);

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        fvbo.f(intent, "intent");
        boolean t = bwth.t(this, "gps");
        boolean t2 = bwth.t(this, "network");
        try {
            sendBroadcast(new Intent("android.intent.action.CLOSE_SYSTEM_DIALOGS"));
        } catch (SecurityException e) {
            ((ejhf) ((ejhf) a.j()).s(e)).x("GLA notification unable to close system dialogs");
        }
        asot asotVar = calv.a;
        asbo f = asbo.f(this);
        fvbo.c(f);
        f.m(-1302891281, dfee.LOCATION_ACCURACY_NOTICE);
        canf.c().f(new eiho() { // from class: camn
            @Override // defpackage.eiho
            public final Object apply(Object obj) {
                cang cangVar = (cang) obj;
                asot asotVar2 = canf.a;
                if (!cangVar.b.L()) {
                    cangVar.U();
                }
                cani caniVar = (cani) cangVar.b;
                cani caniVar2 = cani.a;
                caniVar.b |= 64;
                caniVar.j = true;
                return cangVar;
            }
        });
        String action = intent.getAction();
        if (action != null) {
            switch (action.hashCode()) {
                case -1538639377:
                    if (action.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_LEARN_MORE_CLICKED")) {
                        calv.b(t, t2, emlv.LEARN_MORE_CLICKED);
                        Intent intent2 = new Intent("android.intent.action.VIEW");
                        intent2.setData(Uri.parse("https://support.google.com/android/?p=location_accuracy"));
                        intent2.setFlags(268435456);
                        startActivity(intent2);
                        break;
                    }
                    break;
                case -763916222:
                    if (action.equals("com.google.android.gms.location.settings.GLA_NOTIFICATION_SETTINGS_CLICKED")) {
                        calv.b(t, t2, emlv.SETTINGS_CLICKED);
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
                        calv.b(t, t2, emlv.NOTIFICATION_CLEARED);
                        break;
                    }
                    break;
                case 1788864929:
                    if (action.equals("com.google.android.gms.location.settings.SETUP_WIZARD_MESSAGE_SHOWN")) {
                        calv.b(t, t2, emlv.SETUP_WIZARD_MESSAGE_SHOWN);
                        break;
                    }
                    break;
            }
        }
    }
}
