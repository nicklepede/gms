package com.google.android.gms.people.service;

import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.provider.Settings;
import com.google.android.chimera.IntentOperation;
import com.google.android.gms.people.service.SettingsChangedBroadcastIntentOperation;
import com.google.android.gms.people.service.cpg.ActionPreferenceCleanupTask;
import com.google.android.gms.people.service.cpg.callingcard.CallingCardCleanupTask;
import defpackage.afk;
import defpackage.aqxd;
import defpackage.bqna;
import defpackage.byjl;
import defpackage.ctkm;
import defpackage.ctpn;
import defpackage.ctww;
import defpackage.ctxd;
import defpackage.cuey;
import defpackage.cuhg;
import defpackage.cuxf;
import defpackage.cuxv;
import defpackage.cuyq;
import defpackage.cvex;
import defpackage.cvfc;
import defpackage.cvzk;
import defpackage.dvlw;
import defpackage.dvmh;
import defpackage.ekxc;
import defpackage.fecj;
import defpackage.fqzi;
import defpackage.fqzp;
import defpackage.fraf;
import defpackage.fram;
import defpackage.frdc;
import defpackage.frfn;
import defpackage.frhv;
import defpackage.frib;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes6.dex */
public class SettingsChangedBroadcastIntentOperation extends IntentOperation {
    bqna a;

    private final boolean a() {
        return Settings.Global.getInt(getApplicationContext().getContentResolver(), "device_provisioned", 0) == 1;
    }

    private static final void b(Context context) {
        afk afkVar;
        try {
            afkVar = (afk) ctww.a(context).get();
        } catch (InterruptedException | ExecutionException e) {
            cuey.d("CpgSchemaBuilder", "Failed to get AppSearchSession", e);
            afkVar = null;
        }
        ctxd.b(context, afkVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        if (fqzi.n() && Objects.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED") && intent.getData() != null && Objects.equals(intent.getData().getEncodedSchemeSpecificPart(), "com.google.android.contacts")) {
            b(this);
            return;
        }
        if (("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_CHANGED".equals(intent.getAction()) || "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) && intent.getData() != null && "com.google.android.syncadapters.contacts".equals(intent.getData().getEncodedSchemeSpecificPart())) {
            PackageManager packageManager = getPackageManager();
            SharedPreferences sharedPreferences = ctpn.i(this).a;
            int i = sharedPreferences.getInt("is_fsa1_package_existing", 0);
            boolean b = cvfc.b(packageManager);
            Boolean.valueOf(b).getClass();
            int i2 = true != b ? 1 : 2;
            if (i2 != i) {
                cuey.f("SettingsChangedOp", "FSA1 package status changed.");
                sharedPreferences.edit().putInt("is_fsa1_package_existing", i2).apply();
                ctkm a = ctkm.a();
                fecj v = ekxc.a.v();
                int i3 = i2 == 2 ? 5 : 4;
                if (!v.b.L()) {
                    v.U();
                }
                ekxc ekxcVar = (ekxc) v.b;
                ekxcVar.c = i3 - 1;
                ekxcVar.b |= 1;
                a.g((ekxc) v.Q());
                if (fraf.g()) {
                    cuxf.a(this);
                }
                if (frfn.g()) {
                    cuhg.a(this);
                    return;
                }
                return;
            }
            return;
        }
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.people".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (frhv.a.a().a()) {
                ContentResolver contentResolver = getBaseContext().getContentResolver();
                aqxd aqxdVar = cvzk.a;
                dvlw a2 = dvlw.a(contentResolver, dvmh.a("com.google.android.gms.people"), new Runnable() { // from class: cugy
                    @Override // java.lang.Runnable
                    public final void run() {
                        dvni.e();
                    }
                });
                if (a2 != null) {
                    a2.e();
                } else {
                    cuey.c("SettingsChangedOp", "Get null phenotype loader");
                }
            }
            if (fraf.g()) {
                cuxf.a(getApplicationContext());
            }
            if (frib.k()) {
                DeletedNullContactsCleanupChimeraService.f(this);
            }
            if (fqzi.i()) {
                ActionPreferenceCleanupTask.d(byjl.a(this));
            }
            if (fqzi.k()) {
                CallingCardCleanupTask.d(byjl.a(this));
            }
            if (fram.j()) {
                BackupAndSyncOptInValidationChimeraService.e(this);
            }
            if (frfn.g()) {
                cuhg.a(this);
            }
            if (fqzi.n() && fqzi.a.a().H()) {
                b(this);
            }
            if (fqzp.a.a().t() && !fqzp.j()) {
                cuxv.a(this).g();
            }
            if (frdc.g() && !a()) {
                cuyq a3 = cuyq.a(getApplicationContext());
                cuey.f("SettingsChangedOp", "Add the account adding listener for Preliminary sync.");
                try {
                    if (this.a == null) {
                        this.a = bqna.b(getApplicationContext());
                    }
                    this.a.t(a3, new String[]{"com.google"});
                } catch (IllegalStateException unused) {
                    cuey.l("SettingsChangedOp", "Failed to add the account listener for Preliminary sync.");
                }
            }
            if (!frdc.h() || a()) {
                return;
            }
            cvex.b(getApplicationContext(), new Runnable() { // from class: cugz
                @Override // java.lang.Runnable
                public final void run() {
                    cuey.f("SettingsChangedOp", "Set Provisioned timestamp");
                    cuyj.a(SettingsChangedBroadcastIntentOperation.this.getApplicationContext()).b(System.currentTimeMillis());
                }
            });
        }
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onCreate() {
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onDestroy() {
    }
}
