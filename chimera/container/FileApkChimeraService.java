package com.google.android.gms.chimera.container;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.ResultReceiver;
import android.util.Log;
import com.google.android.chimera.Service;
import defpackage.aqbv;
import defpackage.fpjb;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public class FileApkChimeraService extends Service {
    public static void a(boolean z, Context context, String str, ResultReceiver resultReceiver) {
        if (!fpjb.j() || z) {
            c(context, str, resultReceiver, new Intent().putExtra("STAGE_FILE_APKS_ASSET_NAME", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver));
        } else {
            aqbv.a(context, new Intent("com.google.android.gms.chimera.container.STAGE_MODULE_APKS").putExtra("STAGE_FILE_APKS_ASSET_NAME", str).putExtra("STAGE_FILE_APKS_RESULT_RECEIVER", resultReceiver), -1);
        }
    }

    public static void b(Context context) {
        c(context, null, null, new Intent());
    }

    public static void c(Context context, String str, ResultReceiver resultReceiver, Intent intent) {
        ComponentName componentName;
        Intent intent2 = intent.setAction("com.google.android.gms.chimera.container.STAGE_MODULE_APKS").setPackage("com.google.android.gms");
        intent2.setClassName(context, "com.google.android.gms.chimera.container.FileApkService");
        try {
            componentName = context.startService(intent2);
        } catch (IllegalArgumentException | SecurityException e) {
            Log.e("FileApkSvc", e.toString());
            componentName = null;
        }
        if (componentName != null || str == null || resultReceiver == null) {
            return;
        }
        resultReceiver.send(-1, null);
    }

    public static void d(Context context, boolean z) {
        c(context, null, null, new Intent().putExtra("DEXOPT_ALL_MODULES", z).putExtra("ON_BOOT_OR_UPGRADE", true));
    }

    @Override // com.google.android.chimera.Service
    public final IBinder onBind(Intent intent) {
        return null;
    }

    @Override // com.google.android.chimera.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        return aqbv.a(this, intent, i2);
    }
}
