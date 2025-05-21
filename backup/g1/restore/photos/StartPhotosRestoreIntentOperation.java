package com.google.android.gms.backup.g1.restore.photos;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.widget.Toast;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.R;
import com.google.android.gms.backup.g1.restore.photos.StartPhotosRestoreIntentOperation;
import com.google.android.libraries.photos.restore.api.RestoreCapability;
import defpackage.ahhp;
import defpackage.ahwd;
import defpackage.ajgv;
import defpackage.aqsz;
import defpackage.asiu;
import defpackage.byhr;
import defpackage.byjl;
import defpackage.bykj;
import defpackage.dvwv;
import defpackage.flmm;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class StartPhotosRestoreIntentOperation extends IntentOperation {
    private static final ahwd a = new ahwd("StartPhotosRestoreIntentOperation");
    private static final long b = TimeUnit.SECONDS.toMillis(5);

    private final void a() {
        RestoreCapability a2;
        Intent intent = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
        aqsz aqszVar = new aqsz();
        dvwv dvwvVar = null;
        if (asiu.a().d(this, intent, aqszVar, 1)) {
            try {
                IBinder b2 = aqszVar.b(b, TimeUnit.MILLISECONDS);
                IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                dvwvVar = queryLocalInterface instanceof dvwv ? (dvwv) queryLocalInterface : new dvwv(b2);
            } catch (InterruptedException | TimeoutException e) {
                a.l(e);
            }
        }
        try {
            if (dvwvVar != null) {
                try {
                    a2 = dvwvVar.a();
                } catch (RemoteException e2) {
                    a.n("getRestoreCapability failed", e2, new Object[0]);
                }
                if (a2 != null) {
                    if (a2.a) {
                        Intent startIntent = IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT");
                        ajgv ajgvVar = ajgv.a;
                        Account a3 = new ahhp(this).a();
                        if (a3 != null && a3.name != null) {
                            try {
                            } catch (RemoteException e3) {
                                a.n("requestRestore failed", e3, new Object[0]);
                            }
                            if (dvwvVar.b(a3.name, PendingIntent.getService(this, 0, startIntent, 134217728))) {
                                ajgvVar.g(this, true);
                                bykj bykjVar = new bykj();
                                bykjVar.j = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
                                bykjVar.e(flmm.f(), flmm.e());
                                bykjVar.t("com.google.android.gms.backup.g1.restore.REVIVE_SERVICE");
                                bykjVar.p = true;
                                byjl.a(this).f(bykjVar.b());
                                asiu.a().b(this, aqszVar);
                                return;
                            }
                        }
                    }
                }
            }
            asiu.a().b(this, aqszVar);
            return;
        } catch (IllegalArgumentException | IllegalStateException e4) {
            a.l(e4);
            return;
        }
        new byhr(Looper.getMainLooper()).post(new Runnable() { // from class: ajdt
            @Override // java.lang.Runnable
            public final void run() {
                StartPhotosRestoreIntentOperation startPhotosRestoreIntentOperation = StartPhotosRestoreIntentOperation.this;
                Toast.makeText(startPhotosRestoreIntentOperation, startPhotosRestoreIntentOperation.getString(R.string.g1_restore_failed), 1).show();
            }
        });
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        ajgv ajgvVar = ajgv.a;
        if (flmm.r() && !ajgv.n(this) && ajgv.k(this) == 1) {
            a();
        }
    }
}
