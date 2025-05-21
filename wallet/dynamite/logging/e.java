package com.google.android.gms.wallet.dynamite.logging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import defpackage.assx;
import java.io.PrintWriter;
import java.io.StringWriter;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes7.dex */
public final class e {
    public static void a(Context context, Throwable th, String str) {
        try {
            if ((assx.b(context).e(context.getPackageName(), 0).flags & 2) == 0) {
                StringWriter stringWriter = new StringWriter();
                th.printStackTrace(new PrintWriter(stringWriter));
                d dVar = new d(stringWriter.toString(), str, Runtime.getRuntime().freeMemory(), Runtime.getRuntime().totalMemory());
                String valueOf = String.valueOf(Base64.encodeToString(dVar.b.getBytes(d.a), 10));
                StringBuilder sb = new StringBuilder();
                sb.append("UTF8-BASE64-TRACE:".concat(valueOf));
                sb.append("/");
                sb.append(dVar.d);
                sb.append("/");
                sb.append(dVar.e);
                sb.append("/");
                String str2 = dVar.c;
                if (!TextUtils.isEmpty(str2)) {
                    sb.append(str2);
                }
                sb.append("/\n");
                context.sendBroadcast(new Intent().setClassName("com.google.android.gms", "com.google.android.gms.chimera.GmsIntentOperationService$GmsExternalReceiver").setAction("com.google.android.gms.wallet.REPORT_CRASH").putExtra("com.google.android.gms.wallet.CRASH_LOG", sb.toString()));
                return;
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        Log.e("WalletCrash", "Uncaught exception", th);
    }
}
