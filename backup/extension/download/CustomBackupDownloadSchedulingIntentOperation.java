package com.google.android.gms.backup.extension.download;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.a;
import defpackage.ahwd;
import defpackage.aixm;
import defpackage.anya;
import defpackage.asqg;
import defpackage.asri;
import defpackage.eike;
import defpackage.fllt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadSchedulingIntentOperation extends anya {
    private static final ahwd a = new ahwd("CustomDownloadSchedulingIO");
    private static final String b = asqg.f("com.google.android.gms.backup");

    private final boolean e() {
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 26) {
            return fllt.n();
        }
        int b2 = asri.b();
        try {
            packageInfo = getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 2097152);
            ahwd ahwdVar = a;
            ahwdVar.j("bundled version: " + packageInfo.versionCode, new Object[0]);
            ahwdVar.j(a.j(b2, "prev version: "), new Object[0]);
        } catch (PackageManager.NameNotFoundException e) {
            a.g("Package manager could not find GMSCore package", e, new Object[0]);
        }
        return b2 == packageInfo.versionCode;
    }

    @Override // defpackage.anya
    protected final void a(Intent intent, boolean z) {
        if (z || !fllt.o()) {
            return;
        }
        a.d("#onModuleUpdated. Scheduling CustomBackupDownloadStarterTask to run", new Object[0]);
        CustomBackupDownloadStarterTask.d(this);
    }

    @Override // defpackage.anya
    protected final void c(Intent intent, boolean z) {
        if (!e() && !fllt.o()) {
            a.d("#onContainerUpdated. CustomBackupDownloadStarterTask not scheduled since this was not the first GmsCore update after SuW", new Object[0]);
        } else {
            a.d("#onContainerUpdated. Scheduling CustomBackupDownloadStarterTask to run", new Object[0]);
            CustomBackupDownloadStarterTask.d(this);
        }
    }

    @Override // defpackage.anya, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        eike.e(action);
        String valueOf = String.valueOf(action);
        ahwd ahwdVar = a;
        ahwdVar.j("Received Action: ".concat(valueOf), new Object[0]);
        if (!fllt.m()) {
            if (!fllt.a.a().aj() || !b.equals(intent.getAction()) || (!e() && !fllt.o())) {
                super.onHandleIntent(intent);
                return;
            } else {
                ahwdVar.d("#FlagsCommitted. Scheduling CustomBackupDownloadStarterTask to run", new Object[0]);
                CustomBackupDownloadStarterTask.d(this);
                return;
            }
        }
        ahwdVar.j("customBackupDownloadEnableSuwTriggerWithGmsUpdateCheck flag on", new Object[0]);
        aixm aixmVar = new aixm(this);
        if (!aixm.k()) {
            ahwdVar.j("Flag to run custom backup downloads is off.", new Object[0]);
            return;
        }
        if (aixmVar.i()) {
            if (!aixmVar.f()) {
                ahwdVar.j("No backups available to download.", new Object[0]);
                return;
            }
            ahwdVar.j("Restore token is available", new Object[0]);
            if (e() || fllt.o()) {
                CustomBackupDownloadStarterTask.d(this);
            }
        }
    }
}
