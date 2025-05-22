package com.google.android.gms.ads.jams;

import android.content.Intent;
import android.content.SharedPreferences;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.ads.internal.util.client.h;
import com.google.android.gms.chimera.modules.ads.AppContextProvider;
import defpackage.apzs;
import defpackage.casd;
import defpackage.dozb;
import defpackage.fmqp;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public final class SystemEventIntentOperation extends IntentOperation {

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class OnBootIntentOperation extends apzs {
        @Override // defpackage.apzs
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
            boolean k = dozb.k(AppContextProvider.a().getContentResolver(), "ads:jams:is_enabled", fmqp.f());
            SharedPreferences sharedPreferences = eVar.a;
            sharedPreferences.edit().putBoolean("negotiation_enabled", k).apply();
            sharedPreferences.edit().putBoolean("non_default_account_enabled", true).apply();
            if (g && !k) {
                h.d("[JAMS] Negotiation disabled");
                casd.a(AppContextProvider.a()).d("jams-negotiation-task", "com.google.android.gms.ads.jams.NegotiationService");
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
