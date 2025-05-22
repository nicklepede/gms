package com.google.android.gms.fido.authenticator.autoenroll;

import android.app.KeyguardManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import com.google.android.chimera.IntentOperation;
import defpackage.aumn;
import defpackage.aurq;
import defpackage.aury;
import defpackage.auub;
import defpackage.bcuy;
import defpackage.bcva;
import defpackage.bddd;
import defpackage.bdde;
import defpackage.bddf;
import defpackage.bddm;
import defpackage.bdoo;
import defpackage.beow;
import defpackage.beox;
import defpackage.beoy;
import defpackage.bepb;
import defpackage.bepc;
import defpackage.bepp;
import defpackage.elqe;
import defpackage.elsn;
import defpackage.fqpj;
import defpackage.fqps;
import defpackage.fqqn;
import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class FidoEnrollmentIntentOperation extends IntentOperation {
    public static final beow a = new beow("FidoEnrollmentIntentOperation");
    private final Context b;
    private final beoy c;
    private final bddd d;
    private final bddm e;
    private final bepc f;

    public FidoEnrollmentIntentOperation() {
        this.b = this;
        this.c = beoy.a(beox.FIDO_AUTOENROLLMENT_V1);
        this.d = new bddd(this);
        this.e = new bddm(this);
        this.f = bepb.a();
    }

    public static void c(Context context, String str) {
        PendingIntent pendingIntent = IntentOperation.getPendingIntent(context, FidoEnrollmentIntentOperation.class, new Intent("com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE"), 0, 134217728);
        aumn aumnVar = new aumn(context);
        long elapsedRealtime = SystemClock.elapsedRealtime();
        long a2 = fqpj.a.lK().a();
        aumnVar.d("FidoEnrollmentIntentOperation", 2, elapsedRealtime + (a2 / 2) + ((long) (Math.random() * a2)), pendingIntent, str);
    }

    public final void a(bcva bcvaVar, Exception exc) {
        this.f.E(this.c, bcuy.EVENT_TYPE_ENROLLMENT_ERROR, bcvaVar, 2, exc);
    }

    public final void b(bcva bcvaVar) {
        this.f.E(this.c, bcuy.EVENT_TYPE_ENROLLMENT_SUCCESS, bcvaVar, 2, null);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        CountDownLatch countDownLatch;
        CountDownLatch countDownLatch2;
        beow beowVar = a;
        beowVar.d("Received %s event", intent.getAction());
        if (!intent.getAction().equals("com.google.android.gms.fido.authenticator.autoenroll.FIDO_ENROLLMENT_CHECK_DELAY_COMPLETE")) {
            beowVar.f("Intent action %s is not FIDO enrollment", intent.getAction());
            return;
        }
        c(this.b, getPackageName());
        if (!fqpj.c()) {
            beowVar.f("Fido auto enrollment is disabled", new Object[0]);
            return;
        }
        if (fqqn.a.lK().e()) {
            try {
                Set a2 = this.d.a(bdoo.SOFTWARE_KEY);
                CountDownLatch countDownLatch3 = new CountDownLatch(a2.size());
                elsn it = ((elqe) a2).iterator();
                while (it.hasNext()) {
                    this.e.c((String) it.next(), bdoo.SOFTWARE_KEY, new bddf(this, countDownLatch3));
                }
                countDownLatch = countDownLatch3;
            } catch (bepp e) {
                a.g("Encountered an issue with the database", e, new Object[0]);
                a(bcva.KEY_TYPE_SOFTWARE, e);
                countDownLatch = new CountDownLatch(0);
            }
        } else {
            countDownLatch = new CountDownLatch(0);
        }
        if (!fqps.a.lK().a()) {
            countDownLatch2 = new CountDownLatch(0);
        } else if (auub.e()) {
            Context context = this.b;
            if (!context.getPackageManager().hasSystemFeature("android.hardware.strongbox_keystore")) {
                countDownLatch2 = new CountDownLatch(0);
            } else if (aury.l(context)) {
                try {
                    Set a3 = this.d.a(bdoo.STRONGBOX_KEY);
                    CountDownLatch countDownLatch4 = new CountDownLatch(a3.size());
                    elsn it2 = ((elqe) a3).iterator();
                    while (it2.hasNext()) {
                        this.e.c((String) it2.next(), bdoo.STRONGBOX_KEY, new bdde(this, countDownLatch4));
                    }
                    countDownLatch2 = countDownLatch4;
                } catch (bepp e2) {
                    a.g("Encountered an issue with the database", e2, new Object[0]);
                    a(bcva.KEY_TYPE_STRONGBOX, e2);
                    countDownLatch2 = new CountDownLatch(0);
                }
            } else {
                countDownLatch2 = new CountDownLatch(0);
            }
        } else {
            countDownLatch2 = new CountDownLatch(0);
        }
        if (fqpj.a.lK().f()) {
            if (((KeyguardManager) this.b.getSystemService("keyguard")).isDeviceSecure()) {
                try {
                    Set a4 = this.d.a(bdoo.ANDROID_KEYSTORE);
                    if (a4.isEmpty()) {
                        a.d("All existing accounts have KeyStore keys enrolled. No enrollment is needed", new Object[0]);
                    } else {
                        Context context2 = this.b;
                        beow beowVar2 = FidoEnrollmentPersistentIntentOperation.a;
                        if (aurq.k(a4)) {
                            FidoEnrollmentPersistentIntentOperation.a.d("Account list is empty. No need to start FIDO key enrollment", new Object[0]);
                        } else {
                            Intent startIntent = FidoEnrollmentPersistentIntentOperation.getStartIntent(context2, FidoEnrollmentPersistentIntentOperation.class, "com.google.android.gms.fido.authenticator.autoenroll.FIDO_KEY_ENROLLMENT");
                            startIntent.putStringArrayListExtra("extra_accounts", new ArrayList<>(a4));
                            context2.startService(startIntent);
                        }
                    }
                } catch (bepp e3) {
                    a.g("Encountered an issue with the database", e3, new Object[0]);
                    a(bcva.KEY_TYPE_KEYSTORE, e3);
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

    FidoEnrollmentIntentOperation(Context context, beoy beoyVar, bddd bdddVar, bddm bddmVar, bepc bepcVar) {
        this.b = context;
        this.c = beoyVar;
        this.d = bdddVar;
        this.e = bddmVar;
        this.f = bepcVar;
    }
}
