package com.google.android.gms.auth.account;

import android.content.Intent;
import com.google.android.chimera.IntentOperation;
import defpackage.adod;
import defpackage.afds;
import defpackage.apzs;
import defpackage.auid;
import defpackage.aura;
import defpackage.ausn;
import defpackage.auua;
import defpackage.auub;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.ekva;
import defpackage.ekvd;
import defpackage.elgo;
import defpackage.elpg;
import defpackage.eluo;
import defpackage.fmul;
import defpackage.fmvc;
import defpackage.wqq;
import defpackage.wrn;
import defpackage.wuz;
import defpackage.wzt;
import defpackage.wzz;
import defpackage.xiz;
import defpackage.xjb;
import j$.util.Objects;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class AuthInitIntentOperation extends apzs {
    private static final ausn e = ausn.b("AuthInitIntentOperation", auid.AUTH_ACCOUNT_DATA);
    public static final String a = auua.f("com.google.android.gms.auth_account");
    protected static final String[] b = {"com.google.android.gms.auth.setup.devicesignals.LockScreenReceiver", "com.google.android.gms.auth.account.accounttransfer.AccountTransferReceiver", "com.google.android.gms.auth.account.data.WorkAccountStoreReceiver", "com.google.android.gms.auth.uiflows.addaccount.FinishSessionActivity", "com.google.android.gms.auth.uiflows.addaccount.DmSetScreenlockActivity", "com.google.android.gms.auth.uiflows.addaccount.UncertifiedNotificationActivity", "com.google.android.gms.auth.uiflows.consent.BrowserConsentActivity", "com.google.android.gms.auth.uiflows.factoryreset.PreFactoryResetActivity", "com.google.android.gms.auth.uiflows.removeaccount.GetAccountRemovalAllowedActivity", "com.google.android.gms.auth.account.mdm.GcmReceiverService", "com.google.android.gms.auth.account.visibility.RequestAccountsAccessActivity"};
    protected static final String[] c = new String[0];
    protected static final elgo d = elgo.l("com.google.android.gms.auth.uiflows.addaccount.GoogleServicesActivity");
    private static final wuz[] f = {afds.a, adod.a, wzt.a, xjb.a, wzz.a, wrn.a, xiz.a, wqq.a};

    private final void e(String str) {
        aura.H(this, str, false);
    }

    private final void f(String str) {
        aura.H(this, str, true);
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        Intent startIntent;
        ekvd ekvdVar = new ekvd("; ");
        ekva ekvaVar = new ekva(ekvdVar, ekvdVar);
        String[] strArr = b;
        int length = strArr.length;
        ekvaVar.f(strArr);
        for (int i = 0; i < 11; i++) {
            f(strArr[i]);
        }
        if (fmvc.a.lK().d()) {
            f("com.google.android.gms.auth.aang.impl.deeplink.DeepLinkActivity");
        }
        String[] strArr2 = c;
        int length2 = strArr2.length;
        ekvaVar.f(strArr2);
        elgo elgoVar = d;
        int i2 = ((elpg) elgoVar).c;
        for (int i3 = 0; i3 < i2; i3++) {
            try {
                e((String) elgoVar.get(i3));
            } catch (IllegalArgumentException unused) {
            }
        }
        if (fmvc.c()) {
            try {
                e("com.google.android.gms.auth.aang.impl.deeplink.DeepLinkActivity");
            } catch (IllegalArgumentException e2) {
                ((eluo) ((eluo) e.i()).s(e2)).x("Failed to disable DeepLinkActivity");
            }
        }
        if (z || !auub.e() || (startIntent = IntentOperation.getStartIntent(this, PhenotypeConfigSyncIntentOperation.class, "com.google.android.gms.auth.account.config.PHENOTYPE_CONFIG_SYNC")) == null) {
            return;
        }
        startService(startIntent);
    }

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        wuz[] wuzVarArr = f;
        intent.getAction();
        int length = wuzVarArr.length;
        for (int i2 = 0; i2 < 8; i2++) {
            boolean z = (i & 2) > 0;
            wuz wuzVar = wuzVarArr[i2];
            if (z) {
                wuzVar.a(this);
            }
            boolean z2 = (i & 12) > 0;
            if (z2) {
                wuzVar.d(this);
            }
            if (z || z2) {
                wuzVar.b(this);
            }
        }
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public void onHandleIntent(Intent intent) {
        wuz[] wuzVarArr = f;
        if (!fmul.a.lK().i() || !Objects.equals(intent.getAction(), a)) {
            super.onHandleIntent(intent);
            return;
        }
        dxwx.f(dxxi.a("com.google.android.gms.auth_account"));
        int length = wuzVarArr.length;
        for (int i = 0; i < 8; i++) {
            wuzVarArr[i].c(this);
        }
    }
}
