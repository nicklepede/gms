package com.google.android.gms.reminders.sync;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.czqn;
import defpackage.czrc;
import defpackage.ejms;
import defpackage.ekvk;
import defpackage.eluo;
import defpackage.fgqp;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.fulq;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    public static final ausn b = ausn.b("GcmBroadcastReceiver", auid.REMINDERS);
    static boolean c = false;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ejms ejmsVar;
        if (!fulq.c()) {
            ausn ausnVar = b;
            ((eluo) ((eluo) ausnVar.i()).ai((char) 9066)).B("New tickle sync is not enabled. %s", czrc.a());
            if (c) {
                return;
            }
            ((eluo) ((eluo) ausnVar.h()).ai((char) 9067)).B("Re-subscribe to gsync feed. %s", czrc.a());
            for (Account account : auqx.h(context, context.getPackageName())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("resub", true);
                ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
            }
            c = true;
            return;
        }
        c = false;
        if (intent == null) {
            ((eluo) ((eluo) b.i()).ai((char) 9065)).B("Received intent message is null. %s", czrc.a());
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((eluo) ((eluo) b.i()).ai((char) 9064)).B("Received message with no bundle. %s", czrc.a());
            return;
        }
        String string = extras.getString("rcp");
        if (ekvk.c(string)) {
            ((eluo) ((eluo) b.i()).ai((char) 9063)).B("Chime payload is empty. %s", czrc.a());
            return;
        }
        try {
            byte[] decode = Base64.decode(string, 1);
            fgri y = fgri.y(ejms.a, decode, 0, decode.length, fgqp.a());
            fgri.M(y);
            ejmsVar = (ejms) y;
        } catch (fgsd | IllegalArgumentException e) {
            ((eluo) ((eluo) ((eluo) b.i()).s(e)).ai(9061)).P("Failed to parse RemindersChimePayload. %s %s", e, czrc.a());
            ejmsVar = null;
        }
        if (ejmsVar == null) {
            ((eluo) ((eluo) b.i()).ai((char) 9062)).B("Cannot decode RemindersChimePayload. %s", czrc.a());
            return;
        }
        String str = ejmsVar.b;
        if (!ekvk.c(str)) {
            new czqn(context, str).start();
        } else {
            ((eluo) ((eluo) b.i()).ai((char) 9060)).B("Obfuscated Gaia Id is empty. %s", czrc.a());
        }
    }
}
