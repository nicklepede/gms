package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.aoeq;
import defpackage.appn;
import defpackage.appp;
import defpackage.auid;
import defpackage.auqx;
import defpackage.cbnt;
import defpackage.elja;
import defpackage.rxx;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes3.dex */
public final class CastHatsChimeraActivity extends rxx {
    public static final appp j = new appp("CastHatsChimeraActivity");
    private static final AtomicInteger k = new AtomicInteger(new Random().nextInt(AndroidInputTypeSignal.TYPE_TEXT_FLAG_AUTO_COMPLETE));
    private int l;

    public CastHatsChimeraActivity() {
        super(R.layout.cast_hats_activity);
    }

    public static final Intent a(int i) {
        Intent intent = new Intent("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION");
        intent.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT", i);
        intent.setPackage("com.google.android.gms");
        return intent;
    }

    @Override // defpackage.rza, defpackage.rxs, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onActivityResult(int i, int i2, Intent intent) {
        j.p("onActivityResult(): requestCode=%d, resultCode=%d", Integer.valueOf(i), Integer.valueOf(i2));
        super.onActivityResult(i, i2, intent);
        if (i == this.l) {
            Intent a = a(5);
            a.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_REQUEST_CODE", i);
            a.putExtra("com.google.android.gms.cast.activity.HATS_SURVEY_EVENT_ACTION_KEY_RESULT_CODE", i2);
            sendBroadcast(a);
            finish();
        }
    }

    @Override // defpackage.rza, defpackage.rxs, defpackage.rys, com.google.android.chimera.android.Activity, defpackage.rtn
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.cast_hats_activity);
        setTitle("");
        setFinishOnTouchOutside(true);
        if (getWindow() != null) {
            getWindow().getDecorView().getBackground().setColorFilter(new PorterDuffColorFilter(0, PorterDuff.Mode.CLEAR));
            WindowManager.LayoutParams attributes = getWindow().getAttributes();
            attributes.gravity = 8388693;
            getWindow().setAttributes(attributes);
            overridePendingTransition(0, 0);
            setRequestedOrientation(14);
        }
        int andIncrement = k.getAndIncrement();
        this.l = andIncrement;
        j.n("Launching HaTS survey with request code: %d", Integer.valueOf(andIncrement));
        appn.b();
        Context applicationContext = getApplicationContext();
        new cbnt(auid.CAST, appn.b().d(), appn.b().f(), new aoeq(this), elja.o(auqx.h(applicationContext, applicationContext.getPackageName()), null) == null ? null : appn.b().a(getApplicationContext()), Integer.valueOf(this.l), ((Boolean) appn.b().c.lK()).booleanValue() ? Integer.valueOf(R.drawable.gs_cast_vd_theme_24) : null).a(getContainerActivity(), appn.b().d());
    }
}
