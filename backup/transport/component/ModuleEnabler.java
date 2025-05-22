package com.google.android.gms.backup.transport.component;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import com.google.android.chimera.IntentOperation;
import defpackage.ajqm;
import defpackage.ajwt;
import defpackage.apzs;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class ModuleEnabler extends apzs {
    private static final ajwt a = new ajwt("ModuleEnabler");

    @Override // defpackage.apzs
    protected final void b(Intent intent, int i) {
        if (ajqm.a.k(this)) {
            return;
        }
        ajwt ajwtVar = a;
        ajwtVar.j("Trying to enable SmartDevice", new Object[0]);
        try {
            getPackageManager().getActivityInfo(new ComponentName("com.google.android.gms", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity"), 0);
            ajwtVar.j("SmartDevice activity found", new Object[0]);
        } catch (PackageManager.NameNotFoundException e) {
            ajwt ajwtVar2 = a;
            ajwtVar2.k("Activity not found", e, new Object[0]);
            ajwtVar2.m("SmartDevice activity %s not found, trying to enable SmartDevice", "com.google.android.gms.smartdevice.d2d.ui.TargetDirectTransferActivity");
            ajwtVar2.j("Starting module: %s", "com.google.android.gms.smartdevice");
            Intent putExtra = new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").putExtra("moduleid", "com.google.android.gms.smartdevice").putExtra("intent", new Intent(IntentOperation.ACTION_NEW_MODULE).putExtra(IntentOperation.EXTRA_CONTAINER_UPDATED, false));
            putExtra.setPackage("com.google.android.gms");
            if (startService(putExtra) == null) {
                ajwtVar2.f("Failed to start module com.google.android.gms.smartdevice", new Object[0]);
            }
        }
    }
}
