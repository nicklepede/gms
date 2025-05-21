package com.google.android.gms.fido.authenticator.autoenroll;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.asit;
import defpackage.asnw;
import defpackage.asoe;
import defpackage.asqh;
import defpackage.barc;
import defpackage.bare;
import defpackage.bazf;
import defpackage.bazg;
import defpackage.bazh;
import defpackage.bazo;
import defpackage.bbkx;
import defpackage.bcnj;
import defpackage.bcnk;
import defpackage.bcnl;
import defpackage.bcno;
import defpackage.bcnp;
import defpackage.bcoc;
import defpackage.ejcz;
import defpackage.ejfg;
import defpackage.fnxh;
import defpackage.fnxq;
import defpackage.fnyl;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class FidoEnrollmentIntentOperation extends IntentOperation {
    public static final bcnj a = new bcnj("FidoEnrollmentIntentOperation");
    private final Context b;
    private final bcnl c;
    private final bazf d;
    private final bazo e;
    private final bcnp f;

    public FidoEnrollmentIntentOperation() {
        this.b = this;
        this.c = bcnl.a(bcnk.FIDO_AUTOENROLLMENT_V1);
        this.d = new bazf(this);
        this.e = new bazo(this);
        this.f = bcno.a();
    }

    public static void c(Context context, String str) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FidoEnrollmentIntentOperation.class, new Intent("com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE"), 0, 134217728);
        asit asitVar = new asit(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a2 = fnxh.a.a().a();
        asitVar.d("FidoEnrollmentIntentOperation", 2, elapsedRealtime + (a2 / 2) + ((long) (Math.random() * a2)), pendingIntent, str);
    }

    public final void a(bare bareVar, Exception exc) {
        this.f.E(this.c, barc.EVENT_TYPE_ENROLLMENT_ERROR, bareVar, 2, exc);
    }

    public final void b(bare bareVar) {
        this.f.E(this.c, barc.EVENT_TYPE_ENROLLMENT_SUCCESS, bareVar, 2, null);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        bcnj bcnjVar = a;
        bcnjVar.d("Received %s event", intent.getAction());
        if (!intent.getAction().equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE")) {
            bcnjVar.f("Intent action %s is not FIDO enrollment", intent.getAction());
            return;
        }
        c(this.b, getPackageName());
        if (!fnxh.c()) {
            bcnjVar.f("Fido auto enrollment is disabled", new Object[0]);
            return;
        }
        if (fnyl.a.a().e()) {
            try {
                Set a2 = this.d.a(bbkx.SOFTWARE_KEY);
                CountDownLatch countDownLatch3 = new CountDownLatch(a2.size());
                ejfg it = ((ejcz) a2).iterator();
                while (it.hasNext()) {
                    this.e.c((String) it.next(), bbkx.SOFTWARE_KEY, new bazh(this, countDownLatch3));
                }
                countDownLatch = countDownLatch3;
            } catch (bcoc e) {
                a.g("Encountered an issue with the database", e, new Object[0]);
                a(bare.KEY_TYPE_SOFTWARE, e);
                countDownLatch = new CountDownLatch(0);
            }
        } else {
            countDownLatch = new CountDownLatch(0);
        }
        if (!fnxq.a.a().a()) {
            countDownLatch2 = new CountDownLatch(0);
        } else if (asqh.e()) {
            Context context = this.b;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                countDownLatch2 = new CountDownLatch(0);
            } else if (asoe.l(context)) {
                try {
                    Set a3 = this.d.a(bbkx.STRONGBOX_KEY);
                    CountDownLatch countDownLatch4 = new CountDownLatch(a3.size());
                    ejfg it2 = ((ejcz) a3).iterator();
                    while (it2.hasNext()) {
                        this.e.c((String) it2.next(), bbkx.STRONGBOX_KEY, new bazg(this, countDownLatch4));
                    }
                    countDownLatch2 = countDownLatch4;
                } catch (bcoc e2) {
                    a.g("Encountered an issue with the database", e2, new Object[0]);
                    a(bare.KEY_TYPE_STRONGBOX, e2);
                    countDownLatch2 = new CountDownLatch(0);
                }
            } else {
                countDownLatch2 = new CountDownLatch(0);
            }
        } else {
            countDownLatch2 = new CountDownLatch(0);
        }
        if (fnxh.a.a().f()) {
            if (((KeyguardManager) this.b.getSystemService("keyguard")).isDeviceSecure()) {
                try {
                    Set a4 = this.d.a(bbkx.ANDROID_KEYSTORE);
                    if (a4.isEmpty()) {
                        a.d("All existing accounts have KeyStore keys enrolled. No enrollment is needed", new Object[0]);
                    } else {
                        Context context2 = this.b;
                        bcnj bcnjVar2 = FidoEnrollmentPersistentIntentOperation.a;
                        if (asnw.k(a4)) {
                            FidoEnrollmentPersistentIntentOperation.a.d("Account list is empty. No need to start FIDO key enrollment", new Object[0]);
                        } else {
                            Intent startIntent = FidoEnrollmentPersistentIntentOperation.getStartIntent(context2, FidoEnrollmentPersistentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_ENROLLMENT");
                            startIntent.putStringArrayListExtra("extra_accounts", new ArrayList<>(a4));
                            context2.startService(startIntent);
                        }
                    }
                } catch (bcoc e3) {
                    a.g("Encountered an issue with the database", e3, new Object[0]);
                    a(bare.KEY_TYPE_KEYSTORE, e3);
                }
            } else {
                a.d("Screen lock is not enabled on device, not enrolling hardware-backed keys", new Object[0]);
            }
        }
        try {
            countDownLatch.await(300000L, TimeUnit.MILLISECONDS);
            countDownLatch2.await(300000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e4) {
            a.g("Software or StrongBox key enrollments timed out or got interrupted", e4, new Object[0]);
        }
    }

    FidoEnrollmentIntentOperation(Context context, bcnl bcnlVar, bazf bazfVar, bazo bazoVar, bcnp bcnpVar) {
        this.b = context;
        this.c = bcnlVar;
        this.d = bazfVar;
        this.e = bazoVar;
        this.f = bcnpVar;
    }
}
