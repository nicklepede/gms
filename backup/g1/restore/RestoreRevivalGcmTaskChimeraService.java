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
import defpackage.ahhp;
import defpackage.ahwd;
import defpackage.ajgv;
import defpackage.aqsz;
import defpackage.arni;
import defpackage.asiu;
import defpackage.byln;
import defpackage.dvwv;
import defpackage.flmm;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class RestoreRevivalGcmTaskChimeraService extends GmsTaskChimeraService {
    private static final long a = TimeUnit.SECONDS.toMillis(5);
    private static final ahwd b = new ahwd("RestoreRevivalGcmTaskChimeraService");

    private final boolean d() {
        dvwv dvwvVar;
        ajgv ajgvVar = ajgv.a;
        boolean z = false;
        if (ajgv.n(this)) {
            b.j("Photos restore is complete", new Object[0]);
            return false;
        }
        int i = Settings.Secure.getInt(getContentResolver(), "photos_restore_started", 0);
        ajgv.i("photos_restore_started", i, ajgv.b);
        if (i != 1) {
            b.j("Photos restore is not started", new Object[0]);
            return false;
        }
        Account a2 = new ahhp(this).a();
        if (a2 == null || a2.name == null) {
            b.j("No backup account", new Object[0]);
            return false;
        }
        Intent intent = new Intent("com.google.android.apps.photos.restore.apiservice.PHOTOS_RESTORE_SERVICE").setPackage("com.google.android.apps.photos");
        aqsz aqszVar = new aqsz();
        if (asiu.a().d(this, intent, aqszVar, 1)) {
            try {
                try {
                    IBinder b2 = aqszVar.b(a, TimeUnit.MILLISECONDS);
                    IInterface queryLocalInterface = b2.queryLocalInterface("com.google.android.libraries.photos.restore.api.IPhotosRestore");
                    dvwvVar = queryLocalInterface instanceof dvwv ? (dvwv) queryLocalInterface : new dvwv(b2);
                } catch (IllegalArgumentException | IllegalStateException e) {
                    b.l(e);
                    return false;
                }
            } catch (InterruptedException | TimeoutException unused) {
                asiu.a().b(this, aqszVar);
                return false;
            }
        } else {
            dvwvVar = null;
        }
        try {
            dvwvVar.b(a2.name, PendingIntent.getService(this, 0, IntentOperation.getStartIntent(this, PhotosRestoreResultIntentOperation.class, "com.google.android.gms.backup.g1.PHOTOS_RESTORE_RESULT"), 134217728));
            z = true;
        } catch (RemoteException unused2) {
        } catch (Throwable th) {
            try {
                asiu.a().b(this, aqszVar);
            } catch (IllegalArgumentException | IllegalStateException e2) {
                b.l(e2);
            }
            throw th;
        }
        try {
            asiu.a().b(this, aqszVar);
        } catch (IllegalArgumentException | IllegalStateException e3) {
            b.l(e3);
        }
        return z;
    }

    @Override // com.google.android.gms.libs.scheduler.GmsTaskChimeraService, com.google.android.gms.libs.scheduler.GmsTaskServiceInterface
    public final int a(byln bylnVar) {
        boolean z;
        arni arniVar = new arni(this, "com.google.android.gms.backup.g1.restore.REVIVE_SERVICE", true);
        int i = arniVar.getInt("numberOfRuns", 0);
        if (i > flmm.a.a().e()) {
            SharedPreferences.Editor edit = arniVar.edit();
            edit.putInt("numberOfRuns", 0);
            edit.commit();
            Intent startIntent = IntentOperation.getStartIntent(this, "com.google.android.gms.backup.g1.restore.mms.BugleRestoreCompleteIntentOperation", "com.google.android.gms.backup.g1.BUGLE_RESTORE_ABORT");
            if (startIntent != null) {
                startService(startIntent);
            }
            b.f("Requested restores are still complete, but we've hit our max run limit", new Object[0]);
            return 2;
        }
        SharedPreferences.Editor edit2 = arniVar.edit();
        edit2.putInt("numberOfRuns", i + 1);
        edit2.commit();
        ajgv ajgvVar = ajgv.a;
        if (ajgv.l(this)) {
            b.j("MMS restore is complete", new Object[0]);
        } else {
            if (ajgv.m(this)) {
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
