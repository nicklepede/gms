package com.google.android.gms.auth.account;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.abod;
import defpackage.addq;
import defpackage.anya;
import defpackage.asej;
import defpackage.asng;
import defpackage.asot;
import defpackage.asqg;
import defpackage.asqh;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.eihv;
import defpackage.eihy;
import defpackage.eitj;
import defpackage.ejcb;
import defpackage.ejhf;
import defpackage.fkdz;
import defpackage.fkeq;
import defpackage.uur;
import defpackage.uvo;
import defpackage.uyz;
import defpackage.vds;
import defpackage.vdy;
import defpackage.vmy;
import defpackage.vna;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class AuthInitIntentOperation extends anya {
    private static final asot e = asot.b("AuthInitIntentOperation", asej.AUTH_ACCOUNT_DATA);
    public static final String a = asqg.f("com.google.android.gms.auth_account");
    protected static final String[] b = {"com.google.android.gms.auth.setup.devicesignals.LockScreenReceiver", "com.google.android.gms.auth.account.accounttransfer.AccountTransferReceiver", "com.google.android.gms.auth.account.data.WorkAccountStoreReceiver", "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity", "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity", "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity", "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity", "com.google.android.gms.auth.uiflows.factoryreset.PreFactoryResetActivity", "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity", "com.google.android.gms.auth.account.mdm.GcmReceiverService", "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity"};
    protected static final String[] c = new String[0];
    protected static final eitj d = eitj.l("com.google.android.gms.auth.uiflows.addaccount.GoogleServicesActivity");
    private static final uyz[] f = {addq.a, abod.a, vds.a, vna.a, vdy.a, uvo.a, vmy.a, uur.a};

    private final void e(String str) {
        asng.H(this, str, false);
    }

    private final void f(String str) {
        asng.H(this, str, true);
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        Intent startIntent;
        eihy eihyVar = new eihy("; ");
        eihv eihvVar = new eihv(eihyVar, eihyVar);
        String[] strArr = b;
        int length = strArr.length;
        eihvVar.f(strArr);
        for (int i = 0; i < 11; i++) {
            f(strArr[i]);
        }
        if (fkeq.a.a().d()) {
            f("com.google.android.gms.auth.aang.impl.deeplink.DeepLinkActivity");
        }
        String[] strArr2 = c;
        int length2 = strArr2.length;
        eihvVar.f(strArr2);
        eitj eitjVar = d;
        int i2 = ((ejcb) eitjVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                e((String) eitjVar.get(i3));
            } catch (IllegalArgumentException unused) {
            }
        }
        if (fkeq.c()) {
            try {
                e("com.google.android.gms.auth.aang.impl.deeplink.DeepLinkActivity");
            } catch (IllegalArgumentException e2) {
                ((ejhf) ((ejhf) e.i()).s(e2)).x("Failed to disable DeepLinkActivity");
            }
        }
        if (z || !asqh.e() || (startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigSyncIntentOperation.class, "com.google.android.gms.auth.account.config.PHENOTYPE_CONFIG_SYNC")) == null) {
            return;
        }
        startService(startIntent);
    }

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        uyz[] uyzVarArr = f;
        intent.getAction();
        int length = uyzVarArr.length;
        for (int i2 = 0; i2 < 8; i2++) {
            boolean z = (i & 2) > 0;
            uyz uyzVar = uyzVarArr[i2];
            if (z) {
                uyzVar.a(this);
            }
            boolean z2 = (i & 12) > 0;
            if (z2) {
                uyzVar.d(this);
            }
            if (z || z2) {
                uyzVar.b(this);
            }
        }
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public void onHandleIntent(Intent intent) {
        uyz[] uyzVarArr = f;
        if (!fkdz.a.a().i() || !Objects.equals(intent.getAction(), a)) {
            super.onHandleIntent(intent);
            return;
        }
        dvlw.f(dvmh.a("com.google.android.gms.auth_account"));
        int length = uyzVarArr.length;
        for (int i = 0; i < 8; i++) {
            uyzVarArr[i].c(this);
        }
    }
}
