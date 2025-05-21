package com.google.android.gms.backup.transport.component;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;
import defpackage.ahpw;
import defpackage.ahwd;
import defpackage.anya;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public class ModuleEnabler extends anya {
    private static final ahwd a = new ahwd("ModuleEnabler");

    @Override // defpackage.anya
    protected final void b(Intent intent, int i) {
        if (ahpw.a.k(this)) {
            return;
        }
        ahwd ahwdVar = a;
        ahwdVar.j("Trying to enable SmartDevice", new Object[0]);
        try {
            getPackageManager().getActivityInfo(new ComponentName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity"), 0);
            ahwdVar.j("SmartDevice activity found", new Object[0]);
        } catch (PackageManager.NameNotFoundException e) {
            ahwd ahwdVar2 = a;
            ahwdVar2.k("Activity not found", e, new Object[0]);
            ahwdVar2.m("SmartDevice activity %s not found, trying to enable SmartDevice", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity");
            ahwdVar2.j("Starting module: %s", "com.google.android.gms.smartdevice");
            Intent putExtra = new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").putExtra("moduleid", "com.google.android.gms.smartdevice").putExtra("intent", new Intent(IntentOperation.ACTION_NEW_MODULE).putExtra(IntentOperation.EXTRA_CONTAINER_UPDATED, false));
            putExtra.setPackage("com.google.android.gms");
            if (startService(putExtra) == null) {
                ahwdVar2.f("Failed to start module com.google.android.gms.smartdevice", new Object[0]);
            }
        }
    }
}
