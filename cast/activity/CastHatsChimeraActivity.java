package com.google.android.gms.cast.activity;

import android.content.Context;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.view.WindowManager;
import com.google.android.gms.R;
import com.google.autofill.detection.ml.AndroidInputTypeSignal;
import defpackage.amdf;
import defpackage.annu;
import defpackage.annw;
import defpackage.asej;
import defpackage.asnd;
import defpackage.bzfc;
import defpackage.eivv;
import defpackage.qet;
import java.util.Random;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes3.dex */
public final class CastHatsChimeraActivity extends qet {
    public static final annw j = new annw("CastHatsChimeraActivity");
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

    @Override // defpackage.qfw, defpackage.qeo, com.google.android.chimera.android.Activity, defpackage.qaj
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

    @Override // defpackage.qfw, defpackage.qeo, defpackage.qfo, com.google.android.chimera.android.Activity, defpackage.qaj
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
        annu.b();
        Context applicationContext = getApplicationContext();
        new bzfc(asej.CAST, annu.b().d(), annu.b().f(), new amdf(this), eivv.o(asnd.h(applicationContext, applicationContext.getPackageName()), null) == null ? null : annu.b().a(getApplicationContext()), Integer.valueOf(this.l), ((Boolean) annu.b().c.a()).booleanValue() ? Integer.valueOf(R.drawable.gs_cast_vd_theme_24) : null).a(getContainerActivity(), annu.b().d());
    }
}
