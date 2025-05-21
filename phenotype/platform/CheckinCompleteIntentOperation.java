package com.google.android.gms.phenotype.platform;

import android.content.Context;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.chimera.modules.phenotype.AppContextProvider;
import defpackage.apsr;
import defpackage.apta;
import defpackage.apud;
import defpackage.aqxd;
import defpackage.asej;
import defpackage.asot;
import defpackage.cvzk;
import defpackage.cwal;
import defpackage.cwas;
import defpackage.dfbl;
import defpackage.dmnn;
import defpackage.ejhf;
import defpackage.fief;
import defpackage.frlx;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class CheckinCompleteIntentOperation extends IntentOperation {
    private Context d;
    private cwal e;
    private apud f;
    private static final asot b = asot.e(asej.PHENOTYPE);
    static final String[] a = {"DUMMYLOGSOURCE"};
    private static final int[] c = new int[0];

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        aqxd aqxdVar = cvzk.a;
        cwal cwalVar = new cwal(this);
        WeakReference weakReference = cwas.a;
        apta aptaVar = weakReference != null ? (apta) weakReference.get() : null;
        if (aptaVar == null) {
            Context a2 = AppContextProvider.a();
            List list = apta.n;
            aptaVar = new apsr(a2, "PHENOTYPE").a();
            aptaVar.h(fief.UNMETERED_OR_DAILY);
            cwas.a = new WeakReference(aptaVar);
        }
        apud apudVar = new apud(aptaVar, "PHENOTYPE_COUNTERS", 1024);
        this.d = this;
        this.e = cwalVar;
        this.f = apudVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
        if (frlx.i()) {
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
            ((ejhf) b.j()).B("Received unknown action: %s", action);
            return;
        }
        if (intent.getBooleanExtra("success", true)) {
            Map h = dmnn.h(this.d.getContentResolver(), "checkin_expid_");
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
                            if (!frlx.i()) {
                                this.f.e("CheckinExpId").a(parseInt, 1L, apud.b);
                            }
                        } catch (NumberFormatException unused) {
                            if (!frlx.i()) {
                                this.f.d("BadCheckinExpId").a(0L, 1L, apud.b);
                            }
                            ((ejhf) b.j()).B("Received gservices flag with bad format: %s", str);
                        }
                    }
                }
                copyOf = i == h.size() ? iArr : Arrays.copyOf(iArr, i);
            }
            Arrays.toString(copyOf);
            try {
                dfbl.o(this.e.g("com.google.android.gms.checkin.binary", 1, a, copyOf), frlx.b(), TimeUnit.MILLISECONDS);
                if (frlx.i()) {
                    return;
                }
                this.f.d("CheckinExpIdWeakRegisterSuccess").a(0L, 1L, apud.b);
            } catch (InterruptedException | ExecutionException | TimeoutException unused2) {
                if (frlx.i()) {
                    return;
                }
                this.f.d("CheckinExpIdWeakRegisterFailure").a(0L, 1L, apud.b);
            }
        }
    }
}
