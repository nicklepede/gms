package com.google.android.gms.backup.g1.restore;

import android.accounts.Account;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.backup.g1.restore.photos.PhotosRestoreResultIntentOperation;
import com.google.android.gms.libs.scheduler.GmsTaskChimeraService;
import defpackage.ajif;
import defpackage.ajwt;
import defpackage.alhn;
import defpackage.asvp;
import defpackage.atpx;
import defpackage.aumo;
import defpackage.cauf;
import defpackage.dyiw;
import defpackage.fodw;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class RestoreRevivalGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    private static final ajwt b = new ajwt("RestoreRevivalGcmTaskChimeraService");

    private final boolean d() {
        dyiw dyiwVar;
        alhn alhnVar = alhn.a;
        boolean z = false;
        if (alhn.n(this)) {
            b.j("Photos restore is complete", new Object[0]);
            return false;
        }
        int i = Settings.Secure.getInt(getContentResolver(), "photos_restore_started", 0);
        alhn.i("photos_restore_started", i, alhn.b);
        if (i != 1) {
            b.j("Photos restore is not started", new Object[0]);
            return false;
        }
        Account a2 = new ajif(this).a();
        if (a2 == null || a2.name == null) {
            b.j("No backup account", new Object[0]);
            return false;
        }
        Intent intent = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
        asvp asvpVar = new asvp();
        if (aumo.a().d(this, intent, asvpVar, 1)) {
            try {
                try {
                    IBinder b2 = asvpVar.b(a, TimeUnit.MILLISECONDS);
                    IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                    dyiwVar = queryLocalInterface instanceof dyiw ? (dyiw) queryLocalInterface : new dyiw(b2);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    b.l(e);
                    return false;
                }
            } catch (InterruptedException | TimeoutException unused) {
                aumo.a().b(this, asvpVar);
                return false;
            }
        } else {
            dyiwVar = null;
        }
        try {
            dyiwVar.b(a2.name, PendingIntent.getService(this, 0, IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT"), 134217728));
            z = true;
        } catch (RemoteException unused2) {
        } catch (Throwable th) {
            try {
                aumo.a().b(this, asvpVar);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                b.l(e2);
            }
            throw th;
        }
        try {
            aumo.a().b(this, asvpVar);
        } catch (IllegalArgumentException | IllegalStateException e3) {
            b.l(e3);
        }
        return z;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(cauf caufVar) {
        boolean z;
        atpx atpxVar = new atpx(this, "com.google.android.gms.backup.g1.restore.REVIVE_SERVICE", true);
        int i = atpxVar.getInt("numberOfRuns", 0);
        if (i > fodw.a.lK().e()) {
            SharedPreferences.Editor edit = atpxVar.edit();
            edit.putInt("numberOfRuns", 0);
            edit.commit();
            Intent startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.backup.g1.restore.mms.BugleRestoreCompleteIntentOperation", "com.google.android.gms.backup.g1.BUGLE_RESTORE_ABORT");
            if (startIntent != null) {
                startService(startIntent);
            }
            b.f("Requested restores are still complete, but we've hit our max run limit", new Object[0]);
            return 2;
        }
        SharedPreferences.Editor edit2 = atpxVar.edit();
        edit2.putInt("numberOfRuns", i + 1);
        edit2.commit();
        alhn alhnVar = alhn.a;
        if (alhn.l(this)) {
            b.j("MMS restore is complete", new Object[0]);
        } else {
            if (alhn.m(this)) {
                Intent intent = new Intent();
                intent.setClassName(this, "com.google.android.gms.backup.mms.MmsRestoreService");
                startService(intent);
                z = true;
                boolean d = d();
                if (!z || d) {
                    b.j("Requested restores were restarted / still running, checking again soon", new Object[0]);
                    return 1;
                }
                b.j("Requested restores are complete", new Object[0]);
                return 0;
            }
            b.j("MMS restore was not started", new Object[0]);
        }
        z = false;
        boolean d2 = d();
        if (z) {
        }
        b.j("Requested restores were restarted / still running, checking again soon", new Object[0]);
        return 1;
    }
}
