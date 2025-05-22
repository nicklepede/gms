package com.google.android.gms.googlehelp.service;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.auid;
import defpackage.ausn;
import defpackage.bkzw;
import defpackage.blfn;
import defpackage.bljo;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class ClearHelpHistoryChimeraIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;

    /* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
    public class PackageActionIntentOperation extends IntentOperation {
        static {
            ausn.b("gH_PackageActionISvc", auid.GOOGLE_HELP);
        }

        @Override // com.google.android.chimera.IntentOperation
        public final void onHandleIntent(Intent intent) {
            if (intent != null && "android.intent.action.PACKAGE_REMOVED".equals(intent.getAction())) {
                Uri data = intent.getData();
                String schemeSpecificPart = data == null ? "" : data.getSchemeSpecificPart();
                Intent intent2 = new Intent("com.google.android.gms.googlehelp.clear_help_history");
                intent2.putExtra("app_package_name", schemeSpecificPart);
                int i = ClearHelpHistoryChimeraIntentOperation.a;
                startService(new Intent("com.google.android.chimera.container.IntentOperationService.MODULE_SPECIFIC").setPackage("com.google.android.gms").putExtra("moduleid", "com.google.android.gms.googlehelp").putExtra("intent", intent2));
            }
        }
    }

    static {
        ausn.b("gH_ClearHelpHistoryISvc", auid.GOOGLE_HELP);
    }

    @Override // com.google.android.chimera.IntentOperation
    public final void onHandleIntent(Intent intent) {
        if (intent == null) {
            return;
        }
        String stringExtra = intent.getStringExtra("app_package_name");
        if (TextUtils.isEmpty(stringExtra)) {
            return;
        }
        blfn blfnVar = new blfn(this);
        bkzw bkzwVar = new bkzw(this);
        bljo bljoVar = new bljo(this, stringExtra);
        blfnVar.d(stringExtra);
        blfnVar.close();
        bkzwVar.i(stringExtra);
        bkzwVar.close();
        bljoVar.d();
        bljoVar.close();
    }
}
