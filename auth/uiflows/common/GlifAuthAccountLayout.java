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
import defpackage.acnd;
import defpackage.acne;
import defpackage.acnh;
import defpackage.afks;
import defpackage.auus;
import defpackage.efrj;
import defpackage.efrl;
import defpackage.efrm;
import defpackage.efsu;
import defpackage.eftg;
import defpackage.fmua;
import defpackage.fmyt;
import defpackage.ryr;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes2.dex */
public class GlifAuthAccountLayout extends GlifLayout implements acne, acnh {
    public GlifAuthAccountLayout(Context context) {
        this(context, null);
    }

    @Override // defpackage.acne
    public final void e(CharSequence charSequence) {
        ((TextView) findViewById(R.id.message)).setText(charSequence);
    }

    @Override // defpackage.acne
    public final void g() {
        findViewById(R.id.progress_bar_layout).setVisibility(0);
    }

    @Override // defpackage.acnh
    public final void h(Window window, Context context) {
        ((efsu) q(efsu.class)).b(window, context);
    }

    @Override // defpackage.acnh
    public final void i(Window window) {
        efsu.c(window);
    }

    @Override // defpackage.acnh
    public final void j(Window window) {
        i(window);
    }

    public GlifAuthAccountLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public GlifAuthAccountLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        efrm i2;
        Intent intent;
        LayoutInflater.from(getContext()).inflate(R.layout.auth_glif_auth_account_layout, this);
        K(false);
        afks.b(context, this);
        boolean z = true;
        if (!auus.a(context)) {
            if (context instanceof ryr) {
                intent = ((ryr) context).getIntent();
            } else {
                intent = context instanceof Activity ? ((Activity) context).getIntent() : null;
            }
            if (!eftg.b(intent)) {
                z = false;
            }
        }
        if ((!fmua.a.lK().x() || z) && fmyt.c() && (i2 = efrl.h(context).i(context, efrj.CONFIG_PROGRESS_ILLUSTRATION_ACCOUNT)) != null) {
            findViewById(R.id.progress_bar).setVisibility(8);
            IllustrationVideoView illustrationVideoView = (IllustrationVideoView) findViewById(R.id.animation_view);
            illustrationVideoView.c(i2.c, i2.a);
            illustrationVideoView.setVisibility(0);
        }
    }

    @Override // defpackage.acne
    public final void f() {
    }

    @Override // defpackage.acne
    public final void a(boolean z) {
    }

    @Override // defpackage.acne
    public final /* synthetic */ void c(int i) {
    }

    @Override // defpackage.acne
    public final void d(acnd acndVar) {
    }
}
