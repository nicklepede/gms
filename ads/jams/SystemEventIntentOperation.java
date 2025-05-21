package com.google.android.gms.ads.jams;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.anya;
import defpackage.byjl;
import defpackage.dmnn;
import defpackage.fkak;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public final class SystemEventIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class OnBootIntentOperation extends anya {
        @Override // defpackage.anya
        protected final void b(Intent intent, int i) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            h.d("[JAMS] Boot completed");
            if (new e(AppContextProvider.a()).g()) {
                b.c(2);
            }
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        e eVar = new e(AppContextProvider.a());
        if (Objects.equals(intent.getAction(), "com.google.android.gms.auth.GOOGLE_ACCOUNT_CHANGE")) {
            int i = com.google.android.gms.ads.internal.util.c.a;
            h.d("[JAMS] Accounts changed");
            if (eVar.g()) {
                b.c(3);
                return;
            }
            return;
        }
        if (Objects.equals(intent.getAction(), "com.google.android.checkin.CHECKIN_COMPLETE")) {
            int i2 = com.google.android.gms.ads.internal.util.c.a;
            h.d("[JAMS] Gservices updated");
            boolean g = eVar.g();
            boolean k = dmnn.k(AppContextProvider.a().getContentResolver(), "ads:jams:is_enabled", fkak.f());
            boolean l = fkak.a.a().l();
            SharedPreferences sharedPreferences = eVar.a;
            sharedPreferences.edit().putBoolean("negotiation_enabled", k).apply();
            sharedPreferences.edit().putBoolean("non_default_account_enabled", l).apply();
            if (g && !k) {
                h.d("[JAMS] Negotiation disabled");
                byjl.a(AppContextProvider.a()).d("jams-negotiation-task", "com.google.android.gms.ads.jams.NegotiationService");
            } else {
                if (g || !k) {
                    return;
                }
                h.d("[JAMS] Negotiation enabled");
                b.c(4);
            }
        }
    }
}
