package com.google.android.gms.inappreach.receiver;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.inappreach.receiver.PushIntentOperation;
import defpackage.auid;
import defpackage.auqx;
import defpackage.ausn;
import defpackage.bqho;
import defpackage.bqib;
import defpackage.bqiu;
import defpackage.bqkw;
import defpackage.bqla;
import defpackage.dhcb;
import defpackage.ekut;
import defpackage.eluo;
import defpackage.eqcy;
import defpackage.ewbd;
import defpackage.ffij;
import defpackage.ffis;
import defpackage.fgqp;
import defpackage.fgrc;
import defpackage.fgri;
import defpackage.fgsd;
import defpackage.wjw;
import defpackage.wjx;
import defpackage.wkg;
import java.io.IOException;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PushIntentOperation extends IntentOperation {
    static final String a = "com.google.android.gms.inappreach.receiver.PushIntentOperation";
    public static final /* synthetic */ int b = 0;
    private static final ausn c = ausn.b(PushIntentOperation.class.getName(), auid.INAPP_REACH);

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ffij ffijVar;
        final String str;
        Context applicationContext;
        String str2;
        try {
            Bundle extras = intent.getExtras();
            if (extras != null) {
                try {
                    String string = extras.getString("casp");
                    if (TextUtils.isEmpty(string)) {
                        ffijVar = null;
                    } else {
                        byte[] decode = Base64.decode(string, 1);
                        fgri y = fgri.y(ffij.a, decode, 0, decode.length, fgqp.a());
                        fgri.M(y);
                        ffijVar = (ffij) y;
                    }
                    if (ffijVar != null) {
                        String str3 = ffijVar.c;
                        if (TextUtils.isEmpty(str3)) {
                            ((eluo) ((eluo) c.j()).ai((char) 5195)).x("Got an intent push without any account Oid");
                        } else {
                            Context applicationContext2 = getApplicationContext();
                            Iterator it = auqx.h(applicationContext2, applicationContext2.getPackageName()).iterator();
                            while (true) {
                                if (!it.hasNext()) {
                                    str = null;
                                    break;
                                }
                                Account account = (Account) it.next();
                                try {
                                    applicationContext = getApplicationContext();
                                    str2 = account.name;
                                    String str4 = wjx.a;
                                } catch (IOException | wjw e) {
                                    ((eluo) ((eluo) ((eluo) c.j()).s(e)).ai((char) 5193)).x("Failed getting account id from GoogleAuthUtil.");
                                }
                                if (str3.equals(wkg.e(applicationContext, str2))) {
                                    str = account.name;
                                    break;
                                }
                                continue;
                            }
                            if (TextUtils.isEmpty(str)) {
                                ((eluo) ((eluo) c.j()).ai((char) 5194)).x("Could not find any account with the received Oid.");
                            } else {
                                ffis ffisVar = ffijVar.d;
                                if (ffisVar == null) {
                                    ffisVar = ffis.a;
                                }
                                String str5 = ffisVar.g;
                                if ("OGA_INAPP_REACH".equals(str5)) {
                                    try {
                                        ((eqcy) ((bqib) bqiu.d().b().a()).d(new ekut() { // from class: bqkq
                                            @Override // defpackage.ekut
                                            public final Object apply(Object obj) {
                                                bqhe bqheVar = (bqhe) obj;
                                                int i = PushIntentOperation.b;
                                                fgrc fgrcVar = (fgrc) bqheVar.iQ(5, null);
                                                fgrcVar.X(bqheVar);
                                                bqhd bqhdVar = (bqhd) fgrcVar;
                                                String str6 = str;
                                                str6.getClass();
                                                if (!bqhdVar.b.L()) {
                                                    bqhdVar.U();
                                                }
                                                bqhe bqheVar2 = (bqhe) bqhdVar.b;
                                                bqhe bqheVar3 = bqhe.a;
                                                bqheVar2.b().put(str6, false);
                                                return (bqhe) bqhdVar.Q();
                                            }
                                        })).u();
                                    } catch (InterruptedException | ExecutionException e2) {
                                        ((eluo) ((eluo) ((eluo) c.j()).s(e2)).ai((char) 5197)).x("Failed updating pending fetch account in store.");
                                    }
                                    new bqkw(str, null).f(getApplicationContext());
                                } else if ("OGA_INAPP_REACH_PRERENDERED".equals(str5)) {
                                    Context applicationContext3 = getApplicationContext();
                                    fgrc v = bqho.a.v();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    bqho bqhoVar = (bqho) v.b;
                                    str.getClass();
                                    bqhoVar.c = str;
                                    fgrc v2 = ewbd.a.v();
                                    if (!v2.b.L()) {
                                        v2.U();
                                    }
                                    ewbd ewbdVar = (ewbd) v2.b;
                                    ewbdVar.c = 4;
                                    ewbdVar.b |= 1;
                                    ewbd ewbdVar2 = (ewbd) v2.Q();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    bqho bqhoVar2 = (bqho) v.b;
                                    ewbdVar2.getClass();
                                    bqhoVar2.d = ewbdVar2;
                                    bqhoVar2.b |= 1;
                                    String packageName = applicationContext3.getPackageName();
                                    if (!v.b.L()) {
                                        v.U();
                                    }
                                    bqho bqhoVar3 = (bqho) v.b;
                                    packageName.getClass();
                                    bqhoVar3.b |= 2;
                                    bqhoVar3.e = packageName;
                                    new bqla((bqho) v.Q(), null).f(applicationContext3);
                                }
                            }
                        }
                    }
                } catch (fgsd e3) {
                    ((eluo) ((eluo) ((eluo) c.j()).s(e3)).ai(5196)).x("Failed parsing AndroidPayload from push notification.");
                }
            }
        } finally {
            dhcb.b(intent);
        }
    }
}
