package com.google.android.gms.feedback;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import defpackage.auid;
import defpackage.auio;
import defpackage.aura;
import defpackage.ausn;
import defpackage.bcoc;
import defpackage.bcsg;
import defpackage.eluo;
import defpackage.fqfl;
import defpackage.fqns;
import defpackage.ryt;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public class IntentListenerFeedbackChimeraActivity extends ryt {
    private static final ausn j = ausn.b("gF_IntentListenerFeedbackChimeraActivity", auid.FEEDBACK);
    private String k;

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    protected final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        String q = aura.q(this);
        this.k = q;
        if (TextUtils.isEmpty(q)) {
            finish();
            return;
        }
        PackageManager packageManager = getPackageManager();
        ErrorReport errorReport = new ErrorReport();
        errorReport.a.packageName = this.k;
        errorReport.a.type = 11;
        errorReport.a.installerPackageName = packageManager.getInstallerPackageName(this.k);
        Intent className = new Intent().setClassName(this, true != bcoc.c(errorReport) ? "com.google.android.gms.feedback.FeedbackActivity" : "com.google.android.gms.feedback.FeedbackAlohaActivity");
        className.addFlags(268435456);
        Intent intent = getIntent();
        if (intent.hasExtra("com.android.feedback.SCREENSHOT_EXTRA")) {
            className.putExtra("com.android.feedback.SCREENSHOT_EXTRA", Screenshot.b((Bitmap) intent.getParcelableExtra("com.android.feedback.SCREENSHOT_EXTRA")));
        }
        if (intent.hasExtra("com.android.feedback.GOOGLE_ACCOUNT_EXTRA")) {
            CharSequence charSequenceExtra = intent.getCharSequenceExtra("com.android.feedback.GOOGLE_ACCOUNT_EXTRA");
            if (!TextUtils.isEmpty(charSequenceExtra)) {
                errorReport.B = charSequenceExtra.toString();
            }
        }
        if (intent.hasExtra("com.android.feedback.PSD_EXTRA") && (bundleExtra = intent.getBundleExtra("com.android.feedback.PSD_EXTRA")) != null && bundleExtra.size() > 0) {
            errorReport.D = bundleExtra;
        }
        String stringExtra = intent.getStringExtra("category_tag");
        if (stringExtra != null) {
            errorReport.P = stringExtra;
        }
        String stringExtra2 = intent.getStringExtra("com.android.feedback.TRIGGER_ID_EXTRA");
        if (stringExtra2 != null) {
            errorReport.ap = stringExtra2;
        }
        className.putExtra("com.android.feedback.SAFEPARCELABLE_REPORT", errorReport);
        if (fqns.a.lK().a()) {
            bcsg.a(this, auio.FEEDBACK_ACTIVITY_FROM_BROADCAST);
            if (fqfl.c()) {
                ((eluo) ((eluo) j.h()).ai((char) 3623)).x("FEEDBACK_ACTIVITY_FROM_BROADCAST");
            }
        }
        startActivity(className);
        finish();
    }
}
