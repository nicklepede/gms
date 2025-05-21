package com.google.android.gms.googlehelp.service;

import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.chimera.IntentOperation;
import defpackage.asej;
import defpackage.asot;
import defpackage.bivh;
import defpackage.bjay;
import defpackage.bjez;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class ClearHelpHistoryChimeraIntentOperation extends IntentOperation {
    public static final /* synthetic */ int a = 0;

    /* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
    public class PackageActionIntentOperation extends IntentOperation {
        static {
            asot.b("gH_PackageActionISvc", asej.GOOGLE_HELP);
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
        asot.b("gH_ClearHelpHistoryISvc", asej.GOOGLE_HELP);
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
        bjay bjayVar = new bjay(this);
        bivh bivhVar = new bivh(this);
        bjez bjezVar = new bjez(this, stringExtra);
        bjayVar.d(stringExtra);
        bjayVar.close();
        bivhVar.i(stringExtra);
        bivhVar.close();
        bjezVar.d();
        bjezVar.close();
    }
}
