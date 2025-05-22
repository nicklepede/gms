package com.google.android.gms.phenotype.platform;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phenotype.AppContextProvider;
import defpackage.arvi;
import defpackage.arvr;
import defpackage.arwu;
import defpackage.aszs;
import defpackage.auid;
import defpackage.ausn;
import defpackage.cyjh;
import defpackage.cyki;
import defpackage.cykp;
import defpackage.dhmr;
import defpackage.dozb;
import defpackage.eluo;
import defpackage.fkuc;
import defpackage.fufv;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class CheckinCompleteIntentOperation extends IntentOperation {
    private Context d;
    private cyki e;
    private arwu f;
    private static final ausn b = ausn.e(auid.PHENOTYPE);
    static final String[] a = {"DUMMYLOGSOURCE"};
    private static final int[] c = new int[0];

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aszs aszsVar = cyjh.a;
        cyki cykiVar = new cyki(this);
        WeakReference weakReference = cykp.a;
        arvr arvrVar = weakReference != null ? (arvr) weakReference.get() : null;
        if (arvrVar == null) {
            Context a2 = AppContextProvider.a();
            List list = arvr.n;
            arvrVar = new arvi(a2, "PHENOTYPE").a();
            arvrVar.h(fkuc.UNMETERED_OR_DAILY);
            cykp.a = new WeakReference(arvrVar);
        }
        arwu arwuVar = new arwu(arvrVar, "PHENOTYPE_COUNTERS", 1024);
        this.d = this;
        this.e = cykiVar;
        this.f = arwuVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        if (fufv.i()) {
            return;
        }
        this.f.h();
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        int[] copyOf;
        if (intent == null) {
            return;
        }
        String action = intent.getAction();
        if (!"com.google.android.checkin.CHECKIN_COMPLETE".equals(action)) {
            ((eluo) b.j()).B("Received unknown action: %s", action);
            return;
        }
        if (intent.getBooleanExtra("success", true)) {
            Map h = dozb.h(this.d.getContentResolver(), "checkin_expid_");
            if (h.isEmpty()) {
                copyOf = c;
            } else {
                int[] iArr = new int[h.size()];
                int i = 0;
                for (Map.Entry entry : h.entrySet()) {
                    String str = (String) entry.getKey();
                    String str2 = (String) entry.getValue();
                    if (str2 != null && !str2.isEmpty()) {
                        try {
                            int parseInt = Integer.parseInt(str.substring(14));
                            iArr[i] = parseInt;
                            i++;
                            if (!fufv.i()) {
                                this.f.e("CheckinExpId").a(parseInt, 1L, arwu.b);
                            }
                        } catch (NumberFormatException unused) {
                            if (!fufv.i()) {
                                this.f.d("BadCheckinExpId").a(0L, 1L, arwu.b);
                            }
                            ((eluo) b.j()).B("Received gservices flag with bad format: %s", str);
                        }
                    }
                }
                copyOf = i == h.size() ? iArr : Arrays.copyOf(iArr, i);
            }
            Arrays.toString(copyOf);
            try {
                dhmr.o(this.e.g("com.google.android.gms.checkin.binary", 1, a, copyOf), fufv.b(), TimeUnit.MILLISECONDS);
                if (fufv.i()) {
                    return;
                }
                this.f.d("CheckinExpIdWeakRegisterSuccess").a(0L, 1L, arwu.b);
            } catch (InterruptedException | ExecutionException | TimeoutException unused2) {
                if (fufv.i()) {
                    return;
                }
                this.f.d("CheckinExpIdWeakRegisterFailure").a(0L, 1L, arwu.b);
            }
        }
    }
}
