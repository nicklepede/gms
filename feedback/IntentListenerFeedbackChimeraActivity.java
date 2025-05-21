package com.google.android.gms.feedback;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.googlehelp.feedback.Screenshot;
import defpackage.asej;
import defpackage.aseu;
import defpackage.asng;
import defpackage.asot;
import defpackage.bakg;
import defpackage.baok;
import defpackage.ejhf;
import defpackage.fnnc;
import defpackage.fnvj;
import defpackage.qfp;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes4.dex */
public class IntentListenerFeedbackChimeraActivity extends qfp {
    private static final asot j = asot.b("gF_IntentListenerFeedbackChimeraActivity", asej.FEEDBACK);
    private String k;

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
    protected final void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        String q = asng.q(this);
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
        Intent className = new Intent().setClassName(this, true != bakg.c(errorReport) ? "com.google.android.gms.feedback.FeedbackActivity" : "com.google.android.gms.feedback.FeedbackAlohaActivity");
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
        if (fnvj.a.a().a()) {
            baok.a(this, aseu.FEEDBACK_ACTIVITY_FROM_BROADCAST);
            if (fnnc.c()) {
                ((ejhf) ((ejhf) j.h()).ah((char) 3617)).x("FEEDBACK_ACTIVITY_FROM_BROADCAST");
            }
        }
        startActivity(className);
        finish();
    }
}
