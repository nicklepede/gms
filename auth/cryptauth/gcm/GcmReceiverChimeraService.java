package com.google.android.gms.auth.cryptauth.gcm;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.aaqo;
import defpackage.aarh;
import defpackage.aarr;
import defpackage.aatp;
import defpackage.aatw;
import defpackage.arxo;
import defpackage.asnj;
import defpackage.deqh;
import defpackage.fkxb;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private static final arxo a = new arxo(new String[]{"GcmReceiverService"}, (byte[]) null);

    public GcmReceiverChimeraService() {
        super("CryptauthGcmIntentReceiver");
        setIntentRedelivery(true);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        Account account;
        if (fkxb.c()) {
            try {
                if (intent == null) {
                    a.m("Received null intent.", new Object[0]);
                    int i = deqh.b;
                    return;
                }
                arxo arxoVar = aarr.a;
                aarh aarhVar = new aarh(this);
                aaqo aaqoVar = new aaqo(this);
                if (!intent.hasExtra("S")) {
                    aarr.a.m("Missing target service", new Object[0]);
                } else if (intent.hasExtra("H")) {
                    try {
                        account = new Account(aaqoVar.g(asnj.d(intent.getStringExtra("H"))).f, "com.google");
                    } catch (aatw e) {
                        aarr.a.n("Couldn't retrieve key from key handle", e, new Object[0]);
                        account = null;
                    }
                    if (account == null) {
                        aarr.a.m("Account could not be retrieved from key handle", new Object[0]);
                    } else {
                        if (intent.hasExtra("F")) {
                            String stringExtra = intent.getStringExtra("F");
                            aarr.a.h("Sending device sync feature broadcast for ".concat(String.valueOf(stringExtra)), new Object[0]);
                            aatp.a(3);
                            String str = account.name;
                            Intent intent2 = new Intent("com.google.android.gms.auth.cryptauth.DEVICE_SYNC_V2_FEATURE");
                            intent2.setPackage("com.google.android.gms");
                            intent2.putExtra("account_name", str);
                            intent2.putExtra("feature_name", stringExtra);
                            sendBroadcast(intent2);
                        }
                        String stringExtra2 = intent.getStringExtra("S");
                        if (stringExtra2.hashCode() == 50 && stringExtra2.equals("2")) {
                            String stringExtra3 = intent.getStringExtra("K");
                            if (stringExtra3 == null) {
                                aarr.a.m("Missing device sync key name", new Object[0]);
                            } else {
                                aarhVar.a(account, stringExtra3, intent.getStringExtra("I"));
                            }
                        } else {
                            aarr.a.m("Unrecognized target service: ".concat(String.valueOf(stringExtra2)), new Object[0]);
                        }
                    }
                } else {
                    aarr.a.m("Missing active key handle field", new Object[0]);
                }
            } catch (RuntimeException e2) {
                a.n("Error", e2, new Object[0]);
            } finally {
                deqh.c(intent);
            }
        }
    }
}
