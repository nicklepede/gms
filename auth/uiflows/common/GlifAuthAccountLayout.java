package com.google.android.gms.auth.uiflows.common;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Window;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.setupdesign.GlifLayout;
import com.google.android.setupdesign.view.IllustrationVideoView;
import defpackage.aand;
import defpackage.aane;
import defpackage.aanh;
import defpackage.adkl;
import defpackage.asqy;
import defpackage.edeo;
import defpackage.edeq;
import defpackage.eder;
import defpackage.edfz;
import defpackage.edgl;
import defpackage.fkdo;
import defpackage.fkie;
import defpackage.qfn;

/* compiled from: :com.google.android.gms@251661004@25.16.61 (040400-752466036) */
/* loaded from: classes2.dex */
public class GlifAuthAccountLayout extends GlifLayout implements aane, aanh {
    public GlifAuthAccountLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.aane
    public final void e(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }

    @Override // defpackage.aane
    public final void g() {
        findViewById(R.id.progress_bar_layout).setVisibility(0);
    }

    @Override // defpackage.aanh
    public final void h(Window window, Context context) {
        ((edfz) q(edfz.class)).b(window, context);
    }

    @Override // defpackage.aanh
    public final void i(Window window) {
        edfz.c(window);
    }

    @Override // defpackage.aanh
    public final void j(Window window) {
        i(window);
    }

    public GlifAuthAccountLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlifAuthAccountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        eder i2;
        Intent intent;
        LayoutInflater.from(getContext()).inflate(R.layout.auth_glif_auth_account_layout, this);
        K(false);
        if (fkdo.n()) {
            adkl.b(context, this);
        }
        boolean z = true;
        if (!asqy.a(context)) {
            if (context instanceof qfn) {
                intent = ((qfn) context).getIntent();
            } else {
                intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
            }
            if (!edgl.b(intent)) {
                z = false;
            }
        }
        if ((!fkdo.a.a().w() || z) && fkie.c() && (i2 = edeq.h(context).i(context, edeo.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT)) != null) {
            findViewById(R.id.progress_bar).setVisibility(8);
            IllustrationVideoView illustrationVideoView = (IllustrationVideoView) findViewById(R.id.animation_view);
            illustrationVideoView.c(i2.c, i2.a);
            illustrationVideoView.setVisibility(0);
        }
    }

    @Override // defpackage.aane
    public final void f() {
    }

    @Override // defpackage.aane
    public final void a(boolean z) {
    }

    @Override // defpackage.aane
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.aane
    public final void d(aand aandVar) {
    }
}
