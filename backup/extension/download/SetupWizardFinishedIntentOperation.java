package com.google.android.gms.backup.extension.download;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.ajwt;
import defpackage.akyc;
import defpackage.auvc;
import defpackage.fodd;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private final ajwt a = new ajwt("SuWFinishedIO");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        akyc akycVar = new akyc(this);
        if (!fodd.m()) {
            this.a.j("Custom backup download SUW trigger flag off. Returning without any action.", new Object[0]);
            return;
        }
        if (!akyc.k()) {
            this.a.j("Required conditions not met. Returning without any action.", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            z = fodd.n();
        } else {
            int c = auvc.c();
            try {
                PackageInfo packageInfo = getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 2097152);
                ajwt ajwtVar = this.a;
                ajwtVar.j("bundled version: " + packageInfo.versionCode, new Object[0]);
                ajwtVar.j(a.j(c, "current version: "), new Object[0]);
                if (c > packageInfo.versionCode) {
                    z = true;
                }
            } catch (PackageManager.NameNotFoundException e) {
                this.a.g("Package manager could not find GMSCore package", e, new Object[0]);
            }
            z = false;
        }
        if (!z) {
            this.a.j("GMSCore has not updated. Returning without any action.", new Object[0]);
            return;
        }
        ajwt ajwtVar2 = this.a;
        ajwtVar2.j("Received SuW finished broadcast", new Object[0]);
        if (akycVar.i()) {
            CustomBackupDownloadStarterTask.d(this);
        } else {
            ajwtVar2.j("Restore token not available... returning", new Object[0]);
        }
    }
}
