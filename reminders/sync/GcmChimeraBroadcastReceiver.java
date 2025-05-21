package com.google.android.gms.reminders.sync;

import android.accounts.Account;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Base64;
import com.google.android.chimera.WakefulBroadcastReceiver;
import defpackage.asej;
import defpackage.asnd;
import defpackage.asot;
import defpackage.cxgr;
import defpackage.cxhg;
import defpackage.egzn;
import defpackage.eiif;
import defpackage.ejhf;
import defpackage.febw;
import defpackage.fecp;
import defpackage.fedk;
import defpackage.frre;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class GcmChimeraBroadcastReceiver extends WakefulBroadcastReceiver {
    public static final asot b = asot.b("GcmBroadcastReceiver", asej.REMINDERS);
    static boolean c = false;

    @Override // com.google.android.chimera.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        egzn egznVar;
        if (!frre.c()) {
            asot asotVar = b;
            ((ejhf) ((ejhf) asotVar.i()).ah((char) 9068)).B("New tickle sync is not enabled. %s", cxhg.a());
            if (c) {
                return;
            }
            ((ejhf) ((ejhf) asotVar.h()).ah((char) 9069)).B("Re-subscribe to gsync feed. %s", cxhg.a());
            for (Account account : asnd.h(context, context.getPackageName())) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("resub", true);
                ContentResolver.requestSync(account, "com.google.android.gms.reminders", bundle);
            }
            c = true;
            return;
        }
        c = false;
        if (intent == null) {
            ((ejhf) ((ejhf) b.i()).ah((char) 9067)).B("Received intent message is null. %s", cxhg.a());
            return;
        }
        Bundle extras = intent.getExtras();
        if (extras == null) {
            ((ejhf) ((ejhf) b.i()).ah((char) 9066)).B("Received message with no bundle. %s", cxhg.a());
            return;
        }
        String string = extras.getString("rcp");
        if (eiif.c(string)) {
            ((ejhf) ((ejhf) b.i()).ah((char) 9065)).B("Chime payload is empty. %s", cxhg.a());
            return;
        }
        try {
            byte[] decode = Base64.decode(string, 1);
            fecp y = fecp.y(egzn.a, decode, 0, decode.length, febw.a());
            fecp.M(y);
            egznVar = (egzn) y;
        } catch (fedk | IllegalArgumentException e) {
            ((ejhf) ((ejhf) ((ejhf) b.i()).s(e)).ah(9063)).P("Failed to parse RemindersChimePayload. %s %s", e, cxhg.a());
            egznVar = null;
        }
        if (egznVar == null) {
            ((ejhf) ((ejhf) b.i()).ah((char) 9064)).B("Cannot decode RemindersChimePayload. %s", cxhg.a());
            return;
        }
        String str = egznVar.b;
        if (!eiif.c(str)) {
            new cxgr(context, str).start();
        } else {
            ((ejhf) ((ejhf) b.i()).ah((char) 9062)).B("Obfuscated Gaia Id is empty. %s", cxhg.a());
        }
    }
}
