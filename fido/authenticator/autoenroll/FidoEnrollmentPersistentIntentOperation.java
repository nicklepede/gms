package com.google.android.gms.fido.authenticator.autoenroll;

import android.content.Intent;
import android.content.IntentFilter;
import com.google.android.chimera.IntentOperation;
import defpackage.bazi;
import defpackage.bazo;
import defpackage.bazr;
import defpackage.bazs;
import defpackage.bbkx;
import defpackage.bcnj;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcno;
import defpackage.bcnp;
import defpackage.eiig;
import defpackage.iln;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoEnrollmentPersistentIntentOperation extends IntentOperation implements bazr {
    public static final bcnj a = new bcnj("FidoEnrollmentPersistentIntentOperation");
    public final bcnl b;
    public final bcnp c;
    public CountDownLatch d;
    private final bazs e;
    private final bazo f;
    private ArrayList g;

    public FidoEnrollmentPersistentIntentOperation() {
        this.b = bcnl.a(bcnk.FIDO_AUTOENROLLMENT_V1);
        this.e = new bazs(this, this);
        this.f = new bazo(this);
        this.c = bcno.a();
    }

    @Override // defpackage.bazr
    public final void a() {
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            String str = (String) arrayList.get(i);
            a.d("Start FIDO key enrollment for account ".concat(String.valueOf(str)), new Object[0]);
            this.f.c(str, bbkx.ANDROID_KEYSTORE, new bazi(this));
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        String valueOf = String.valueOf(action);
        bcnj bcnjVar = a;
        bcnjVar.d("Received action ".concat(valueOf), new Object[0]);
        if (!action.equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_ENROLLMENT")) {
            bcnjVar.f("Action %s is not supported", action);
            return;
        }
        this.g = intent.getStringArrayListExtra("extra_accounts");
        if (this.d == null) {
            this.d = new CountDownLatch(this.g.size());
        }
        bazs bazsVar = this.e;
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        iln.b(bazsVar.b, bazsVar.c, intentFilter, 2);
        try {
            this.d.await(24L, TimeUnit.HOURS);
        } catch (InterruptedException unused) {
            a.f("The countdown latch is interrupted", new Object[0]);
        }
        bazs bazsVar2 = this.e;
        bazsVar2.b.unregisterReceiver(bazsVar2.c);
    }

    FidoEnrollmentPersistentIntentOperation(bcnl bcnlVar, bazs bazsVar, CountDownLatch countDownLatch, bazo bazoVar, bcnp bcnpVar) {
        this.b = bcnlVar;
        eiig.x(bazsVar);
        this.e = bazsVar;
        eiig.x(countDownLatch);
        this.d = countDownLatch;
        eiig.x(bazoVar);
        this.f = bazoVar;
        this.c = bcnpVar;
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
    }
}
