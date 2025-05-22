package com.google.android.gms.backup.extension.download;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import defpackage.a;
import defpackage.ajwt;
import defpackage.akyc;
import defpackage.apzs;
import defpackage.auua;
import defpackage.auvc;
import defpackage.ekxj;
import defpackage.fodd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class CustomBackupDownloadSchedulingIntentOperation extends apzs {
    private static final ajwt a = new ajwt("CustomDownloadSchedulingIO");
    private static final String b = auua.f("com.google.android.gms.backup");

    private final boolean e() {
        PackageInfo packageInfo;
        if (Build.VERSION.SDK_INT < 26) {
            return fodd.n();
        }
        int b2 = auvc.b();
        try {
            packageInfo = getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 2097152);
            ajwt ajwtVar = a;
            ajwtVar.j("bundled version: " + packageInfo.versionCode, new Object[0]);
            ajwtVar.j(a.j(b2, "prev version: "), new Object[0]);
        } catch (PackageManager.NameNotFoundException e) {
            a.g("Package manager could not find GMSCore package", e, new Object[0]);
        }
        return b2 == packageInfo.versionCode;
    }

    @Override // defpackage.apzs
    protected final void a(Intent intent, boolean z) {
        if (z || !fodd.o()) {
            return;
        }
        a.d("#onModuleUpdated. Scheduling CustomBackupDownloadStarterTask to run", new Object[0]);
        CustomBackupDownloadStarterTask.d(this);
    }

    @Override // defpackage.apzs
    protected final void c(Intent intent, boolean z) {
        if (!e() && !fodd.o()) {
            a.d("#onContainerUpdated. CustomBackupDownloadStarterTask not scheduled since this was not the first GmsCore update after SuW", new Object[0]);
        } else {
            a.d("#onContainerUpdated. Scheduling CustomBackupDownloadStarterTask to run", new Object[0]);
            CustomBackupDownloadStarterTask.d(this);
        }
    }

    @Override // defpackage.apzs, com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        String action = intent.getAction();
        ekxj.e(action);
        String valueOf = String.valueOf(action);
        ajwt ajwtVar = a;
        ajwtVar.j("Received Action: ".concat(valueOf), new Object[0]);
        if (!fodd.m()) {
            if (!fodd.a.lK().aj() || !b.equals(intent.getAction()) || (!e() && !fodd.o())) {
                super.onHandleIntent(intent);
                return;
            } else {
                ajwtVar.d("#FlagsCommitted. Scheduling CustomBackupDownloadStarterTask to run", new Object[0]);
                CustomBackupDownloadStarterTask.d(this);
                return;
            }
        }
        ajwtVar.j("customBackupDownloadEnableSuwTriggerWithGmsUpdateCheck flag on", new Object[0]);
        akyc akycVar = new akyc(this);
        if (!akyc.k()) {
            ajwtVar.j("Flag to run custom backup downloads is off.", new Object[0]);
            return;
        }
        if (akycVar.i()) {
            if (!akycVar.f()) {
                ajwtVar.j("No backups available to download.", new Object[0]);
                return;
            }
            ajwtVar.j("Restore token is available", new Object[0]);
            if (e() || fodd.o()) {
                CustomBackupDownloadStarterTask.d(this);
            }
        }
    }
}
