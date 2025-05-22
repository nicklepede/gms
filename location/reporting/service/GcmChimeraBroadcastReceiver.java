package com.google.android.gms.location.reporting.service;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import android.util.Log;
import com.google.android.chimera.BroadcastReceiver;
import defpackage.aura;
import defpackage.autl;
import defpackage.bkcz;
import defpackage.ccue;
import defpackage.edhz;
import defpackage.edid;
import defpackage.ediz;
import defpackage.edja;
import defpackage.edke;
import defpackage.edkn;
import defpackage.edks;
import defpackage.edmd;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import java.util.Iterator;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes5.dex */
public class GcmChimeraBroadcastReceiver extends BroadcastReceiver {
    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        edmd.g(context);
        if (autl.c(context)) {
            edhz.c("GCoreUlr", "GCM message received ".concat(String.valueOf(String.valueOf(intent))));
            Bundle extras = intent.getExtras();
            if (extras != null) {
                Iterator<String> it = extras.keySet().iterator();
                while (it.hasNext()) {
                    String.valueOf(intent.getExtras().get(it.next()));
                }
            }
            edid.g("UlrGcmNotificationReceived");
            bkcz.a(context);
            String e = bkcz.e(intent);
            if ("send_error".equals(e)) {
                edhz.f("GCM send error: ".concat(String.valueOf(String.valueOf(intent.getExtras()))));
                return;
            }
            if ("deleted_messages".equals(e)) {
                edhz.c("GCoreUlr", "GCM server deleted pending messages because they were collapsible.".concat(String.valueOf(String.valueOf(intent.getExtras()))));
                return;
            }
            if ("gcm".equals(e)) {
                edja edjaVar = null;
                if (intent.hasExtra("ulr_notification")) {
                    String stringExtra = intent.getStringExtra("ulr_notification");
                    if (stringExtra == null || stringExtra.isEmpty()) {
                        Log.e("GCoreUlr", "Received GCM notification with empty data extra.");
                    } else {
                        try {
                            byte[] decode = Base64.decode(stringExtra, 0);
                            try {
                                fgri y = fgri.y(edja.a, decode, 0, decode.length, fgqp.a());
                                fgri.M(y);
                                edja edjaVar2 = (edja) y;
                                if ((edjaVar2.b & 1) == 0 || edjaVar2.c.isEmpty()) {
                                    edhz.f("Received notification missing account name");
                                } else {
                                    edjaVar = edjaVar2;
                                }
                            } catch (fgsd e2) {
                                edhz.g("Error parsing notification", e2);
                            }
                        } catch (IllegalArgumentException e3) {
                            edhz.g("Error decoding notification", e3);
                        }
                    }
                } else {
                    edhz.f("Dropping non-ULR GCM message");
                }
                if (edjaVar != null) {
                    Account account = new Account(edjaVar.c, "com.google");
                    edhz.c("GCoreUlr", "Received GCM notification for " + ccue.a(account) + " timestamp:" + edjaVar.d);
                    if ((edjaVar.b & 4) == 0) {
                        edke.g(context, "GcmBroadcastReceiver", account);
                        edks edksVar = new edks(context);
                        Intent intent2 = new Intent("com.google.android.location.settings.REMOTE_CHANGED");
                        intent2.putExtra("account", account);
                        edksVar.b.sendBroadcast(aura.k(intent2));
                        edid.g("UlrGcmSettingsNotification");
                        return;
                    }
                    ediz edizVar = edjaVar.e;
                    if (edizVar == null) {
                        edizVar = ediz.a;
                    }
                    if ((edizVar.b & 1) != 0) {
                        edhz.c("GCoreUlr", "Changing primary device state for " + ccue.a(account) + " to " + edizVar.c);
                        boolean z = edizVar.c;
                        Intent a = edkn.a(context, "com.google.android.location.reporting.CHANGE_PRIMARY_DEVICE");
                        a.putExtra("account", account);
                        a.putExtra("isPrimaryDevice", z);
                        edmd.p(context, a);
                    } else {
                        edhz.f("Received null value for primary device state");
                    }
                    edid.g("UlrGcmPrimaryDeviceNotification");
                }
            }
        }
    }
}
