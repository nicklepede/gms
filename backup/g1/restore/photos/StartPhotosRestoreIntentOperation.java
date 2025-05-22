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
import defpackage.ajif;
import defpackage.ajwt;
import defpackage.alhn;
import defpackage.asvp;
import defpackage.aumo;
import defpackage.caqj;
import defpackage.casd;
import defpackage.catb;
import defpackage.dyiw;
import defpackage.fodw;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class StartPhotosRestoreIntentOperation extends IntentOperation {
    private static final ajwt a = new ajwt("StartPhotosRestoreIntentOperation");
    private static final long b = TimeUnit.SECONDS.toMillis(5);

    private final void a() {
        RestoreCapability a2;
        Intent intent = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
        asvp asvpVar = new asvp();
        dyiw dyiwVar = null;
        if (aumo.a().d(this, intent, asvpVar, 1)) {
            try {
                IBinder b2 = asvpVar.b(b, TimeUnit.MILLISECONDS);
                IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                dyiwVar = queryLocalInterface instanceof dyiw ? (dyiw) queryLocalInterface : new dyiw(b2);
            } catch (InterruptedException | TimeoutException e) {
                a.l(e);
            }
        }
        try {
            if (dyiwVar != null) {
                try {
                    a2 = dyiwVar.a();
                } catch (RemoteException e2) {
                    a.n("getRestoreCapability failed", e2, new Object[0]);
                }
                if (a2 != null) {
                    if (a2.a) {
                        Intent startIntent = IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT");
                        alhn alhnVar = alhn.a;
                        Account a3 = new ajif(this).a();
                        if (a3 != null && a3.name != null) {
                            try {
                            } catch (RemoteException e3) {
                                a.n("requestRestore failed", e3, new Object[0]);
                            }
                            if (dyiwVar.b(a3.name, PendingIntent.getService(this, 0, startIntent, 134217728))) {
                                alhnVar.g(this, true);
                                catb catbVar = new catb();
                                catbVar.j = "com.google.android.gms.backup.g1.restore.RestoreRevivalGcmTaskService";
                                catbVar.e(fodw.f(), fodw.e());
                                catbVar.t("com.google.android.gms.backup.g1.restore.REVIVE_SERVICE");
                                catbVar.p = true;
                                casd.a(this).f(catbVar.b());
                                aumo.a().b(this, asvpVar);
                                return;
                            }
                        }
                    }
                }
            }
            aumo.a().b(this, asvpVar);
            return;
        } catch (IllegalArgumentException | IllegalStateException e4) {
            a.l(e4);
            return;
        }
        new caqj(Looper.getMainLooper()).post(new Runnable() { // from class: alel
            @Override // java.lang.Runnable
            public final void run() {
                StartPhotosRestoreIntentOperation startPhotosRestoreIntentOperation = StartPhotosRestoreIntentOperation.this;
                Toast.makeText(startPhotosRestoreIntentOperation, startPhotosRestoreIntentOperation.getString(R.string.g1_restore_failed), 1).show();
            }
        });
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        alhn alhnVar = alhn.a;
        if (fodw.r() && !alhn.n(this) && alhn.k(this) == 1) {
            a();
        }
    }
}
