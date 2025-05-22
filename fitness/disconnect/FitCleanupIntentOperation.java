package com.google.android.gms.fitness.disconnect;

import android.accounts.Account;
import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.atwh;
import defpackage.ausn;
import defpackage.bidl;
import defpackage.bidm;
import defpackage.bids;
import defpackage.bifh;
import defpackage.bikw;
import defpackage.biky;
import defpackage.bjds;
import defpackage.bjdy;
import defpackage.bjev;
import defpackage.casd;
import defpackage.ekvl;
import defpackage.eluo;
import defpackage.xgt;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FitCleanupIntentOperation extends IntentOperation {
    private static final ausn a = bjev.a();
    private biky b;
    private bidm c;

    public static void a(Context context, Intent intent) {
        Intent startIntent = IntentOperation.getStartIntent(context, FitCleanupIntentOperation.class, "com.google.android.gms.fitness.disconnect.CLEANUP");
        if (startIntent == null) {
            ((eluo) ((eluo) a.i()).ai((char) 4682)).x("Couldn't create intent for FitCleanupIntentOperation.");
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
        ekvl.a(!str.isEmpty());
        ekvl.a(!str2.isEmpty());
        ausn ausnVar = a;
        ((eluo) ((eluo) ausnVar.h()).ai((char) 4678)).B("Clearing all cached OAuth tokens for: %s", str);
        bidl bidlVar = ((bids) this.c.k(str2)).j;
        if (i == 0) {
            i = bidlVar.a(str);
        }
        atwh b = atwh.b(bidlVar.a, i, bidlVar.b, str);
        if (b != null) {
            bidlVar.b(b);
        }
        ((eluo) ((eluo) ausnVar.h()).ai((char) 4679)).B("Removing all subscriptions for: %s", str);
        try {
            this.b.q(str2).c(str);
        } catch (IOException e) {
            ((eluo) ((eluo) ((eluo) a.i()).s(e)).ai((char) 4680)).x("Cannot remove subscriptions");
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        biky a2 = bikw.a(this);
        bidm e = a2.e();
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
        ((eluo) ((eluo) a.h()).ai((char) 4681)).B("FitCleanupIntentOperation received Intent %s", intent.getAction());
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
            if (bifh.d(intent)) {
                return;
            }
            b(bifh.b(intent), bifh.a(intent));
            return;
        }
        if (c != 2) {
            if (c == 3) {
                b(bifh.b(intent), bifh.a(intent));
                return;
            }
            if (c != 4) {
                throw new IllegalArgumentException("Unexpected intent ".concat(String.valueOf(String.valueOf(intent))));
            }
            for (Account account : xgt.c(intent)) {
                this.b.p(account.name).K();
                bjdy.d(getApplicationContext(), account.name);
                Context applicationContext = getApplicationContext();
                String str = account.name;
                Set set = bjds.a;
                casd.a(applicationContext).d(bjds.c(str), "com.google.android.gms.fitness.sync.SyncGcmTaskService");
                Set set2 = bjds.a;
                synchronized (set2) {
                    set2.remove(str);
                }
            }
        }
    }
}
