package com.google.android.gms.fitness.disconnect;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.arts;
import defpackage.asot;
import defpackage.bfyv;
import defpackage.bfyw;
import defpackage.bfzc;
import defpackage.bgar;
import defpackage.bggg;
import defpackage.bggi;
import defpackage.bgzc;
import defpackage.bgzi;
import defpackage.bhaf;
import defpackage.byjl;
import defpackage.eiig;
import defpackage.ejhf;
import defpackage.vks;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FitCleanupIntentOperation extends IntentOperation {
    private static final asot a = bhaf.a();
    private bggi b;
    private bfyw c;

    public static void a(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, FitCleanupIntentOperation.class, "com.google.android.gms.fitness.disconnect.CLEANUP");
        if (startIntent == null) {
            ((ejhf) ((ejhf) a.i()).ah((char) 4672)).x("Couldn't create intent for FitCleanupIntentOperation.");
        } else {
            startIntent.putExtra("BROADCAST_INTENT", intent);
            context.startService(startIntent);
        }
    }

    private final void b(String str, int i) {
        Iterator it = this.c.d().iterator();
        while (it.hasNext()) {
            c(str, i, (String) it.next());
        }
    }

    private final void c(String str, int i, String str2) {
        eiig.a(!str.isEmpty());
        eiig.a(!str2.isEmpty());
        asot asotVar = a;
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 4668)).B("Clearing all cached OAuth tokens for: %s", str);
        bfyv bfyvVar = ((bfzc) this.c.k(str2)).j;
        if (i == 0) {
            i = bfyvVar.a(str);
        }
        arts b = arts.b(bfyvVar.a, i, bfyvVar.b, str);
        if (b != null) {
            bfyvVar.b(b);
        }
        ((ejhf) ((ejhf) asotVar.h()).ah((char) 4669)).B("Removing all subscriptions for: %s", str);
        try {
            this.b.q(str2).c(str);
        } catch (IOException e) {
            ((ejhf) ((ejhf) ((ejhf) a.i()).s(e)).ah((char) 4670)).x("Cannot remove subscriptions");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        bggi a2 = bggg.a(this);
        bfyw e = a2.e();
        this.b = a2;
        this.c = e;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        char c;
        if (intent.getAction().equals("com.google.android.gms.fitness.disconnect.CLEANUP")) {
            intent = (Intent) intent.getParcelableExtra("BROADCAST_INTENT");
        }
        ((ejhf) ((ejhf) a.h()).ah((char) 4671)).B("FitCleanupIntentOperation received Intent %s", intent.getAction());
        String action = intent.getAction();
        switch (action.hashCode()) {
            case -757193177:
                if (action.equals("com.google.android.gms.fitness.app_disconnected")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -177095062:
                if (action.equals("com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            case 172491798:
                if (action.equals("android.intent.action.PACKAGE_CHANGED")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case 267468725:
                if (action.equals("android.intent.action.PACKAGE_DATA_CLEARED")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 525384130:
                if (action.equals("android.intent.action.PACKAGE_REMOVED")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0) {
            c(intent.getStringExtra("com.google.android.gms.fitness.disconnected_app"), 0, intent.getStringExtra("com.google.android.gms.fitness.disconnected_account"));
            return;
        }
        if (c == 1) {
            if (bgar.d(intent)) {
                return;
            }
            b(bgar.b(intent), bgar.a(intent));
            return;
        }
        if (c != 2) {
            if (c == 3) {
                b(bgar.b(intent), bgar.a(intent));
                return;
            }
            if (c != 4) {
                throw new IllegalArgumentException("Unexpected intent ".concat(String.valueOf(String.valueOf(intent))));
            }
            for (Account account : vks.c(intent)) {
                this.b.p(account.name).K();
                bgzi.d(getApplicationContext(), account.name);
                Context applicationContext = getApplicationContext();
                String str = account.name;
                Set set = bgzc.a;
                byjl.a(applicationContext).d(bgzc.c(str), "com.google.android.gms.fitness.sync.SyncGcmTaskService");
                Set set2 = bgzc.a;
                synchronized (set2) {
                    set2.remove(str);
                }
            }
        }
    }
}
