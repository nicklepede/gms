package com.google.android.gms.backup.extension.download;

import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import com.google.android.chimera.IntentOperation;
import defpackage.a;
import defpackage.ahwd;
import defpackage.aixm;
import defpackage.asri;
import defpackage.fllt;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class SetupWizardFinishedIntentOperation extends IntentOperation {
    private final ahwd a = new ahwd("SuWFinishedIO");

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        boolean z;
        aixm aixmVar = new aixm(this);
        if (!fllt.m()) {
            this.a.j("Custom backup download SUW trigger flag off. Returning without any action.", new Object[0]);
            return;
        }
        if (!aixm.k()) {
            this.a.j("Required conditions not met. Returning without any action.", new Object[0]);
            return;
        }
        if (Build.VERSION.SDK_INT < 26) {
            z = fllt.n();
        } else {
            int c = asri.c();
            try {
                PackageInfo packageInfo = getApplicationContext().getPackageManager().getPackageInfo("com.google.android.gms", 2097152);
                ahwd ahwdVar = this.a;
                ahwdVar.j("bundled version: " + packageInfo.versionCode, new Object[0]);
                ahwdVar.j(a.j(c, "current version: "), new Object[0]);
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
        ahwd ahwdVar2 = this.a;
        ahwdVar2.j("Received SuW finished broadcast", new Object[0]);
        if (aixmVar.i()) {
            CustomBackupDownloadStarterTask.d(this);
        } else {
            ahwdVar2.j("Restore token not available... returning", new Object[0]);
        }
    }
}
