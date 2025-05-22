package com.google.android.gms.growth.uiflow.ui.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.gms.R;
import com.google.android.gms.growth.ui.widget.pageindicator.PageIndicator;
import defpackage.bmrj;
import defpackage.bnbt;
import defpackage.bncp;
import defpackage.dqrb;
import defpackage.fxxm;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: :com.google.android.gms@251864004@25.18.64 (040400-758020094) */
/* loaded from: classes4.dex */
public final class PagerControls extends RelativeLayout implements bncp {
    public PageIndicator a;
    public View b;
    public View c;
    public boolean d;
    public dqrb e;
    public TextView f;
    public String g;
    public String h;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerControls(Context context) {
        this(context, null, 0, 6, null);
        fxxm.f(context, "context");
    }

    @Override // defpackage.bncp
    public final void g(bmrj bmrjVar) {
        boolean b = bmrj.b();
        this.d = b;
        if (b) {
            RelativeLayout.inflate(getContext(), R.layout.pager_controls_bc25, this);
        } else {
            RelativeLayout.inflate(getContext(), R.layout.pager_controls, this);
        }
        if (!this.d) {
            View findViewById = findViewById(R.id.pager_controls_next_text);
            fxxm.d(findViewById, "null cannot be cast to non-null type android.widget.TextView");
            this.f = (TextView) findViewById;
        }
        this.a = (PageIndicator) findViewById(R.id.pager_controls_indicator);
        View findViewById2 = findViewById(R.id.pager_controls_next);
        this.b = findViewById2;
        View view = null;
        if (findViewById2 == null) {
            fxxm.j("nextButton");
            findViewById2 = null;
        }
        bnbt.a(findViewById2);
        View findViewById3 = findViewById(R.id.pager_controls_prev);
        this.c = findViewById3;
        if (findViewById3 == null) {
            fxxm.j("prevButton");
        } else {
            view = findViewById3;
        }
        bnbt.a(view);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PagerControls(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        fxxm.f(context, "context");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PagerControls(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        fxxm.f(context, "context");
    }

    public /* synthetic */ PagerControls(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
