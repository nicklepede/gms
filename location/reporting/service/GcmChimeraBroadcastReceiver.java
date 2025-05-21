package com.google.android.gms.location.reporting.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.asng;
import defpackage.aspr;
import defpackage.bhyk;
import defpackage.calo;
import defpackage.eavm;
import defpackage.eavq;
import defpackage.eawm;
import defpackage.eawn;
import defpackage.eaxr;
import defpackage.eaya;
import defpackage.eayf;
import defpackage.eazq;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        eazq.g(context);
        if (aspr.c(context)) {
            eavm.c("GCoreUlr", "GCM message received ".concat(String.valueOf(String.valueOf(intent))));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Iterator<String> it = extras.keySet().iterator();
                while (it.hasNext()) {
                    String.valueOf(intent.getExtras().get(it.next()));
                }
            }
            eavq.g("UlrGcmNotificationReceived");
            bhyk.a(context);
            String e = bhyk.e(intent);
            if ("send_error".equals(e)) {
                eavm.f("GCM send error: ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
                return;
            }
            if ("deleted_messages".equals(e)) {
                eavm.c("GCoreUlr", "GCM server deleted pending messages because they were collapsible.".concat(String.valueOf(String.valueOf(intent.getExtras()))));
                return;
            }
            if ("gcm".equals(e)) {
                eawn eawnVar = null;
                if (intent.hasExtra("ulr_notification")) {
                    String stringExtra = intent.getStringExtra("ulr_notification");
                    if (stringExtra == null || stringExtra.isEmpty()) {
                        Log.e("GCoreUlr", "Received GCM notification with empty data extra.");
                    } else {
                        try {
                            byte[] decode = Base64.decode(stringExtra, 0);
                            try {
                                fecp y = fecp.y(eawn.a, decode, 0, decode.length, febw.a());
                                fecp.M(y);
                                eawn eawnVar2 = (eawn) y;
                                if ((eawnVar2.b & 1) == 0 || eawnVar2.c.isEmpty()) {
                                    eavm.f("Received notification missing account name");
                                } else {
                                    eawnVar = eawnVar2;
                                }
                            } catch (fedk e2) {
                                eavm.g("Error parsing notification", e2);
                            }
                        } catch (IllegalArgumentException e3) {
                            eavm.g("Error decoding notification", e3);
                        }
                    }
                } else {
                    eavm.f("Dropping non-ULR GCM message");
                }
                if (eawnVar != null) {
                    Account account = new Account(eawnVar.c, "com.google");
                    eavm.c("GCoreUlr", "Received GCM notification for " + calo.a(account) + " timestamp:" + eawnVar.d);
                    if ((eawnVar.b & 4) == 0) {
                        eaxr.g(context, "GcmBroadcastReceiver", account);
                        eayf eayfVar = new eayf(context);
                        Intent intent2 = new Intent("com.google.android.location.settings.REMOTE_CHANGED");
                        intent2.putExtra("account", account);
                        eayfVar.b.sendBroadcast(asng.k(intent2));
                        eavq.g("UlrGcmSettingsNotification");
                        return;
                    }
                    eawm eawmVar = eawnVar.e;
                    if (eawmVar == null) {
                        eawmVar = eawm.a;
                    }
                    if ((eawmVar.b & 1) != 0) {
                        eavm.c("GCoreUlr", "Changing primary device state for " + calo.a(account) + " to " + eawmVar.c);
                        boolean z = eawmVar.c;
                        Intent a = eaya.a(context, "com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE");
                        a.putExtra("account", account);
                        a.putExtra("isPrimaryDevice", z);
                        eazq.p(context, a);
                    } else {
                        eavm.f("Received null value for primary device state");
                    }
                    eavq.g("UlrGcmPrimaryDeviceNotification");
                }
            }
        }
    }
}
