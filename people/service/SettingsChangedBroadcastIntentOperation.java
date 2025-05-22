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
import defpackage.afp;
import defpackage.aszs;
import defpackage.bsup;
import defpackage.casd;
import defpackage.cvts;
import defpackage.cvyt;
import defpackage.cwgc;
import defpackage.cwgj;
import defpackage.cwof;
import defpackage.cwqn;
import defpackage.cxgn;
import defpackage.cxhd;
import defpackage.cxhy;
import defpackage.cxog;
import defpackage.cxol;
import defpackage.cyjh;
import defpackage.dxwx;
import defpackage.dxxi;
import defpackage.enko;
import defpackage.fgrc;
import defpackage.fttd;
import defpackage.fttk;
import defpackage.ftua;
import defpackage.ftuh;
import defpackage.ftwx;
import defpackage.ftzi;
import defpackage.fubq;
import defpackage.fubw;
import j$.util.Objects;
import java.util.concurrent.ExecutionException;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes6.dex */
public class SettingsChangedBroadcastIntentOperation extends IntentOperation {
    bsup a;

    private final boolean a() {
        return Settings.Global.getInt(getApplicationContext().getContentResolver(), "device_provisioned", 0) == 1;
    }

    private static final void b(Context context) {
        afp afpVar;
        try {
            afpVar = (afp) cwgc.a(context).get();
        } catch (InterruptedException | ExecutionException e) {
            cwof.d("CpgSchemaBuilder", "Failed to get AppSearchSession", e);
            afpVar = null;
        }
        cwgj.b(context, afpVar);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (Objects.equals(intent.getAction(), "com.google.android.gms.ENTIRE_PACKAGE_CHANGED")) {
            intent.setAction("android.intent.action.PACKAGE_CHANGED");
        }
        if (fttd.n() && Objects.equals(intent.getAction(), "android.intent.action.PACKAGE_ADDED") && intent.getData() != null && Objects.equals(intent.getData().getEncodedSchemeSpecificPart(), "com.google.android.contacts")) {
            b(this);
            return;
        }
        if (("android.intent.action.PACKAGE_ADDED".equals(intent.getAction()) || "android.intent.action.PACKAGE_CHANGED".equals(intent.getAction()) || "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) && intent.getData() != null && "com.google.android.syncadapters.contacts".equals(intent.getData().getEncodedSchemeSpecificPart())) {
            PackageManager packageManager = getPackageManager();
            SharedPreferences sharedPreferences = cvyt.i(this).a;
            int i = sharedPreferences.getInt("is_fsa1_package_existing", 0);
            boolean b = cxol.b(packageManager);
            Boolean.valueOf(b).getClass();
            int i2 = true != b ? 1 : 2;
            if (i2 != i) {
                cwof.f("SettingsChangedOp", "FSA1 package status changed.");
                sharedPreferences.edit().putInt("is_fsa1_package_existing", i2).apply();
                cvts a = cvts.a();
                fgrc v = enko.a.v();
                int i3 = i2 == 2 ? 5 : 4;
                if (!v.b.L()) {
                    v.U();
                }
                enko enkoVar = (enko) v.b;
                enkoVar.c = i3 - 1;
                enkoVar.b |= 1;
                a.g((enko) v.Q());
                if (ftua.g()) {
                    cxgn.a(this);
                }
                if (ftzi.g()) {
                    cwqn.a(this);
                    return;
                }
                return;
            }
            return;
        }
        if ("com.google.android.gms.phenotype.COMMITTED".equals(intent.getAction()) && "com.google.android.gms.people".equals(intent.getStringExtra("com.google.android.gms.phenotype.PACKAGE_NAME"))) {
            if (fubq.a.lK().a()) {
                ContentResolver contentResolver = getBaseContext().getContentResolver();
                aszs aszsVar = cyjh.a;
                dxwx a2 = dxwx.a(contentResolver, dxxi.a("com.google.android.gms.people"), new Runnable() { // from class: cwqf
                    @Override // java.lang.Runnable
                    public final void run() {
                        dxyi.e();
                    }
                });
                if (a2 != null) {
                    a2.e();
                } else {
                    cwof.c("SettingsChangedOp", "Get null phenotype loader");
                }
            }
            if (ftua.g()) {
                cxgn.a(getApplicationContext());
            }
            if (fubw.k()) {
                DeletedNullContactsCleanupChimeraService.f(this);
            }
            if (fttd.i()) {
                ActionPreferenceCleanupTask.d(casd.a(this));
            }
            if (fttd.k()) {
                CallingCardCleanupTask.d(casd.a(this));
            }
            if (ftuh.j()) {
                BackupAndSyncOptInValidationChimeraService.e(this);
            }
            if (ftzi.g()) {
                cwqn.a(this);
            }
            if (fttd.n() && fttd.a.lK().H()) {
                b(this);
            }
            if (fttk.a.lK().s() && !fttk.j()) {
                cxhd.a(this).g();
            }
            if (ftwx.g() && !a()) {
                cxhy a3 = cxhy.a(getApplicationContext());
                cwof.f("SettingsChangedOp", "Add the account adding listener for Preliminary sync.");
                try {
                    if (this.a == null) {
                        this.a = bsup.b(getApplicationContext());
                    }
                    this.a.t(a3, new String[]{"com.google"});
                } catch (IllegalStateException unused) {
                    cwof.l("SettingsChangedOp", "Failed to add the account listener for Preliminary sync.");
                }
            }
            if (!ftwx.h() || a()) {
                return;
            }
            cxog.b(getApplicationContext(), new Runnable() { // from class: cwqg
                @Override // java.lang.Runnable
                public final void run() {
                    cwof.f("SettingsChangedOp", "Set Provisioned timestamp");
                    cxhr.a(SettingsChangedBroadcastIntentOperation.this.getApplicationContext()).b(System.currentTimeMillis());
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
