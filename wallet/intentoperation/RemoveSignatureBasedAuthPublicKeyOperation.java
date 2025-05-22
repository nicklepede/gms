package com.google.android.gms.wallet.intentoperation;

import android.accounts.Account;
import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.wallet.shared.ApplicationParameters;
import com.google.android.gms.wallet.shared.BuyFlowConfig;
import defpackage.atzs;
import defpackage.dkwa;
import defpackage.dlnn;
import defpackage.ekbh;
import defpackage.ekby;
import defpackage.fgrc;
import defpackage.fgtj;
import defpackage.fgwc;
import defpackage.fgwf;
import j$.util.DesugarCollections;
import java.util.ArrayList;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes7.dex */
public class RemoveSignatureBasedAuthPublicKeyOperation extends IntentOperation {
    private dlnn a;

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
        this.a = new dlnn(getApplicationContext());
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        try {
            BuyFlowConfig buyFlowConfig = (BuyFlowConfig) atzs.b(intent, "com.google.android.gms.wallet.buyFlowConfig", BuyFlowConfig.CREATOR);
            int a = ekbh.a(intent.getIntExtra("EXTRA_AUTHENTICATOR", 0));
            ApplicationParameters applicationParameters = buyFlowConfig.b;
            int i = applicationParameters.a;
            Account account = applicationParameters.b;
            fgwf c = this.a.c(i, account);
            if (c != null) {
                fgrc fgrcVar = (fgrc) c.iQ(5, null);
                fgrcVar.X(c);
                fgwc fgwcVar = (fgwc) fgrcVar;
                ArrayList arrayList = new ArrayList();
                for (ekby ekbyVar : DesugarCollections.unmodifiableList(((fgwf) fgwcVar.b).g)) {
                    int a2 = ekbh.a(ekbyVar.f);
                    if (a2 == 0) {
                        a2 = 1;
                    }
                    if (a2 != a) {
                        arrayList.add(ekbyVar);
                    }
                }
                if (!fgwcVar.b.L()) {
                    fgwcVar.U();
                }
                ((fgwf) fgwcVar.b).g = fgtj.a;
                fgwcVar.a(arrayList);
                this.a.f(i, account, (fgwf) fgwcVar.Q());
            }
            dkwa.a(getApplicationContext(), buyFlowConfig).i(a);
        } catch (Exception unused) {
            getApplicationContext();
        }
    }
}
