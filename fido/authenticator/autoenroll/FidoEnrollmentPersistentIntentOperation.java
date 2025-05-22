package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.chimera.IntentOperation;
import defpackage.bddg;
import defpackage.bddm;
import defpackage.bddp;
import defpackage.bddq;
import defpackage.bdoo;
import defpackage.beow;
import defpackage.beox;
import defpackage.beoy;
import defpackage.bepb;
import defpackage.bepc;
import defpackage.ekvl;
import defpackage.ind;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoEnrollmentPersistentIntentOperation extends IntentOperation implements bddp {
    public static final beow a = new beow("FidoEnrollmentPersistentIntentOperation");
    public final beoy b;
    public final bepc c;
    public CountDownLatch d;
    private final bddq e;
    private final bddm f;
    private ArrayList g;

    public FidoEnrollmentPersistentIntentOperation() {
        this.b = beoy.a(beox.FIDO_AUTOENROLLMENT_V1);
        this.e = new bddq(this, this);
        this.f = new bddm(this);
        this.c = bepb.a();
    }

    @Override // defpackage.bddp
    public final void a() {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            a.d("Start FIDO key enrollment for account ".concat(String.valueOf(str)), new Object[0]);
            this.f.c(str, bdoo.ANDROID_KEYSTORE, new bddg(this));
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        beow beowVar = a;
        beowVar.d("Received action ".concat(valueOf), new Object[0]);
        if (!action.equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_ENROLLMENT")) {
            beowVar.f("Action %s is not supported", action);
            return;
        }
        this.g = intent.getStringArrayListExtra("extra_accounts");
        if (this.d == null) {
            this.d = new CountDownLatch(this.g.size());
        }
        bddq bddqVar = this.e;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        ind.b(bddqVar.b, bddqVar.c, intentFilter, 2);
        try {
            this.d.await(24L, TimeUnit.HOURS);
        } catch (InterruptedException unused) {
            a.f("The countdown latch is interrupted", new Object[0]);
        }
        bddq bddqVar2 = this.e;
        bddqVar2.b.unregisterReceiver(bddqVar2.c);
    }

    FidoEnrollmentPersistentIntentOperation(beoy beoyVar, bddq bddqVar, CountDownLatch countDownLatch, bddm bddmVar, bepc bepcVar) {
        this.b = beoyVar;
        ekvl.y(bddqVar);
        this.e = bddqVar;
        ekvl.y(countDownLatch);
        this.d = countDownLatch;
        ekvl.y(bddmVar);
        this.f = bddmVar;
        this.c = bepcVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
    }
}
