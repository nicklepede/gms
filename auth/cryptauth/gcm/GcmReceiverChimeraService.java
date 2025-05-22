package com.google.android.gms.auth.cryptauth.gcm;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.framework.tracing.wrapper.TracingIntentService;
import defpackage.acqo;
import defpackage.acrh;
import defpackage.acrr;
import defpackage.actp;
import defpackage.actw;
import defpackage.auad;
import defpackage.aurd;
import defpackage.dhbk;
import defpackage.fnog;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GcmReceiverChimeraService extends TracingIntentService {
    private static final auad a = new auad(new String[]{"GcmReceiverService"}, (byte[]) null);

    public GcmReceiverChimeraService() {
        super("CryptauthGcmIntentReceiver");
        setIntentRedelivery(true);
    }

    @Override // com.google.android.gms.framework.tracing.wrapper.TracingIntentService
    protected final void a(Intent intent) {
        Account account;
        if (fnog.c()) {
            try {
                if (intent == null) {
                    a.m("Received null intent.", new Object[0]);
                    int i = dhbk.b;
                    return;
                }
                auad auadVar = acrr.a;
                acrh acrhVar = new acrh(this);
                acqo acqoVar = new acqo(this);
                if (!intent.hasExtra("S")) {
                    acrr.a.m("Missing target service", new Object[0]);
                } else if (intent.hasExtra("H")) {
                    try {
                        account = new Account(acqoVar.g(aurd.d(intent.getStringExtra("H"))).f, "com.google");
                    } catch (actw e) {
                        acrr.a.n("Couldn't retrieve key from key handle", e, new Object[0]);
                        account = null;
                    }
                    if (account == null) {
                        acrr.a.m("Account could not be retrieved from key handle", new Object[0]);
                    } else {
                        if (intent.hasExtra("F")) {
                            String stringExtra = intent.getStringExtra("F");
                            acrr.a.h("Sending device sync feature broadcast for ".concat(String.valueOf(stringExtra)), new Object[0]);
                            actp.a(3);
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
                                acrr.a.m("Missing device sync key name", new Object[0]);
                            } else {
                                acrhVar.a(account, stringExtra3, intent.getStringExtra("I"));
                            }
                        } else {
                            acrr.a.m("Unrecognized target service: ".concat(String.valueOf(stringExtra2)), new Object[0]);
                        }
                    }
                } else {
                    acrr.a.m("Missing active key handle field", new Object[0]);
                }
            } catch (RuntimeException e2) {
                a.n("Error", e2, new Object[0]);
            } finally {
                dhbk.c(intent);
            }
        }
    }
}
